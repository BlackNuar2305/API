package seminar1;
import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        int n = in.nextInt();
        int summa = 0;
        int p = 1;
        for (int i = 1; i <= n; i++){
            summa += i;
            p = p * i;
        }
        System.out.println(summa);
        System.out.println(p);
    }
}
