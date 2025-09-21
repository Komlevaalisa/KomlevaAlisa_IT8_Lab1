class Lab1 {
    // Задача 1.1
    public double fraction(double x) {
        return x % 1;
    }

    // Задача 1.3
    public int charToNum(char x) {
        return x - 48;
    }

    // Задача 1.5
    public boolean is2Digits(int x) {
        return x >= 10 && x <= 99;
    }

    // Задача 1.7
    public boolean isInRange(int a, int b, int num) {
        return (num >= a && num <= b) || (num >= b && num <= a);
    }

    // Задача 1.9
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // Задача 2.1
    public int abs(int x) {
        if (x < 0) {
            return x * (-1);
        } else {
            return x;
        }
    }

    // Задача 2.3
    public boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return false;
        }
        return x % 3 == 0 || x % 5 == 0;
    }

    // Задача 2.5
    public int max3(int x, int y, int z) {
        if (x >= y && x >= z) {
            return x;
        }
        if (y >= z) {
            return y;
        }
        return z;
    }

    // Задача 2.7
    public int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    // Задача 2.9
    public String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    // Задача 3.1
    public String listNums(int x) {
        String result = "0";
        for (int i = 1; i <= x; i++) {
            result += " " + i;
        }
        return result;
    }

    // Задача 3.3
    public String chet(int x) {
        String result = "0";
        for (int i = 2; i <= x; i += 2) {
            result += " " + i;
        }
        return result;
    }

    // Задача 3.5
    public int numLen(long x) {
        if (x == 0) {
            return 1;
        }
        int count = 0;
        long num = x;
        if (num < 0) {
            num = -num;
        }
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    // Задача 3.7
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // Задача 3.9
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(" ".repeat(x - i) + "*".repeat(i));
        }
    }

    // Задача 4.1
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Задача 4.3
    public int maxAbs(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int maxAbsValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int currentAbs = arr[i];
            if (currentAbs < 0) {
                currentAbs = -currentAbs;
            }
            int maxAbs = maxAbsValue;
            if (maxAbs < 0) {
                maxAbs = -maxAbs;
            }
            if (currentAbs > maxAbs) {
                maxAbsValue = arr[i];
            }
        }
        return maxAbsValue;
    }

    // Задача 4.5
    public int[] add(int[] arr, int[] ins, int pos) {
        int newLength = arr.length + ins.length;
        int[] result = new int[newLength];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[ins.length + i] = arr[i];
        }
        return result;
    }

    // Задача 4.7
    public int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    // Задача 4.9
    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }
}