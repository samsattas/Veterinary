package ui;

import model.*;
import java.util.Scanner;
import java.util.ArrayList;
//import java.time.LocalDate;


public class Main{
	public static void main(String []args){
		
		ArrayList<Client> regClient = new ArrayList<Client>();
		ArrayList<Pet> regPet = new ArrayList<Pet>();
		Room[] miniRoom = new Room[7];

		Scanner s=new Scanner(System.in);

		//LocalDate today = LocalDate.now();
		int i = 0;
		int select = 0;
		String tot = "	Clientes:\n";
		Pet auxPet;
		Client auxClient;
		
/*		
		//DATE
		System.out.print("ingrese el dia actual\n");
		int day=s.nextInt();
		s.nextLine();
		
		System.out.print("ingrese el mes actual\n");		
		int month=s.nextInt();
		s.nextLine();
		
		System.out.print("ingrese el anio actual\n");		
		int year=s.nextInt();
		s.nextLine();
		
		Date todayDate =new Date(day, month, year);
*/

		while(i < 1){
			System.out.println("#############################################");
			System.out.println("#####	VETERINARIA MI PEQUE\u00d1A MASCOTA	#####");
			System.out.println("#############	  BIENVENIDO	#############");
			System.out.println("#############################################\n");

			//System.out.println("Fecha: " + today);
			//System.out.println("Fecha: " + day + "/" + month + "/" + year + "\n");

			System.out.println("\n	Que desea hacer?");
			System.out.println("	1.Registrar usuario");
			System.out.println("	2.Ver usuarios");
			System.out.println("	3.Registrar mascota");//DONE RF#
			System.out.println("	4.Ver mascotas");
			System.out.println("	5.Calcular costo");
			System.out.println("	6.Buscar datos de contacto a traves del nombre del cliente");
			System.out.println("	7.");
			System.out.println("	8.");
			System.out.println("	9.");
			System.out.println("	10.");
			System.out.println("	11.");
			System.out.println("	12.");

			System.out.println("	0.Salir");

			select = s.nextInt();

			if (select == 0){//SALIDA
				System.out.println("VUELVA PRONTO!");
				i++;

			}else if(select== 1){//REGISTRO CLIENTES
				s.nextLine();//CLEAR int>String
				

				if (!regPet.isEmpty()){
					System.out.println("Ingrese su nombre:");				
					String name = s.nextLine();
				
					System.out.println("Ingrese su ID:");
					int id = s.nextInt();

					s.nextLine();//CLEAR int>String

					System.out.println("Ingrese su direccion:");
					String adress = s.nextLine();
				
					System.out.println("Ingrese su telefono:");
					long phone = s.nextLong();

					System.out.println("Ingrese el numero de su Mascota:");
					for (int a = 0; a < regPet.size(); a++){
						System.out.println( a + ")----------" + regPet.get(a) + "\n------------\n");
					}
					int petSelect = s.nextInt();
					Pet cPet = regPet.get(petSelect);

					auxClient = new Client(name, id, adress, phone, cPet);
					
					regClient.add(auxClient);
					
				}else{
					System.out.println("\n########################################");
					System.out.println("# NO HAY MASCOTAS, REGISTRO CANCELADO. #");
					System.out.println("########################################\n");
				}

				
				

				
   				
    			

			}else if (select == 2){//VER CLIENTES
				
				System.out.println("Clientes:\n" );
				for(int n = 0; n < regClient.size();n++){
					System.out.println(n + ")-----------------------------\n" + regClient.get(n) + "\n-------------------------------\n");
				}
				







			}else if (select == 3){//REGISTRO MASCOTA
				s.nextLine();//CLEAR int>String

				System.out.println("Ingrese el nombre:");
				String pName = s.nextLine();

				System.out.println("Ingrese la edad:");
				int age = s.nextInt();

				s.nextLine();//CLEAR int>String

				String type = "";
				int i3 = 0;
				while(i3 <1){
					System.out.println("Ingrese el tipo de animal:");
					System.out.println("0.Perro");
					System.out.println("1.Gato");
					System.out.println("2.Ave");
					System.out.println("3.Otro");

					int typeSelect = s.nextInt();

					if(typeSelect == 0){
						type = "Perro";
						i3++;
					}else if(typeSelect == 1){
						type = "Gato";
						i3++;
					}else if(typeSelect == 2){
						type = "Ave";
						i3++;
					}else if(typeSelect == 3){
						type = "Otro";
						i3++;
					}else{
						System.out.println("\nNumero no valido, ingrese de nuevo");
					}
				}
				System.out.println("Ingrese el peso:");
				double weight = s.nextDouble();

				auxPet = new Pet(pName, age, type, weight);

				regPet.add(auxPet);

				System.out.println("\nSE HA REGISTRADO EXITOSAMENTE!");








			}else if (select == 4){//VER MASCOTAS
				System.out.println("Mascotas:\n");
				for (int n = 0; n < regPet.size();n++){
					System.out.println( n + ")----------" + regPet.get(n) + "\n------------\n");
				}







			}else if(select == 5){//CALCULAR TOTAL A PAGAR
				if (!regPet.isEmpty()){
				System.out.println("Seleccione la mascota:\n");
				System.out.println("Mascotas:\n");
				for (int n = 0; n < regPet.size();n++){
					System.out.println( n + ")----------" + regPet.get(n) + "\n------------\n");
				}
				select = s.nextInt();
				double total;
				String type = regPet.get(select).getType();
				double weight = regPet.get(select).getWeight();
				int nDays;
				System.out.println("Ingrese el numero de dias de hospitalozacion:\n");
				nDays = s.nextInt();

				if(type == "Gato"){
					if (weight>=1 && weight<=3){
						total = 10000;
					}else if (weight>=3.1 && weight<=10){
						total = 12000;
					}else if (weight>=10.1 && weight<=20) {
						total = 15000;
					}else{
						total = 20000;
					}
				}else if(type == "Perro"){
					if (weight>=1 && weight<=3){
						total = 15000;
					}else if (weight>=3.1 && weight<=10){
						total = 17000;
					}else if (weight>=10.1 && weight<=20) {
						total = 20000;
					}else{
						total = 25000;
					}
				}else if(type == "Ave"){
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


				total *= nDays;

				System.out.println("Costo de medicamentos: \n");
				double mCost = s.nextInt();
				total += mCost;
				System.out.println("El total a pagar es: $" + total);
				}else{
					System.out.println("\n#######################################");
					System.out.println("# NO HAY MASCOTAS, CALCULO CANCELADO. #");
					System.out.println("#######################################\n");
				}







			}else if(select == 6){//BUSQUEDA DE DATOS A TRAVES DEL NOMBRE DE CLIENTE
				s.nextLine();
				String find;
				
				if(!regClient.isEmpty()){
					System.out.println("Ingrese el nombre del usuario:");
					
					find = s.nextLine();

					for(int n = 0; n<regClient.size();n++){
						//String name = regClient.get(n).getName();
						//System.out.println(name);
						
						if(regClient.get(n).getName().equals(find)){
							System.out.println("Datos de contacto:\n");
							System.out.println("Telefono: " + regClient.get(n).getPhone());
							System.out.println("Direccion: " + regClient.get(n).getAdress());
						}
					}
				}else {
					System.out.println("NO HAY USUARIOS REGISTRADOS");
				}





			}else if(select == 7){
				
			}else if(select == 8){//CONSULTAR MINI CUARTOS
				
			}else if(select == 9){
				
			}else if(select == 10){
				
			}else if(select == 11){
				
			}else if(select == 12){
				
			}
		}
	}
}