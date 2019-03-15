package model;

public class Pet{
	
	private String name;
	private int age;
	private String type;
	private double weight;
	

	public Pet(String name, int age, String type, double weight ){
		this.name = name;
		this.age = age;
		this.type = type;
		this.weight = weight;
	}


	public String getName(){return name;}
	public int getAge(){return age;}
	public String getType(){return type;}
	public double getWeight(){return weight;}

	public void setName(String name){this.name = name;}
	public void setAge(int age){this.age = age;}
	public void setType(String type){this.type = type;}
	public void setWeight(double weight){this.weight = weight;}



}