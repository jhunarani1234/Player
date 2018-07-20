
package com.java.model;

import java.util.List;

public class Player {

	public int id;
	public String name;
	public String country;
	public int rank;
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", country=" + country + ", rank=" + rank + "]";

}
}