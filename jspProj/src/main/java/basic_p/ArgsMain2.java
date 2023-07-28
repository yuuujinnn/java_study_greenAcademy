package basic_p;


public class ArgsMain2 {
	
	public static void main(String[] args) {
		
		// 합계, 평균, 최대=0, 최소=0
		int sum = 0;
		int length = 0;
		float avg = 0;
		int max = 0;
		int min = 0;
		
		for (String str : args) {
			try {
				int num = Integer.parseInt(str);
				if (num % 2 == 0) {
					sum += num;
					length += 1;
					avg = (float) sum / length;
					if (num >= 0) {
						for(int i=0; i<args.length; i++) {
							max = Math.max(max, num); 
							min = Math.min(min, num);
						}
					} else {
						max = 0;
						min = 0;
					}
				}
			} catch (Exception e) {
				System.out.println("에러 글자 : " + str);
			}
		}
		System.out.println("개수 : " + length);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대 : " + max);
		System.out.println("최소 : " + min);
	}
}

