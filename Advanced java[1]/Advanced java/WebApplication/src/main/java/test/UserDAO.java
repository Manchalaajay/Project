package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
public class UserDAO {
	public int k=0;
	public int register(WebBean ub) {
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement  ps=con.prepareStatement("insert into user1 values(?,?,?,?,?)");
			ps.setString(1, ub.getId());
			ps.setString(2, ub.getName());
			ps.setString(3, ub.getMail());
			ps.setString(4, ub.getAge());
			ps.setString(5, ub.getDob());
			
			k=ps.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}

}

