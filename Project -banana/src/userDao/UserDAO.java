package userDao;

import java.util.ArrayList;

import bean.User;

public interface UserDAO {

	// C= create
	boolean createUser(User user);

	// R=查詢 找account
	User findUserById(int id);

	ArrayList<User> finUsers();

	// U=更新
	boolean updateUser(User user);

	// D=delete
	boolean deleteUserById(int id);

}