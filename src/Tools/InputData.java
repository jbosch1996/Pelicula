/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 53298857Z
 */
public class InputData {
    	    private static String pedirCadena(String mensaje) {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String cadena = "";
	        boolean error;
	        do {
	            try {
	                System.out.println(mensaje);
	                cadena = br.readLine();
	                error = false;
	            } catch (IOException ex) {
	                System.out.println("Error entrada salida");
	                error = true;
	            }
	        } while (error);
	        return cadena;
	    }
	    private static int pedirEntero(String mensaje) {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int numero = 0;
	        boolean error;
	        do {
	            try {
	                System.out.println(mensaje);
	                numero = Integer.parseInt(br.readLine());
	                error = false;
	            } catch (IOException ex) {
	                System.out.println("Error entrada salida");
	                error = true;
	            } catch (NumberFormatException ex) {
	                System.out.println("No has introducido un n� entero.");
	                error = true;
	            }
	        } while (error);    // es lo mismo que error == true
	        return numero;
	    }
	    private static double pedirDouble(String mensaje) {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        double numero = 0;
	        boolean error;
	        do {
	            try {
	                System.out.println(mensaje);
	                numero = Double.parseDouble(br.readLine());
	                error = false;
	            } catch (IOException ex) {
	                System.out.println("Error entrada salida");
	                error = true;
	            } catch (NumberFormatException ex) {
	                System.out.println("No has introducido un n�mero.");
	                error = true;
	            }
	        } while (error);
	        return numero;
	    }
    
}
