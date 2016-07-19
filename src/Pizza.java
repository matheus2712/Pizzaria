import java.util.HashMap;
import java.util.Map;

public class Pizza {

	//String ingredient;
	int qtdeingrediente;
	static int qtdetotal;
	Map<String,Integer> ingrediente = new HashMap<String, Integer>();
	//int valuni;
	
	
	
	
	
	
	




	






	public String adicionaingrediente(Map<String,Integer> ing){
		
		
		ingrediente = ing;
		qtdeingrediente = ing.size();
		contabilizaIng(qtdeingrediente);
		System.out.println(getPreco()+"preco");
		System.out.println();
		return "";
	}
	

	
	
	public int getPreco(){
		
		
		if(qtdeingrediente <= 2){
			return 15;
		} else
			 if(qtdeingrediente > 2 && qtdeingrediente <= 5){
			return 20;
		}else{
			return 23;
		}
		
				
	}
	
	
	
	
	public int contabilizaIng(int cont) {
		
		qtdetotal += cont;
		return qtdetotal;
		
	}




	
	
	
	
	
}
