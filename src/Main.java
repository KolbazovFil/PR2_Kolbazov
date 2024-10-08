import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    // 1 задание
    public static int MaxNum(int a, int b) {

        if (a == b) {                                           //Оператор throw используется для явного вызова исключения.
            throw new IllegalArgumentException("Числа равны!"); // метод вызывается с недопустимым или неподходящим аргументом.
        } else
            return Math.max(a, b);
    }
    //------------------------------------------------------------------------------------------------------------------
    // 2 задание
    public static double CalcDiv(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Делить на ноль нельзя!"); //исключение во время выполнения, которое возникает при возникновении исключительного арифметического условия, например, при делении на ноль.
        } else {
            return dividend / divisor;
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    // 3 задание
    public static int convertStringToNum(String str) {

        try {
            return Integer.parseInt(str);       //преобразование
        } catch (NumberFormatException e) {     //вызывается если входная строка не может быть преобразована в допустимое целое число
            throw new NumberFormatException("Строка не может быть преобразована в целое число!");
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    // 4 задание
    public static void Age(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Недопустимый возраст!");
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    // 5 задание
    public static double Square(double Num) {
        if (Num < 0) {
            throw new IllegalArgumentException("Корень отрицательного числа не определен!");
        }
        else {
            return Math.sqrt(Num);
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    // 6 задание
    public static int Factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен!");
        }
        else if (num == 0) {
            return 1;
        }
        else {
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            return result;
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    // 7 задание
    public static void checkArray(int[] array) {
        for (int num : array) {
            if (num == 0) {
                throw new IllegalArgumentException("Массив содержит нули!");
            }
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    // 8 задание
    public static double Deg(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Степень должна быть положительной!");
        } else {
            return Math.pow(base, exponent);
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    // 9 задание
    public static String cutString(String str, int length) {
        if (length > str.length()) {
            throw new IllegalArgumentException("Число символов больше длины строки!");
        } else {
            return str.substring(0, length); // Метод substring возвращает часть строки
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    // 10 задание
    public static int ElMass(int[] mass, int element) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == element) {
                return i;
            }
        }
        throw new IllegalArgumentException("Элемент не найден!");
    }
    //------------------------------------------------------------------------------------------------------------------
    // 11 задание
    public static String toBinary(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Число должно быть положительным!");
        }
        else {
            return Integer.toBinaryString(num);
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    // 12 задание
    public static boolean isDivisible(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Делить на ноль нельзя!");
        }
        else {
            return dividend % divisor == 0;
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    // 13 задание
    public static <T> T Element(List<T> list, int index) {
        if (index < 0 || index >= list.size()) {        //возвращает список элементов, количество которых равно index, начиная с list
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка!");
        }
        else {
            return list.get(index);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача 1: Функция для нахождения максимума");
        System.out.println("Условие: Напишите функцию, которая принимает два числа и возвращает максимальное из них. " +
                "Если числа равны, выбрасывайте исключение с сообщением об ошибке.");
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        try {                                 //Конструкция try...catch...finally используется для обработки исключений.
            int Max = MaxNum(a, b);
            System.out.println("Максимальное число: " + Max);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); //возвращает подробное сообщение о произошедшем исключении.
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 2: Калькулятор деления");
        System.out.println("Условие: Создайте функцию для деления двух чисел. Если делитель равен нулю, " +
                "выбрасывайте ArithmeticException с сообщением о недопустимости деления на ноль.\n");
        System.out.print("Введите первое число: ");
        double a1 = sc.nextDouble();
        System.out.print("Введите второе число: ");
        double b1 = sc.nextDouble();
        try {
            double res = CalcDiv(a1, b1);
            System.out.println("Результат деления: " + res);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 3: Конвертер строк в числа");
        System.out.println("Условие: Напишите функцию, которая принимает строку и пытается конвертировать её в целое число. " +
                "Если строка не может быть конвертирована, выбрасывайте NumberFormatException.");
        System.out.print("введите строку: ");
        String str = sc.next();
        try {
            int num = convertStringToNum(str);
            System.out.println("Преобразованное число: " + num);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 4: Проверка возраста");
        System.out.println("Условие: Создайте функцию, которая принимает возраст и выбрасывает IllegalArgumentException, " +
                "если возраст меньше нуля или больше 150.");
        System.out.print("Введите возраст: ");
        int age = sc.nextInt();

        try {
            Age(age);
            System.out.println("Возраст допустимый)");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 5: Нахождение корня");
        System.out.println("Условие: Реализуйте функцию, которая находит корень из числа. Если число отрицательное, " +
                "выбрасывайте IllegalArgumentException.");
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        try {
            double root = Square(num);
            System.out.println("Корень числа " + num + " = " + root);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 6: Факториал");
        System.out.println("Условие: Напишите функцию, которая вычисляет факториал числа. Если число отрицательное, выбрасывайте исключение.");
        System.out.print("Введите число: ");
        int factorial = sc.nextInt();
        try {
            int fact = Factorial(factorial);
            System.out.println("Факториал числа " + factorial + " = " + fact);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 7: Проверка массива на нули");
        System.out.println("Условие: Создайте функцию, которая проверяет массив на наличие нулей. Если в массиве есть нули, выбрасывайте исключение.");
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();
        int[] mass = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            mass[i] = sc.nextInt();
        }
        try {
            checkArray(mass);
            System.out.println("Массив не содержит нулей");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 8: Калькулятор возведения в степень");
        System.out.println("Условие: Реализуйте функцию, которая возводит число в степень. Если степень отрицательная, " +
                "выбрасывайте исключение.");
        System.out.print("Введите число: ");
        int numDeg = sc.nextInt();
        System.out.print("Введите степень: ");
        int deg = sc.nextInt();

        try {
            double result = Deg(numDeg, deg);
            System.out.println("число " + numDeg + " в степени " + deg + " = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 9: Обрезка строки");
        System.out.println("Условие: Напишите функцию, которая принимает строку и число символов. Функция должна возвращать строку, " +
                "обрезанную до указанного числа символов. Если число символов больше длины строки, выбрасывайте исключение.");
        System.out.print("Введите строку: ");
        String str1 = sc.next();
        int strlength = 6;
        System.out.println("Установленная длина строки по умолчанию - " + strlength);   // если оставляю ввод через клавиатуру, выдает ошибку!!!
        try {
            String truncated = cutString(str1, strlength);
            System.out.println("Обрезанная строка: " + truncated);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 10: Поиск элемента в массиве");
        System.out.println("Условие: Напишите функцию, которая ищет элемент в массиве. Если элемент не найден, " +
                "выбрасывайте исключение с сообщением об ошибке.");
        System.out.print("Введите размер массива: ");
        int size1 = sc.nextInt();

        int[] mass1 = new int[size1];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size1; i++) {
            mass1[i] = sc.nextInt();
        }
        try {
            int index = ElMass(mass1, size1);
            System.out.println("Индекс элемента: " + index);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 11: Конвертация в двоичную систему");
        System.out.println("Условие: Создайте функцию, которая конвертирует целое число в двоичную строку. " +
                "Если число отрицательное, выбрасывайте исключение.");
        System.out.print("Введите число: ");
        int num2 = sc.nextInt();
        try {
            String binary = toBinary(num2);
            System.out.println("Двоичное представление: " + binary);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 12: Проверка делимости");
        System.out.println("Условие: Реализуйте функцию, которая принимает два числа и проверяет, делится ли первое число на второе. " +
                "Если второе число равно нулю, выбрасывайте ArithmeticException.");
        System.out.print("Введите первое число: ");
        int num3 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int num4 = sc.nextInt();
        try {
            boolean divisible = isDivisible(num3, num4);
            System.out.println("Делится: " + divisible);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 13: Чтение элемента списка");
        System.out.println("Условие: Напишите функцию, которая возвращает элемент списка по индексу. Если индекс выходит " +
                "за пределы списка, выбрасывайте IndexOutOfBoundsException.");
        System.out.print("Введите первое имя: ");
        String name = sc.next();
        System.out.print("Введите второе имя: ");
        String name1 = sc.next();
        System.out.print("Введите третье имя: ");
        String name2 = sc.next();
        System.out.println("Введите индекс: ");
        int strlength2 = sc.nextInt();
        try {
            List<String> names = new ArrayList<>(Arrays.asList(name, name1, name2));
            String name3 = Element(names, strlength2);
            System.out.println("Имя: " + name3);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 14: Парольная проверка");
        System.out.println("Условие: Создайте функцию для проверки сложности пароля. Если пароль содержит менее 8 символов, " +
                "выбрасывайте исключение WeakPasswordException.");

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 15: Проверка даты");
        System.out.println("Условие: Напишите функцию, которая проверяет, является ли строка корректной датой в формате " +
                "dd.MM.yyyy. Если формат неверен, выбрасывайте DateTimeParseException.");

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 16: Конкатенация строк");
        System.out.println("Условие: Реализуйте функцию, которая объединяет две строки. Если одна из строк равна null, " +
                "выбрасывайте NullPointerException.");

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 17: Остаток от деления");
        System.out.println("Условие: Создайте функцию, которая возвращает остаток от деления двух чисел. " +
                "Если второе число равно нулю, выбрасывайте исключение.");

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 18: Квадратный корень");
        System.out.println("Условие: Реализуйте функцию, которая находит квадратный корень числа. Если число отрицательное, " +
                "выбрасывайте исключение.");

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 19: Конвертер температуры");
        System.out.println("Условие: Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт. " +
                "Если температура меньше абсолютного нуля, выбрасывайте исключение.");

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nЗадача 20: Проверка строки на пустоту");
        System.out.println("Условие: Создайте функцию, которая проверяет, является ли строка пустой или null. " +
                "Если строка пустая или равна null, выбрасывайте исключение.");

    }
}