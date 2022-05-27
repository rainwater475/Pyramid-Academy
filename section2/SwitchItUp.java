package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class SwitchItUp implements Assignment {
    public String solution(int x) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        int day = x;
        String printout="";
        switch (day) {
            case 1:
                printout="one";
                break;
            case 2:
                printout="two";
                break;
            case 3:
                printout="three";
                break;
            case 4:
                printout="four";
                break;
            case 5:
                printout="five";
                break;
            default:
                printout="none matched";
        }


        return printout;
    }
}
