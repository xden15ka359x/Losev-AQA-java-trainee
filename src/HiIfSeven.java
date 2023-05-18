import java.util.Scanner;

public class HiIfSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = input.nextInt();

        if (num > 7) System.out.println("Привет");
        input.close();
    }
}
