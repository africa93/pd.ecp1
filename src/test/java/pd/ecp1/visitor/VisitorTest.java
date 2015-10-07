package pd.ecp1.visitor;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;


public class VisitorTest {
	private Collection<Figure> coleccion = new ArrayList<Figure>();
	
	@Before
    public void ini() {
        coleccion.add(new Square("Square",2));
        coleccion.add(new Triangle("Triangle",2,3));
        coleccion.add(new Circle("Circle",1));
        coleccion.add(new Square("Square", 1));
    }
	@Test
	public void testVisitArea() {
		VisitArea vArea = new VisitArea();
		for(Figure figura : coleccion){
			figura.accept(vArea);		
		}
		assertTrue(vArea.getArea()==14.14);
	}
	
	@Test
	public void testVisitNumberOfSides(){
		VisitNumberOfSides vSides = new VisitNumberOfSides();
		for(Figure figura : coleccion){
			figura.accept(vSides);		
		}
		assertTrue(vSides.getNum_sides()==Double.POSITIVE_INFINITY);
	}

}
