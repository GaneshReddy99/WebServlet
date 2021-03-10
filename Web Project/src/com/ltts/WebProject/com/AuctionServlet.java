package com.ltts.WebProject.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.WebProject.dao.AuctionDao;
import com.ltts.WebProject.dao.PlayerDao;
import com.ltts.WebProject.model.Auction;

/**
 * Servlet implementation class AuctionServlet
 */
@WebServlet("/AuctionServlet")
public class AuctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuctionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int auction_id=Integer.parseInt(request.getParameter("ano"));
		int player_id=Integer.parseInt(request.getParameter("pno"));
		int team_id=Integer.parseInt(request.getParameter("tno"));
		int year=Integer.parseInt(request.getParameter("year"));
		int amount=Integer.parseInt(request.getParameter("amo"));
		Auction a= new Auction(auction_id,player_id,team_id,year,amount);
		System.out.println("inserted.." +a);
		AuctionDao ad = new AuctionDao();
		boolean b=false;
		try {
			b=ad.insertAuction(a); // Control TRanfers to Dao file
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
