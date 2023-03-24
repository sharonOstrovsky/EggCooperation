
package mascotapp2;

import Entidad.Mascota2;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class MascotAPP2 {


    public static void main(String[] args) {
        
        
        HashMap<String, Mascota2> mascotas = new HashMap();
        
        mascotas.put("1", new Mascota2("Fer", "Chiquito","Perro"));
        mascotas.put("2", new Mascota2("Pepa", "Lola","Gato"));
        
       // mascotas.remove("1",new Mascota2("Fer", "Chiquito","Perro") );
        mascotas.remove("1");
        for (Map.Entry<String, Mascota2> aux : mascotas.entrySet()) {
            String key = aux.getKey();
            Mascota2 value = aux.getValue();
            
            System.out.println("key "+ key + " value "+ value);
            
        }
        
        
//        HashMap<Integer, String> nombres = new HashMap();
//        
//        nombres.put(1, "Chiquito");
//        nombres.put(123, "Lola");
//        
//        for (Map.Entry<Integer, String> aux : nombres.entrySet()) {
//            Integer key = aux.getKey();
//            String value = aux.getValue();
//            
//            System.out.println("key "+ key + " value "+ value);
//            
//        }
        
        
        
 //       ___________________________________________________________-
        
//        TreeSet<Mascota2> mascotas = new TreeSet();
//        
//        mascotas.add(new Mascota2("Fer", "Chiquito", "Perro"));
//        mascotas.add(new Mascota2("Fer", "Chiquito", "Perro"));
//        mascotas.add(new Mascota2("Fer", "Chiquito", "Perro"));
//        mascotas.add(new Mascota2("Fer", "Chiquito", "Perro"));
//        mascotas.add(new Mascota2("Fer", "Chiquito", "Perro"));
//        mascotas.add(new Mascota2("Fer", "Chiquito", "Perro"));
//        mascotas.add(new Mascota2("Pepa", "Lola", "Gato"));
//        mascotas.add(new Mascota2("Pepa", "Lola", "Gato"));
//        mascotas.add(new Mascota2("Pepa", "Lola", "Gato"));
//        mascotas.add(new Mascota2("Pepa", "Lola", "Gato"));
//        mascotas.add(new Mascota2("Pepa", "Lola", "Gato"));
//        mascotas.add(new Mascota2("Pepa", "Lola", "Gato"));
//        mascotas.add(new Mascota2("Pepa", "Lola", "Gato"));
//        mascotas.add(new Mascota2("zzzz", "zzzz", "Perro"));
//
//        
//        for (Mascota2 mascota2 : mascotas) {
//            System.out.println(mascotas);
//        }
//        
        //hasset y treeset no soportan elementos duplicados
//        HashSet<String> nombres = new HashSet();
//        TreeSet<String> nombres = new TreeSet();
//        
//        nombres.add("Chiquito");
//        nombres.add("Chiquito");
//        nombres.add("Chiquito");
//        
//        for (String nombre : nombres) {
//            System.out.println(nombre);
//        }
        
        
        
        
//        //ArrayList<ArrayList<String>> matriz = new ArrayList();
//        //columnas<filas>
//        
//        ArrayList<Mascota2> mascotas = new ArrayList();
//        
//        mascotas.add(new Mascota2("Fer", "Chiquito", "Perro"));
//        mascotas.add(new Mascota2("Fer", "Chiquito", "Perro"));
//        mascotas.add(new Mascota2("Fer", "Chiquito", "Perro"));
//        mascotas.add(new Mascota2("Fer", "Chiquito", "Perro"));
//        mascotas.add(new Mascota2("Fer", "Chiquito", "Perro"));
//        mascotas.add(new Mascota2("Fer", "Chiquito", "Perro"));
//        mascotas.add(new Mascota2("Pepa", "Lola", "Gato"));
//        mascotas.add(new Mascota2("Pepa", "Lola", "Gato"));
//        mascotas.add(new Mascota2("Pepa", "Lola", "Gato"));
//        mascotas.add(new Mascota2("Pepa", "Lola", "Gato"));
//        mascotas.add(new Mascota2("Pepa", "Lola", "Gato"));
//        mascotas.add(new Mascota2("Pepa", "Lola", "Gato"));
//        mascotas.add(new Mascota2("Pepa", "Lola", "Gato"));
//        
//        //ordenar por nombre
//        Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
//        //shuffle-> desordena 
//        Collections.shuffle(mascotas);
//        
//        for (Mascota2 mascota : mascotas) {
//            System.out.println(mascota);
//            
//        }
    }
    
}
