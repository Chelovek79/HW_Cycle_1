public class Main {
    public static void main(String[] args) {

// Задание 1.
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println('\n' + "-----------------------");

// Задание 2.
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println('\n' + "-----------------------");

// Задание 3.
        for (int i = 0; i <= 17; i++) {
           if (i % 2 == 0) {
               System.out.print(i + " ");
           }
        }
        System.out.println('\n' + "-----------------------");

// Задание 4.
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println('\n' + "-----------------------");

// Задание 5.
        for (int i = 1904; i <= 2096; i = i+4) {
            System.out.println(i + " - год является високосным");
        }
        System.out.println("-----------------------");

// Задание 6.
        for (int i = 7; i <=98; i = i+7) {
            System.out.print(i + " ");
        }
        System.out.println('\n' + "-----------------------");

// Задание 7.
        for (int i = 1; i <= 512; i += i) {
            System.out.print(i + " ");
        }
        System.out.println('\n' + "-----------------------");

// Задание 8.
        int Kopilka = 0;
        for (int i = 1; i <= 12; i++) {
            Kopilka = Kopilka + 29000;
            System.out.println("Месяц - " + i + ". Cумма накоплений равна " + Kopilka + " рублей");
        }
        System.out.println("-----------------------");

// Задание 9.
        int Vklad = 29000;      // Ежемесячное пополнение банковской суммы;
        int Summa_Bank = 0; // Первый взнос;
        for (int i = 1; i <= 12; i++) {
            Summa_Bank = Summa_Bank + (Summa_Bank/100) + Vklad;
            System.out.println("Месяц - " + i + ". Cумма накоплений равна " + Summa_Bank + " рублей");
        }
        System.out.println("-----------------------");

    }
}