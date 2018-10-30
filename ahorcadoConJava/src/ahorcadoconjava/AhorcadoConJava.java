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
        Scanner leer = new Scanner(System.in);
        int vidas=5, longitud;
        boolean intentos;
        
        String palabraAdivinar="Adivinas";
        longitud = palabraAdivinar.length();
        
        char []letra;
        letra = new char[longitud];
        
        for (int i=0;i<longitud; i++){
            letra[i]='x';
        }
        
        for(int i=0;i<longitud;i++){
            System.out.println(palabraAdivinar.substring(i,i+1));
        }
        
        while(vidas<0){
            
        }
    }
    
    public static void PintaMuñeco(int fallos){
        switch (fallos){
            case 0:
                // Primer Intento
                System.out.println("|___________________________________");
                break;
            case 1:
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
                // Tercer Intento
                System.out.println("|----------------|                  ");
                System.out.println("|                |                  ");
                System.out.println("|                |                  ");
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
            case 3:
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
            case 4:
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
            case 5:
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
                break;
            default:
        }
    }
    
}
