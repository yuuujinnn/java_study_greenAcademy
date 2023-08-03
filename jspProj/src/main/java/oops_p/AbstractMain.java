package oops_p;

abstract class AbsPar {
	
	int a = 10, b = 20;
	
	void meth_1() { // 선언과 정의가 동시에 일어난것
		System.out.println("부모 meth_1()");
	}
	
	abstract void meth_2(); 
	// 선언만 한것, 정의부가 없음 abstract 하려면 선언만 해주고 정의부가 없어야함 
	//(그리고 클래스 앞에도 abstract가 포함되어 있는거라고 알려줘야하기때문에 앞에 붙여줘야함)
	//부모에서 abstract 걸면 자식은 반드시 재정의를 해줘야함
	// 앞에 private(클래스 안에서만 사용가능) 걸어주면 클래스 밖에 있는 자식 클래스에서 사용을 못해서 절대불가 
	
}

class AbsChild extends AbsPar {
	
	int c = 3000;
	
	void meth_3() {
		System.out.println("자식 meth_3()");
	}


	void meth_2() {
		System.out.println("자식 meth_2()");
		
	}
}

public class AbstractMain {

	public static void main(String[] args) {
		
		AbsChild cc = new AbsChild();
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
	}
}
