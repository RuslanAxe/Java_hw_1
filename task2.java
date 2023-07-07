// Задание
// 2) К калькулятору из предыдущего дз добавить логирование.
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
public class task2 {
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
    public static void calculation(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.print("Введите два числа: ");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("\nВведите знак операции (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Ошибка! Введите корректный знак операции");
            return;
      }
      System.out.print("\nРезультат операции:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
      String fileName = "LogCalculation.xml";
      Logger(fileName);
      System.out.println(Double.toString(ans, fileName));
   }
   // public static void calculation(String[] args) throws IOException {
   //      //Придумываем имя для логгера и записываем логи в xml
   //      String fileName = "LogCalculation.xml";
   //      Logger(fileName);
   //    }
   }

