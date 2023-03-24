package mascotapp.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import mascotapp.entidades.Mascota;


public class ServicioMascota {
    
    private Scanner leer;
    private ArrayList<Mascota> mascotas;
    
    public ServicioMascota(){
        this.leer =  new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
 /*   
    //nacimiento de una mascota con tales caracteristicas
    public Mascota crearMascota(){
        
        System.out.println("introducir nombre");
        String nombre = leer.next();
        
        System.out.println("introducir apodo");
        String apodo = leer.next();
        
        System.out.println("introducir tipo");
        String tipo = leer.next();
        
//        Mascota m = new Mascota(nombre, apodo, tipo);
//        return m;
        
        return new Mascota(nombre, apodo, tipo);

    }
*/
    
    //Crear mascota en colecciones
    public Mascota crearMascota(){
        
        System.out.println("introducir nombre");
        String nombre = leer.next();
        
        System.out.println("introducir apodo");
        String apodo = leer.next();
        
        System.out.println("introducir tipo");
        String tipo = leer.next();
        
//        Mascota m = new Mascota(nombre, apodo, tipo);
//        return m;
        
        return new Mascota(nombre, apodo, tipo);

    }
    
    public void agregarMascota(Mascota m){
         mascotas.add(m);
    }
    
    //visualizar mascotas
    public void mostrarMascotas(){
        System.out.println("Las mascotas actuales de la Lista Mascotas son:");
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = "+ mascotas.size());
    }
    
    
    /**
     * Crea Mascotas TODOS Chiquitos
     * equivale a la cantidad de mascotas a crear y añadir a la lista
     * @param cantidad 
     */
    public void fabricaChiquitos(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
            
            mascotas.add( new Mascota("Fer", "Chiquito", "Beagle"));
            
            //Mascota aux = new Mascota("Fer", "Chiquito", "Beagle");
            //mascotas.add(aux)
        
        }
    }
    
    /**
     * Crea mascotas pidiendo por teclado
     * @param cantidad 
     */
    public void fabricaMascota(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            
            agregarMascota(mascotaCreada);
            
            System.out.println(mascotaCreada.toString());
            
        }
    }
    
    
    /**
     * recibe el indice de que mascota quiero modificar de mi collection
     * @param index 
     */
    public void actualizarMascota(int index){
        
        if(index <= (mascotas.size()-1)){
            System.out.println("");
            System.out.println("--------Actualizar--------");
        
            Mascota m = mascotas.get(index);
            m.setApodo("Roberto");
        }else{
            System.out.println("Fallo al actualizar, El indice es erroneo");
        }
        
        
    }
    
    public void actualizarMascota2(int index){
        
        
        if(index <= (mascotas.size()-1)){
            System.out.println("");
            System.out.println("--------Actualizar--------");
            Mascota m = crearMascota();
        
            mascotas.set(index,m);
        
        }else{
            System.out.println("Fallo al actualizar, El indice es erroneo");
        }
    }
    
    public void eliminarMascota(int index){
        
        if(index <= (mascotas.size()-1)){
            mascotas.remove(index);
        }else{
            System.out.println("Fallo al eliminar, El indice es erroneo");
        }
        
    }
    
    public void eliminarMascotaPorNombre(String nombre){
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            if(m.getNombre().equals(nombre)){
                mascotas.remove(i);
            }
        }
    }
    
    public void actualizarMascotaPorNombre(String nombreViejo, String nombreNuevo){
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            if(m.getNombre().equals(nombreViejo)){
               m.setNombre(nombreNuevo);
            }
        }
    }
}
