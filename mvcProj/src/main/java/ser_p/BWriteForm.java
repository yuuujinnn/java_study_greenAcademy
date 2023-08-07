package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;

public class BWriteForm implements BoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("mainTitle","게시판 글쓰기");
		System.out.println("BList.execute() 실행");

	}

}
