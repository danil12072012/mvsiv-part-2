public class Main {
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxWastes = 99_000;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxWastes) {
                maxWastes = arr[i];
            }
        }

        int minWastes = 201_000;

        for (int i = 0; i < arr.length; i++) {
            if (minWastes > arr[i]) {
                minWastes = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWastes + " рублей. Максимальная сумма трат за день составила " + maxWastes + " рублей.");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        double average = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length -1; index >= 0 ; index--) {
            if (index == 0) {
                System.out.print(reverseFullName[index]);
                break;
            }
            System.out.print(reverseFullName[index]);
    }}}





