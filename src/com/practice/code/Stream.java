package com.practice.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
//		map
		List<Integer> number = Arrays.asList(2,3,4,5);
	    List<Integer> square = number.stream().map(x -> x*x).
	                           collect(Collectors.toList());
	    System.out.println(square);
	    
//	    filter
	    List<String> names = Arrays.asList("String","Reflection","Collection","Stream");
	    List<String> filters=names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
	    System.out.println(filters);
	    
//	    sorted
	    List<String> sorted=names.stream().sorted().collect(Collectors.toList());
	    System.out.println(sorted);
	    
//	    forEach
	    number.stream().map(x->x*x).forEach(System.out::println);
	    number.stream().map(x->x*x).forEach(y->System.out.println(y));
	    
//	    reduce
	    int even=number.stream().filter(x->x%2==0).reduce(0, (ans,i)->ans+i);
	    System.out.println("***"+even);
	}

}
