/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itst
 */
import java.util.*;

public class GenLib {
    public static int genInt(int start, int end) {
        double ranInt = Math.random();
        int randomInt ;
        randomInt = (int) (ranInt*((end - start) + 1) + start);
        return randomInt;

    }

    public static void main(String[]args){
        for(int i=0;i<100;i++){

          for(int j=100;j>0;j--){
              System.out.println(genInt(i,j));
          }

        }

     }

}
