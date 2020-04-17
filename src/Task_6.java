import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        System.out.print("Введите y: ");
        double y = in.nextDouble();
        System.out.print("Введите z: ");
        double z = in.nextDouble();
        double num = (x + y + z) / 3; // Запись в переменную среднего арифметического
        System.out.println("Среднее арифметическое чисел x,y,z: " + num);
        int del = (int)num / 2; // деление среднего арифметического на 2 без остатка
        if (del > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
