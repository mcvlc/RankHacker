package Greedy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PermutingTwoArrays{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numTestCases = Integer.parseInt(sc.nextLine());
        for(int i = 0;i<numTestCases;i++){
            int arraySize = sc.nextInt();
            int kValue = sc.nextInt();
            sc.nextLine();
            int []numArrayA = new int[arraySize];
            int []numArrayB = new int[arraySize];
            for(int k=0;k<arraySize;k++){
                numArrayA[k] = sc.nextInt();
            }
            for(int k=0;k<arraySize;k++){
                numArrayB[k] = sc.nextInt();

            }
            Arrays.sort(numArrayA);
            Arrays.sort(numArrayB);

            boolean isPossible = true;
            for(int j=0;j<numArrayA.length;j++){
                if(numArrayA[j]+numArrayB[numArrayB.length-1-j] < kValue){
                    isPossible = false;
                    break;
                }
            }
            System.out.println(isPossible?"YES":"NO");

        }
    }
}