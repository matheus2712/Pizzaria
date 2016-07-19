import java.util.HashMap;
		  import java.util.Map;
		  
		  
public class Principal {

	public static void main(String[] args) {
		
						
						
						
						
						Map<String,Integer> ingrediente = new HashMap<String, Integer>();
						
						
						Pizza p1 = new Pizza();
		               
		                /*
		                * Vamos adicionar alguns valores a nossa lista
		                * */
		               ingrediente.put( "Mussarela", new Integer(1));
		               ingrediente.put( "Mussarela", new Integer(1));
		               p1.adicionaingrediente(ingrediente);
		               Pizza p2 = new Pizza();
		               ingrediente.put( "Mussarela", new Integer(1));
		               ingrediente.put( "Calabresa", new Integer (1));
		               ingrediente.put( "Frango", new Integer (1));
		               p2.adicionaingrediente(ingrediente);
		               System.out.println();
		               
		               System.out.println(ingrediente); 
		               
		               /*
		                * 
		                *String keyToSearch = "K1";        
		               
		               
		               if ( example.containsKey( keyToSearch ) ) {
		                System.out.println("Valor da Chave "+keyToSearch+
		                 " = "+example.get(keyToSearch));             
		               }else{
		                      System.err.println("Chave não existe");
		                      }
		              */
		               	 
		 
	}

}
