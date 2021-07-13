package JavaProgram_no_4_12_7_2021;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Map<String, LinkedList<String>> multimap = new HashMap();
        LinkedList<String> list=new LinkedList<>();
        list.add("abc") ;
        list.add("def") ;
        list.add("ghi") ;
        multimap.put("s",list);

        for (Map.Entry<String,LinkedList<String>> set: multimap.entrySet())
        {
            System.out.println("value is : ------ "+ set.getKey());
            for (String data:set.getValue())
            {
                System.out.println("and value is : -------- "+data);
            }

        }
    }
}
