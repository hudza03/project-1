
package com.example;

import java.util.Random;
import static java.lang.Math.sqrt;

public class ComputeMethods {
    public  double fToC(double degreesF){ 
        double suhu = 5.0/9*(degreesF - 32);
        String suhuFix = (Double.toString(suhu).substring(0, 5));
        
        System.out.println("temperature : " + suhuFix + " C");
        return 0;
    }
    public  double hypotenuse(double a, int b){
        double c = (a*a) + (b*b);
        c = sqrt(c);
        System.out.println("C : " + c);
        return 0;
    }
    public int roll(){
        Random rand = new Random();
        int dice = rand.nextInt(6)+1;
        int dice2 = rand.nextInt(6)+1;
        System.out.println("roll : " + dice + " and " + dice2);
        return 0;
    
    }
}
