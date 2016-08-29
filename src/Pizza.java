import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.QName;

public class Pizza {

	
	static int qtdeingrediente;
	 static int qtdeing;
	
	static Map<String, Integer> contagem = new HashMap<String, Integer>();
		
	static List<String> aux = new ArrayList<String>();
		
	
	
public static void zerarIngredientes(){
		
		contagem.clear();
		aux.clear();
		qtdeingrediente = 0;
		}
	
	
	public void addIng(String c){
				
		aux.add(c);
		qtdeingrediente++;
			
	}
	
	
	
	



	public int getPreco(){		
		
		if(qtdeingrediente > 0 && qtdeingrediente <= 2){
			return 15;
		} else
			 if(qtdeingrediente > 2 && qtdeingrediente <= 5){
			return 20;
		}else{
			return 23;
		}		
	}
	
	
	
	
	public static void contabilizaIng() {
		
		for (String valor : aux) {
		   if (!contagem.containsKey(valor)) {
		       contagem.put(valor, 0);
		   }
		   contagem.put(valor, contagem.get(valor)+1);
		   //Integer value = contagem.get(valor);
		   
		   }
		
     for (String key : contagem.keySet()) {        
	        
	        Integer value = contagem.get(key);
	        System.out.println("Ingrediente: " + key+" - Quantidade: "+value);
		}
		
	}
	
	
	
	
	
	
	
}
