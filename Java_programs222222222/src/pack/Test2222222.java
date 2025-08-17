package pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class Emp1 {

	int id;

	String name;

	double sal;

	int age;

	String desig;

	String gender;

	public Emp1() {

	}

	public Emp1(int id, String name, double sal, int age, String desig, String gender) {

		super();

		this.id = id;

		this.name = name;

		this.sal = sal;

		this.age = age;

		this.desig = desig;

		this.gender = gender;

	}

	public Emp1(List<Emp> l) {

		l.add(new Emp(id, name, sal, age, desig, gender));

	}

	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public double getSal() {

		return sal;

	}

	public void setSal(double sal) {

		this.sal = sal;

	}

	public int getAge() {

		return age;

	}

	public void setAge(int age) {

		this.age = age;

	}

	public String getDesig() {

		return desig;

	}

	public void setDesig(String desig) {

		this.desig = desig;

	}

	public String getGender() {

		return gender;

	}

	public void setGender(String gender) {

		this.gender = gender;

	}

	public List<Emp> getList(List<Emp> list) {

		return list;

	}

	@Override

	public String toString() {

		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + ", age=" + age + ", desig=" + desig + ", gender="

				+ gender + "]";

	}

}

public class Test2222222 {

	public static void main(String[] args) {

		String str222 = "the dog is  biting biting a a very very strong";

		Map<Character, Long> map1 = str222.chars().mapToObj(s -> (char) s)

				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));

		String[] words = str222.split("\\s+");

		// Count the occurrences of each word
		Map<String, Long> wordCount = Arrays.stream(words)
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()));

		// Filter words that occur exactly twice
		List<String> duplicates = wordCount.entrySet().stream().filter(entry -> entry.getValue() == 2)
				.map(Map.Entry::getKey).collect(Collectors.toList());

		// Print the duplicate words that occur twice
		System.out.println("Words occurring twice: " + duplicates);
		/*
		 * 
		 * 
		 * List<Entry<Character, Long>> l2 =
		 * 
		 * map.entrySet().stream().sorted(Map.Entry.comparingByKey()).distinct().
		 * 
		 * collect(Collectors.filtering(s->s.getValue()==1, Collectors.toList()));
		 * 
		 * System.out.println(l2);
		 * 
		 * 
		 */
		List<String> list = new ArrayList<>();

		String[] str1 = str222.split(" ");

		for (int i = 0; i < str1.length; i++) {

			list.add(str1[i]);

			System.out.println("1. Original List with duplicates : \n");

			/*
			 * 
			 * // 2. get unique elements after removing duplicates Set<String> distinct list
			 * 
			 * = list .stream() .collect(Collectors.toSet());
			 *
			 *
			 * 
			 * 
			 * 
			 * // 2.1 print unique elements System.out.println("\n2. Unique elements : \n");
			 * 
			 * distinctlist.forEach(System.out::println);
			 * 
			 */

			// 3. get duplicate elements

			Set<String> duplicatelist = list

					.stream()

					.filter(company -> Collections.frequency(list, company) > 1)

					.collect(Collectors.toSet());

			// 3.1 print duplicate elements

			System.out.println("\n 3. Duplicate elements : \n");

			duplicatelist.forEach(System.out::println);

		}

		Emp1 e1 = new Emp1(1001, "Renuka", 88200.232, 38, "Manager", "Female");

		Emp1 e2 = new Emp1(4301, "harit", 33200.232, 32, "Analyst", "Male");

		Emp1 e3 = new Emp1(101, "harit", 45200.232, 37, "Developer", "Male");

		Emp1 e4 = new Emp1(201, "Aadhya", 785200.232, 25, "Analyst", "Female");

		Emp1 e5 = new Emp1(1301, "Aadhya", 1455200.232, 30, "Manager", "Female");

		Emp1 e6 = new Emp1(11, "Abhishek", 28200.232, 38, "Analyst", "Male");

		Emp1 e7 = new Emp1(43, "Modi", 34.232343434, 32, "Clerk", "Male");

		Emp1 e8 = new Emp1(103, "Balotia", 334344.232, 37, "Developer", "Male");

		Emp1 e9 = new Emp1(3434, "Raghu", 45454.232, 25, "Manager", "Male");

		Emp1 e10 = new Emp1(232, "Viswas", 44324545.232, 30, "Archeitect", "Male");
		Emp1 e11 = new Emp1(334, "Aadhya Sai", 455500.45345, 38, "Analyst", "Male");
		Emp1 e12 = new Emp1(3434, "Shivangi", 34200.345435, 45, "Manager", "Female");
		Emp1 e13 = new Emp1(343, "Samyuktha", 56200.7787, 38, "Analyst", "Female");
		Emp1 e14 = new Emp1(343, "Harith", 48200.545454, 48, "Analyst", "Male");

		List<Emp1> list11 = new ArrayList<>();

		list11.add(e1);
		list11.add(e2);
		list11.add(e3);
		list11.add(e4);
		list11.add(e5);
		list11.add(e6);
		list11.add(e7);
		list11.add(e8);
		list11.add(e9);
		list11.add(e10);
		list11.add(e11);
		list11.add(e12);
		list11.add(e13);
		list11.add(e14);

		 list11.stream().filter(e->e.getGender().equalsIgnoreCase("male")).
				collect(Collectors.groupingBy(e->e.getGender(),Collectors.counting())).
				entrySet().stream().filter(e->e.getValue()>1).sorted().map(e->e.getValue()).collect(Collectors.toList()).forEach(System.out::println);
				
				
		//System.out.println("listCountMale----@@@@@@@@@@@------>" + listCount);
		
		
		
		Function<Emp1, String> f = e -> e.getName();

		Map<String, Map<String, Long>> map2 = list11.stream().

				collect(Collectors.groupingBy(Emp1::getDesig,

						Collectors.groupingBy(e -> e.getGender(), Collectors.counting())));

		System.out.println("map2-----====------->" + map2);

		List<Entry<String, Long>> list44 = map2.entrySet().stream()
				.flatMap(e22 -> (e22).getValue().entrySet().stream().filter(ee -> ee.getValue() > 2))

				.collect(Collectors.toList());

		System.out.println("list4---------> " + list44);

		int a[] = { 7, 3, 2, 15, 10, 9, 19, 20 };

		int count = 1;

		int curr_max = a[1];

		for (int m = 0; m < a.length; m++) {

			if (a[m] < curr_max && a[m] != curr_max) {
				

				count++;

				curr_max = a[m];

			}

		}

		System.out.println("count: " + count);

	}

}
