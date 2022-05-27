package genspark.assignments.section3;

import genspark.assignments.Assignment;

public class IndexOutBounds implements Assignment {
    public Object solution(int[] array, int index) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
int y =0;
try {
    if (array.length==0)
    {
        throw new ArrayIndexOutOfBoundsException("Caught Exception: Index Out of Bounds.");
    }
    else if (index > array.length ) {
        throw new ArrayIndexOutOfBoundsException("Caught Exception: Index Out of Bounds.");
    } else

    {
        y = array[index];
    }
}
catch(ArrayIndexOutOfBoundsException e){
    System.out.println( e.getMessage());
    //throw new ArithmeticException(  "Caught Exception: Divide by zero");

    return "Caught Exception: Index Out of Bounds.";
        }
        return y;
    }
}
