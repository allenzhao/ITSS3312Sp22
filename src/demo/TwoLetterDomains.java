package demo;

public class TwoLetterDomains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char first;
		int second;
		first = 'a';
		while (first <= 'z') {
			for (second = 0; second <= 9; ++second) {
				System.out.println(""+ first + second + ".com");
			}
			++first;
		}

	}

}
