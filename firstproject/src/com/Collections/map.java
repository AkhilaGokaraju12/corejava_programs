package com.Collections;

import java.util.Hashtable;
import java.util.Map;

public class map {

	public static void main(String[] args) {
Map<String,String> m=new Hashtable<>();
m.put("TG","Telagana");
m.put("Ap","andhrapradesh");
m.put("Tn","Tamilnadu");

System.out.println(m);
System.out.println(m.put("br", "bihar"));
System.out.println(m.put("ok", "bihar"));
System.out.println(m.put("TG", "Hydrebad"));
System.out.println(m);
System.out.println(m.containsKey("Ap"));
System.out.println(m.containsKey("ap"));
System.out.println(m.containsValue("Tamilnadu"));
System.out.println(m.get("Tn"));
//Set<Entry<String,String>> en=m.entrySet();
//
//for(Entry<String,String> entry:en) {
//	System.out.println(entry);
//}
//for(Entry<String,String> entry:en) {
//	System.out.println(entry.getKey()+"->"+entry.getValue());
//}
System.out.println(m.keySet());
System.out.println(m.values());
System.out.println(m.size());
	}

}
