package sanwar;
import java.util.Scanner;
/*By Sanwar Hussain Chowdhury
  id:2022020014
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[] = {0, 0, 1, 1};
        int b[] = {0, 1, 0, 1};

        //Input
        Scanner sc = new Scanner(System.in);

        // Logic Gate Option
        System.out.println("Choose Option:\n1. AND Gate\n2.OR Gate\n3.NOT Gate\n4.NAND Gate\n5.NOR Gate\n6.XOR Gate\n7.XNOR Gate");

        try {
            System.out.print("\nEnter: ");
            int option = sc.nextInt();
            System.out.println("");

            // Implementation
            if (option == 1) {
                for (int i = 0; i < 4; i++) {
                    System.out.println(a[i] + " AND " + b[i] + " = " + a[i] * b[i]);
                }
                System.out.println("");
            } else if (option == 2) {
                for (int i = 0; i < 4; i++) {
                    int c = a[i] + b[i];
                    if (c > 1) {
                        c = 1;
                    }
                    System.out.println(a[i] + " OR " + b[i] + " = " + c);
                }
                System.out.println("");
            } else if (option == 3) {
                System.out.println("NOT 0 = 1");
                System.out.println("NOT 1 = 0\n");
            } else if (option == 4) {
                for (int i = 0; i < 4; i++) {
                    int c = a[i] * b[i];
                    if (c == 1) {
                        c = 0;
                    } else {
                        c = 1;
                    }
                    System.out.println(a[i] + " NAND " + b[i] + " = " + c);
                }
                System.out.println("");
            }
            else if (option == 5) {
                for (int i = 0; i < 4; i++) {
                    int c = a[i] + b[i];
                    if (c >= 1) {
                        c = 0;
                    } else {
                        c = 1;
                    }
                    System.out.println(a[i] + " NOR " + b[i] + " = " + c);
                }
                System.out.println("");
            }
            else if (option == 6) {
                for (int i = 0; i < 4; i++) {
                    int c;
                    if (a[i] == b[i]) {
                        c = 0;
                    } else {
                        c = 1;
                    }
                    System.out.println(a[i] + " XOR " + b[i] + " = " + c);
                }
                System.out.println("");
            } else if (option == 7) {
                for (int i = 0; i < 4; i++) {
                    int c;
                    if (a[i] == b[i]) {
                        c = 1;
                    } else {
                        c = 0;
                    }
                    System.out.println(a[i] + " XNOR " + b[i] + " = " + c);
                }
                System.out.println("");
            } else {
                System.out.println("!!!\tINVALID NUMBER");
            }
        } catch (Exception e) { /// IF ANYTHING OTHER THAN NUMBER IS ENTERED, IT WILL PRINT
            System.out.println("\n!!! ERROR !!!");
        }

    }
}


