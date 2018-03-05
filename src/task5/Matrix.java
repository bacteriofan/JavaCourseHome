package task5;


public class Matrix {
        public static void main(String[] args) {
            char[][] A = new char[6][7];
            for (int i = 0; i < 6; i++)

                for (int j = 0; j < 7; j++) {
                    A[i][j] = '0';
                }

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {

                    if ((i == j) || (i==5-j+1)) {
                        if(i<4) {
                            A[i][j] = '1';

                        } else{
                            if(j<3) {
                                A[i][j-1] = '1';

                            }  else if(j>3){


                                A[i][j+1] = '1';

                            }
                        }
                    }

                }
            }


            for (int i = 0; i < 6; i++) {
                System.out.println("");
                for (int j = 0; j < 7; j++) {
                    System.out.print(A[i][j] + " ");
                }
            }
        }
    }

