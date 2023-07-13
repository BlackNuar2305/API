package seminar1;

public class hw2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (simpleNumber(i)) System.out.print(i + " ");
        }
    }

static boolean simpleNumber(int number){
    int k = 2;
    while (k * k <= number){
        if (number % k == 0){
            return false;
        }
        k += 1;
    }
    return true;
}

}
