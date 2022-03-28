import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Нарисуем радугу");
        System.out.println("Выберите из скольких цветов будет состоять радуга: 1 или 2");
        Scanner scan = new Scanner(System.in);
        int chislo = scan.nextInt();
        if (chislo == 1) {
            System.out.println("Выбор первого цвета радуги. Нажмите номер цвета от 1 до 7");
            Scanner scan1 = new Scanner(System.in);
            int number = scan.nextInt();
            Rainbow rainbow = new Rainbow();
            String cvet = rainbow.getColorName(number);
            {

                System.out.println("Радуга будет " + cvet + " цвета");
            }
        }
        else if (chislo == 2) {
            System.out.println("Выбор первого цвета.Нажмите номер цвета от 1 до 7");
            Scanner scan2 = new Scanner(System.in);
            int number = scan.nextInt();
            Rainbow rainbow = new Rainbow();
            String cvet1 = rainbow.getColorName(number);
            System.out.println("Выбор первого цвета.Нажмите номер цвета от 1 до 7");
            Scanner scan3 = new Scanner(System.in);
            int number2 = scan.nextInt();
            Rainbow rainbow2 = new Rainbow();
            String cvet2 = rainbow.getColorName(number2);
            {

                System.out.println("Радуга будет " + cvet1+"-" + cvet2 + " цвета");
            }
        } else {
            System.out.println("Вы не правильно ввели количество цветов радуги. Попробуйте еще раз");
        }


    }
}
