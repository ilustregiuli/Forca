package main;

import java.sql.Connection;

import controller.ConectorDB;
import model.Forca;

public class PlayGame {

	public static void main(String[] args)  {
		
		ConectorDB condb = new ConectorDB();
		
		Connection connect = condb.getConnection();
		
		if(connect != null) {
			System.out.println("Conectado!");
		} 
		
		Forca f = new Forca();
		
		condb.CloseConnection(connect);
		
	}

}
