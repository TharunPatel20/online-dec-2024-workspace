package stringdemo;

public class StringPermutation {

	// str = abc, ch = a, ros=bc, ans=""+a = a
	// str = bc, ch = b, ros=c, ans=a+b=ab
	// str = c , ch = c, ros="", ans=ab+c=abc
	// str = "", prints "abc"
	// str = bc, ch = c, ros=b, ans=a+c=ac
	// str = b, ch = b, ros="", ans=ac+b=acb
	// str = "", prints "acb"
	
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
