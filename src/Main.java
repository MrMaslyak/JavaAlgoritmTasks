import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        int result = MaxGeneralDivider(84, 90);
        System.out.println("Max General Divider: " + result);
        SumTrueConst(12345, 15);
        SumTrueConst(9876, 20);
        searchFibonacciSequence(23);
        int[] arr = {8, 2, 1};
        isSorted(arr);
    }

    public static int MaxGeneralDivider(int a, int b) {
        while (a != 0) {
            int temp = a;
            a = b % a;
            b = temp;
        }
        return b;
    }

    public static void SumTrueConst(int num, int userNum) {
        int sum = 0;
        int originalNum = num;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if (sum == userNum) {
            System.out.println("Sum of digits of a given number: " + originalNum + " the previous tasks correspond to constants - " + sum);
        } else {
            System.out.println("Sum of digits of a given number: " + originalNum + " NOT the previous tasks correspond to constants - " + sum);
        }
    }

    public static void searchFibonacciSequence(int userNum) {
        if (userNum <= 0) {
            System.out.println("Число должно быть больше 0");
            return;
        }

        int current = userNum - 1;

        while (current < current+1) {
            int temp = current;
            current += userNum;
            userNum = temp;

            boolean isWork = false;
            for (int i = 2; i < current; i++) {
                if (current % i == 0) {
                    isWork = true;
                    break;
                }
            }

            if (!isWork) {
                System.out.println(current + " - Простое число");
                break;
            }

        }
    }


    public static void isSorted(int[] arr) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                increasing = false;
            }
            if (arr[i] < arr[i + 1]) {
                decreasing = false;
            }
        }

        if (!increasing && !decreasing) {
            System.out.println("Масив не впорядкований.");
        } else {
            if (increasing) {
                System.out.println("Масив впорядкований за зростанням.");
            }
            if (decreasing) {
                System.out.println("Масив впорядкований за спаданням.");
            }
        }


    }


}


