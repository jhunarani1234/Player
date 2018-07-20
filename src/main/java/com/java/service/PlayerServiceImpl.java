
package com.java.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.java.model.Player;
import com.java.repository.IPlayerRepository;
import com.java.utils.ConnectionUtils;

public class PlayerServiceImpl implements IPlayerService {


	private IPlayerRepository repository;
	public PlayerServiceImpl(IPlayerRepository repository) {
		this.repository=repository;
	}
	

	public void save(Player ply) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			con=ConnectionUtils.getConnection(); // create connection
			repository.save(ply, con); // save
			con.commit();// commit
			System.out.println("commited: "+ply.id);
		} catch (SQLException p) {
			// TODO: handle exception
			try {
				System.out.println("rollback: "+ply.id);
				con.rollback(); // rollback
			} catch (SQLException p1) {
				// TODO Auto-generated catch block
				p1.printStackTrace();
			}
		}
		finally {
			try {
				ConnectionUtils.closeConnection(con);
			} catch (SQLException p) {
				// TODO Auto-generated catch block
				p.printStackTrace();
			}
		}
	}

	public void updateNameAndRank(String name,int rank , int id) {
		// TODO Auto-generated method stub
		Connection con=null;
				
				try {
					con=ConnectionUtils.getConnection();
					repository.updateNameAndRank(name, rank, id, con);
					con.commit();
				} catch (SQLException p) {
					// TODO Auto-generated catch block
					try {
						con.rollback();
					} catch (SQLException p1) {
						// TODO Auto-generated catch block
						p1.printStackTrace();
					}
					p.printStackTrace();
				}
				finally {
					try {
						ConnectionUtils.closeConnection(con);
					} catch (SQLException p) {
						// TODO Auto-generated catch block
						p.printStackTrace();
					}
				}		
	}

	public void updateCountry(String country, int id) {
		// TODO Auto-generated method stub
		Connection con=null;
				
				try {
					con=ConnectionUtils.getConnection();
					repository.updateCountry(country, id, con);
		 con.commit();
				} catch (SQLException p) {
					// TODO Auto-generated catch block
					try {
						con.rollback();
					} catch (SQLException p1) {
						// TODO Auto-generated catch block
						p1.printStackTrace();
					}
					p.printStackTrace();
				}
				finally
				{
					try {
						ConnectionUtils.closeConnection(con);
					} catch (SQLException p) {
						// TODO Auto-generated catch block
						p.printStackTrace();
					}
				}
				
	}

	public List<Player> findAll() {
		List<Player> Players=null;
		
		Connection con=null;
		try {
			con = ConnectionUtils.getConnection();
			Players=repository.findAll(con); 
			// select operation so commit not required
		} catch (SQLException p) {
			// select operation so rollback not required
			p.printStackTrace();
		}
		finally {
			try {
				ConnectionUtils.closeConnection(con);
			} catch (SQLException p) {
				// TODO Auto-generated catch block
				p.printStackTrace();
			}
		}
		return Players;
	}

	public Player findById(int id) {
		// TODO Auto-generated method stub
		Connection con=null;
		Player ply=null;
		try {
			con=ConnectionUtils.getConnection();
			repository.findById(id, con);
			// SELECT operation so commit not required
		} catch (SQLException e) {
			// SELECT operation so rollback not required
			e.printStackTrace();
		}
		finally {
			try {
				ConnectionUtils.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ply;
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
     
	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}