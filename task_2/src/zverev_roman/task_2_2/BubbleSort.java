package zverev_roman.task_2_2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numArray = new int[10];
        int count = 0;
        while(true){
            if(count == 10)
                break;
            System.out.print("Введите число:");
            int num = Integer.parseInt(reader.readLine());
            numArray[count] = num;
            count++;
        }

        for(int i = numArray.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if( numArray[j] > numArray[j + 1]){
                    int tmp = numArray[j];
                    numArray[j] = numArray[j + 1];
                    numArray[j + 1] = tmp;
                }
            }
        }

        for(int i = 0; i < numArray.length; i++){
            System.out.println(numArray[i]);
        }
    }

}
