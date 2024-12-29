package stringdemo;

public class StringPermutation {

	static void findPermutation(String str, String ans) {
		// put a condition here to stop the recursion
		if(str.length()==0) {
			System.out.println(ans + " ");
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i+1);
			findPermutation(ros, ans + ch);
		}
	}
	
	public static void main(String[] args) {
		String s = "abc";
		findPermutation(s, "");

	}

}
