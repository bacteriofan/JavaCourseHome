

package main.java.homework_1.task4;

public class Array {
        public static void main(String[] args) {

            int n =10;
            int[] a=new int[]{25,10,4,3,2,7,15,20,21,4,25};

            int max = a[0] + a[n];
            for (int i = 1; i < n; i++) {
                int curr = a[i] + a[n];
                if (curr > max) max = curr;

            }
            System.out.println ("Значение max = "+max);
        }
    }



