import org.junit.Test;
import static org.junit.Assert.*;


public class TestPartition2 {


@Test
public void testAssertEquals() {
	Libro prueba1;
	prueba1 = new Libro("La celestina","Fernando de Rojas","Kukutuxuxu",852,false);
	Libro prueba2;
	prueba2 = new Libro();
	prueba2.setTitulo("La Mosca");
	assertEquals(prueba1.getTitulo(),prueba2.getTitulo());
}
@Test
public void testAsserttrue() {
	Libro prueba1;
	prueba1 = new Libro("La celestina","Fernando de Rojas","Kukutuxuxu",852,false);
	Libro prueba2;
	prueba2 = new Libro();
	prueba2.setTitulo("La Cosa");
	assertTrue(prueba1.getTitulo() == prueba2.getTitulo());
}
@Test
public void testAssertFalse() {
	Libro prueba1;
	prueba1 = new Libro("La celestina","Fernando de Rojas","Kukutuxuxu",852,false);
	Libro prueba2;
	prueba2 = new Libro();
	prueba2.setTitulo("La Cosa");
	assertFalse(prueba1.getTitulo() == prueba2.getTitulo());
}
@Test
public void testAssertNotNull() {
	Libro prueba1;
	prueba1 = new Libro("La celestina","Fernando de Rojas","Kukutuxuxu",852,false); 	
	prueba1.setTitulo(null);
	assertNotNull(prueba1.getTitulo()); 
}
@Test
public void testAssertNull() {
	Libro prueba1 = null;
	assertNull(prueba1); 
}
@Test
public void testAssertSame() {
	Libro prueba1;
	prueba1 = new Libro("La celestina","Fernando de Rojas","Kukutuxuxu",852,false);
	Libro prueba2;
	prueba2 = prueba1;
	assertSame(prueba1.getTitulo(),prueba2.getTitulo());
}
@Test
public void testAssertNotSame() {
	Libro prueba1;
	prueba1 = new Libro("La celestina","Fernando de Rojas","Kukutuxuxu",852,false);
	Libro prueba2;
	prueba2 = prueba1;
	assertNotSame(prueba1.getTitulo(),prueba2.getTitulo());
}
@Test
public void testAssertArrayEquals() {
	Libro arraylibros[] = new Libro[3];
	arraylibros[0] = new Libro("La celestina","Fernando de Rojas","Kukutuxuxu",852,false);
	arraylibros[1] = new Libro();
	Libro arraylibros2[];
	arraylibros2 = arraylibros;
	assertArrayEquals(arraylibros,arraylibros2);
}
}



