
package com.java.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.model.Player;
import com.java.utils.PlayerQueries;

// wjhy abstract. what is abstract. please learn tghis concept.
public  class PlayerRepositoryImpl implements IPlayerRepository {

	// hit ctrl shift o to import pkgO
	public void save(Player ply, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		
		PreparedStatement ps=con.prepareStatement(PlayerQueries.INSERT);
		ps.setInt(1, ply.id);
		ps.setString(2, ply.name);
		ps.setString(3, ply.country);
		ps.setInt(4, ply.rank);
		
		ps.executeUpdate();
		System.out.println("saved");
		
	}

	public void updateNameAndRank(String name, int rank, int id, Connection con) throws SQLException{
		// TODO Auto-generated method stub
		PreparedStatement ps=con.prepareStatement(PlayerQueries.UPDATE_NAME_RANK);
				ps.setString(1, name);
				ps.setInt(2, rank);
				ps.setInt(3, id);
				
				ps.executeUpdate();
	}

	public void updateCountry(String counrty, int id, Connection con) throws SQLException{
		// TODO Auto-generated method stub
		PreparedStatement ps=con.prepareStatement(PlayerQueries.UPDATE_COUNTRY);
				

				ps.setString(1, "country");
				ps.setInt(2, id);
				
				ps.executeUpdate();
	}

	public List<Player> findAll(Connection con) throws SQLException {
		// TODO Auto-generated method stub
		List<Player> Players=new ArrayList<Player>();
		PreparedStatement ps=con.prepareStatement(PlayerQueries.SELECT_ALL);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			Player p=new Player();
			p.id=rs.getInt("ID");// ID is column_name in the table 
			p.name=rs.getString("NAME");
			p.country=rs.getString("COUNTRY");
			p.rank=rs.getInt("RANK");
			
			Players.add(p);
		}
		return Players;
	}

	public Player findById(int id, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		Player p=new Player();
		PreparedStatement ps=con.prepareStatement(PlayerQueries.SELECT_BY_ID);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			p.id=rs.getInt("ID");// ID is column_name in the table 
			p.name=rs.getString("NAME");
			p.country=rs.getString("COUNTRY");
			p.rank=rs.getInt("RANK");
		}
		
		return p;
		
	}

	public void deleteById(int id, Connection con)  throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps=con.prepareStatement(PlayerQueries.DELETE_BY_ID);
				ps.setInt(1, id);
				
				ps.executeUpdate();
	}

	public void deleteAll(Connection con) throws SQLException{
		// TODO Auto-generated method stub
		PreparedStatement ps=con.prepareStatement(PlayerQueries.DELETE_ALL);
				
				// nothing to set to ps
				
				ps.executeUpdate();
				
	}

}

	