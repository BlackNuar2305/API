package seminar1;
import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int n1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int n2 = in.nextInt();
        System.out.print("Выберите операцию + или -: ");
        String operation = in.nextLine();
        if (operation == "+") System.out.print(n1 + n2);
        if (operation == "-") System.out.print(n1 - n2);

    }
}
