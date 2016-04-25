
package finaldeinfo4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pablo
 */
public class FinalDeInfo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        List<List<String>> listOfList = new ArrayList<>();
        listOfList.add(new ArrayList<>());
        listOfList.get(0).add("Tomatoes");
        listOfList.add(new ArrayList<>());
        listOfList.get(1).add("Lechugas");
        listOfList.get(1).add("1");
        listOfList.get(1).add("2");
        listOfList.get(1).remove(1);
        
        
//        ArrayList<String> Inventario = new ArrayList<String>();
//        Inventario.add("Cosa1");
//        Inventario.add("Cosa2");
//        Inventario.add("Cosa3");
//        Inventario.add("Cosa4");
//        Inventario.add("Cosa5");
//        Inventario.add("Cosa6");
//        Inventario.remove(Inventario.indexOf("Cosa2"));
//        for(int i=0; i<Inventario.size(); i++)
//        System.out.println(Inventario.get(i));
//        Inventario.add(ListaNueva(Class<T>klazz));        
    }
    public <T> List<T> ListaNueva(Class<T>klazz){
   List<T> lista = new ArrayList<>();
   return lista;
   }
    
//    public void agregaUnaLista(){
//    Inventario.add(ListaNueva()); //checar el error en esta linea
//    }
    
  
   
   
   /* Estructura de datos en C++
   
   [
           ["tomatos", a, b, c, d],
           ["peppers", a, b, c, d]
   ]

    */
   
   
    
}
