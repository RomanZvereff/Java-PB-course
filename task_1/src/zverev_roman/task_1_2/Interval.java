package zverev_roman.task_1_2;

import java.util.Scanner;

public class Interval {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = getNumber();
        if(number >= 0 && number <= 14){
            System.out.println("Ваше число вошло в диапазон [0 - 14]");
        }else if(number >= 15 && number <= 35){
            System.out.println("Ваше число вошло в диапазон [15 - 35]");
        }else if(number >= 36 && number <= 50){
            System.out.println("Ваше число вошло в диапазон [36 - 50]");
        }else if(number >= 51 && number <= 100){
            System.out.println("Ваше число вошло в диапазон [51 - 100]");
        }else{
            System.out.println("Ваше число не вошло ни в один из диапазонов!");
        }
    }

    public static int getNumber(){
        int num = -1;
        System.out.println("Введите число от 0 до 100:");
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }else{
            getNumber();
        }
        return num;
    }

}
