package basic_p;


public class Game {

	public static void main(String[] args) {
		
		System.out.println("3,6,9 게임 ");
		System.out.println("1 -> 20 ");
		
		for (int i = 1; i<=20; i++) {
			int num = i % 10;
			int three = num % 3;
			try {
				int a = 1234 / three;
				System.out.println(i);
			} catch(Exception e) {
				try {
					int a = 123/num;
					System.out.println("짝");
				} catch (Exception e2) {
					System.out.println(i);
				}
			}
		}

		
		/*
		for ( int i = 1; i <=20; i++) {
			int one = i % 10;
			if(one%3==0 && one!=0) {
				System.out.println("짝");
			}else {
				System.out.println(i+" , "+one);
			}
		}
	
		System.out.println("1 ->  100 >>>>>>>>>>>> ");
		for (int i = 1; i <=100; i++) {
			int one = i % 10;
			int ten = i/10;
			
			String ttt = "";
			if(ten%3==0 && ten!=0) {
				ttt += "짝";
			}
			if(one%3==0 && one!=0) {
				ttt += "짝";
			}
			if(ttt.equals("")) {
				ttt += i;
			}
			System.out.println(ttt);
		}
		
		int no = 1245;
		System.out.println("1 ->  "+no+" >>>>>>>>>>>> ");
		for (int i = 1; i <=no; i++) {
			
			String ttt = "";
			
			int buf = i;
			
			while(true) {
				int one = buf % 10;
				buf /= 10;
				if(one%3==0 && one!=0) {
					ttt += "짝";
				}
				
				if(buf == 0) {
					break;
				}	
			}
			
			if(ttt.equals("")) {
				ttt += i;
			}
			System.out.println(ttt);
		} */
		

	}

}
