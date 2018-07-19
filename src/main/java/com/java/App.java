package com.java;

import com.java.model.Player;
import com.java.repository.PlayerRepositoryImpl;
import com.java.repository.PlayerRepositoryImpl;
import com.java.repository.IPlayerRepository;
import com.java.repository.IPlayerRepository;
import com.java.service.PlayerServiceImpl;
import com.java.service.IPlayerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	IPlayerRepository repository=new PlayerRepositoryImpl();
    	IPlayerService service=new PlayerServiceImpl(repository);
    	// CREATE PLAYER
    	Player ply1=new Player();
    	ply1.id=1;
    	ply1.name="john";
    	ply1.country="India";
    	ply1.rank=1;
    	
    	service.save(ply1); // calling save
    	
    	Player ply2=new Player();
    	ply2.id=2;
    	ply2.name="matthew";
    	ply2.country="USA";
    	ply2.rank=2;
    	
    	service.save(ply2);// calling save
    	
    	Player ply3=new Player();
    	ply3.id=3;
    	ply3.name="alex";
    	ply3.country="Brazil";
    	ply3.rank=3;
    	
    	service.save(ply3);// calling save
    	
        
    }

	private static void IPlayerService(IPlayerService service) {
		// TODO Auto-generated method stub
		
	}
    }

