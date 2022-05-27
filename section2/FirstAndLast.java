package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class FirstAndLast implements Assignment {
    public boolean solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        int leng=word.length()-1;   boolean y;char first=' ';
        char last = ' ';
        if (leng<0)
        {
            y=true;
        }
        else{
            first=word.charAt(0);
             last = word.charAt(leng);
        }





        if (first==last)
        {
            y=true;
        }
        else
        {
            y=false;
        }


        return y;
    }
}
