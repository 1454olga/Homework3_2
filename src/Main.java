public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clienOS = 1;
        if (clienOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clienOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("неверное значение");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clienOS = 1;
        int divaceYear = 2011;
        if (clienOS == 0) {
            if (divaceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clienOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2024;
        if ((year % 4 ==0 && year % 100 !=0) || year % 400 ==0) {
            System.out.println("год является високосным");
        }   else {
            System.out.println("год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveriDistance = 95;
        int deliveri = 1;
        if (deliveriDistance <= 20) {
            deliveri = deliveri;
            System.out.println("Потребуется дней: " + deliveri);
        }   else if (deliveriDistance > 20 && deliveriDistance <=60) {
            deliveri += 1;
            System.out.println("Потребуется дней: " + deliveri);
        }   else if (deliveriDistance > 60 && deliveriDistance <=100) {
            deliveri += 1+1;
            System.out.println("Потребуется дней: " + deliveri);
        }   else if (deliveriDistance > 100) {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int mouth =5;
        switch (mouth) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный месяц");
        }
    }
}