package looping;

import java.util.Scanner;

public class loop02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x > 0) {
                System.out.println("quarto");
            }
            else if (y > 0) {
                System.out.println("segundo");
            }
            else  {
                System.out.println("terceiro");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}


