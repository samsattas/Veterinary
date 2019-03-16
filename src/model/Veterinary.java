package model;

public class Veterinary{
	private String name;
	private Client[] nClient;


	//constructor
	public Veterinary(String name, Client[] nClient){
		this.name = name;
		this.nClient = nClient;

	}


	public String getName(){return name;}
	public Client[] nClient(){return nClient;}

	public void setName(String name){this.name = name;}
	public void setNClient(Client[] nClient){this.nClient = nClient;}
}