package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class MaxNumber implements Assignment {
    public int solution(int a, int b) {
        int max=0;
       if (a>b)
           max=a;
       else
           max=b;

       return max;
    }
}
