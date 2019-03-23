package model;
import java.util.ArrayList;


public class Veterinary{
	
	private final static int rNumber = 8;

	private String name;
	//private ArrayList<Client> vClient;
	private Room[] vRoom;
	//private ArrayList<Client> regClient;


	//constructor
	public Veterinary(String name, /*ArrayList<Client> vClient,*/Room[] vRoom){
		this.name = name;
		//this.vClient = new ArrayList<Client>;
		this.vRoom = new Room[rNumber];
		//regClient = new ArrayList<Client>();

	}


	//getters & setters
	public String getName(){return name;}
	//public ArrayList<Client> getNClient(){return vClient;}
	public Room[] getVRoom(){return vRoom;}

	public void setName(String name){this.name = name;}
	//public void setNClient(ArrayList<CLient> vClient){this.vClient = vClient;}
	public void setVRoom(Room[] vRoom){this.vRoom = vRoom;}

/*
	public void addClient(Client auxClient){
		regClient.add(auxClient);

	}





	public double cost(String type, double weight){
		double total;
		type = Pet.getType();
		weight = Pet.getWeight();
		int nDays;


		if(type = "Perro"){
			if (weight>=1 && weight<=3){
				total = 10000;
			}else if (weight>=3.1 && weight<=10){
				total = 12000;
			}else if (weight>=10.1 && weight<=20) {
				total = 15000;
			}else{
				total = 20000;
			}
		}else if(type = "Gato"){
			if (weight>=1 && weight<=3){
				total = 15000;
			}else if (weight>=3.1 && weight<=10){
				total = 17000;
			}else if (weight>=10.1 && weight<=20) {
				total = 20000;
			}else{
				total = 25000;
			}
		}else if(type = "Ave"){
			if (weight>=1 && weight<=3){
				total = 10000;
			}else if (weight>=3.1 && weight<=10){
				total = 12000;
			}else if (weight>=10.1 && weight<=20) {
				total = 20000;
			}else{
				total = 25000;
			}
		}else{
			if (weight>=1 && weight<=3){
				total = 10000;
			}else if (weight>=3.1 && weight<=10){
				total = 17000;
			}else if (weight>=10.1 && weight<=20) {
				total = 30000;
			}else{
				total = 30000;
			}
		}

		total = total * nDays;
		return total;
	}
*/


}