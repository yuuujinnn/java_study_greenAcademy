package basic_p;

import java.util.Arrays;

public class ArgsMain {
	public static void main(String[] args) {
		System.out.println("내가 argsMain  이다: " + args.length);
		
		System.out.println(Arrays.toString(args));
		
		for (String str : args) {
			System.out.println(str);
		}
		
		System.out.println("argsMain 끝");
	}
}
