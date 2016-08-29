import static org.junit.Assert.*;

import java.io.LineNumberInputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class testPizza {

	

	@Test
	public void pizzatest2() {
		Pizza pt = new Pizza();
		
		
		pt.addIng("mussarela");
		pt.addIng("queijo");
		pt.addIng("bacon");
		pt.addIng("queijo2");
		pt.addIng("tomate");
		
		assertEquals(Arrays.asList("mussarela","queijo","bacon","queijo2","tomate"), pt.aux);
		
		
	}
	
	@Test
	public void carrinhotest() {
		//adicionar Pizza sem ingredientes
		Pizza p = new Pizza();
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		
		c.addpizza(p);
		
	}

	
	@Test
	public void carrinhotest2() {
		
		//Valor da pizza de acordo com a quantidade de ingredientes
		
					
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		
		Pizza p = new Pizza();	
		p.zerarIngredientes();
		p.addIng("ing1");
		p.addIng("ing2");
		p.addIng("ing3");		
		assertEquals(20, p.getPreco());
		c.addpizza(p);
		
		
		Pizza p2 = new Pizza();
		p2.zerarIngredientes();
		p2.addIng("ing1");
		p2.addIng("ing2");		
		assertEquals(15, p2.getPreco());
		c.addpizza(p2);
		
		
		Pizza p3 = new Pizza();
		p3.zerarIngredientes();
		p3.addIng("ing1");
		p3.addIng("ing2");
		p3.addIng("ing3");
		p3.addIng("ing4");
		p3.addIng("ing5");
		p3.addIng("ing6");
		
		assertEquals(23, p3.getPreco());
		c.addpizza(p3);
		
		
		p3.zerarIngredientes();
	}
	
	@Test
	public void carrinhotest1() {
		
		//Somatoria das pizzas do carrinho
		Pizza p = new Pizza();
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		p.zerarIngredientes();
		
		p.addIng("a");
		c.addpizza(p);
		
		Pizza p2 = new Pizza();
		p2.addIng("s");
		c.addpizza(p2);
		
		assertEquals(30, c.total);
		Pizza.zerarIngredientes();
	}
	
	
	
}
