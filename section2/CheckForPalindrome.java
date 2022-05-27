package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CheckForPalindrome implements Assignment {
    public boolean solution(String pally) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        int c=pally.length()-1;
        String j="";

        while (c>=0)
        {
            j=j+pally.charAt(c);
            c--;
        }
        boolean a = false;
        if (pally.equals(j))
        {
            a=true;
        }
        else { a=false;}

        return a;
    }
}
