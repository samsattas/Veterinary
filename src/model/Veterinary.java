package model;
import java.util.ArrayList;


public class Veterinary{
	
	private final static int rNumber = 8;

	private String name;
	private Room[] vRoom;

	//constructor
	public Veterinary(String name, Room[] vRoom){
		this.name = name;
		this.vRoom = new Room[rNumber];
		

	}


	//getters & setters
	public String getName(){return name;}
	public Room[] getVRoom(){return vRoom;}

	public void setName(String name){this.name = name;}
	public void setVRoom(Room[] vRoom){this.vRoom = vRoom;}

/*
	public void addClient(Client auxClient){
		regClient.add(auxClient);

	}





	
*/


}