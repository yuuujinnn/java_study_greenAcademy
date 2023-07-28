package arr_p;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		int a = 10;
		int [] arr1 = {11, 22, 33}; //배열 생성 및 초기화 후 주소 대입
		
		System.out.println("a:" + a);
		System.out.println("arr1:" + arr1+"=>"+arr1.length);  //[I@515f550a  
		// [ : 배열 차원 (2개면 2차원 배열 - 갯수가 차원을 얘기함)
		// I : int
		// @ : 구분
		// 515f550a : hash 코드 16진수로 표현  (a가 들어가면 10이라는 표시)
		
		a = 23;
		//arr1 = {55, 66, 77};
		// new int [] 는 최초 배열변수 선언시에만 가능하다. (나중에는 불가능)
		
		arr1 = new int [] {55, 66, 77, 88, 99};  
		//갯수가 달라도 상관없다. 주소를 받는것이기 때문에 
		System.out.println("a:" + a);
		System.out.println("arr1:" + arr1+"=>"+arr1.length);
		
		int [] arr2 = new int[4];
		System.out.println("arr2:" + arr2+"=>"+arr2.length);
		
		int [] arr3 = arr1; //shallow copy (주소만 복사)
		
		// deep copy (원소 새로 생성후 값 복사)
		int [] arr4 = new int[arr1.length];
		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = arr1[i];
		}
		
		int [] arr5 = arr1.clone();	//deep copy
		
		System.out.println("arr3:" + arr3+"=>"+arr3.length);
		System.out.println("arr4:" + arr4+"=>"+arr4.length);
		
		System.out.println("arr1:" + Arrays.toString(arr1));
		System.out.println("arr3:" + Arrays.toString(arr3));
		System.out.println("arr4:" + Arrays.toString(arr4));
		System.out.println("arr5:" + Arrays.toString(arr5));
		
		int b = a;
		System.out.println("a:" + a + ", b:" + b);
		a = 77;
		arr1[1] = 6543;
		System.out.println("a:" + a + ", b:" + b);
		System.out.println("arr1[1]:" + arr1[1]);
		System.out.println("arr3[1]:" + arr3[1]);
		
		System.out.println("arr1:" + Arrays.toString(arr1));
		System.out.println("arr3:" + Arrays.toString(arr3));
		System.out.println("arr4:" + Arrays.toString(arr4));
		System.out.println("arr5:" + Arrays.toString(arr5));
		
		
		System.out.println("---------------------------------------");
		
		//점수 : 87,65,82,46,98,65,72,34,91,79,45,67
		//점수에 대응하는 수우미양가 등급 배열을 구현하세요
		// 90점 이상 :수, 80점 이상 :우, 70점 이상 :미, 60점 이상:양, 나머지 가
		int [] scoreArr = {87,65,82,46,98,65,72,34,91,79,45,67};
		String [] scoreArr2 = new String[scoreArr.length];
		
		for (int i = 0; i < scoreArr.length; i++) {
			if (scoreArr[i] >= 90) {
				scoreArr2[i] = "수";
			} else if (scoreArr[i] >= 80) {
				scoreArr2[i] = "우";
			} else if (scoreArr[i] >= 70) {
				scoreArr2[i] = "미";
			} else if (scoreArr[i] >= 60) {
				scoreArr2[i] = "양";
			} else {
				scoreArr2[i] = "가";
			}
		}
		System.out.println("scoreArr2:" + Arrays.toString(scoreArr2));
	}
}
