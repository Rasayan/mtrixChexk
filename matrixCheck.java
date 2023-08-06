import java.util.Scanner;
public class matrixCheck {

    static int upperTriangular(int m) {
        int [][]a = new int[m][m];
        int upper = 0;
        Scanner ui = new Scanner(System.in);

        System.out.println("Enter the elements");
        for (int i =0; i<m; i++) {
            for(int j =0; j<m; j++) {
                a[i][j] = ui.nextInt();
            }
            System.out.println();
        }

        System.out.println("The entered matrix is --");
        for (int i =0; i<m; i++) {
            for(int j =0; j<m; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

        for (int i =0; i<m; i++) {
            for(int j =0; j<m; j++) {
                if(j<i && a[i][j]==0) {
                    upper = 1;
                } if (j<i && a[i][j]!=0) {
                    upper = 0;
                    break;
                }
            }
        }
        return upper;
    }

    static int identityMatrix(int m) {
        int [][]a = new int[m][m];
        int idn = 0;
        Scanner ui = new Scanner(System.in);

        System.out.println("Enter the elements");
        for (int i =0; i<m; i++) {
            for(int j =0; j<m; j++) {
                a[i][j] = ui.nextInt();
            }
            System.out.println();
        }

        System.out.println("The entered matrix is --");
        for (int i =0; i<m; i++) {
            for(int j =0; j<m; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

        for (int i =0; i<m; i++) {
            for(int j =0; j<m; j++) {
                if(i==j) {
                    if(a[i][j]==1) {
                        idn = 1;
                    }
                } else  {
                    if (a[i][j]==1) {
                        idn = 0;
                        break;
                    }
                }
            }
        }
        return idn;
    }

    static int lowerTriangular(int m) {
        int [][]a = new int[m][m];
        int lower = 0;
        Scanner ui = new Scanner(System.in);

        System.out.println("Enter the elements");
        for (int i =0; i<m; i++) {
            for(int j =0; j<m; j++) {
                a[i][j] = ui.nextInt();
            }
            System.out.println();
        }

        System.out.println("The entered matrix is --");
        for (int i =0; i<m; i++) {
            for(int j =0; j<m; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

        for (int i =0; i<m; i++) {
            for(int j =0; j<m; j++) {
                if(j>i && a[i][j]==0) {
                    lower = 1;
                } if (j>i && a[i][j]!=0) {
                    lower = 0;
                    break;
                }
            }
        }
        return lower;
    }
    public static void main(String[] args) {
        int u,l,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension");
        int m = sc.nextInt();

        System.out.println("Enter 1(Upper Triangular)/ 2(Lower Triangular)/ 3(Identity Matrix)");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                u = upperTriangular(m);
                if (u==1) {
                    System.out.println("It is Upper Triangular");
                } else {
                    System.out.println("It is not Upper Triangular");
                }
                break;

            case 2:
                l = lowerTriangular(m);
                if (l==1) {
                    System.out.println("It is Upper Triangular");
                } else {
                    System.out.println("It is not Upper Triangular");
                }
                break;

            case 3:
                i = identityMatrix(m);
                if (i==1) {
                    System.out.println("It is Identity Matrix");
                } else {
                    System.out.println("It is not identity matrix");
                }
                break;

            default:
                System.out.println("Invalid Input of Choice");
                break;
        }
    }
}
