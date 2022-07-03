
public class Libro {

	String titulo;
	String autor;
	String editorial;
	int numPaginas;
	boolean prestado;
	
	public String getTitulo() {
		return titulo; 
	}
	public void setTitulo(String valorTitulo) {
		 titulo = valorTitulo; 
	}
	
	public String getAutor() {
		return autor; 
	}
	public void setAutor(String valorAutor) {
		 autor = valorAutor; 
	}

	public String getEditorial() {
		return editorial; 
	}
	public void setEditorial(String valorEditorial) {
		 editorial = valorEditorial; 
	}

	public int getnumPaginas() {
		return numPaginas; 
	}
	public void setNumPaginas(int valorNumPaginas) {
		 numPaginas = valorNumPaginas; 
	}

	public boolean getPrestado() {
		return prestado; 
	}
	public void setPrestado(boolean valorPrestado) {
		 prestado = valorPrestado;
	}
public Libro () {
	this.titulo = "";
	this.autor = "";
	this.editorial = "";
	this.numPaginas = 0;
	this.prestado = false;
	
}
public Libro (String valortitulo, String valorautor, String valoreditorial, int valornumpaginas, boolean valorprestado) {
	this.titulo = valortitulo;
	this.autor = valorautor;
	this.editorial = valoreditorial;
	this.numPaginas = valornumpaginas;
	this.prestado = valorprestado;
	
}	

}

