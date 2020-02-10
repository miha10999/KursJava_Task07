

import java.util.*;
import java.lang.*;

public class main  {

    public static void main(String[] args) {
       /* Задача №7: Условие вывода данных.
          Выполнил Хлюстов М.В.
          Условие:Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
          В программе должны присутствовать константы X, Y, Z. Программа должна сравнивать введенное значение с клавиатуры
          со значением констант и вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
          Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
        */
        Scanner in = new Scanner(System.in); // объявим объект для ввода
        int  number1;
        final int
                const_X = 3,// зададим константные значения
                const_Y = 6,
                const_Z  = 9;

        System.out.println("Сведения для справки. Константы имеют значения:");
        System.out.println("1."+const_X);
        System.out.println("2."+const_Y);
        System.out.println("3."+const_Z);

        number1 =  in.nextInt();//записали в переменную

        switch (number1 )
        {
            case const_X:  System.out.println("Данное значение имеется в константах");
            break;
            case const_Y:  System.out.println("Данное значение имеется в константах");
            break;
            case const_Z:  System.out.println("Данное значение имеется в константах");
            break;
            default: System.out.println("Такой константы нет!");
            break;
        }
        System.exit(0);// завершим выполнение программы
    }
    }
