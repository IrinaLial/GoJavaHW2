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

        System.out.println("----------------------------");
        System.out.println("Имя: " + name);
        System.out.println("Город: " + city);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + hobby);

        System.out.println("----------------------------");

        System.out.println("Человек по имени " + name + " живет в городе " + city + ".");
        System.out.println("Этому человеку " + age  + " и он любит заниматься " + hobby + ".");

        System.out.println("----------------------------");

        System.out.println(name + " - " + "имя");
        System.out.println(city + " - " + "город");
        System.out.println(age + " - " + "возраст");
        System.out.println(hobby + " - " + "хобби");
        System.out.println("----------------------------");
    }
}
