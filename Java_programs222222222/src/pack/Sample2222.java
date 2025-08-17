package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.crypto.spec.ChaCha20ParameterSpec;

class Emp {

	int id;
	String name;
	double sal;
	int age;
	String desig;
	String gender;

	public Emp() {

	}

	public Emp(int id, String name, double sal, int age, String desig, String gender) {

		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.age = age;
		this.desig = desig;
		this.gender = gender;

	}

	public Emp(List<Emp> l) {

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
	public int hashCode() {
		return Objects.hash(age, desig, gender, id, name, sal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return age == other.age && Objects.equals(desig, other.desig) && Objects.equals(gender, other.gender)
				&& id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(sal) == Double.doubleToLongBits(other.sal);
	}

	@Override

	public String toString() {

		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + ", age=" + age + ", desig=" + desig + ", gender="

				+ gender + "]";

	}

	public int compareTo(Emp other) {
		return Integer.compare(this.id, other.id); // Sorting by id
	}

}

public class Sample2222 {

	public static void main(String[] args) throws IOException {

		System.out.println("Java1/8");

		Emp e1 = new Emp(1001, "Renuka", 88200.232, 38, "Manager", "Female");
		Emp e2 = new Emp(4301, "Abhay", 33200.232, 32, "Analyst", "Male");
		Emp e3 = new Emp(101, "Vaishnavi", 45200.232, 37, "Developer", "Female");
		Emp e4 = new Emp(201, "Winston", 145200.232, 25, "Manager", "Female");
		Emp e5 = new Emp(1301, "Aadhya", 1455200.232, 30, "Manager", "Female");
		Emp e6 = new Emp(11, "Abhishek", 28200.232, 38, "Analyst", "Male");
		Emp e7 = new Emp(43, "Modi", 34.232343434, 32, "Clerk", "Male");
		Emp e8 = new Emp(103, "Balotia", 334344.232, 37, "Developer", "Male");
		Emp e9 = new Emp(3434, "Aparna", 45454.232, 25, "Manager", "Female");
		Emp e10 = new Emp(232, "Viswas", 44324545.232, 30, "Archeitect", "Male");

		List<Emp> list = new ArrayList<>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e9);
		list.add(e10);

		String str = "Commmunicanmmnmtion";

		Map<String, Long> result2 = Arrays.stream(str.split("")).filter(s -> s.contains("m"))
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		System.out.println("result--------------> " + result2);

		Set<Entry<String, Long>> s2222 = result2.entrySet().stream().collect(Collectors.toSet());
		System.out.println("s2222------> " + s2222);

		Map<String, Long> mapNew = s2222.stream().filter(s -> s.getValue() > 3)
				.collect(Collectors.toMap(s -> s.getKey(), s -> s.getValue()));

		System.out.println("mapNew----->" + mapNew);

		List<String> wordsList = Arrays.asList("hello", "bye", "ciao", "bye", "ciao");
		Map<String, Long> collect = wordsList.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		System.out.println(collect);

		Map<String, Emp> empMap = list.stream().collect(Collectors.toMap(Emp::getName, e -> e));
		empMap.forEach((k, v) -> System.out.println(k + " " + v));

		System.out.println("===================<###############>=================================");

		// Stream.of(wordsList).mapToInt(str->new Map.Entrystr, 1)).collect(toMap(str,
		// count));

		List<String> listVal = empMap.keySet().stream().sorted((e11, e22) -> e11.compareTo(e22))
				.collect(Collectors.toList());
		System.out.println("listVal==================> " + listVal);

		List<Emp> listDesig = empMap.values().stream().sorted(Comparator.comparing(Emp::getDesig))
				.collect(Collectors.toList());
		System.out.println("listDesig----======------------>" + listDesig);

		Set<String> setDsg1 = listDesig.stream().map(e -> e.getDesig()).sorted((e11, e22) -> e11.compareTo(e22))
				.collect(Collectors.toSet());

		System.out.println("setDsg1---------------------->" + setDsg1);

		System.out.println("===================<###############>=================================");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String");

		String strMap = br.readLine();

		Map<Character, Long> map = strMap.chars().mapToObj(c -> (char) c)

				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println(map);

		List<Character> listRepeat = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.filter(s -> s.getValue() >= 2).map(e -> e.getKey()).collect(Collectors.toList());

		System.out.println("listRepeat-----#####------->" + listRepeat);

		Set<Entry<Character, Long>> map11 = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.filtering(s -> s.getValue() == 1 ? true : false, Collectors.toSet()));

		System.out.println("map11-----=====--->" + map11);

		int count = 1;
		int arr[] = { 7, 4, 8, 2, 9 };
		// Start traversing element
		int curr_max = arr[0];
		for (int i = 1; i < arr.length; i++) {

			// If curr_element is maximum
			// or current element
			// is equal, update maximum and increment count
			if (arr[i] > curr_max || arr[i] == curr_max) {
				count++;

				curr_max = arr[i];
			}

		}

		System.out.println("Count:  " + count);

		List<Integer> list22 = Arrays.asList(12, 13, 45, 65, 65, 43, 67, 89, 89, 70);
		list22.stream().sorted(Collections.reverseOrder()).distinct().forEach(System.out::println);
		Integer i22 = list22.stream().sorted(Comparator.reverseOrder()).distinct().limit(4).skip(3).findFirst().get();
		System.out.println("i22---->" + i22);

		Map<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating System", 79);
		hm.put("Networking", 80);

		System.out.println("hm------------------>" + hm);

		hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(entry -> System.out.println(entry.getKey() + "<==>" + entry.getValue()));

		System.out.println(
				"<-------------------------------------------[[[[[[[[Comparator.comparing]]]]]]]]]------------------------------------------------------------------------->");

		hm.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
				.forEach(entry -> System.out.println(entry.getKey() + "<@@@@@>" + entry.getValue()));

		Map<Integer, Emp> mapEmp = new HashMap<>();
		mapEmp.put(1213, e1);
		mapEmp.put(1, e2);
		mapEmp.put(123, e3);
		mapEmp.put(456, e4);
		mapEmp.put(34, e5);
		mapEmp.put(675, e6);
		mapEmp.put(46, e10);
		mapEmp.put(876, e7);
		mapEmp.put(345, e8);
		mapEmp.put(786, e9);

		mapEmp.entrySet().stream()
				.sorted(Map.Entry
						.comparingByValue(Comparator.comparing(Emp::getSal).thenComparing(Emp::getName).reversed()))
				.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

		mapEmp.forEach((k, v) -> System.out.println(k + "<===>" + v));

		System.out.println(
				"<-------------------------------------------------------------------------------------------------------------------->");
		System.out.println();

		// no need to implement comparable.7

		mapEmp.entrySet().stream()
				.sorted(Comparator.comparing(entry -> entry.getValue().getId(), Comparator.reverseOrder())) // Sorting
																											// by Emp ID
																											// in
																											// descending
																											// order
				.forEach(entry -> System.out.println(entry.getKey() + " -==-> " + entry.getValue()));

		String strSwap = "AadhyM";
		char[] ch = strSwap.toCharArray();
		char temp =ch[0];
		for (int i = 0; i < ch.length; i++) {
			
			if (i == 0) {
				ch[0] = ch[ch.length - 1];
				
				System.out.print(ch[0]);
			}
			else if (i == ch.length - 1) {

				 ch[ch.length-1] = temp ;
				System.out.print(ch[ch.length - 1]);

			} else {
				System.out.print(ch[i]);
			}
		}

		
		String strArr = "Aadhya";
		 Map<Character, Long> freqMap = strArr.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		 
		 System.out.println("freqMap---------> " + freqMap);
		 String repeatedChars = freqMap.entrySet().stream()
	                .filter(e -> e.getValue() > 1)
	                .map(e -> String.valueOf(e.getKey()).repeat(e.getValue().intValue()))
	                .collect(Collectors.joining());
		 
		 System.out.println("repeatedCharacters----------> "+repeatedChars);
		 
		 String uniqueChars = freqMap.entrySet().stream()
	                .filter(e -> e.getValue() == 1)
	                .map(e -> String.valueOf(e.getKey()))
	                .collect(Collectors.joining());
		 System.out.println("uniqueChars-------------------> "+uniqueChars); 
		 
		 String res2222 = repeatedChars+uniqueChars;
		 System.out.println("res2222------->" + res2222);
		 
		 System.out.println("length------> "+ strArr.length());
		 
		 String strNextSwap = IntStream.range(0, strArr.length())
         .mapToObj(i -> (i % 2 == 0 && i + 1 < str.length())
                 ? "" + str.charAt(i + 1) + str.charAt(i)
                 : (i % 2 != 0) ? "" : String.valueOf(str.charAt(i)))
         .collect(Collectors.joining());
		 
		 System.out.println("strNextswap------------->" + strNextSwap);
		
	}
}
