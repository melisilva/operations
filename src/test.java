import java.util.Scanner;

public class test {
    public test() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (operation.equals("sum")) {
            System.out.println(a + b);
        } else if (operation.equals("mul")) {
            System.out.println(a * b);
        } else {
            System.out.println("ERROR");
        }

    }
}
