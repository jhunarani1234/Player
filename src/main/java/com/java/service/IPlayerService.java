
package com.java.service;

import java.util.List;

import com.java.model.Player;

public interface  IPlayerService {

	public void save(Player ply);
	public void updateNameAndRank(String name,int rank,int id);
	public void updateCountry(String country,int id);
	public List<Player> findAll();
	public Player findById(int id);
	public void deleteById(int id);
	public void deleteAll();
}
