package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if (first >= second) {
            System.out.println(first);
        } else
            System.out.println(second);
    }

    public static void main(String[] args) {
        GreatestNumberPrinter greatestNumberPrinter = new GreatestNumberPrinter();
        greatestNumberPrinter.printGreatest(10, -5);
        greatestNumberPrinter.printGreatest(5, 80);
        greatestNumberPrinter.printGreatest(9, 9);
    }
}
