import java.util.Scanner;
// Задание
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            result = result * i;
        }
        System.out.println("Сумма чисел от 1 до n =" + sum);
        System.out.println("произведение чисел от 1 до n=" + result);
    }    
}