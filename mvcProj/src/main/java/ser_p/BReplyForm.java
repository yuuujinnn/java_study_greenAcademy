package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_p.BoardDAO;

public class BReplyForm implements BoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle","게시판 답변");
		System.out.println("BReplyForm 실행");
		
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("mainData",new BoardDAO().detail(id));
	}

}
