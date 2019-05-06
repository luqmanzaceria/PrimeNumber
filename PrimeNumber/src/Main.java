import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {

            System.out.println("Enter a number.");
            Scanner input = new Scanner(System.in);

            int div;
            int priCom = 0;

            if (!input.hasNextInt()) {
                System.out.println("Input is not valid.");
                continue;
            } else {
                int num;
                num = input.nextInt();

                for (div = 1; (num / 2) + 1 > div; div++) {
                    if (div < num) {
                        if (num % div == 0) {
                            priCom++;
                            System.out.println(num + " is divisible by " + div);
                        } else {
                            System.out.println(num + " is not divisible by " + div);
                        }
                    } else {
                        if (num == 1) {
                            System.out.println("1 is composite");
                            java.lang.System.exit(0);
                        }

                    }

                }

                System.out.println(num + " is divisible by " + num);

                if (priCom == 0) {
                    System.out.println(num + " is composite");
                } else if (priCom == 1) {
                    System.out.println(num + " is prime");
                } else if (priCom > 1) {
                    System.out.println(num + " is composite");
                }

            }
        }
    }
}





