package com.ltts.WebProject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ltts.WebProject.configure.MyConnection;
import com.ltts.WebProject.model.Team;

public class TeamDao {
	public boolean insertTeam(Team t) throws Exception
	{
		Connection c= MyConnection.getConnection();
		
		PreparedStatement ps= c.prepareStatement("insert into team values(?,?,?,?)");
		ps.setInt(1,t.getTeam_id());
		ps.setString(2, t.getTeamname());
		ps.setString(3, t.getOwnername());
		ps.setString(4, t.getCoachname());
		System.out.println("Data Inserted Succesfully");
		return ps.execute();
}

}
