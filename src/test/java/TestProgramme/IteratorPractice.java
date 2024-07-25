package TestProgramme;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorPractice {
    public static void main(String[] args) {

      Set<String> allSet= new HashSet<>();
      allSet.add("num1");
        allSet.add("num2");
        allSet.add("num3");
        allSet.add("num4");

       Iterator<String> itr=allSet.iterator();
       while (itr.hasNext())
        System.out.println(itr.next());
       // System.out.println(itr.next());


    }
}
