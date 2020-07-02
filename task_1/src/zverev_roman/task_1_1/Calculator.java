package zverev_roman.task_1_1;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = getNumber();
        double num2 = getNumber();
        char operation = getOperation();

        switch(operation){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                if(num2 == 0){
                    System.out.println("Деление на ноль недопустимо!");
                    break;
                }else{
                    System.out.println(num1 / num2);
                    break;
                }
            default:
                System.out.println("Некорректная операция!");
        }

        scanner.close();
    }

    public static double getNumber(){
        double num = 0;
        boolean isNotNumber;
        do{
            System.out.println("Введите число:");
            num = scanner.nextDouble();
            isNotNumber = false;
        }while(isNotNumber);
        return num;
    }

    public static char getOperation(){
        char operation = '\u0000';
        System.out.println("Введите арифметическую операцию (+, -, *, /):");
        if(scanner.hasNextLine()){
            operation = scanner.next().charAt(0);
        }else{
            getOperation();
        }
        return operation;
    }



}
