package arr_p;

import java.util.Arrays;

public class SortMain {
	
	public static void main(String[] args) {
		// 77,65,98,46,82
		
		// 46,65,77,82,98
		
		int a = 10;
		int b = 20;
		
		System.out.println(a + "," + b);
		int buf = b;
		b = a;
		//a = b;
		a = buf;
		
		System.out.println(a + "," + b);
		
		int [] arr = {77,65,98,46,82};
		System.out.println("정렬전:" + Arrays.toString(arr));
		
		for (int me = 0; me < arr.length; me++) {
			System.out.println(arr[me]);
			
			for (int you = me+1; you < arr.length; you++) {
				System.out.print(arr[you] + ", ");
				if(arr[me] > arr[you]) {
					//System.out.print("바꿔");
					buf = arr[you];
					arr[you] = arr[me];
					arr[me] = buf;
				}
			}
			
			System.out.println("\n::" + Arrays.toString(arr));
		}
	}
}
