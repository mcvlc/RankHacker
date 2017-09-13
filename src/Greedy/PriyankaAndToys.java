package Greedy;

import java.util.*;


public class PriyankaAndToys {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[]numArray = new int[arraySize];
        for(int i = 0;i<arraySize;i++){
            numArray[i] = sc.nextInt();
        }

        Arrays.sort(numArray);

        int count = 1;
        int currentToy=numArray[0];
        for(int i = 1;i<numArray.length;i++){
            if(numArray[i]>currentToy+4){
                count++;
                currentToy=numArray[i];
            }
        }
        System.out.println(count);
    }
}
