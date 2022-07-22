package Homework2;

import java.sql.SQLOutput;

public class HomeworkTasks {
    public static void main(String[] args) {

        // Домашка
        // Базовый уровень
        // TODO Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
        //
//        for (int i = 1; i<=100; i++){
//            System.out.print(i+"a ");
//        }

        // TODO Задание №2
        // Дано:
        int ageChildren = 18;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.
//        if (ageChildren<6) {
//            System.out.println("Пошёл в сад");
//        } else if (ageChildren<11) {
//            System.out.println("Пошёл в младшую школу");
//        } else  if (ageChildren<17) {
//            System.out.println("Пошёл в среднюю школу");
//        } else System.out.println("Пошёл в университет");


        // TODO Задание №3
        // Дано:
        boolean chicken = false;
        boolean vegetables = true;
        boolean sour = false;
        boolean toast = true;
        boolean sausage = false;
        boolean eggs = true;
        // Задача: Повара попросили сделать салат. false
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.

//        if (chicken && vegetables && sour && toast ){
//            System.out.println("Приготовил Цезарь");
//        } else if ((chicken ||  sausage) && vegetables && eggs) {
//            System.out.println("Приготовил Оливье");
//        } else if (vegetables) {
//            System.out.println("Приготовил Овощной салат");
//        } else  {
//            System.out.println("У меня ничего нет");
//        }


        // TODO Задание №4
        // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Создать экземпляры этих двух животных.

//        Dog Korg = new Dog ("Korgik", 3);
//        Korg.setName("Bulka");
//        Korg.setAge(4);
//        System.out.println(Korg.getName() +" "+ Korg.getAge());
//        Cat Pushok = new Cat ("Pushok", 1);
//        Pushok.setName("Marusya");
//        Pushok.setAge(2);
//        System.out.println(Pushok.getName() +" "+ Pushok.getAge());


        // Продвинутый уровень
        // TODO Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.

//        int count = 0;
//        while (result <=1_000_000){
//            if (increment <=0) {
//                break;
//            }
//            result =result + increment;
//            count++;
//        }
//        System.out.println("Количество итераций :" + count);

        // TODO Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
//        int array[] = new int[15];
//        for (int i = 0; i<array.length; i++){
//            array[i] = 1;
//            System.out.print(array[i] + ", ");
//        }
//        System.out.println();
//        for (int i = 0; i<array.length; i++){
//            if ((i+1)%2!=0){
//                array[i] = 0;
//            }
//            System.out.print(array[i] + ", ");
//        }


        // TODO Задание №3:
        // Дано:
        boolean hasFuel = false;
        boolean hasElectricsProblem = true;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = false;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.


//        double check = 0;
//        if(hasFuel && (!hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem)) {
//            System.out.println("У машины нет бензина: 1000 рублей за диагностику");
//        } else {
//            if (hasMotorProblem){
//                System.out.println("Проблема с двигателем: 10000 рублей за ремонт");
//                check = check +10000;
//                }
//            if (hasElectricsProblem){
//                System.out.println("Проблема с электрикой: 5000 рублей за ремонт");
//                check = check + 5000;
//                }
//            if (hasTransmissionProblem){
//                System.out.println("Проблема с коробкой передач: 4000 рублей за ремонт");
//                check = check + 4000;
//                }
//            if (hasWheelsProblem){
//                System.out.println("Проблема с колесами: 2000 рублей за ремонт");
//                check = check + 2000;
//                }
//            if (!hasFuel) {
//                System.out.println("У машины нет бензина");
//                }
//            }
//
//        if (hasElectricsProblem && hasMotorProblem && hasTransmissionProblem){
//            System.out.println("Счёт со скидкой в 20% : " + (check*0.8));
//        } else if ((hasElectricsProblem ? 1 : 0) + (hasMotorProblem ? 1 : 0) + (hasTransmissionProblem ? 1 : 0) + (hasWheelsProblem ? 1 : 0) >=2){
//            System.out.println("Счёт со скидкой в 10% : " + (check*0.9));
//        } else System.out.println("Счёт: " + (check));



        // TODO Задание №4:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.

//        Stock vodka = new Stock("Horoshaya Vodka", 500);
//        System.out.println(vodka.getNameOfProduct()+ ": " +  vodka.getQuantity());
//        vodka.destocking(500);
//        vodka.setNameOfProduct("Lydshya Vodka");
//        vodka.increaseInStocks(1000);
//        System.out.println(vodka.getNameOfProduct()+ ": " +  vodka.getQuantity());
//
//        Employee Volodya = new Employee(1,"Volodya");
//        Employee Grigorii = new Employee(2, "Grigorii");
//        Employee Nikolay = new Employee(3, "Kolya");
//        Nikolay.setName("Nikolay");
//        vodka.destocking(10);
//        Nikolay.increaseQuantitySpoiled(10);
//        Volodya.increaseQuantitySpoiled(35);
//        Grigorii.increaseQuantitySpoiled(120);
//
//
//        System.out.println(Volodya.getEmployeeQuantitySpoiled());
//        System.out.println(Grigorii.getEmployeeQuantitySpoiled());
//        System.out.println(Nikolay.getEmployeeQuantitySpoiled());
//        System.out.println(Employee.getQuantitySpoiled());



        // Экспертный уровень:
        // Предыстория: Мы находимся в статистическом институте. Хочется понять уровень миграции между регионами за месяц.
        // Для этого было решено произвести анализ передвижения автомобилей: на границе каждого региона стоят камеры,
        // фиксирующие въезд и выезд автомобилей. Формат автомобильного номера: (буква)(3 цифры)(2 буквы)(2-3 цифры)
        // К474СЕ178 - где 178 регион

        // Задача №1: узнать сколько всего машин со спец номерами: начинаются на M и заканчиваются на АВ.
        // Не повторяющиеся

        //Входящие данные
        // Map<Integer, Map<String, String[]>> - где ключ первого уровня - номер региона,
        // out, input - ключи второго уровня (выезд, въезд), и String[] - массивы номеров.
        // { 1 : {
        //      "out" : ["К474СЕ178"],
        //      "input": ["А222РТ178"]
        //    },
        //   2 : {
        //        "out" : ["К722АВ12", "А222РТ178"],
        //        "input" : ["М001АВ01", "А023РВ73"],
        //   }
        // ..
        //  }

        //Список технологий:
        // Set (HashSet) - узнать что это, set.contains(), set.put()
        // Map (HashMap) - узнать что это, map.get(), map.put(), map.entrySet() - для итерации, entry.getValue(), entry.getKey()
        // <Integer> - обозначает тип который хранится в этой структуре данных (Generics)
        // Регулярные выражения - вытащить регион авто
    }

}
