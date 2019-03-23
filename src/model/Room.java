package model;

public class Room{

	private int number;
	private Clinic rClinic;
	private Pet rPet;
	private boolean space;

	public  Room(int number, Clinic rClinic, Pet rPet){
		this.number = number;
		this.rClinic = null;
		this.rPet = null;
		this.space = space;
	}

	//getters & setters
	public int getNumber(){return number;}
	public Clinic getRClient(){return rClinic;}
	public Pet getRPet(){return rPet;}
	public boolean getSpace(){return space;}

	public void setNumber(int number){this.number = number;}
	public void setRClient(Clinic rClinic){this.rClinic = rClinic;}
	public void setRPet(Pet rPet){this.rPet = rPet;}
	public void setSpace(boolean space){this.space = space;}
}