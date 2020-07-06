package zverev_roman.task_2_1;

import java.util.Scanner;

public class Bingo {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int countAttempt = 0;
        int randomNum = getRandom();

        while(true){
            int customNum = getCustomNum();
            countAttempt++;

            if(customNum > 100){
                break;
            }

            if(customNum == randomNum){
                System.out.println("Вы угадали! потрачено " + countAttempt + " попыток(ки)");
                break;
            }else if(customNum < randomNum){
                System.out.println("Загаданное число больше! Попробуйте еще раз");
            }else{
                System.out.println("Загаданное число меньше! Попробуйте еще раз");
            }
        }
        scanner.close();
    }

    public static int getRandom(){
        return (int) (Math.random() * ((100) + 1));
    }

    public static int getCustomNum(){
        int number = -1;
        System.out.println("Введите число (для выхода введите любое число больше 100):");
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
        }else{
            getCustomNum();
        }
        return number;
    }

}
