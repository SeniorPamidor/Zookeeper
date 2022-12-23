import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;
        int max = 0;
        while (number != 0) {
            number = scanner.nextInt();

            if (number > max) {
                max = number;
            }

        }
        System.out.println(max);
    }
}