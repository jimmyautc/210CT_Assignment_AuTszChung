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

public class TestLib {
    public static void main(String[]args){
        int ranShape;
        int randX, randY, randRadius, randWidth, randHeight;
        Shape[] shapes = new Shape[10];
        for(int i=0;i<shapes.length;i++) {
            ranShape = GenLib.genInt(1, 2);
            randX = GenLib.genInt(1, 30);
            randY = GenLib.genInt(1, 30);
            randRadius = GenLib.genInt(1, 30);
            randWidth = GenLib.genInt(1, 30);
            randHeight = GenLib.genInt(1, 30);
            if (ranShape == 1) {
                shapes[i] = new Circle(randX, randY, randRadius);
            } else {
                shapes[i] = new Rectangle(randX, randY, randWidth, randHeight);
            }
            System.out.print(shapes[i].getName() +
                    ": " + shapes[i].toString());
            System.out.println("; Area = " + shapes[i].getArea());
        }

    }
}
