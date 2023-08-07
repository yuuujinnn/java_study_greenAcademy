package ser_p;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import control.BoardService;
import model_p.BoardDAO;
import model_p.BoardDTO;
import model_p.PageData;

public class BReplyReg implements BoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		try {
		
			BoardDTO dto = new BoardDTO();
			PageData pd = (PageData)request.getAttribute("pd");
			
			dto.setTitle( request.getParameter("title"));
			dto.setPname( request.getParameter("pname"));
			dto.setPw( request.getParameter("pw"));
			dto.setContent( request.getParameter("content"));
			
			dto.setGid(Integer.parseInt(request.getParameter("gid")));
			dto.setLev(Integer.parseInt(request.getParameter("lev")));
			dto.setSeq(Integer.parseInt(request.getParameter("seq")));
			
			new BoardDAO().reply(dto);
					
			request.setAttribute("mainPage", "alert");
			request.setAttribute("msg","작성되었습니다.");
			request.setAttribute("goUrl","BDetail?id="+dto.getId()+"&page="+pd.page);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}

}
