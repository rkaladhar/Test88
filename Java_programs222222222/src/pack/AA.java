package pack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

interface i {

	int i = 10;

	default void m1() {

		System.out.println(" interface i m1 default method" + i);
	}

	public String setDefault(String str);
}

interface j {

	int j = 20;
	default void m1() {

		System.out.println(" interface j m1 default method" + j);
	}
	
	

}

class BB implements i, j {

	int y = 10;

	public void m1() {

		System.out.println(" class AA m1 default method" + y);
		i.super.m1();
		j.super.m1();
	}
	public  String setDefault(String str) {
	    System.out.println("Setting default value..." + str);
	    return "Default";
	}
	
}

public class AA extends BB {

	int y = 10;
	
	public  String setDefault() {
	    System.out.println("Setting default value--------========------------>");
	    return "Default";
	}
	
	public static void main(String[] args) {

		BB a = new BB();

		a.m1();
		
		String str=" ";
		
		/*
		 * Optional<String> opt =
		 * Optional.of(Optional.ofNullable(str).orElse("Default String"));
		 * System.out.println("opt===> "+ opt);
		 * 
		 * 
		 * String opt1 = Optional.of(str).orElseGet(()-> "Default String");
		 * System.out.println("opt1:"+ opt1);
		 * 
		 * String mayBeNull=null; i i1 = s -> { return "Greeting " + s;};
		 * i1.setDefault("Java8");
		 * 
		 * String opt11 =
		 * Optional.ofNullable(mayBeNull).orElseGet(()->i1.setDefault("Hello Java"));
		 * System.out.println("opt11:"+ opt11);
		 * 
		 * //String str2222 = Optional.of(mayBeNull).orElse(new
		 * AA().setDefault("Hello orElse"));
		 * //System.out.println("str2222------------>"+ str2222);
		 * 
		 * Optional<String> optional = Optional.ofNullable("JavaJ2ee");
		 * //Optional.ofNullable(null);
		 * 
		 * String resultOrElse = optional.orElse("Default Value");
		 * 
		 * System.out.println("resultOrElse----->"+ resultOrElse);
		 * 
		 * String str22= null; // setting default value using lambda function inside
		 * orElseGet Optional<String> opt22 =
		 * Optional.ofNullable(Optional.ofNullable(str22).orElseGet(()->"Sudytonight"));
		 * System.out.println("opt22----->" + opt22);
		 * 
		 */		
		String testStr="";
		
		String orElseGetStr = Optional.of(testStr).orElseGet(new AA()::setDefault);
		System.out.println("Default String for orElseGet is:-------> " + orElseGetStr);
		
		System.out.println("<==================================[[[[@@@@@@]]]]==================================================>");
		
		String orElseStr = Optional.of(testStr).orElse(new AA().setDefault());
		System.out.println("Default String for orElse is:---------> " + orElseStr);
		
String str2="javaj2ee";
		
		String orElseGetStr1 = Optional.ofNullable(str2).orElseGet(new AA()::setDefault);
		System.out.println("Default String for orElseGet is:==========> " + orElseGetStr1);
		
		System.out.println("<==================================[[[[ ###### ]]]]==================================================>");
		
		String orElseStr1 = Optional.ofNullable(str2).orElse(new AA().setDefault());
		System.out.println("Default String for orElse is============> " + orElseStr1);

		
		int[] y = {12, 456, 78, 98, 56, 23, 98};

		Optional<Integer> thirdGreatest = Arrays.stream(y)
		        .distinct()
		        .boxed()
		        .sorted(Comparator.reverseOrder())
		        .skip(2).findFirst();
		       // .mapToInt(Integer::intValue)
		        //.findFirst();
		
		System.out.println("thrirdGreatest------->"+ thirdGreatest);

	}
}
