import java.io.FilterOutputStream;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        String myFavoriteFoto; // объявление переменной
        final int NUM = 1;  // создание константы
        String word = "Class"; // создание типа данных string
        System.out.println(myFavoriteFoto = NUM + " " + word);  // склеивать
        System.out.println(myFavoriteFoto + ", " + NUM + ", " + word);// вывести в одну строку


        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner s=new Scanner(System.in);
        System.out.println("Введите ваше имя:"); // выводить в консоль строку
        String string= s.nextLine();
        System.out.println("Привет"+" "+ string);  //считывать... введенное  с клавиатуры
        System.out.print(string); // здоровать... введенной  с клавиатуры
    }

}