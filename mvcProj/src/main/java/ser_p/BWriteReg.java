package ser_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URLEncoder;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import control.BoardService;
import model_p.BoardDAO;
import model_p.BoardDTO;

public class BWriteReg implements BoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String path = request.getRealPath("up");
		path = "C:\\javawork\\mvcProj\\src\\main\\webapp\\up";
		
		
		try {
			MultipartRequest mr = new MultipartRequest(
					request,
					path,
					10 * 1024 * 1024,
					"utf-8",
					new DefaultFileRenamePolicy()   //파일이름 중복되면 뒤에 이름에 번호 붙여줘
					); 
			// 글쓰기해서 파일 첨부하면 up폴더에 알아서 들어옴
			// 글쓰기한 상태에서 계속 새로고침 하면 번호를 알아서 증가하여 up폴더에 번호가 추가되면서 생성됨
			BoardDTO dto = new BoardDTO();
			dto.setTitle(mr.getParameter("title"));
			dto.setPname(mr.getParameter("pname"));
			dto.setPw(mr.getParameter("pw"));
			dto.setContent(mr.getParameter("content"));
			dto.setUpfile(mr.getFilesystemName("upfile")); 
			//저장된 파일명 가져오는것  - 시스템 파일네임 / 업로드할때 파일명 가져오는것 - 오리지널 파일네임
			
			new BoardDAO().write(dto);
			
			System.out.println("newId:" + dto.getId());
			
			request.setAttribute("mainPage", "alert");
			request.setAttribute("msg", "입력되었습니다.");
			request.setAttribute("goUrl", "BDetail?id="+dto.getId());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}

}
