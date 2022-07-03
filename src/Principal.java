

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Libro primerLibro;
primerLibro = new Libro(); 
primerLibro.setAutor("Leopoldo Alas Clarin");
primerLibro.setTitulo("La regenta");
primerLibro.setEditorial("Catedra");
primerLibro.setNumPaginas(632);
primerLibro.setPrestado(false);

Libro segundoLibro;
segundoLibro = new Libro(); 
segundoLibro.setAutor("Juan Ramon Jimenez");
segundoLibro.setTitulo("Platero y yo");
segundoLibro.setEditorial("Alfaguara");
segundoLibro.setNumPaginas(555);
segundoLibro.setPrestado(false);


System.out.println(primerLibro.getAutor());

	}

}
