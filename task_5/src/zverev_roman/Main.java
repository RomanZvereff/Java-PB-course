package zverev_roman;

import zverev_roman.psychology.Temperament;
import zverev_roman.psychology.TemperamentTypes;
import zverev_roman.psychology.types.Choleric;
import zverev_roman.psychology.types.Melancholic;
import zverev_roman.psychology.types.Phlegmatic;
import zverev_roman.psychology.types.Sanguine;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Temperament> temperaments = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        chooseTemperament();

        Choleric choleric1 = new Choleric();
        choleric1.setName("Холерик");
        Choleric choleric2 = new Choleric();
        choleric2.setName("Холерик");
        Choleric choleric3 = new Choleric();
        choleric3.setName("Тест");

        System.out.println("Результат метода equals - " + choleric1.equals(choleric2));
        System.out.println("Результат метода equals - " + choleric1.equals(choleric3));

        temperaments.add(new Choleric());
        temperaments.add(new Phlegmatic());
        temperaments.add(new Sanguine());
        temperaments.add(new Melancholic());

        for(Temperament temperament : temperaments){
            temperament.toBehave();
        }

    }

    public static void chooseTemperament(){
        Choleric choleric;
        Phlegmatic phlegmatic;
        Sanguine sanguine;
        Melancholic melancholic;

        boolean isCorrect = false;

        do{
            System.out.println("Характеристиками темпирамента: \n введите его название (Холерик, Флегматик, Сангвиник, Меланхолик)");
            String inputStr = scanner.nextLine().toLowerCase();

            if(inputStr.contains("\\s")){
                inputStr = inputStr.substring(0, inputStr.indexOf("\\s"));
            }

            if(inputStr.equals(TemperamentTypes.CHOLERIC.toString())){
                isCorrect = true;
                choleric = new Choleric();
                choleric.toBehave();
                printClass(choleric);
                System.out.println(choleric.hashCode());
            }else if(inputStr.equals(TemperamentTypes.PHLEGMATIC.toString())){
                isCorrect = true;
                phlegmatic = new Phlegmatic();
                phlegmatic.toBehave();
                printClass(phlegmatic);
                System.out.println(phlegmatic.hashCode());
            }else if(inputStr.equals(TemperamentTypes.SANGUINE.toString())){
                isCorrect = true;
                sanguine = new Sanguine();
                sanguine.toBehave();
                printClass(sanguine);
                System.out.println(sanguine.hashCode());
            }else if(inputStr.equals(TemperamentTypes.MELANCHOLIC.toString())){
                isCorrect = true;
                melancholic = new Melancholic();
                melancholic.toBehave();
                printClass(melancholic);
                System.out.println(melancholic.hashCode());
            }else{
                System.out.println("Несуществующий темперамент.");
            }
        }while(!isCorrect);

        scanner.close();
    }

    public static void printClass(Object obj){
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(obj.toString());
    }

}
