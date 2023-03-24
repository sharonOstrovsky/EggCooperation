package mascotapp;

//import java.util.ArrayList;

import mascotapp.servicios.ServicioMascota;

//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.List;
//import mascotapp.entidades.Mascota;


public class MascotAPP {

   
    //public static void main(String[] args) {
        

    //    Scanner leer = new Scanner(System.in);
        
    //    Mascota m2 = new Mascota();
       // Mascota m1 = new Mascota("Fernando Chiquiro", leer.next(), "Perro");
      //  Mascota m1 = new Mascota("Fernando Chiquiro", "Chiquito", "Perro");
        
        //modifico un atributo
      //  m1.setNombre("Pepe Chiquito");
        
      //  System.out.println(m1.getNombre());
        
        //System.out.println(m1); -> me imprime el espacio de memoria donde esta asignada m1(si todavia no puse el toString)
        //System.out.println(m1); -> me devuelve toda la informacion de la mascota con un texto ya armado
       
     //   System.out.println(m1.toString());
        
      //  m1.pasear(100);
      //System.out.println(m1);
        //muestra lo mismo que System.out.println(m1);
        //System.out.println(m1.toString());
       
     //-----------------------------------------------------
        
//        ServicioMascota sm = new ServicioMascota();
//      
//        Mascota m1 = sm.crearMascota();
//        
//        System.out.println(m1.toString());
//        
//        m1 = null;
        
 //---------------------------------------------------------
 
 
 //descomentar esto:
/* 
        int a = 10;
        
        Mascota mm = new Mascota();
        
        modificador(a,mm);
        
        System.out.println("a "+a);
        System.out.println("Mascota "+mm);
        
   */   
      
        
        
        

        
        
//        m1.apodo = "Chiquito";
//        m1.nombre = leer.next();
//        m1.tipo = "Perro";
//        m1.edad = 14;
//        m1.raza = "Beagle";
//        m1.cola = true;
//        m1.color = "tricolor";
//        
//        System.out.println(m1.apodo+" "+m1.edad+" "+m1.tipo);


//__________________________________________________________________________________________
        //COLECCIONES
//__________________________________________________________________________________________
        //Arrays:
/*        String[] nombresArray = new String[5];
        
        for (int i = 0; i < nombresArray.length; i++) {
            nombresArray[i] = "Chiquito" + (i + 1);
        }
        
        for(String var : nombresArray){
            System.out.println(var);
        }
        
        //Colections
        
        ArrayList<String> nombresArrayList = new ArrayList();
        
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        
        System.out.println(nombresArrayList.size());
        
        nombresArrayList.remove("Chiquito");
        
        System.out.println(nombresArrayList.size());
    }
    
    public static void modificador(int num, Mascota m){
        
        num = 100;
        m.setApodo("Mascota Referencia");
*/
 //   }
            
    
    //main colecciones
    public static void main(String[] args) {
/*        
        //Arrays.asList(nombres) -> arma una lista con los String del vector
        String[] nombres = {"pepe", "pepa"};
        List<String> nombresList = new ArrayList(Arrays.asList(nombres));
        
        //agrego cosas al arrayList
        List<String> nombresList2 = new ArrayList();
        nombresList2.addAll(nombresList2);
 */     
/*

//recorrer una lista:
        List<String> nombres = new ArrayList();
        nombres.add("Lola");
        nombres.add("Roman");
        nombres.add("Chiquito");
//una forma:
        for (String aux : nombres{
            System.out.println(aux);
        }    
*/
//otra forma:
        /*
        for (int = 0; i < nombres.size(); i++{
            System.out.println(nombres.get(i);
        }
//otra forma
        nombres.forEach( (e)->System.out.println(e) );
*/
        /*
        
        */
        
        ServicioMascota servMasc = new ServicioMascota();
        //servMasc.fabricaChiquitos(140);
        servMasc.fabricaMascota(1);
        
        System.out.println("");
        
     //   servMasc.mostrarMascotas();
        
        System.out.println("");
        
     //   servMasc.actualizarMascota2(0);
        
    //    servMasc.mostrarMascotas();
        
        System.out.println("");
        
    //    servMasc.eliminarMascota(3);
        servMasc.eliminarMascotaPorNombre("Lola");
        
        servMasc.mostrarMascotas();

 

/*
//recorrer un elemento una lista:
        List<String> nombres = new ArrayList();
        nombres.add("Lola");
        nombres.add("Roman");
        nombres.add("Chiquito");
        
        Iterator<String> it = nombres.iterator();
        
        while (it.hasNext()) {
            String aux = it.next();
            
            if(aux.equals("Lola")){
                it.remove();
            }
            
        }
//eliminar un elemento una lista:
               
        for(int i = 0; i < nombres.size(); i++){
            String m = nombres.get(i);
            if(m.equals("Lola")){
                nombres.remove(m);
            }
        }
        
        nombres.forEach( (e)->System.out.println(e) );
        
    }
    */
    
}
}
