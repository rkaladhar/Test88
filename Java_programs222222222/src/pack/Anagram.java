package pack;

import java.util.*;

import java.util.stream.Stream;

public class Anagram {

	

	boolean isAnagram(List<String> wordList) {

		long count = Stream.of(wordList).map(String::toCharArray)

				.map(arr -> {

					Arrays.sort(arr);

					return arr;

				})

				.map(String::valueOf)

				.distinct()

				.count();

		return count == 1;

	}

	public static void main(String[] args) {
		List<String> wordList = Arrays.asList("face", "caffe", "cafe", "milk", "limk", "abc");
     Anagram a = new Anagram();
   System.out.println( a.isAnagram(wordList));
	}

}