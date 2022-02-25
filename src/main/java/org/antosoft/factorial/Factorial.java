package org.antosoft.factorial;

/**
 *  Class providing a method that computes the factorial of an integer number
 *
 * @author Antonio V
 */
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
