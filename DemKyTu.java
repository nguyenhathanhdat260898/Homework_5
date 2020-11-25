package Homework5;

public class DemKyTu {
	public static void main(String args[]) {
		int count;
		String a = "Hello word";
		for (int i = 0; i < a.length(); i++) {
			count = 0;
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j)) {
					count++;
				}
			}
			System.out.println("Ki tự " + a.charAt(i) + " xuất hiện " + count + " lân");
		}
	}
}
