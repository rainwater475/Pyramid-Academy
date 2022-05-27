package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CheckingAGrade implements Assignment {
    public String solution(int grade) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
String g="";
        if (grade >=90)
        {
            g="A";
        }
        else if(grade <90 && grade >=80)
        {
            g="B";
        }
        else if(grade<80 && grade >=70)
        {
            g="C";
        }
        else if (grade<70)
        {
            g="FAILURE";
        }


        return g;
    }
}
