package seminar2;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.*;

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
        Logger logger = Logger.getLogger(bubbleSort.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler ();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter ();
        ch.setFormatter(sFormat);
        logger.log(Level.WARNING, "Тестовое логирование" );
        logger.info("Тестовое логирование" );
    }
}
