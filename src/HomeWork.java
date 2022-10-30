public class HomeWork {
    public static void main(String[] args) {
/// Задание 1
        System.out.println("Задание 1 ");

        int clientOs = 0;
        if (clientOs == 1) {
            System.out.println("Установите версию приложений для Android по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложений для iOS по ссылке");
        }
        /// Задание 2
        System.out.println("Задание 2 ");
        int clientDeviceYear = 2015;
        if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложений для Android по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установаите версию приложений для iOS по ссылке");
        }

        /// Задача 3
        System.out.println("Задача 3");

        int year = 2021;
        if (year % 4 == 0)  {
            System.out.println(year + " год является высокосным");
        } else if (year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является невыскосным");
        }

        /// Задача 4
        System.out.println("Задача 4");

        int deliveryDistance = 5;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней :1 ");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней :2 ");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100)
            System.out.println("Потребуется дней :3 ");

        /// Задача 5
        System.out.println("задача 5");

        int mouthNumber = 15;
        switch (mouthNumber) {
            case 1:
                System.out.println("Январь принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Февраль принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Март принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Апрель принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Май принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Июнь принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Июль принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Август принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Сентябрь принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Октябрь приндлежит к сезону осень");
                break;
            case 11:
                System.out.println("Ноябрь принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Декабрь принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }

        }

    }
