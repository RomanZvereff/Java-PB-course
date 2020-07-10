package zverev_roman;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите первую фразу:");
        String firstPhrase = scanner.nextLine().toLowerCase().replaceAll("\\s*(\\s|,|!|\\.)\\s*", "");

        System.out.println("Введите вторую фразу:");
        String secondPhrase = scanner.nextLine().toLowerCase().replaceAll("\\s*(\\s|,|!|\\.)\\s*", "");

        if(comparePhrases(firstPhrase, secondPhrase)){
            System.out.println("Фразы являются анаграммой.");
        }else{
            System.out.println("Фразы не являются анаграммой.");
        }
        scanner.close();
        }

    public static boolean comparePhrases(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        return sort(str1).equals(sort(str2));
    }

    public static String sort(String str){
        char[] word = str.toCharArray();
        Arrays.sort(word);
        return new String(word);
    }

}
