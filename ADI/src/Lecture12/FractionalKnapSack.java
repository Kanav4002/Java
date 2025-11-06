package Lecture12;

import java.util.*;

public class FractionalKnapSack {
    public static class Pair {
        int w;
        int v;
        double r;

        Pair(int w, int v) {
            this.w = w;
            this.v = v;
            this.r = v * 1.0 / w;
        }
        public String toString() {
            return "(" + w + " " + v + " " + r + ")";
        }
    }
    public static void main(String[] args) {
       int[] weight = {10, 20, 50, 10, 30};
       int[] value = {100, 100, 300, 200, 300};
       int w = 80;

       ArrayList<Pair> list = new ArrayList<>();

       for (int i = 0; i < value.length; i++) {
           Pair pp = new Pair(weight[i], value[i]);
           list.add(pp);
       }
       System.out.println(list);

        Collections.sort(list, new Comparator<Pair>(){
            @Override
            public int compare(Pair o1, Pair o2) {
//                return Double.compare(o2.r, o1.r);
                return (int) (o2.r - o1.r);
            }
        });
        System.out.println(list);
        int total = 0;
        w = 80;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).w <= w) {
                total += list.get(i).v;
                w = w - list.get(i).w;
                if (w <= 0) {
                    break;
                }
            } else {
                total = total + (int)(w * list.get(i).r);
                w = w - list.get(i).w;
                if (w <= 0) {
                    break;
                }
            }
        }
        System.out.println(total);
    }
}
