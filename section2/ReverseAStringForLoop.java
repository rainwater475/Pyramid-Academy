package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAStringForLoop implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String w="";
        int strlen=str.length()-1;
        for(int x=strlen;x>=0;x--)
        {
            w=w+str.charAt(x);
        }

        return w;
    }
}
