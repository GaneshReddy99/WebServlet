package com.ltts.WebProject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.WebProject.configure.MyConnection;
import com.ltts.WebProject.model.*;


public class AuctionDao {
	public List<Auction> getAllAuction() throws Exception{
		List<Auction> li=new ArrayList<Auction>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from auction");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Auction(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5)));
			
		}
		return li;
	}
	public boolean insertAuction(Auction a) throws Exception
	{
		Connection c= MyConnection.getConnection();
		
		PreparedStatement ps= c.prepareStatement("insert into auction values(?,?,?,?,?)");
		ps.setInt(1,a.getAuction_id());
		ps.setInt(2,a.getPlayer_id());
		ps.setInt(3,a.getTeam_id());
		ps.setInt(4,a.getYear());
		ps.setInt(5,a.getAmount());
		
		System.out.println("Data Inserted Succesfully");
		return ps.execute();
		
	}

}
