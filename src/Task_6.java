import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = in.nextInt();
        System.out.print("Введите y: ");
        int y = in.nextInt();
        System.out.print("Введите z: ");
        int z = in.nextInt();
        int num = (x + y + z) / 2; // Запись в переменную среднего арифметического
        System.out.println("Среднее арифметическое чисел x,y,z: " + num);
        int del = num / 2; // деление среднего арифметического на 2 без остатка
        if (del > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
