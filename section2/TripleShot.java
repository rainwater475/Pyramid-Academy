package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class TripleShot implements Assignment {
    public boolean solution(boolean x, boolean y, boolean z) {
        boolean a=true;
        // ↓↓↓↓ your code goes here ↓↓↓↓

        if (x==true&&y==true&&z==true) {
            a= true;
        }
        else {a = false;}

        return a;
    }
}
