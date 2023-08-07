package model_p;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class GalleryDAO {

	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	String sql;
	
	public GalleryDAO() {
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:/comp/env/mvc322");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<GalleryDTO> list(){
		
		sql = "select * from gallery order by id desc";
		ArrayList<GalleryDTO> res = new ArrayList<>();
		
		try {
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			while(rs.next()) {

				GalleryDTO dto = new GalleryDTO();
			
				dto.setId(rs.getInt("id"));
				dto.setTitle(rs.getString("title"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setPname(rs.getString("pname"));
				dto.setPw(rs.getString("pw"));
				dto.setContent(rs.getString("content"));
				dto.setReg_date(rs.getTimestamp("reg_date"));
				dto.setUpfile(rs.getString("upfile"));
				
				res.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		return res;
		 
	}
	
//	public int totalCnt() {
//		
//		sql = "select count(*) from gallery";
//		int res = 0;
//		
//		try {
//			ptmt = con.prepareStatement(sql);
//			rs = ptmt.executeQuery();
//			rs.next();
//			res = rs.getInt(1);
//		
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			close();
//		}
//		 
//		return res;
//	}
//	
//	
	
	public GalleryDTO detail(int id){
		
		sql = "select * from gallery where id = ?";
		GalleryDTO dto = null;
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, id);
			rs = ptmt.executeQuery();
			
			if(rs.next()) {
				dto = new GalleryDTO();
				dto.setId(rs.getInt("id"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setPname(rs.getString("pname"));
				dto.setPw(rs.getString("pw"));
				dto.setTitle(rs.getString("title"));
				dto.setUpfile(rs.getString("upfile"));
				dto.setContent(rs.getString("content"));
				dto.setReg_date(rs.getTimestamp("reg_date"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		 
		return dto;
	}
	
	
	public void addCount(int id){
		
		sql = "update gallery set cnt = cnt + 1 where id = ?";
		
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
	
	public void write(GalleryDTO dto){

		try {
			sql = "select max(id)+1 from gallery";
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			rs.next();
			dto.setId(rs.getInt(1));
			
			
			ptmt.close();
			
			sql = "insert into gallery " +
					"(id, title, pname, pw, upfile, content, cnt, reg_date) "+ 
					 "values (?, ?, ?, ?, ?, ?, -1, sysdate() )";
			
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, dto.getId());
			ptmt.setString(2, dto.getTitle());
			ptmt.setString(3, dto.getPname());
			ptmt.setString(4, dto.getPw());
			ptmt.setString(5, dto.getUpfile());
			ptmt.setString(6, dto.getContent());
			ptmt.executeUpdate();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	public int delete(GalleryDTO dto){
		
		sql = "delete from gallery where id = ? and pw = ?";
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
	
	
	public void fileDelete(GalleryDTO dto){
		
		sql = "update gallery set upfile = null where id = ? and pw = ?";
		
		try {
			ptmt = con.prepareStatement(sql);
			
			ptmt.setInt(1, dto.getId());
			ptmt.setString(2, dto.getPw());
			
			ptmt.executeUpdate();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
	}
	
	
	
	public GalleryDTO idPwChk(GalleryDTO dto){
		
		sql = "select * from gallery where id = ? and pw = ?";
		GalleryDTO res = null;
		try {
			ptmt = con.prepareStatement(sql);
			
			ptmt.setInt(1, dto.getId());
			ptmt.setString(2, dto.getPw());
			
			rs = ptmt.executeQuery();
			
			if(rs.next()) {
				res = new GalleryDTO();
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
	
	
	
	
	public int modify(GalleryDTO dto){
		
		int res = 0;
		
		sql = "update gallery set title = ?, pname = ?, upfile = ?, content = ? "+
		" where id = ? and pw = ?";
		
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
		if(rs!=null) try { rs.close();	} catch (Exception e) {}
		if(ptmt!=null) try { ptmt.close();	} catch (Exception e) {}
		if(con!=null) try { con.close();	} catch (Exception e) {}
	}
}
