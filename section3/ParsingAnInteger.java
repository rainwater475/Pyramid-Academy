package genspark.assignments.section3;

import genspark.assignments.Assignment;

public class ParsingAnInteger implements Assignment {
    public Object solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int r=0;

        try{
            r=Integer.parseInt(word);
        }
        catch(Exception e)
        {
            return "Caught Exception: Number Format Exception";
        }




        return r;
    }
}
