import java.util.*;

class Anagram {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter first String:");
		String s1 = sc.next();
		System.out.println("Enter Second String:");
		String s2 = sc.next();
		int l1 = s1.length();
		int l2 = s2.length();
		if (l1 != l2) {
			System.out.println("Not Anagram");
		} else {
			l2 = 0;
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			Map<Character, Integer> map = new HashMap<>();
			for (int i = 0; i < l1; i++) {
				char ch = s1.charAt(i);
				if (!map.containsKey(ch)) {
					map.put(ch, 1);
				} else {
					Integer fr = map.get(ch);
					map.put(ch, ++fr);
				}
			}
			for (int i = 0; i < l1; i++) {
				char ch = s2.charAt(i);
				if (!map.containsKey(ch)) {
					l2 = 1;
					break;
				} else {
					Integer fr = map.get(ch);
					map.put(ch, --fr);
				}
			}
		}
		if (l2 == 0) {
			System.out.println("Anagram !");
		} else
			System.out.println("not  Anagram !");
	}
}
