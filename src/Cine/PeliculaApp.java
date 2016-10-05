package Cine;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PeliculaApp {
    private static ArrayList<Pelicula> array_Pelicula;
    private static void mostrarMenu() {
        System.out.println("**** PELICULA ****");
        System.out.println("1. Nueva Pelicula");
        System.out.println("2. Consultar Datos de una Pelicula");
        System.out.println("3. Listado de Peliculas de un G�nero");
        System.out.println("4. Pelicula Favorita");
        System.out.println("5. Totales");
        System.out.println("6. Salir");
    }
	   public static void main(String[] args) {
	        // Inicializamos la lista de discos 
	        array_Pelicula = new ArrayList<>();
	        int opcion;
	        do {
	            mostrarMenu();
	            opcion = pedirEntero("Escoge una opci�n:");
	            switch (opcion) {
	                case 1:
	                    nuevaPelicula();
	                    break;
	                case 2:
	                    mostrarDatos();
	                    break;
	                case 3:
	                    mostrarGenero();
	                    break;
	                case 4:
	                    mostrarFavorita();
	                    break;
	                case 5:
	                    break;
	                case 6: 
	                	System.out.println("Hasta la pr�xima!");
	                    break;
	                default:
	                    System.out.println("Opci�n incorrecta.");
	            }
	        } while (opcion != 6);
	    }
	    private static void mostrarGenero() {
	    	int existe = 0;
	    	String genero_pedido = pedirCadena("Dime el genero de la pelicula");
	    	for (Pelicula p : array_Pelicula) {
	    		if(p.getGenero().equalsIgnoreCase(genero_pedido)){	    			
	    			System.out.println(p);
	    			existe = 1;
	    		}            
	        }
	    	if(existe == 1){
	    		System.out.println("No existe ninguna pelicula del genero indicado");
	    	}
	    	
	    }
	    private static void mostrarDatos() {
	    	int existe = 0;
	    	int codigo_pedido = pedirEntero("Dime el codigo de la pelicula");
	    	for (Pelicula p : array_Pelicula) {
	    		if(p.getCodigo() == codigo_pedido){	    			
	    			System.out.println(p);
	    			existe = 1;
	    		}            
	        }
	    	if(existe == 1){
	    		System.out.println("No dispones de ninguna pel�cula con ese c�digo");
	    	}

	    }
	    private static void mostrarFavorita() {
	    	int existe = 0;
	    	int max = 0;
	    	for (Pelicula p : array_Pelicula) {
           if(p.getValoracion() > max){
        	   max = p.getValoracion();
           }
	        }
	    	
	    }

	    private static void nuevaPelicula() {
	        // TODO control de errores 
	    	String visto_sino = "";
	    	int codigo = pedirEntero("Introduce el codigo de la pelicula");
	    	while(codigo == 0){
	    		codigo = pedirEntero("Introduce el codigo de la pelicula");
	    	}
	        String titulo = pedirCadena("Introduce el t�tulo de la pelicula");
	        while(titulo == ""){
	        	titulo = pedirCadena("Introduce el t�tulo de la pelicula");
	    	}
	        String director = pedirCadena("Introduce el director");
	        while(director == null){
	        	director = pedirCadena("Introduce el director");
	    	}
	        int duracion = pedirEntero("Introduce la duracion de la pelicula");
	        while(duracion == 0 && duracion<0){
	        	duracion = pedirEntero("Introduce la duracion de la pelicula");
	    	}
	        String genero = pedirCadena("Introduce el genero de la pelicula");
	        while(genero == null){
	        	genero = pedirCadena("Introduce el genero de la pelicula");
	    	}
	        int valoracion = pedirEntero("Introduce la valoracion de la pelicula");
	        while(valoracion<0 && valoracion >10){
	        valoracion = pedirEntero("Introduce la valoracion de la pelicula");
	        }
	    	boolean visto = false;	
	        String sino = pedirCadena("Has visto la pelicula?");
	        if (sino.equalsIgnoreCase("si")) {	     
	        	  visto = true;	
	        }
	        else if(sino.equalsIgnoreCase("no")){
	        	  visto = false;	
	        }
	        // Creamos el disco con los datos introducidos por el usuario
	        Pelicula p = new Pelicula(codigo,titulo,director,duracion,genero,valoracion,visto);
	        // A�adimos el disco a la lista de discos de la colecci�n
	        array_Pelicula.add(p);
	    }
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
