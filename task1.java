import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
// Задание
// 1) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class task1 {
    public static void Logger(String fileName) throws IOException {
        // Создаем логгер
        Logger logger = Logger.getLogger(task1.class.getName());
//        logger.setLevel(Level.INFO);
        // вывод
//        ConsoleHandler ch = new ConsoleHandler();
//        logger.addHandler(ch);
        FileHandler fh = new FileHandler(fileName);
        logger.addHandler(fh);
        // формат вывода
//        SimpleFormatter sFormatter = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
//        ch.setFormatter(sFormatter);
//        ch.setFormatter(xml);
        fh.setFormatter(xml);

        //Сообщение
        logger.log(Level.INFO, "Test logging");
        logger.info("Test logging2");
    }

    public static int[] Bubble(int[] array,String filename) throws IOException {
        int size = array.length;
        int temp;
        for (int i = 1; i < size; i++) {
            Logger(filename);
            for (int j = size - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        //Придумываем имя для логгера и записываем логи в xml
        String fileName = "Log2.xml";
        Logger(fileName);

        // выполняем сортировку пузырьком
        int[] int1 = {2, 8, 9, 11, 0, -40};
        System.out.println(Arrays.toString(Bubble(int1 ,fileName)));
    }
}