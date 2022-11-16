package com.proyecto;

import javax.swing.JOptionPane;

public class Dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String textopart [] = {"\tPartidos jugados\tPartidos ganados\tPartidos empatados"
				+"\tPartidos perdidos\tGoles a favor\t\tGoles en contra\t\tPuntos equipo"};
		
		String equipos [] = {"\nBrasil\t","\nMexico\t","\nColombia","\nVenezuela","\nEcuador\t"
		,"\nPeru\t"};
		String equipost [] = {"Brasil","Mexico","Colombia","Venezuela","Ecuador"
				,"Peru"};
		
		int partidosest [][]=new int [6][7];

		int resultados[][] = new int [6][6];
		for (int x = 0; x < resultados.length; x++) {
			for (int y = 0; y < resultados[x].length;y++) {
				resultados [x][y] = 4;
			}
		}

		String menu="Seleccione si: \n"
				+ "1. Quiere jugar un partido.\n"
				+ "2. Quiere ver la cantidad de partidas ganados, perdidos, y empatados.\n"
				+ "3. Quiere ver la cantidad de goles favor y en contra de los equipos.\n"
				+ "4. Salir";

		int opcion=0;
		do {opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
		switch (opcion)
		{
		case 1:
			Partidos(resultados,partidosest,equipos,equipost);
			break;
		case 2:
			Resultadospartidos(partidosest,textopart,equipos,equipost);
			break;
		case 3:
			break;
		case 4:
			break;
		}
		}while(opcion!=4);
	}

	public  static void Partidos (int [][] resultados,int [][]partidosest,String[]equipos,String []equipost) {
		int ronda = 0;
		String eleccion ="";
		String eleccion1 ="";
		
		eleccion = JOptionPane.showInputDialog("Seleccione un equipo que va a jugar, siendo:\n"
				+"1.Para equipo 1\n"
				+"2.Para equipo 2\n"
				+"3.Para equipo 3\n"
				+"4.Para equipo 4\n"
				+"5.Para equipo 5\n"
				+"6.Para equipo 6\n");

		switch (Integer.parseInt(eleccion)) {
		case 1:
			eleccion1 = JOptionPane.showInputDialog("Seleccione el otro equipo que va a jugar, siendo:\n"
					+"1.Para equipo 1\n"
					+"2.Para equipo 2\n"
					+"3.Para equipo 3\n"
					+"4.Para equipo 4\n"
					+"5.Para equipo 5\n"
					+"6.Para equipo 6\n");

			switch (Integer.parseInt(eleccion1)) {
			case 1:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 2:
				if (resultados[0][1] == 4) {
					int x = 1;
					equipo1p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 3:
				if (resultados[0][2] == 4) {
					int x = 2;
					equipo1p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 4:
				if (resultados[0][3] == 4) {
					int x = 3;
					equipo1p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 5:
				if (resultados[0][4] == 4) {
					int x = 4;
					equipo1p( x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 6:
				if (resultados[0][5] == 4) {
					int x = 5;
					equipo1p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		case 2:
			eleccion1 = JOptionPane.showInputDialog("Seleccione el otro equipo que va a jugar, siendo:\n"
					+"1.Para equipo 1\n"
					+"2.Para equipo 2\n"
					+"3.Para equipo 3\n"
					+"4.Para equipo 4\n"
					+"5.Para equipo 5\n"
					+"6.Para equipo 6\n");

			switch (Integer.parseInt(eleccion1)) {
			case 2:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 1:
				if (resultados[1][0] == 4) {
					int x = 0;
					equipo2p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 3:
				if (resultados[1][2] == 4) {
					int x = 2;
					equipo2p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 4:
				if (resultados[1][3] == 4) {
					int x = 3;
					equipo2p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 5:
				if (resultados[1][4] == 4) {
					int x = 4;
					equipo2p( x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 6:
				if (resultados[1][5] == 4) {
					int x = 5;
					equipo2p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		case 3:
			eleccion1 = JOptionPane.showInputDialog("Seleccione el otro equipo que va a jugar, siendo:\n"
					+"1.Para equipo 1\n"
					+"2.Para equipo 2\n"
					+"3.Para equipo 3\n"
					+"4.Para equipo 4\n"
					+"5.Para equipo 5\n"
					+"6.Para equipo 6\n");

			switch (Integer.parseInt(eleccion1)) {
			case 3:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 1:
				if (resultados[2][0] == 4) {
					int x = 0;
					equipo3p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 2:
				if (resultados[2][1] == 4) {
					int x = 1;
					equipo3p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 4:
				if (resultados[2][3] == 4) {
					int x = 3;
					equipo3p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 5:
				if (resultados[2][4] == 4) {
					int x = 4;
					equipo3p( x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 6:
				if (resultados[2][5] == 4) {
					int x = 5;
					equipo3p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		case 4:
			eleccion1 = JOptionPane.showInputDialog("Seleccione el otro equipo que va a jugar, siendo:\n"
					+"1.Para equipo 1\n"
					+"2.Para equipo 2\n"
					+"3.Para equipo 3\n"
					+"4.Para equipo 4\n"
					+"5.Para equipo 5\n"
					+"6.Para equipo 6\n");

			switch (Integer.parseInt(eleccion1)) {
			case 4:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 1:
				if (resultados[3][0] == 4) {
					int x = 0;
					equipo4p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 2:
				if (resultados[3][1] == 4) {
					int x = 1;
					equipo4p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 3:
				if (resultados[3][2] == 4) {
					int x = 2;
					equipo4p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 5:
				if (resultados[3][4] == 4) {
					int x = 4;
					equipo4p( x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 6:
				if (resultados[3][5] == 4) {
					int x = 5;
					equipo4p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		case 5:
			eleccion1 = JOptionPane.showInputDialog("Seleccione el otro equipo que va a jugar, siendo:\n"
					+"1.Para equipo 1\n"
					+"2.Para equipo 2\n"
					+"3.Para equipo 3\n"
					+"4.Para equipo 4\n"
					+"5.Para equipo 5\n"
					+"6.Para equipo 6\n");

			switch (Integer.parseInt(eleccion1)) {
			case 5:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 1:
				if (resultados[4][0] == 4) {
					int x = 0;
					equipo5p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 2:
				if (resultados[4][1] == 4) {
					int x = 1;
					equipo5p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 3:
				if (resultados[4][2] == 4) {
					int x = 2;
					equipo5p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 4:
				if (resultados[4][3] == 4) {
					int x = 3;
					equipo5p( x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 6:
				if (resultados[4][5] == 4) {
					int x = 5;
					equipo5p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		case 6:
			eleccion1 = JOptionPane.showInputDialog("Seleccione el otro equipo que va a jugar, siendo:\n"
					+"1.Para equipo 1\n"
					+"2.Para equipo 2\n"
					+"3.Para equipo 3\n"
					+"4.Para equipo 4\n"
					+"5.Para equipo 5\n"
					+"6.Para equipo 6\n");

			switch (Integer.parseInt(eleccion1)) {
			case 6:
				System.out.println("No puede escoger el mismo equipo dos veces");
				break;
			case 1:
				if (resultados[5][0] == 4) {
					int x = 0;
					equipo6p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 2:
				if (resultados[5][1] == 4) {
					int x = 1;
					equipo6p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			case 3:
				if (resultados[5][2] == 4) {
					int x = 2;
					equipo6p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 4:
				if (resultados[5][3] == 4) {
					int x = 3;
					equipo6p( x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}
				break;
			case 5:
				if (resultados[5][4] == 4) {
					int x = 4;
					equipo6p(x,resultados,partidosest,equipost);
					ronda++;
				}
				else {
					System.out.println("Estos equipos ya se enfrentaron, escoja otro equipo");
				}	
				break;
			}
			break;
		}
		if (ronda == 30) {
		resultados(equipos);
		}
	}


	public static void equipo1p(int x, int resultados[][], int [][] partidosest,String equipost []) {
		int min = 1;
		int max = 3;
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		int valorAleatorio;
		String texto ="";

		valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
		switch (valorAleatorio) {
		case 1:
			resultados [0][x] = 0;
			resultados [x][0] = 3;
			break;
		case 2:
			resultados [0][x] = 1;
			resultados [x][0] = 1;
			break;
		case 3:
			resultados [0][x] = 3;
			resultados [x][0] = 0;
			break;
		}
		if (resultados [0][x] == 0) {
			texto = "Ganó";
			partidosest[0][6]+=3;
			partidosest[0][1]+=1;
			partidosest[0][0]+=1;
			
			partidosest[x][6]+=0;
			partidosest[x][3]+=1;
			partidosest[x][0]+=1;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[0][4]+= Goles;
			partidosest[x][6]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[0][5]+= Goles;
			}while(partidosest[0][4]<=partidosest[x][4]);
		}
		if (resultados [0][x] == 1) {
			texto = "Empató";
			partidosest[0][2]+=1;
			partidosest[0][0]+=1;
			partidosest[0][6]+=1;
			
			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[x][4]+=Goles;
			partidosest[0][5]+= Goles;
			partidosest[x][5]+= Goles;
			partidosest[0][4]+= Goles;
		}
		if (resultados [0][x] == 3) {
			texto = "Perdió";
			partidosest[0][3]+=1;
			partidosest[0][0]+=1;
			partidosest[0][6]+=0;
			
			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=3;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[0][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[0][5]+= Goles;
			}while(partidosest[0][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [0] + " " + texto + " contra " + equipost [x]);
	}
	public static void equipo2p(int x, int resultados[][],int [][] partidosest,String equipost []) {
		int min = 1;
		int max = 3;
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		int valorAleatorio;
		String texto ="";

		valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
		switch (valorAleatorio) {
		case 1:
			resultados [0][x] = 0;
			resultados [x][0] = 3;
			break;
		case 2:
			resultados [0][x] = 1;
			resultados [x][0] = 1;
			break;
		case 3:
			resultados [0][x] = 3;
			resultados [x][0] = 0;
			break;
		}
		if (resultados [0][x] == 0) {
			texto = "Ganó";
			partidosest[1][1]+=1;
			partidosest[1][0]+=1;
			partidosest[1][6]+=3;
			
			partidosest[x][3]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=0;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[1][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[1][5]+= Goles;
			}while(partidosest[1][4]<=partidosest[x][4]);
		}
		if (resultados [0][x] == 1) {
			texto = "Empató";
			partidosest[1][2]+=1;
			partidosest[1][0]+=1;
			partidosest[1][6]+=1;
			
			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[x][4]+=Goles;
			partidosest[1][4]+= Goles;
			
			partidosest[1][5]+= Goles;
			partidosest[x][5]+= Goles;
		}
		if (resultados [0][x] == 3) {
			texto = "Perdió";
			partidosest[1][3]+=1;
			partidosest[1][0]+=1;
			partidosest[1][6]+=0;
			
			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=3;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[1][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[1][5]+= Goles;
			}while(partidosest[1][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [1] +" "+ texto + " contra " + equipost [x]);
	}
	public static void equipo3p(int x, int resultados[][],int [][] partidosest,String equipost []) {
		int min = 1;
		int max = 3;
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		int valorAleatorio;
		String texto ="";

		valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
		switch (valorAleatorio) {
		case 1:
			resultados [0][x] = 0;
			resultados [x][0] = 3;
			break;
		case 2:
			resultados [0][x] = 1;
			resultados [x][0] = 1;
			break;
		case 3:
			resultados [0][x] = 3;
			resultados [x][0] = 0;
			break;
		}
		if (resultados [0][x] == 0) {
			texto = "Ganó";
			partidosest[2][1]+=1;
			partidosest[2][0]+=1;
			partidosest[2][6]+=3;
			
			partidosest[x][3]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=0;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[2][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[2][5]+= Goles;
			}while(partidosest[2][4]<=partidosest[x][4]);
		}
		if (resultados [0][x] == 1) {
			texto = "Empató";
			partidosest[2][2]+=1;
			partidosest[2][0]+=1;
			partidosest[2][6]+=1;
			
			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[x][4]+=Goles;
			partidosest[2][4]+= Goles;
			
			partidosest[2][5]+= Goles;
			partidosest[x][5]+= Goles;
		}
		if (resultados [0][x] == 3) {
			texto = "Perdió";
			partidosest[2][3]+=1;
			partidosest[2][0]+=1;
			partidosest[2][6]+=0;
			
			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=3;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[2][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[2][5]+= Goles;
			}while(partidosest[2][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [2] +" "+ texto + " contra " + equipost [x]);
	}
	public static void equipo4p(int x, int resultados[][],int [][] partidosest,String equipost []) {
		int min = 1;
		int max = 3;
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		int valorAleatorio;
		String texto ="";

		valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
		switch (valorAleatorio) {
		case 1:
			resultados [0][x] = 0;
			resultados [x][0] = 3;
			break;
		case 2:
			resultados [0][x] = 1;
			resultados [x][0] = 1;
			break;
		case 3:
			resultados [0][x] = 3;
			resultados [x][0] = 0;
			break;
		}
		if (resultados [0][x] == 0) {
			texto = "Ganó";
			partidosest[3][1]+=1;
			partidosest[3][0]+=1;
			partidosest[3][6]+=3;
			
			partidosest[x][3]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=0;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[3][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[3][5]+= Goles;
			}while(partidosest[3][4]<=partidosest[x][4]);
		}
		if (resultados [0][x] == 1) {
			texto = "Empató";
			partidosest[3][2]+=1;
			partidosest[3][0]+=1;
			partidosest[3][6]+=1;
			
			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[x][4]+=Goles;
			partidosest[3][4]+= Goles;
			
			partidosest[x][5]+= Goles;
			partidosest[3][5]+= Goles;
		}
		if (resultados [0][x] == 3) {
			texto = "Perdió";
			partidosest[3][3]+=1;
			partidosest[3][0]+=1;
			partidosest[3][6]+=0;
			
			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=3;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[3][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[3][5]+= Goles;
			}while(partidosest[3][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [3] +" "+ texto + " contra " + equipost [x]);
	}
	public static void equipo5p(int x, int resultados[][],int [][] partidosest,String equipost []) {
		int min = 1;
		int max = 3;
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		int valorAleatorio;
		String texto ="";

		valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
		switch (valorAleatorio) {
		case 1:
			resultados [0][x] = 0;
			resultados [x][0] = 3;
			break;
		case 2:
			resultados [0][x] = 1;
			resultados [x][0] = 1;
			break;
		case 3:
			resultados [0][x] = 3;
			resultados [x][0] = 0;
			break;
		}
		if (resultados [0][x] == 0) {
			texto = "Ganó";
			partidosest[4][1]+=1;
			partidosest[4][0]+=1;
			partidosest[4][6]+=3;
			
			partidosest[x][3]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=0;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[4][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[4][5]+= Goles;
			}while(partidosest[4][4]<=partidosest[x][4]);
		}
		if (resultados [0][x] == 1) {
			texto = "Empató";
			partidosest[4][2]+=1;
			partidosest[4][0]+=1;
			partidosest[4][6]+=1;
			
			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[x][4]+=Goles;
			partidosest[4][4]+= Goles;
			
			partidosest[x][5]+= Goles;
			partidosest[4][5]+= Goles;
		}
		if (resultados [0][x] == 3) {
			texto = "Perdió";
			partidosest[4][3]+=1;
			partidosest[4][0]+=1;
			partidosest[4][6]+=0;
			
			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=3;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[4][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[4][5]+= Goles;
			}while(partidosest[4][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [4] +" "+ texto + " contra " + equipost [x]);
	}
	public static void equipo6p(int x, int resultados[][],int [][] partidosest,String equipost []) {
		int min = 1;
		int max = 3;
		int min1 = 1;
		int max1 = 5;
		int Goles = 0;
		int valorAleatorio;
		String texto ="";

		valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
		switch (valorAleatorio) {
		case 1:
			resultados [0][x] = 0;
			resultados [x][0] = 3;
			break;
		case 2:
			resultados [0][x] = 1;
			resultados [x][0] = 1;
			break;
		case 3:
			resultados [0][x] = 3;
			resultados [x][0] = 0;
			break;
		}
		if (resultados [0][x] == 0) {
			texto = "Ganó";
			partidosest[5][1]+=1;
			partidosest[5][0]+=1;
			partidosest[5][6]+=3;
			
			partidosest[x][3]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=0;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[5][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[5][5]+= Goles;
			}while(partidosest[5][4]<=partidosest[x][4]);
		}
		if (resultados [0][x] == 1) {
			texto = "Empató";
			partidosest[5][2]+=1;
			partidosest[5][0]+=1;
			partidosest[5][6]+=1;
			
			partidosest[x][2]+=1;
			partidosest[x][0]+=1;
			partidosest[x][6]+=1;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[x][4]+=Goles;
			partidosest[5][4]+= Goles;
			
			partidosest[x][5]+= Goles;
			partidosest[5][5]+= Goles;
		}
		if (resultados [0][x] == 3) {
			texto = "Perdió";
			partidosest[5][3]+=1;
			partidosest[5][0]+=1;
			partidosest[5][6]+=0;
			
			partidosest[x][1]+=1;
			partidosest[x][0]+=1;
			partidosest[5][6]+=3;
			
			Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
			partidosest[5][4]+= Goles;
			partidosest[x][5]+= Goles;
			do {
				Goles = (int) Math.floor(Math.random() * (max1 - min1 + 1) ) + min;
				partidosest[x][4]+=Goles;
				partidosest[5][5]+= Goles;
			}while(partidosest[5][4]>=partidosest[x][4]);
		}
		System.out.println(equipost [5] +" "+ texto + " contra " + equipost [5]);
	}

	public static void Resultadospartidos(int [][] partidosest,String [] textopart,String equipos [],String equipost []){
		String menu="Seleccione que equipo quiere ver \n"
				+ "1. " + equipost [0] + "\n"
				+ "2. " + equipost [1] + "\n"
				+ "3. " + equipost [2] + "\n"
				+ "4. " + equipost [3] + "\n"
				+ "5. " + equipost [4] + "\n"
				+ "6. " + equipost [5] + "\n"
				+ "7. Estadísticas de todos los equipos";
		int opcion;
			
		switch (opcion = Integer.parseInt(JOptionPane.showInputDialog(menu))){
		case 1:
			estadisticase1(partidosest,equipost);
			break;
		case 2:
			estadisticase2(partidosest,equipost);
			break;
		case 3:
			estadisticase3(partidosest,equipost);
			break;
		case 4:
			estadisticase4(partidosest,equipost);
			break;
		case 5:
			estadisticase5(partidosest,equipost);
			break;
		case 6:
			estadisticase6(partidosest,equipost);
			break;
		case 7:
			estadisticase7(partidosest,textopart,equipos);
			break;
		}
	}

	public static void estadisticase1(int [][] partidosest,String equipost []) {
		System.out.println("La cantidad de partidos jugados por "+ equipost [0] +" es: " + partidosest[0][0]);
		System.out.println("La cantidad de partidos ganados por "+ equipost [0] +" es: " + partidosest[0][1]);
		System.out.println("La cantidad de partidos perdidos por "+ equipost [0] +" es: " + partidosest[0][3]);
		System.out.println("La cantidad de partidos empatados por "+ equipost [0] +" es: "+ partidosest[0][2]);
	}
	public static void estadisticase2( int [][] partidosest,String equipost []) {
		System.out.println("La cantidad de partidos jugados por "+ equipost [1] +" es: " + partidosest[1][0]);
		System.out.println("La cantidad de partidos ganados por "+ equipost [1] +" es: " + partidosest[1][1]);
		System.out.println("La cantidad de partidos perdidos por "+ equipost [1] +" es: " + partidosest[1][3]);
		System.out.println("La cantidad de partidos empatados por "+ equipost [1] +" es: " + partidosest[1][2]);
	}
	public static void estadisticase3( int [][] partidosest,String equipost []) {
		System.out.println("La cantidad de partidos jugados por "+ equipost [2] +" es: " + partidosest[2][0]);
		System.out.println("La cantidad de partidos ganados por "+ equipost [2] +" es: " + partidosest[2][1]);
		System.out.println("La cantidad de partidos perdidos por "+ equipost [2] +" es: " + partidosest[2][3]);
		System.out.println("La cantidad de partidos empatados por "+ equipost [2] +" es: " + partidosest[2][2]);
	}
	public static void estadisticase4( int [][] partidosest,String equipost []) {
		System.out.println("La cantidad de partidos jugados por "+ equipost [3] +" es: " + partidosest[3][0]);
		System.out.println("La cantidad de partidos ganados por "+ equipost [3] +" es: " + partidosest[3][1]);
		System.out.println("La cantidad de partidos perdidos por "+ equipost [3] +" es: " + partidosest[3][3]);
		System.out.println("La cantidad de partidos empatados por "+ equipost [3] +" es: " + partidosest[3][2]);
	}
	public static void estadisticase5( int [][] partidosest,String equipost []) {
		System.out.println("La cantidad de partidos jugados por "+ equipost [4] +" es: " + partidosest[4][0]);
		System.out.println("La cantidad de partidos ganados por "+ equipost [4] +" es: " + partidosest[4][1]);
		System.out.println("La cantidad de partidos perdidos por "+ equipost [4] +" es: " + partidosest[4][3]);
		System.out.println("La cantidad de partidos empatados por "+ equipost [4] +" es: " + partidosest[4][2]);
	}
	public static void estadisticase6( int [][] partidosest,String equipost []) {
		System.out.println("La cantidad de partidos jugados por "+ equipost [5] +" es: " + partidosest[5][0]);
		System.out.println("La cantidad de partidos ganados por "+ equipost [5] +" es: " + partidosest[5][1]);
		System.out.println("La cantidad de partidos perdidos por "+ equipost [5] +" es: " + partidosest[5][3]);
		System.out.println("La cantidad de partidos empatados por"+ equipost [5] +" es: "+ partidosest[5][2]);
	}
	public static void estadisticase7( int [][] partidosest, String [] textopart,String equipos []) {

		String[] orden = new String [1];
		int [] ayuda = new int[1];
		
		for(int a = 0;a<partidosest.length;a++) {
			for(int x = 0; x<partidosest.length-1;x++) {
				
				if (partidosest[x][6]<partidosest[x+1][6]) {
					orden [0]=equipos[x];
					equipos[x]=equipos[x+1];
					equipos[x+1] = orden [0];
				}
				
				for (int y = 0;y<partidosest[x].length;y++) {
					if (partidosest[x][6]<partidosest[x+1][6]) {
						ayuda [0]=partidosest[x][y];
						partidosest[x][y]=partidosest[x+1][y];
						partidosest[x+1][y]=ayuda [0];
					}
				}
			}
		}
		
		System.out.println(textopart[0]);
		for (int i = 0; i<partidosest.length;i++) {
			System.out.print(equipos [i]+"\t");
			for (int j = 0; j<partidosest[i].length;j++) {
			System.out.print(partidosest[i][j]+"\t\t\t");	
			}
			System.out.println();
		}
	}
	public static void resultados (String [] equipos) {
		System.out.println("El equipo ganador es el equipo: " + equipos [0]);
	}
}