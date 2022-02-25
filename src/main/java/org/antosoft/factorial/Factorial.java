package org.antosoft.factorial;

public class Factorial {


    public int compute(int value) {
        int result;

        if(value < 0)
            throw new IllegalArgumentException("Error: negative number --> " + value);
        else if((value == 0) || (value == 1))
            result = 1;
        else
            result = value * compute(--value);

         return result;
    }



} // end of class
