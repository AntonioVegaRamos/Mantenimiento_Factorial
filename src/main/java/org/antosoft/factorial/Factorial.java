package org.antosoft.factorial;

public class Factorial {


    public int compute(int value) {
        int result = 1;

        if(value < 0)
            throw new IllegalArgumentException("Error: negative number --> " + value);

        //Just compute for values > 0
        for (int i = value; i > 1; --i)
            result *= i;

         return result;
    }



} // end of class
