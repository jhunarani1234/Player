package com.java.utils;

public class PlayerQueries {
	public static final String INSERT="INSERT INTO PLAYER(ID,NAME,COUNTRY,RANK) VALUES(?,?,?,?)";
	public static final String SELECT_ALL="SELECT * FROM PLAYER";
	public static final String SELECT_BY_ID="SELECT * FROM PLAYER WHERE ID=?";
	public static final String UPDATE_COUNTRY = "UPDATE PLAYER SET COUNTRY=? WHERE ID=?";
    public static final String UPDATE_NAME_RANK = "UPDATE PLAYER SET NAME=?,RANK=? WHERE ID=?";
    public static final String DELETE_BY_ID ="DELETE FROM Player WHERE ID=?";
    public static final String DELETE_ALL ="DELETE FROM Player";
}

