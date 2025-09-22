import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lab1 t = new Lab1();

        System.out.print("Задача 1.1 ");
        System.out.print("Введите вещественное число, для определения дробной части: ");
        double x1 = scanner.nextDouble();
        System.out.println("Дробная часть числа " + x1 + " равна: " + t.fraction(x1));

        System.out.print("Задача 1.3 ");
        System.out.print("символ х, представляет собой один из \"0 1 2 3 4 5 6 7 8 9\" ");
        System.out.print("( код символа '0' — это число 48). ");
        System.out.print("Введите символ для преобразования: ");
        char x2 = scanner.next().charAt(0);
        System.out.println(x2 + " - " + t.charToNum(x2));

        System.out.print("Задача 1.5 ");
        System.out.print("Введите число, для определения двузначности. ");
        System.out.print("(true-двузначное, false-другое): ");
        int x = scanner.nextInt();
        System.out.println("Число " + x + " двузначное? " + t.is2Digits(x));

        System.out.print("Задача 1.7 ");
        System.out.print("Входит ли число в диапозон(включая границы). ");
        System.out.print("true-входит, false-не входит. ");
        System.out.print("Введите левую границу(a): ");
        int a = scanner.nextInt();
        System.out.print("Введите правую границу(b): ");
        int b = scanner.nextInt();
        System.out.print("Введите число для проверки: ");
        int num = scanner.nextInt();
        System.out.println("Число " + num + " входит в диапозон? " + t.isInRange(a, b, num));

        System.out.print("Задача 1.9 ");
        System.out.print("Проверка чисел на равенство. ");
        System.out.print("(true-все три числа равны, false-не равны). ");
        System.out.print("Введите первое число: ");
        a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();
        System.out.println("Числа равны? " + t.isEqual(a, b, c));

        System.out.print("Задача 2.1 ");
        System.out.print("Введите число, для определения модуля: ");
        x = scanner.nextInt();
        System.out.println("Модуль числа " + x + " равен: " + t.abs(x));

        System.out.print("Задача 2.3 ");
        System.out.print("Проверка числа на деление на 3 ИЛИ 5. ");
        System.out.print("(true-делится, false-не делится): ");
        System.out.print("Введите число: ");
        x = scanner.nextInt();
        System.out.println("Число " + x + " делится на 3 ИЛИ 5? " + t.is35(x));

        System.out.print("Задача 2.5 ");
        System.out.print("Нахождение максимального числа. ");
        System.out.print("Введите первое число: ");
        a = scanner.nextInt();
        System.out.print("Введите второе число: y");
        b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        c = scanner.nextInt();
        System.out.println("Максимальное число = " + t.max3(a, b, c));

        System.out.print("Задача 2.7 ");
        System.out.print("Нахождение суммы двух чисел. ");
        System.out.print("(Если сумма в диапозоне 10-19, возвращаем 20). ");
        System.out.print("Введите первое число: ");
        a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        b = scanner.nextInt();
        System.out.println("Сумма чисел = " + t.sum2(a, b));

        System.out.print("Задача 2.9 ");
        System.out.print("День недели. ");
        System.out.print("Введите число, где 1- это понедельник, а 7 – воскресенье: ");
        x = scanner.nextInt();
        System.out.println(x + " день недели - " + t.day(x));

        System.out.print("Задача 3.1 ");
        System.out.print("Возращение строки с числами от 0 до x. ");
        System.out.print("Введите x: ");
        x = scanner.nextInt();
        System.out.println(t.listNums(x));

        System.out.print("Задача 3.3 ");
        System.out.print("Возращение строки с четными числами от 0 до x. ");
        System.out.print("Введите x: ");
        x = scanner.nextInt();
        System.out.println(t.chet(x));

        System.out.print("Задача 3.5 ");
        System.out.print("Возращение количества знаков в числе. ");
        System.out.print("Введите число: ");
        x = scanner.nextInt();
        System.out.println("Количество знаков в " + x + " - " + t.numLen(x));

        System.out.print("Задача 3.7 ");
        System.out.print("Вывод квадрата из символов *. ");
        System.out.print("Введите число: ");
        x = scanner.nextInt();
        t.square(x);

        System.out.print("Задача 3.9 ");
        System.out.print("Вывод правого треугольника из символов *. ");
        System.out.print("Введите число: ");
        x = scanner.nextInt();
        t.rightTriangle(x);

        System.out.print("Задача 4.1 ");
        System.out.print("Поиск индекса первого вхождения числа в массив. ");

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Введите число для поиска (x): ");
        x = scanner.nextInt();

        int result = t.findFirst(arr, x);
        System.out.println("Индекс первого вхождения: " + result);

        System.out.print("Задача 4.3 ");
        System.out.print("Поиск наибольшего значения по модулю в массиве. ");

        System.out.print("Введите размер массива: ");
        size = scanner.nextInt();
        arr = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        result = t.maxAbs(arr);
        System.out.println("Наибольшее значение: " + result);

        System.out.print("Задача 4.5 ");
        System.out.print("Добавление массива в ма array. ");

        System.out.print("Введите размер 1 массива: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Введите элементы 1 массива:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Введите размер 2 массива: ");
        int size2 = scanner.nextInt();
        int[] ins = new int[size2];
        System.out.println("Введите элементы 2 массива:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            ins[i] = scanner.nextInt();
        }
        System.out.print("Введите позицию для вставки (0-" + arr1.length + "): ");
        int pos = scanner.nextInt();

        int[] result3 = t.add(arr1, ins, pos);

        System.out.print("Результат: [");
        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i]);
            if (i < result3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Задание 4.7 (реверс массива через новый массив) ");
        System.out.print("Введите размер массива: ");
        size = scanner.nextInt();
        arr = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Исходный массив: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[] reversedArray = t.reverseBack(arr);

        System.out.print("Перевернутый массив: [");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i]);
            if (i < reversedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Исходный массив после реверса: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Задание 4.9 (все вхождения числа) ");
        System.out.print("Введите размер массива: ");
        size = scanner.nextInt();
        arr = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Введите число для поиска: ");
        x = scanner.nextInt();

        System.out.print("Исходный массив: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[] result4 = t.findAll(arr, x);

        System.out.print("Индексы вхождений числа " + x + ": [");
        for (int i = 0; i < result4.length; i++) {
            System.out.print(result4[i]);
            if (i < result4.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}