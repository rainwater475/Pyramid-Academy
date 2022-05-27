package genspark.assignments.section3;

import genspark.assignments.Assignment;

public class DivideByZero implements Assignment {
    public Object solution(int one, int two) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int div=0;
        String f="";
try {
    //System.out.println("kjhlkh");
     //f=f+div;
    if(two==0)
    {
        throw new ArithmeticException("Caught Exception: Divide by zero");
    }
    else{    div = one / two;}

}
catch (ArithmeticException e)
        {
          System.out.println( e.getMessage());
            //throw new ArithmeticException(  "Caught Exception: Divide by zero");

            return "Caught Exception: Divide by zero";
        }
        return  div;
    }
}
