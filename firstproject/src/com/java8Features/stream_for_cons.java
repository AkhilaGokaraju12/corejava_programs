package com.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class stream_for_cons {

	public static void main(String[] args) {
List<Integer> l=Arrays.asList(4,2,7,9,6,8,7);
Consumer<Integer> c=i->System.out.println(i*i);
//l.stream().forEach(c);
//l.stream().forEach(System.out::println); 
List<Integer> t=l.stream().distinct().collect(Collectors.toList());
long s=t.stream().count();
System.out.println(s);
////ascending
//System.out.println("list with out sorting");
//System.out.println(t);
//List<Integer> f=l.stream().distinct().sorted().collect(Collectors.toList());
//System.out.println(f);
////descending order
//System.out.println(l.stream().distinct().sorted((i1,i2)->i1<i2 ? 1 :i1>i2 ?-1:0)
//		.collect(Collectors.toList()));
//Collection<Integer> a=l.stream().distinct().sorted((i1,i2)->i1<i2 ? 1 :i1>i2 ?-1:0)
//.collect(Collectors.toList());
//System.out.println(a);
////updatedlist filter
//List<Integer> t1=l.stream()
//                  .filter(i->i>4)
//                  .sorted()
//                  .collect(Collectors.toList());
//System.out.println(t1);
////updatedlist filter
List<Integer> t2=l.stream()
               .map(i->i+5)
              .sorted()
              .collect(Collectors.toList());
System.out.println(t2);
	}

}
