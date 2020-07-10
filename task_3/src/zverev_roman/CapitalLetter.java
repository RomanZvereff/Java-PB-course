package zverev_roman;

import java.util.Scanner;

public class CapitalLetter {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите слово или фразу:");
        String[] words = scanner.nextLine().split(" ");

        for(String str: words){
            System.out.print(str.substring(0, 1).toUpperCase() + str.substring(1) + " ");
        }
        scanner.close();
    }
}
