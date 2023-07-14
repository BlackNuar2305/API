package seminar2;

import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.*;

public class bubbleSort {
    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
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
    
    public static void main(String args[]) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        bubbleSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\n");
        }
    }
}
