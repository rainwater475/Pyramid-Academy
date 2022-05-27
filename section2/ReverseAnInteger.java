package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAnInteger implements Assignment {
    public String solution(int number) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        int reverse=0; String n="";
        int i = number;
        String str = Integer.toString(i);

        int len=str.length()-1;
        while(len >=0)
        {

n=n+str.charAt(len);
len--;


        }


        return n;
    }
}
