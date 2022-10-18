package String;

public class total_space_in_string  {
	public static void main(String[] args) {

		String str = "velocity training center pune";

		int counter = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch == ' ') {
				counter++;
			}
		}
		System.out.println("total space in string are>>" + counter);
	}


}
