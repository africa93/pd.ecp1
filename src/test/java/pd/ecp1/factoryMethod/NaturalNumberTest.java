package pd.ecp1.factoryMethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class NaturalNumberTest {

	@Test
	public void test() {
	    NaturalNumberManager nnm = new NaturalNumberManager();
	    System.out.println(nnm.getNaturalNumber().getTextValue());
	    nnm.setCreator(new NaturalNumberFrCreator());
	    System.out.println(nnm.getNaturalNumber().getTextValue());
		
	}

}
