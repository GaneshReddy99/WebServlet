package com.ltts.WebProject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ltts.WebProject.configure.MyConnection;
import com.ltts.WebProject.model.User;


public class UserDao {
	public boolean insertUser(User t) throws Exception
	{
		Connection c= MyConnection.getConnection();
		
		PreparedStatement ps= c.prepareStatement("insert into user values(?,?,?,?)");
		ps.setString(1,t.getName());
		ps.setString(2, t.getEmail());
		ps.setString(3, t.getUsername());
		ps.setString(4, t.getPassword());
		System.out.println("Data Inserted Succesfully");
		return ps.execute();
}
	public boolean loginUser(User t) throws Exception
	{
		Connection c= MyConnection.getConnection();
		
		
		PreparedStatement ps= c.prepareStatement("select * from user where username='\" + ? + \"' and password='\" +? + \"'\"");
		
		ps.setString(1, t.getUsername());
		ps.setString(2, t.getPassword());
		System.out.println("Data I Succesfully");
		return ps.execute();
}

}
