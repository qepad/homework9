public class Main {
    public static void main(String[] args) {

        // task 1

        System.out.println("Задача 1");
        int[] payments = {70000, 71242, 23565, 95732, 63853};
        var sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum += payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        // task 2

        System.out.println("Задача 2");
        int[] payments2 = {65123, 21533, 84631, 2314, 56231};
        var max = payments2[0];
        var min = payments2[0];
        for (int i = 1; i < payments2.length; i++) {
            if (payments2[i] > max) {
                max = payments2[i];
            } else if (payments2[i] < min) {
                min = payments2[i];
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");


        // task 3

        System.out.println("Задача 3");
        int[] payments3 = {147932, 12423, 9452, 74652, 74212};
        double sum3 = 0;
        // считаем сумму элементов
        for (int i = 0; i < payments.length; i++) {
            sum3 += payments3[i];
        }
        // считаем среднее
        double average = sum3 / payments3.length;

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");


        // task 4

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; ; i--) {
            if (i < reverseFullName.length && i != 0) {
                System.out.print(reverseFullName[i] + " ");
            } else if (i == 0) {
                System.out.print(reverseFullName[i]);
                break;
            }

        }


    }
}