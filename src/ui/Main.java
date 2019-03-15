package ui;

import model.*;
import java.util.Scanner;
import java.util.ArrayList;
//import java.time.LocalDate;


public class Main{
	public static void main(String []args){
		ArrayList<String> regClient = new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		//LocalDate today = LocalDate.now();
		int i = 0;
		int select = 0;
		String tot = "	Clientes:\n";

		

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


		while(i < 1){
			System.out.println("#############################################");
			System.out.println("#####	VETERINARIA MI PEQUE\u00d1A MASCOTA	#####");
			System.out.println("#############	  BIENVENIDO	#############");
			System.out.println("#############################################\n");

			//System.out.println("Fecha: " + today);
			System.out.println("Fecha: " + day + "/" + month + "/" + year + "\n");

			System.out.println("\n	Que desea hacer?");
			System.out.println("	1.Registrar usuario");
			System.out.println("	2.");
			System.out.println("	3.");
			System.out.println("	4.");
			System.out.println("	5.");
			System.out.println("	0.Salir");

			select = s.nextInt();

			if (select == 0){
				System.out.println("VUELVA PRONTO!");
				i++;
			}else if(select== 1){
				int n = 1;
				
				System.out.println("nombre:\n");
				s.nextLine();
				/*
Point[] origin = new Point[n];
for (int i = 0; i < n; i++) {
    origin[i] = new Point(x, y);
}
				
				s.nextLine();
				System.out.println("inserte nombre");
				String[] name = new String[n];
				for (int x = 0; x<n;x++){
					name[x] = new String();
					n++;
					System.out.println(name[1]);
				}
*/

				
				regClient.add(s.nextLine());
   				tot = regClient + "\n";
    			

			}else if (select == 2){
				System.out.println("Clientes:\n");
				System.out.println(tot);
			}
		}
	}
}