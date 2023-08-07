package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_p.BoardDAO;
import model_p.PageData;

public class BList implements BoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		request.setAttribute("mainTitle","게시판 목록");
		
		PageData pd = (PageData)request.getAttribute("pd");
		pd.calc();
		System.out.println("BList.execute() 실행:"+pd.page);

		request.setAttribute("mainData",new BoardDAO().list(pd));
		
		
	}

}
