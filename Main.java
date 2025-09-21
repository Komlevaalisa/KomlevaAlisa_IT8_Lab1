import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            double x;
            System.out.print("Задача 1.1 ");
            System.out.print("Введите вещественное число, для определения дробной части: ");
            x = scanner.nextDouble();
            Lab1 t = new Lab1();
            System.out.println("Дробная часть числа " + x + " равна: " + t.fraction(x));
        }
        {
            Scanner scanner = new Scanner(System.in);
            char x;
            System.out.print("Задача 1.3 ");
            System.out.print("символ х, представляет собой один из \"0 1 2 3 4 5 6 7 8 9\" ");
            System.out.print("( код символа '0' — это число 48). ");
            System.out.print("Введите символ для преобразования: ");
            x = scanner.next().charAt(0);
            Lab1 t = new Lab1();
            System.out.println(x + " - " + t.charToNum(x));
        }
        {
            Scanner scanner = new Scanner(System.in);
            int x;
            System.out.print("Задача 1.5 ");
            System.out.print("Введите число, для определения двузначности. ");
            System.out.print("(true-двузначное, false-другое): ");
            x = scanner.nextInt();
            Lab1 t = new Lab1();
            System.out.println("Число " + x + " двузначное? " + t.is2Digits(x));
        }
        {
            Scanner scanner = new Scanner(System.in);
            int a;
            int b;
            int num;
            System.out.print("Задача 1.7 ");
            System.out.print("Входит ли число в диапозон(включая границы). ");
            System.out.print("true-входит, false-не входит. ");
            System.out.print("Введите левую границу(a): ");
            a = scanner.nextInt();
            System.out.print("Введите правую границу(b): ");
            b = scanner.nextInt();
            System.out.print("Введите число для проверки: ");
            num = scanner.nextInt();
            Lab1 t = new Lab1();
            System.out.println("Число " + num + " входит в диапозон? " + t.isInRange(a, b, num));
        }
        {
            Scanner scanner = new Scanner(System.in);
            int a;
            int b;
            int c;
            System.out.print("Задача 1.5 ");
            System.out.print("Проверка чисел на равенство. ");
            System.out.print("(true-все три числа равны, false-не равны). ");
            System.out.print("Введите первое число: ");
            a = scanner.nextInt();
            System.out.print("Введите второе число: ");
            b = scanner.nextInt();
            System.out.print("Введите третье число: ");
            c = scanner.nextInt();
            Lab1 t = new Lab1();
            System.out.println("Числа равны? " + t.isEqual(a, b, c));
        }
        {
            Scanner scanner = new Scanner(System.in);
            int x;
            System.out.print("Задача 2.1 ");
            System.out.print("Введите число, для определения модуля: ");
            x = scanner.nextInt();
            Lab1 t = new Lab1();
            System.out.println("Модуль числа " + x + " равен: " + t.abs(x));
        }
        {
            Scanner scanner = new Scanner(System.in);
            int x;
            System.out.print("Задача 2.3 ");
            System.out.print("Проверка числа на деление на 3 ИЛИ 5. ");
            System.out.print("(true-делится, false-не делится): ");
            System.out.print("Введите число: ");
            x = scanner.nextInt();
            Lab1 t = new Lab1();
            System.out.println("Число " + x + " делится на 3 ИЛИ 5? " + t.is35(x));
        }
        {
            Scanner scanner = new Scanner(System.in);
            int x;
            int y;
            int z;
            System.out.print("Задача 2.5 ");
            System.out.print("Нахождение максимального числа. ");
            System.out.print("Введите первое число: ");
            x = scanner.nextInt();
            System.out.print("Введите второе число: y");
            y = scanner.nextInt();
            System.out.print("Введите третье число: ");
            z = scanner.nextInt();
            Lab1 t = new Lab1();
            System.out.println("Максимальное число = " + t.max3(x, y, z));
        }
        {
            Scanner scanner = new Scanner(System.in);
            int x;
            int y;
            System.out.print("Задача 2.7 ");
            System.out.print("Нахождение суммы двух чисел. ");
            System.out.print("(Если сумма в диапозоне 10-19, возвращаем 20). ");
            System.out.print("Введите первое число: ");
            x = scanner.nextInt();
            System.out.print("Введите второе число: ");
            y = scanner.nextInt();
            Lab1 t = new Lab1();
            System.out.println("Сумма чисел = " + t.sum2(x, y));
        }
        {
            Scanner scanner = new Scanner(System.in);
            int x;
            System.out.print("Задача 2.9 ");
            System.out.print("День недели. ");
            System.out.print("Введите число, где 1- это понедельник, а 7 – воскресенье: ");
            x = scanner.nextInt();
            Lab1 t = new Lab1();
            System.out.println(x + " день недели - " + t.day(x));
        }
        {
            Scanner scanner = new Scanner(System.in);
            int x;
            System.out.print("Задача 3.1 ");
            System.out.print("Возращение строки с числами от 0 до x. ");
            System.out.print("Введите x: ");
            x = scanner.nextInt();
            Lab1 t = new Lab1();
            System.out.println(t.listNums(x));
        }
        {
            Scanner scanner = new Scanner(System.in);
            int x;
            System.out.print("Задача 3.3 ");
            System.out.print("Возращение строки с четными числами от 0 до x. ");
            System.out.print("Введите x: ");
            x = scanner.nextInt();
            Lab1 t = new Lab1();
            System.out.println(t.chet(x));
        }
        {
            Scanner scanner = new Scanner(System.in);
            int x;
            System.out.print("Задача 3.5 ");
            System.out.print("Возращение количества знаков в числе. ");
            System.out.print("Введите число: ");
            x = scanner.nextInt();
            Lab1 t = new Lab1();
            System.out.println("Количество знаков в " + x + " - " + t.numLen(x));
        }
        {
            Scanner scanner = new Scanner(System.in);
            int x;
            System.out.print("Задача 3.7 ");
            System.out.print("Вывод квадрата из символов *. ");
            System.out.print("Введите число: ");
            x = scanner.nextInt();
            Lab1 t = new Lab1();
            t.square(x);
        }
        {
            Scanner scanner = new Scanner(System.in);
            int x;
            System.out.print("Задача 3.9 ");
            System.out.print("Вывод правого треугольника из символов *. ");
            System.out.print("Введите число: ");
            x = scanner.nextInt();
            Lab1 t = new Lab1();
            t.rightTriangle(x);
        }
        {
            Scanner scanner = new Scanner(System.in);
            Lab1 t = new Lab1();
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
            int x = scanner.nextInt();

            int result = t.findFirst(arr, x);
            System.out.println("Индекс первого вхождения: " + result);
        }
        {
            Scanner scanner = new Scanner(System.in);
            Lab1 t = new Lab1();
            System.out.print("Задача 4.3 ");
            System.out.print("Поиск наибольшего значения по модулю в массиве. ");

            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }
            int result = t.maxAbs(arr);
            System.out.println("Наибольшее значение: " + result);
        }
        {
            Scanner scanner = new Scanner(System.in);
            Lab1 t = new Lab1();
            System.out.print("Задача 4.5 ");
            System.out.print("Добавление массива в массив. ");

            System.out.print("Введите размер 1 массива: ");
            int size1 = scanner.nextInt();
            int[] arr = new int[size1];
            System.out.println("Введите элементы 1 массива:");
            for (int i = 0; i < size1; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }
            System.out.print("Введите размер 2 массива: ");
            int size2 = scanner.nextInt();
            int[] ins = new int[size2];
            System.out.println("Введите элементы 2 массива:");
            for (int i = 0; i < size2; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                ins[i] = scanner.nextInt();
            }
            System.out.print("Введите позицию для вставки (0-" + arr.length + "): ");
            int pos = scanner.nextInt();

            int[] result = t.add(arr, ins, pos);

            System.out.print("Результат: [");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        {
            Scanner scanner = new Scanner(System.in);
            Lab1 t = new Lab1();

            System.out.print("Задание 4.7 (реверс массива через новый массив) ");
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];

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
        }
        {
            Scanner scanner = new Scanner(System.in);
            Lab1 t = new Lab1();

            System.out.print("Задание 4.9 (все вхождения числа) ");
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            System.out.print("Введите число для поиска: ");
            int x = scanner.nextInt();

            System.out.print("Исходный массив: [");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            int[] result = t.findAll(arr, x);

            System.out.print("Индексы вхождений числа " + x + ": [");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}