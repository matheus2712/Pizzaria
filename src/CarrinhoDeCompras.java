
public class CarrinhoDeCompras {	
	
	 int pizza;	 
	 int total;	
	
	
	public void addpizza(Pizza p){
		
		
		if(p.aux.isEmpty()){
		      System.out.println("Pizza sem Ingredientes");
		    }
		
		
		pizza++;		
		System.out.println("\n Valor da Pizza: "+pizza+" R$"+p.getPreco());
		System.out.println(p.qtdeingrediente+" ingredientes na Pizza N:"+pizza);
		
		total += p.getPreco();
		    
		System.out.println("Valor Total = "+total);
			
	
	}
}
 
	
	

