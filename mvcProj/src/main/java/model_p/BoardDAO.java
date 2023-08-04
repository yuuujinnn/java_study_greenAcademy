package model_p;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class BoardDAO {

	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	String sql;
	
	public BoardDAO() {
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:/comp/env/mvc322");
			con = ds.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<BoardDTO> list(){
		
		sql = "select * from board order by id desc";
		ArrayList<BoardDTO> res = new ArrayList<>();
		 
		try {
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setId(rs.getInt("id"));
				dto.setGid(rs.getInt("gid"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setSeq(rs.getInt("seq"));
				dto.setLev(rs.getInt("lev"));
				dto.setTitle(rs.getString("title"));
				dto.setPname(rs.getString("pname"));
				dto.setPw(rs.getString("pw"));
				dto.setUpfile(rs.getString("upfile"));
				dto.setContent(rs.getString("content"));
				dto.setReg_date(rs.getTimestamp("reg_date"));
				
				res.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		 
		return res;
	}
	
	public BoardDTO detail(int id){
		
		sql = "select * from board where id = ?";
		BoardDTO dto = null;
		 
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, id);
			rs = ptmt.executeQuery();
			
			if(rs.next()) {
				dto = new BoardDTO();
				dto.setId(rs.getInt("id"));
				dto.setGid(rs.getInt("gid"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setSeq(rs.getInt("seq"));
				dto.setLev(rs.getInt("lev"));
				dto.setTitle(rs.getString("title"));
				dto.setPname(rs.getString("pname"));
				dto.setPw(rs.getString("pw"));
				dto.setUpfile(rs.getString("upfile"));
				dto.setContent(rs.getString("content"));
				dto.setReg_date(rs.getTimestamp("reg_date"));
				
	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		 
		return dto;
	}
	
	public void addCount(int id){
		
		sql = "update board set cnt = cnt + 1 where id = ?";
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, id);
			ptmt.executeUpdate();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	public void write(BoardDTO dto){
		
		sql = "insert into board (title, pname, pw, upfile, content, seq, lev, gid, cnt, reg_date) "+ 
				 "values (?, ?, ?, ?, ?,0, 0, 0, -1, sysdate())"; // 어차피 글 작성하면 1 올라갈거니까 cnt를 -1로 기본값 줌
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dto.getTitle());
			ptmt.setString(2, dto.getPname());
			ptmt.setString(3, dto.getPw());
			ptmt.setString(4, dto.getUpfile());
			ptmt.setString(5, dto.getContent());
			ptmt.executeUpdate();
			
			ptmt.close();
			
			sql = "select max(id) from board";
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			rs.next();
			dto.setId(rs.getInt(1)); // 반드시 있으니까 if 필요없음
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	}
	

	public int delete(BoardDTO dto){
		
		sql = "delete from board where id = ? and pw = ?";
		int res = 0;
		try {
			ptmt = con.prepareStatement(sql);
			
			ptmt.setInt(1, dto.getId());
			ptmt.setString(2, dto.getPw());
			
			res = ptmt.executeUpdate();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return res;
	}
	
	
	public BoardDTO idPwChk(BoardDTO dto){
		
		sql = "select * from board where id = ? and pw = ?";
		BoardDTO res = null;
		try {
			ptmt = con.prepareStatement(sql);
			
			ptmt.setInt(1, dto.getId());
			ptmt.setString(2, dto.getPw());
			
			rs = ptmt.executeQuery();
			
			if(rs.next()) {
				res = new BoardDTO();
				res.setId(rs.getInt("id"));
				res.setUpfile(rs.getString("upfile"));
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return res;
	}
	
	public int modify(BoardDTO dto){
		
		int res = 0;
		
		sql = "update board set title = ?, pname = ?, upfile = ?, content = ? "
				+ "where id = ? and pw = ?"; 
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dto.getTitle());
			ptmt.setString(2, dto.getPname());
			ptmt.setString(3, dto.getUpfile());
			ptmt.setString(4, dto.getContent());
			ptmt.setInt(5, dto.getId());
			ptmt.setString(6, dto.getPw());
			
			res = ptmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return res;
	}
	
	

	public void close() {
		if(rs!=null) try { rs.close(); } catch (Exception e) {}
		if(ptmt!=null) try { ptmt.close(); } catch (Exception e) {}
		if(con!=null) try { con.close(); } catch (Exception e) {}
	}

}
