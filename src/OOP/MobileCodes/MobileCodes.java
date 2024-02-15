package OOP.MobileCodes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileCodes {
    public static void main(String[] args) {
        Map<Integer,String> mobilesCodes = new HashMap<>();
        String phone =  "+375333179409";

        mobilesCodes.put(25, "life");
        mobilesCodes.put(291, "Velcom");
        mobilesCodes.put(292, "МТС");
        mobilesCodes.put(293, "Velcom");
        mobilesCodes.put(294, "Diallog");
        mobilesCodes.put(295, "МТС");
        mobilesCodes.put(296, "Velcom");
        mobilesCodes.put(297, "МТС");
        mobilesCodes.put(298, "МТС");
        mobilesCodes.put(299, "Velcom");
        mobilesCodes.put(33, "МТС");
        mobilesCodes.put(44, "Velcom");
        Set set = mobilesCodes.entrySet();

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            if (phone.indexOf(entry.getKey().toString())==4)
            System.out.println(entry.getValue());
        }
        Set set2 = mobilesCodes.keySet();
       // set2.forEach(el-> {if (phone.indexOf(el.toString())==4)});
        System.out.println(set);
        System.out.println(mobilesCodes.size());
        System.out.println(mobilesCodes.keySet());
        System.out.println(mobilesCodes.get(1));
    }
    static boolean match (String reg, String str){
        System.out.println();
        System.out.println("Mobile");
        System.out.println(reg);
        System.out.println(str);
        Pattern pt = Pattern.compile(reg);
        Matcher mt = pt.matcher(str);
        return mt.matches();
    }
}
