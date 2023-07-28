<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>03_thrid</title>
</head>
<body>
	<h1>03_thrid</h1>
	
	<%!
		// delcaration : 클래스 정의부
		// 멤버변수
		String name = "테스트";
		int age = 33;
		boolean marriage = false;
		
		void meth_1(){
			System.out.println("meth_() 실행");
		}
		//System.out.println("정의부에서 실행구문 불가");
		
		public void jspInit(){
			System.out.println("jspInit() 실행");
		}
		public void jspDestroy(){
			System.out.println("Destroy() 실행");
		}
	%>
	<%!
		// int age = 23; 멤버변수 중복으로 불가
		int[] arr = {11,22,33,44,55};
		
	%>
	
	<%
		// scriptlet :: _jspService();
		System.out.println("scriptlet 실행 : " + age);
		int age = 22; // 지역변수 = 멤버변수와 중복가능
		System.out.println("scriptlet 실행 : " + age);
		// int age = 13; 지역변수 중첩불가
		String str = "테스트2";
		/* 메서드 정의 불가 -> scriptlet _jspService() 인 메서드 이므로 메서드 중첩정의 불가 
		void meth_1(){
			System.out.println("meth_() 실행");
		} */
		out.println("str : " + str);

	%>
</body>
</html>