package model;

public class Med{
	private String name;
	private double dose;
	private double doseCost;
	private int frecuency;
	

	public Med(String name, double dose, double doseCost, int frecuency){
		this.name = name;
		this.dose = dose;
		this.doseCost = doseCost;
		this.frecuency = frecuency;
	}


//getters
	public String getName(){return name;}
	public double getDose(){return dose;}
	public double getDoseCost(){return doseCost;}
	public int getFrecuency(){return frecuency;}

//setters
	public void setName(String name){this.name = name;}
	public void setDose(double dose){this.dose = dose;}
	public void setDoseCost(double doseCost){this.doseCost = doseCost;}
	public void setFrecuency(int frecuency){this.frecuency = frecuency;}
}