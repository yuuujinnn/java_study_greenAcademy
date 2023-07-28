package oops_p;

import java.util.Arrays;

public class ExamMain {
	
	public static void main(String[] args) {
		
		String [] names = {"현빈","원빈","투빈","장희빈","미스터빈"};
		
		String [] kor = "75,55,95,65,85".split(",");
		String [] eng = "73,53,93,63,83".split(",");
		String [] mat = "78,58,98,68,88".split(",");
		
		Exam [] arr = new Exam[names.length];
		
		System.out.println(arr);
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(Arrays.toString(arr));
		//arr[0].name = names[0];
		
		Exam ex0 = new Exam(names[0], kor[0], eng[0], mat[0]);
		Exam ex1 = new Exam(names[1], kor[1], eng[1], mat[1]);
		System.out.println(ex0);
		
		Exam [] arr2 = {
				ex0,
				ex1,
				new Exam(names[2], kor[2], eng[2], mat[2]),
				new Exam(names[3], kor[3], eng[3], mat[3]),
				new Exam(names[4], kor[4], eng[4], mat[4]),
				};
		
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("---------------");
		
		for (int i = 0; i < arr.length; i++) {
			//arr[i] = ex0;
			arr[i] = new Exam(names[i], kor[i], eng[i], mat[i]);
			//System.out.println(arr[i]);
		}
		System.out.println(arr[0]);
		System.out.println(arr[1].name);
		System.out.println(Arrays.toString(arr[1].jum));
		System.out.println(arr[1].tot);
		System.out.println(arr[1].avg);
		System.out.println(arr[1].grade);
		System.out.println(arr[1].rank);
		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i].rank = rankCalc(arr);
//			
//		}
		
		
		
		
	}
}
