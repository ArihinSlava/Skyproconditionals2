

public class Main {

    public static void main(String[] args) {
        int age = 7;
        if (age > 18) {
            System.out.println("Ты должен праздновать");
            if (age < 21) {
                System.out.println("Выпей сливочного пива");
            } else {
                System.out.println("Иди куда хочешь и пей что хочешь");
            }
        } else if (age > 7) {
                System.out.println("Иди в школу");
            } else {
                System.out.println("Иди в десткий сад");
            }
        int age1 = 15;
        if (age1 == 18) {
            System.out.println("С окончанием школы");
        } else if (age1 == 21) {
            System.out.println("Теперь тебе можно пить алкоголь");
        } else if (age1 == 7) {
            System.out.println("Иди в школу");
        } else {
            System.out.println("Пока сказать нечего");
        }

    }
}