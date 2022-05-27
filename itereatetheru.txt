package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class IterateThroughArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<String> myList) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        ArrayList<Integer> arr1=new ArrayList<>();
for (int x=0;x<myList.size();x++)
{
        arr1.add(myList.get(x).length());
}



        return arr1;
    }
}
