
package com.java.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
		ps.setDouble(4, ply.rank);
		
		ps.executeUpdate();
		System.out.println("saved");
		
	}

	public void updateNameAndRank(String name, int rank, int id, Connection con) {
		// TODO Auto-generated method stub

	}

	public void updateCountry(String counrty, int id, Connection con) {
		// TODO Auto-generated method stub

	}

	public List<Player> findAll(Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	public Player findById(int id, Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(int id, Connection con) {
		// TODO Auto-generated method stub

	}

	public void deleteAll(Connection con) {
		// TODO Auto-generated method stub

	}

}
