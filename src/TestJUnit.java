import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class TestJUnit {

@BeforeClass
	 public static void BeforeClass(){
	  System.out.println("Antes de ejecutarse cualquier Test.");
	 }
	 
	 @AfterClass
	 public static void AfterClass(){
	  System.out.println("Despues de ejecutarse todos los Test.");
	 }
	
@Before
	 public void Before(){
	  System.out.println("Antes de cada metodo test.");
 } 
@After
	 public void After(){
	  System.out.println("Despues cada metodo test");
	 }	
@Ignore("No utilizado")
@Test
public void testAssertEquals() {
	Libro prueba1;
	prueba1 = new Libro("La celestina","Fernando de Rojas","Kukutuxuxu",852,false);
	Libro prueba2;
	prueba2 = new Libro();
	assertEquals(prueba1,prueba2);
	
}

@Test
public void testAsserttrue() {
	Libro prueba1;
	prueba1 = new Libro("La celestina","Fernando de Rojas","Kukutuxuxu",852,false);
	Libro prueba2;
	prueba2 = new Libro();
	assertTrue(prueba1.getnumPaginas() < prueba2.getnumPaginas());
	
}

@Test
public void testAssertFalse() {
	Libro prueba1;
	prueba1 = new Libro("La celestina","Fernando de Rojas","Kukutuxuxu",852,false);
	Libro prueba2;
	prueba2 = new Libro();
	assertFalse(prueba1.getnumPaginas() > prueba2.getnumPaginas());
}
@Test
public void testAssertNotNull() {
	Libro prueba1;
	prueba1 = new Libro("La celestina","Fernando de Rojas","Kukutuxuxu",852,false); 	
	assertNotNull(prueba1); 

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
	assertSame(prueba1,prueba2);
}

@Test
public void testAssertNotSame() {
	Libro prueba1;
	prueba1 = new Libro("La celestina","Fernando de Rojas","Kukutuxuxu",852,false);
	Libro prueba2;
	prueba2 = prueba1;
	assertNotSame(prueba1,prueba2);
	
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