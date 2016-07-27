import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
		  
		  
public class Principal {

	public static void main(String[] args) {
		
				        Pizza p1 = new Pizza();
				        CarrinhoDeCompras c = new CarrinhoDeCompras();
				        
				        p1.addIng("Milho");
				        p1.addIng("Mussarela");
				        p1.addIng("Calabresa");
				        
				        c.addpizza(p1);
				        
				        Pizza p2 = new Pizza();
				        p2.addIng("Palmito");
				        p2.addIng("Mussarela");
				        c.addpizza(p2);
				        
				        Pizza p3 = new Pizza();
				        p3.addIng("Lombo");
				        c.addpizza(p3);
				        
				        p2.contabilizaIng();
				        
	}

}
