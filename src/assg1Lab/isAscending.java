/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assg1Lab;

import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import jdk.nashorn.tools.ShellFunctions;

/**
 *
 * @author hp
 */
public class isAscending {
    public  static boolean isIncreazing(int []array) {
        boolean isAscending=false;
        for(int i=0;i<array.length;i++){
            if(array[i]<array[i+1]){
                isAscending=true;
            }
            if(isAscending){
                System.out.println(array[i]+"isAscending");}
            else{
                System.out.println(array[i]+ "not isAscending");}
        }
    return isAscending;
    }
public static void main(String[]args){
int[]array= new int[]{1,2,4};
for(int i=0;i<array.length;i++){
    System.out.println("enter the integer");
}  

}

}