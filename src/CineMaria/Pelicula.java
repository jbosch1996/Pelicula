package CineMaria;

import Cine.*;


public class Pelicula {
	private int codigo = 0;
	private String titulo ="";
	private String director = "";
	private int duracion = 0;
	private String genero ="";
	private int valoracion = 0;
	private boolean visto;
	
	public Pelicula(int codigo, String titulo, String director, int duracion, String genero, int valoracion,boolean visto) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.genero = genero;
		this.valoracion = valoracion;
		this.visto = visto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getValoracion() {
		return valoracion;
	}
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	public boolean isVisto() {
		return visto;
	}
	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", titulo=" + titulo + ", director=" + director + ", duracion=" + duracion
				+ ", genero=" + genero + ", valoracion=" + valoracion + ", visto=" + visto + "]";
	}
}
