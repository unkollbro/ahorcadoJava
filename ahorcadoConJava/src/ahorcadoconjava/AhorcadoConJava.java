/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadoconjava;

import java.util.Scanner;

/**
 *
 * @author Catalin 'uNKoLL' Ciurcanu
 */
public class AhorcadoConJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vidas = 5, aciertos = 0, longitud, contador = 0;
        String palabra , opcion;
        palabra = "caspe";
        char[] respuesta;
        longitud = palabra.length();
        respuesta = new char[longitud];

        for (int i = 0; i <=longitud-1; i++) {
            respuesta[i] = 'X';
        }

        while (aciertos != longitud && vidas != 0) {
            System.out.println("Tienes "+vidas+ " Intentos");
            pintarMuñeco(vidas);
            System.out.println("");
            for (int i = 0; i <=longitud-1; i++) {
 
                System.out.print(respuesta[i]+"__");
            }
            System.out.println("");
            System.out.println("Dime la letra : ");
            opcion = s.next();
            if (palabra.contains(opcion)) {
                for (int i = 0; i <=longitud-1; i++) {
                    if (palabra.charAt(i) == opcion.charAt(0)) {
                        respuesta[i] = opcion.charAt(0);
                        contador++;
                    }
                }
 
                aciertos = aciertos + contador;
            } 
            else {
                vidas--;
            }
 
            contador = 0;
        }
        
        if(vidas==0){
            pintarMuñeco(vidas);
        }
        else{
            System.out.println("");
            System.out.print("Puto amo.. la palabra es... '");
            for (int i = 0; i <=longitud-1; i++) {
 
                System.out.print(respuesta[i]);
            }
            System.out.print("'");
            System.out.println("");
        }
    }
    
    public static void pintarMuñeco(int vidas){
        switch (vidas){
            case 4:
                // Primer Intento
                System.out.println(" ---------------------");
                for (int j = 0; j < 15; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
            case 3:
                // Segundo Intento
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|___________________________________");
                break;
            case 2:
                // Cuarto Intento
                System.out.println("|----------------|                  ");
                System.out.println("|                |                  ");
                System.out.println("|           _____|_____             ");
                System.out.println("|          |  O     O  |            ");
                System.out.println("|          |     |     |            ");
                System.out.println("|          |   (___)   |            ");
                System.out.println("|           -----------             ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|                                   ");
                System.out.println("|___________________________________");
                break;
            case 1:
                // Quinto Intento
                System.out.println("|----------------|                  ");
                System.out.println("|                |                  ");
                System.out.println("|            ____|_____             ");
                System.out.println("|          |  x     O  |            ");
                System.out.println("|          |     |     |            ");
                System.out.println("|          |   (___)   |            ");
                System.out.println("|           -----------             ");
                System.out.println("|                |                  ");
                System.out.println("|                |                  ");
                System.out.println("|                |\\                ");
                System.out.println("|                | \\               ");
                System.out.println("|                |  \\              ");
                System.out.println("|                |   \\             ");
                System.out.println("|                 \\                ");
                System.out.println("|                  \\               ");
                System.out.println("|                   \\              ");
                System.out.println("|                    \\             ");
                System.out.println("|___________________________________");
                break;
            case 0:
                // HAS PALMADO
                System.out.println("|----------------|                  ");
                System.out.println("|                |                  ");
                System.out.println("|           _____|_____             ");
                System.out.println("|          |  x     X  |            ");
                System.out.println("|          |    /_     |            ");
                System.out.println("|          |   -----   |            ");
                System.out.println("|           -----------             ");
                System.out.println("|                |                  ");
                System.out.println("|                |                  ");
                System.out.println("|               /|\\                ");
                System.out.println("|              / | \\               ");
                System.out.println("|             /  |  \\              ");
                System.out.println("|            /   |   \\             ");
                System.out.println("|               / \\                ");
                System.out.println("|              /   \\               ");
                System.out.println("|             /     \\              ");
                System.out.println("|            /       \\             ");
                System.out.println("|___________________________________");
		System.out.println("|___________________________________");
		System.out.println("|___________________________________");
		System.out.println("|____________HAS - PERDIDO__________");
                break;
            default:
        }
    }
    
}
