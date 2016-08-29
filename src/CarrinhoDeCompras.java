import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {	
	
	 int pizza;	 
	 int total;
	 static Map<Pizza, Integer> pizzaCarrinho = new HashMap<Pizza, Integer>();
	
	
	public void addpizza(Pizza p){
		 int cnt = 0;
		pizzaCarrinho.put(p, cnt+1);
		
		
		
		if(p.qtdeingrediente == 0){
			
		      System.out.println("Pizza sem Ingredientes");
		      
		    }else{		
		
		pizza++;		
		System.out.println("\nValor da Pizza: "+pizza+" R$"+p.getPreco());
		System.out.println(p.qtdeingrediente+" ingrediente(s) na Pizza N:"+pizza);
		
		total += p.getPreco();
		    
		System.out.println("Valor Total = "+total);
		p.qtdeingrediente = 0;
		
		    }
	
	}
	
}
 
	
	

