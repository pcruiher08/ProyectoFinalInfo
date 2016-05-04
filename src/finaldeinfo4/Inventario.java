package finaldeinfo4;


import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Pablo
 */
public class Inventario {
       //  public static List<List<String>> listOfList;
  public List<List<String>> contents = new ArrayList<>();
 
   // public ArrayList<String> contents = new ArrayList<>();
	//public ArrayList<String> contents = new ArrayList<String>();
    
	
	public Inventario() {
            
	}
	

	public void addElemento(String item, int n) {
              contents.add(new ArrayList<>());
              contents.get(contents.size()-1).add(item);
        }
              
              
	
	
	public List<String> getUltimoElemento() {
		if ( contents.size() > 0 ) {
			return contents.get(contents.size()-1);
		} else {
			return null;
		}
        }
	
	
	public List<String> getPrimerElemento() {
		if ( contents.size() > 0 ) {
			return contents.get(0);
		} else {
			return null;
		}
	}
	
	
	 public int numeroDeArticulos() {
		return contents.size();
	}
         
         public int numeroDeArticulosEspecificos(String t){
             
         return contents.get(contents.indexOf(t)).size();
         }
	
	
	 public void tiraContenido() {
		System.out.println("\nretirando los elementos del inventario:");
		for(List<String> item : contents) {
			System.out.println(item);
		}
		contents.clear();
		System.out.println("El inventario está vacio!\n");
	}
          public void muestraContenido() {
		System.out.println("\nestos son los elementos:");
		for(List<String> item : contents) {
			System.out.println(item);
		}
		
          }
          
          
          
          public String contenidos(){
              String x = "";
              for(List<String> item : contents)
                  x += item;
          return(x);
          }
}

