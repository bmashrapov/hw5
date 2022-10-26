public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите мобильное приложение для системы IOS по ссылке");
        } else {
            System.out.println("Установите мобильное приложение для Android  по ссылке");
        }
        //Задание 2
        System.out.println("Задание 2");
        int clientOS1 = 1;
        int clientDeviceYear = 2014;
        if (clientOS1 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для системы IOS по ссылке");
            } else {
                System.out.println("Установите мобильное приложение для системы IOS по ссылке");
            }
        } else {
            if (clientOS1 == 1) {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для системы Android по ссылке");
                }
            } else {
                System.out.println("Установите мобильное приложение для системы Android по ссылке");
            }
        }
        //Задание 3
        System.out.println("Задание 3");
        int year = 400;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
        //Задание 5
        System.out.println("Задание 5");
        int monthNumber = 8;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
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
                System.out.println("Такого месяца не существует");
        }
        }


    }




