package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class HumanGoblin implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
String r="";
        if(str.equals("goblin"))
        {

            r= "Attack the Goblin!";
        }
        else if (str.equals("human"))
        {
            r= "You aRe one of us!";
        }
        return r;
    }
}
