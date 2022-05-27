package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class FizzBuzzBaz implements Assignment {
    public String solution(int fuzzy) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
String a="";

        if (fuzzy%3==0&&fuzzy%5==0)
            a="fizz buzz baz";
        else if(fuzzy%3==0&&fuzzy%5!=0)
            a="fizz";
        else if (fuzzy%3!=0&&fuzzy%5==0)
            a="buzz";
        else
            a="Fizzled";

        return a;
    }
}
