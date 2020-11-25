package Homework5;

import java.util.LinkedList;
import java.util.Random;

public class Add25Number {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		Random random = new Random();
		double avg = 0;
		double sumrad = 0;
		for (int i = 0; i < 25; i++) {
			int rad = random.nextInt(100);
			linkedList.add(rad);
			sumrad += rad;
			avg = sumrad / 25;
		}
		System.out.println(sumrad);
		System.out.println(avg);

	}
}
