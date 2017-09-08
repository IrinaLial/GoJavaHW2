import java.util.Scanner;

public class GoJavaHW2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите город : ");
        String city = in.nextLine();

        System.out.println("Введите возраст: ");
        int age = in.nextInt();
        in.nextLine();

        System.out.println("Напишите свое хобби: ");
        String hobby = in.nextLine();
    }
}
