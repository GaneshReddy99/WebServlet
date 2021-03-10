package com.ltts.WebProject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ltts.WebProject.configure.MyConnection;
import com.ltts.WebProject.model.*;


public class AuctionDao {
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
