import static org.junit.Assert.*;

import java.io.LineNumberInputStream;

import org.junit.Test;

public class testPizza {

	@Test
	public void pizzatest() {
		Pizza p = new Pizza();
		
		p.addIng("milho");
		p.addIng("mussare");
		p.addIng("queijo");
		p.addIng("aaa");
		p.addIng("queijo2");
		p.addIng("aaa3");
		
		assertEquals(23, p.getPreco());
	}

	@Test
	public void pizzatest2() {
		Pizza p = new Pizza();
		
		assertEquals("milho", p.aux);
		
		
	}
	
	
	
	
}
