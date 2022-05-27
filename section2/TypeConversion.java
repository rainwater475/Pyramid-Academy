package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class TypeConversion implements Assignment {
    public Object solution(Object object) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        if (object instanceof Integer)
        {
            object=(String)object;
        }
        else if(object instanceof String)
        {
            object=(Integer)object;
        }
        else if (object instanceof Character)
        {
            object=(String)object;
        }


        return object;
    }
}
