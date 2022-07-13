package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        //TODO Базовый уровень
        //TODO Задача №1
        //Дано (переменные ниже менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже) используя String.trim()
        //затроить (Можно вызвать тольку одну команду System.out.println())
//        String HelloWorld = hi.trim() + " " + world.toLowerCase().trim() + newLine;
//        System.out.println(HelloWorld.repeat(3));
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!


        //TODO Задача №2
        //Создать переменные с ростом (!в метрах), весом в кило.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.0345645

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите рост человека в метрах: ");
//        double height = scan.nextDouble();
//        System.out.print("Введите вес человека в килограммах: ");
//        double weight = scan.nextDouble();
//        double indexMass = weight / (height * height);
//        System.out.println("Индекс массы тела: " + indexMass);


        //TODO Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        //Ожидаемый результат:
        //abcde
        //abche

//        char [] abcde = new char[]{'a','b','c','d','e'};
//        System.out.println(abcde);
//        abcde [3] = 'h';
//        System.out.println(abcde);





        //TODO Продвинутый уровень
        //TODO Задача №1
        //Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"

//        String some_text = "234";
//        int x = Integer.parseInt(some_text.trim())+some_text.length();
//        System.out.println(x);


        //TODO Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5

//        int a = 3, b =5;
//        System.out.println((a+b)*(a+b));


        //TODO Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

//        int[] array1 = new int[] {1,2,5,7,10};
//        int[] array2 = new int[] {2,3,2,17,15};
//
//        int[] arrayS = new int[5];
//        for (int k = 0; k<arrayS.length; k++){
//            arrayS[k] = array1[k]*array2[k];
//        }
//
//        int[] arrayAll = new int[array1.length+array2.length+ arrayS.length];
//
//
//        for (int i = 0; i<array1.length;i++) {
//            arrayAll[i] = array1[i];
//        }
//        for (int j = 0; j<array2.length;j++) {
//            arrayAll[j+array1.length] = array2 [j];
//        }
//        for (int l = 0; l< arrayS.length; l++){
//            arrayAll[l+ array1.length+ array2.length] = arrayS[l];
//        }
//
//        System.out.println("Первый массив: " + Arrays.toString(array1) + "  Второй массив: " + Arrays.toString(array2));
//        System.out.println("Массив перемножения: " + Arrays.toString(arrayS));
//        System.out.println("Массив из трёх массивов: " + Arrays.toString(arrayAll));


        //TODO Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран

//        String HelloWorld = "Hello world!";
//        HelloWorld = HelloWorld.replaceAll("l","r");
//        System.out.println(HelloWorld);
//        HelloWorld =  HelloWorld.toUpperCase();
//        System.out.println(HelloWorld);
//
//        System.out.println(HelloWorld.length());
//        char hello8[]=HelloWorld.toCharArray();
//        for (int i=0; i<8; i++){
//            System.out.print(hello8[i]);
//        }



        //Экспертный уровень
        //Задача №1
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //Входящий стринг <client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>
        //Вернет - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //Входящий - <client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>
        //Вернет - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder
    }
}
