package com.company;

import java.util.ArrayList;

public class Sort {

    private ArrayList<Integer> mass;

    Sort(ArrayList<Integer> mass) {
        this.mass = mass;
    }

    public void Sort(int p, int r) {

        if (p < r) {
            int q = (p + r)/2;
            this.Sort(p, q);
            this.Sort(q + 1, r);
            Merge(p, q, r);
        }

    }

    public void Merge(int p, int q, int r) {

        ArrayList<Integer> st = new ArrayList<>();
        for (int i = p, j = q + 1; i < q + 1 || j <= r;) {
            if (this.mass.get(i) <= this.mass.get(j)) {
                st.add(this.mass.get(i));
                i++;
            }
            else {
                st.add(this.mass.get(j));
                j++;
            }
            if (i == q + 1 || j == r + 1) {
                int start = 0;
                int finish = 0;
                if (i == q + 1) {
                    start = j;
                    finish = r;
                }
                if (j == r + 1) {
                    start = i;
                    finish = q;
                }
                for (int d = start; d <= finish; d++) {
                    st.add(this.mass.get(d));
                }
                break;
            }
        }
        int counter = p;
        for (int i = 0; i < st.size(); i++) {
            this.mass.set(counter, st.get(i));
            counter++;
        }
    }

    public String toString() {
        return this.mass.toString();
    }

}
