package com.ltts.WebProject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.WebProject.configure.MyConnection;
import com.ltts.WebProject.model.Player;
import com.ltts.WebProject.model.Team;

public class TeamDao {
	public List<Team> getAllTeam() throws Exception{
		List<Team> li=new ArrayList<Team>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from team");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Team(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			
		}
		return li;
	}
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
