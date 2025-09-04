package yenipabka;

import java.util.Scanner;

public class HavaMesleheti {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("temperaturu daxil edin");
        double temperatur = scanner.nextDouble();


        if (temperatur > 25) {
            System.out.println("Nazik geyinmək məsləhətdir.");

        } else if (temperatur >= 15 && temperatur <= 25) {
            System.out.println("Normal geyinə bilərsiniz.");

        } else if (temperatur >= 5 && temperatur < 15) {
            System.out.println("Qalın geyinməyiniz tövsiyə olunur.");

        } else {
            System.out.println("Çox qalın geyinin və çölə çıxmayın.");
        }

    }
}