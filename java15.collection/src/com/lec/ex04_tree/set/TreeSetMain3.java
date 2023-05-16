package com.lec.ex04_tree.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetMain3 {

	public static void main(String[] args) {
		
		// TreeSet 검색
		TreeSet<String> words = new TreeSet<>();
		words.add("apple");
		words.add("c");
		words.add("forever");
		words.add("description");
		words.add("love");
		words.add("zoo");
		words.add("ever");
		words.add("base");
		words.add("guess");
		words.add("cherry");
		words.add("f");
		
		for(String word:words) {
			System.out.print(word + ", ");
		}
		System.out.println();
		
		// 범위검색
		System.out.println("[c~f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = words.subSet("c", false, "f", true);
		
		for(String word:rangeSet) {
			System.out.print(word + ", ");
		}
		System.out.println();

	}

}















