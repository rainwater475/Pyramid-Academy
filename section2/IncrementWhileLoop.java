package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class IncrementWhileLoop implements Assignment {
    public String solution(int from, int to) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String z="";
        if(from < to)
        {
            while(from <= to)
            {
                z=z+from;
                from++;
            }
        }
        else if (from == to)
        {
            z=z+from;
        }
        else if (from >to)
        {
            z="";
        }

        return z;
    }
}
