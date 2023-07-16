package seminar4;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        try {
            File file = new File("log.txt");
            Deque<String> deque = new ArrayDeque<>();
            FileWriter fileWriter = new FileWriter(file, false);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                Calculator(deque);
                System.out.println("Выберите операцию: d, n, c");
                String act = scanner.nextLine();
                if (act.equals("d")) deque.pollFirst();
                else if (act.equals("n")) continue;
                else if (act.equals("c")) break;
            }
            for (String string : deque) {
                fileWriter.write(string);
            }
            fileWriter.close();
            }
        catch (Exception e) {
            System.out.println("Проблемы в работе с файлом");
        }
    }

    public static void Calculator(Deque<String> deque) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Выберите операцию + - * /: ");
        String op = scanner.nextLine();
        System.out.println("Введите второе число: ");
        int b = Integer.parseInt(scanner.nextLine());
        switch (op) {
            case "+" :
                deque.add(a + " + " + b + " = " + addition(a, b) + "\n");
                break;
            case "-" :
                deque.add(a + " - " + b + " = " + minus(a, b) + "\n");
                break;
            case "/" :
                deque.add(a + " / " + b + " = " + division(a, b) + "\n");
                break;
            case "*" :
                deque.add(a + " * " + b + " = " + multiplication(a, b) + "\n");
                break;
            default:
                System.out.println("Введена неправильная операция!");
                break;
        }
    }
    
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if (b != 0) return a / b;
        else return -1;
    }
}
