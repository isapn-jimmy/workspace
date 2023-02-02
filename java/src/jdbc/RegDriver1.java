package jdbc;

public class RegDriver1 {
	public static void main (String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("OK");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
