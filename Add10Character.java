package Homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Add10Character {
	public static void main(String[] args) {
		List<Character> charList = new ArrayList<>();
		Random random = new Random();
		int limit = (int) 'z' - (int) 'a';
		for (int i = 0; i < 10; i++) {
			int rad = random.nextInt(limit) + (int) 'a';
			char c = (char) rad;
			charList.add(c);
		}
		System.out.println(charList);
		List<Character> charList2 = new ArrayList<>();
		Collections.reverse(charList);
		charList2.addAll(charList);
		System.out.println(charList);

//		for (int i = charList.size() - 1; i >= 0; i--) {
//			charList2.add(charList.get(i));
//		}
//		System.out.println(charList2);
	}
}
