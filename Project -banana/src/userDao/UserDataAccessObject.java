package userDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

import bean.User;
import connUtil.ConnectFactory;

public class UserDataAccessObject implements UserDAO {// DAO
	// C= create
	@Override
	public boolean createUser(User user) {
		String sql = "insert into [user](account ,pwd) values(?,?)"; // 識別規格寫是不用打id(自動增加)，寫否要加id
		ConnectFactory connFactory = new ConnectFactory();

		try (Connection conn = connFactory.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);//預先撰寫
			pstmt.setString(1, user.getAccount());//取得帳號
			pstmt.setString(2, user.getPwd());//取得密碼
			int updateCount = pstmt.executeUpdate();//執行資料庫的更新，回傳變更的資料項目
			if (updateCount < 1) { 
				return false;
			} else {
				return true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;
	}

	// R=查詢 找account
	@Override
	public User findUserById(int id) {
		String sql = "select id,account,pwd from [user] where id = ?"; // 動態查詢
		ConnectFactory connFactory = new ConnectFactory();

		try (Connection conn = connFactory.getConnection()) {

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id); // 把id塞到問號
			ResultSet rs = pstmt.executeQuery();// 查詢結果
			rs.next();
			User user = new User();
			user.setId(rs.getInt(1));
			user.setAccount(rs.getString(2));
			user.setPwd(rs.getString(3));
			return user;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public ArrayList<User> finUsers() {
		return null;

	}

	// U=更新
	@Override
	public boolean updateUser(User user) {
		return false;
	}

	// D=delete
	@Override
	public boolean deleteUserById(int id) {
		return false;
	}

}
