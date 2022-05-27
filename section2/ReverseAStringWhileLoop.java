package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAStringWhileLoop implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int c=str.length()-1;
        String j="";

        while (c>=0)
        {
            j=j+str.charAt(c);
            c--;
        }

        return j;
    }
}
