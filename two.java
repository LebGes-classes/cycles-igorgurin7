import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        double x = -8;
        double y = 0;
        System.out.println("Значение аргумента\tЗначение функции");
        while(x>=-8 && x<=10) {
            if (x >= -8 && x < -5) {
                y = -3;
            } else if (x >= -5 && x < -3) {
                y = x + 3;
            } else if (x >= -3 && x < 3) {
                y = Math.pow(9 - x * x, 0.5);
            } else if (x >= 3 && x < 8) {
                y = 3 * (x - 3) / 5;
            } else if (x >= 8 && x <= 10) {
                y = 3;
            }
            x++;
            System.out.println(x + "\t\t|\t\t" + y);
        }
    }
}
