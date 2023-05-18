import java.util.Scanner;

public class GuessTheVyacheslav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = input.nextLine().toLowerCase();

        if (name.equals("вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        input.close();
    }
}
