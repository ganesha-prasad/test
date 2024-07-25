package TestProgramme;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("Hello");
        list.add("Hi");
        list.add("Hello");
        list.add("Ganesh");
        Set<String> unique=new HashSet<>();
        Set<String> dupli=new HashSet<>();
        for(String str:list)
        {
            if(!unique.add(str))
            dupli.add(str);
        }
     for (String dp:dupli)
         System.out.println(dp);
    }
}
