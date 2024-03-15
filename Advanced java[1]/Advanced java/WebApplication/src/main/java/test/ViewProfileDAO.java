package test;

import java.util.*;
import java.sql.*;
public class ViewProfileDAO {
	public ArrayList<WebBean>al=new ArrayList<WebBean>();
	public ArrayList<WebBean>retrieve(){
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from user1");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				WebBean pb=new WebBean();
				pb.setId(rs.getString(1));
				pb.setName(rs.getString(2));
				pb.setMail(rs.getString(3));
				pb.setAge(rs.getString(4));
				pb.setDob(rs.getString(5));
				al.add(pb);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
	}

}