package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class MeanMedian implements Assignment {
    public String solution(int a, int b, int c) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String hj="";
        float mean=(a+b+c)/3;
        int meanm=0;

        if (a<b&&a>c)
        {
            meanm=a;
        }
        else if(b<a&&b>c)
        {
            meanm=b;
        }
        else if (c<a&&c>b)
        {
            meanm=c;
        }
        hj=hj+mean+" "+meanm;
        return hj;
    }
}
