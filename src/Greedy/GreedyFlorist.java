package Greedy;
import java.io.*;
import java.util.*;

public class GreedyFlorist{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> flowerPriceList = new ArrayList<Integer>();
        int numFlowers = sc.nextInt();
        int numFriends = sc.nextInt();
        for(int i = 0; i<numFlowers;i++){
            flowerPriceList.add(sc.nextInt());
        }
        // Sort the ArrayList in reverse order to start bying flowers from most expensive
        Collections.sort(flowerPriceList,Collections.reverseOrder());
        int flowersBought = 0;
        int friendNum = 0;
        int total = 0;
        for(int price:flowerPriceList){
            //itterate throught all the flower prices and calculate the total
            total +=(flowersBought+1)*price;
            friendNum++;
            if(friendNum == numFriends){
                //if all friends bought flowers reset the friend counter and restart the cycle
                friendNum = 0;
                flowersBought++;
            }
        }
        System.out.println(total);
    }
}