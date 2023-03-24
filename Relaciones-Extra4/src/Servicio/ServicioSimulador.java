
package Servicio;

import Entidades.Alumno;
import Entidades.Simulador;
import Entidades.Voto;
import Enumeraciones.Apellidos;
import Enumeraciones.Nombres;
import Utilidades.Comparators;
import java.util.ArrayList;
import java.util.HashSet;


public class ServicioSimulador {
    
    public Simulador crearSimulador(){
        
        Simulador simulador = new Simulador();
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> apellidos = new ArrayList<>();
        String nom, ape;
        for (Nombres aux : Nombres.values()) {
            nom = aux.toString();
            nombres.add(nom);
        }
        
        for (Apellidos aux : Apellidos.values()) {
            ape = aux.toString();
            apellidos.add(ape);
        }
        
        simulador.setNombres(nombres);
        simulador.setApellidos(apellidos);
        
        return simulador;
        
    }
    
    public void mostrarListasSimulador(Simulador simulador){
        
        System.out.println(simulador.getApellidos().size());
        System.out.println(simulador.getNombres().size());
        
        for (String aux : simulador.getNombres()) {
            System.out.println(aux + " ,");
        }
        
        for (String aux : simulador.getApellidos()) {
            System.out.println(aux + " ,");
        }
    }
    
    
    public static int Aleatorio(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
    
    /*
    método que genere un listado de alumnos manera
aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
    */
    public ArrayList<String> generarListadoAlumnos(Simulador simulador){
        
        ArrayList<String> nombreCompleto = new ArrayList<>();
        
        for (int i = 0; i < 35; i++) {
            
            int nombre = Aleatorio(0,34);
            int apellido = Aleatorio(0,34);
            nombreCompleto.add(simulador.getNombres().get(nombre)+" "+simulador.getApellidos().get(apellido));
            
        }
        
        return nombreCompleto;
    }
    
 /*   generador de combinaciones de DNI posibles, deben estar dentro de un
rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
debe retornar la lista de dnis.
    */
    public ArrayList<Integer> generadorListadoDNI(){
        
        ArrayList<Integer> doc = new ArrayList<>();
        HashSet<Integer> dni = new HashSet<>();
        
        while(dni.size() < 35){
            dni.add(Aleatorio(10000000,99999999));
        }
        
        for (Integer aux : dni) {
            doc.add(aux);
        }
        
//        for (int i = 0; i < 35; i++) {
//            
//            doc.add(Aleatorio(10000000,99999999));
//        }
        
        return doc;
    }
    
    /*
    método que, usando las dos listas generadas, cree una cantidad de
objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
mismo nombre.
    */
    
    public ArrayList<Alumno> generadorDeAlumnos(Simulador simulador, int cantAlumnos){
        
        ArrayList<String> nombresCompletos = generarListadoAlumnos(simulador);
        ArrayList<Integer> documentos = generadorListadoDNI();
        ArrayList<Alumno> alumnos = new ArrayList<>();
       
        for (int i = 0; i < cantAlumnos; i++) {
            Alumno alumno = new Alumno();
            alumno.setNombreCompleto(nombresCompletos.get(i));
            alumno.setDNI(documentos.get(i));
            alumnos.add(alumno);
        }
        
        return alumnos;
    }
    
    
    /*
    • Se debe imprimir por pantalla el listado de alumnos.
    */
    public void mostrarListadoAlumnos(ArrayList<Alumno> alumnos){
        
        System.out.println("Alumno/a\t\tDNI");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombreCompleto()+ "\t\t"+alumno.getDNI());
        }
    }
    /*
    método votación que recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.
    */
    public ArrayList<Voto> votacion(ArrayList<Alumno> alumnos){
        
        ArrayList<Voto> votos = new ArrayList<>();
        int VotoAleatorio;
        int numAlum = 0;
        for (Alumno alumno : alumnos) {
            Voto voto= new Voto();
            HashSet<Alumno> alumnosVotados = new HashSet<>();
            voto.setAlumno(alumno);
            int cantVotos = 1;
            do{
                
                do{
                    VotoAleatorio = Aleatorio(0,alumnos.size()-1);
                }while(VotoAleatorio == numAlum);
                
                alumnosVotados.add(alumnos.get(VotoAleatorio));
                
                if(alumnosVotados.size() == cantVotos){
                    alumnos.get(VotoAleatorio).setCantVotos(alumnos.get(VotoAleatorio).getCantVotos()+1);
                    cantVotos++;
                }

            }while(alumnosVotados.size() != 3);
          
            
            voto.setAlumnosVotados(alumnosVotados);
            
            votos.add(voto);
            numAlum++;
            
            
            
        }
        return votos;
    }
    

//---------------------MAL------------------------    
    public ArrayList<Voto> votacion2(ArrayList<Alumno> alumnos){
        
        int ale1, ale2, ale3;
        ArrayList<Voto> votos = new ArrayList<>();
        
        for (int i = 0; i < alumnos.size(); i++) {
            Voto voto= new Voto();
            HashSet<Alumno> alumnosVotados = new HashSet<>();
            voto.setAlumno(alumnos.get(i));
            
            do{
                ale1= Aleatorio(0,alumnos.size()-1);
                ale2= Aleatorio(0,alumnos.size()-1);
                ale3= Aleatorio(0,alumnos.size()-1);
               // ale1 = (int)(Math.random() * alumnos.size());
               // ale2 = (int)(Math.random() * alumnos.size());
               // ale3 = (int)(Math.random() * alumnos.size());
               //  System.out.println("1:"+ ale1+" 2: "+ ale2+" 3: "+ ale3);
            }while( ale1 != ale2 && ale1 != ale3 && ale1!=i && ale2!=i && ale3 !=i);
            System.out.println("--------");
            System.out.println("1:"+ ale1+" 2: "+ ale2+" 3: "+ ale3);
            alumnosVotados.add(alumnos.get(ale1));
            alumnos.get(ale1).setCantVotos(alumnos.get(ale1).getCantVotos()+1);
            alumnosVotados.add(alumnos.get(ale2));
            alumnos.get(ale2).setCantVotos(alumnos.get(ale2).getCantVotos()+1);
            alumnosVotados.add(alumnos.get(ale3));
            alumnos.get(ale3).setCantVotos(alumnos.get(ale3).getCantVotos()+1);
            voto.setAlumnosVotados(alumnosVotados);
            
            votos.add(voto);
            
        }
        return votos;
    }
    
    
    public void mostrarAlumnosVotados(Voto voto){
 
            System.out.print("Voto a: ");
            for (Alumno alumno : voto.getAlumnosVotados()) {
                
    //            if(  ){
      //              System.out.print(alumno.getNombreCompleto());
        //        }else{
                    System.out.print(alumno.getNombreCompleto()+" , ");
          //      }
                
            }
            System.out.println("");
 
    }
    /*
    • Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
fueron sus 3 votos.
    */
    public void mostrarAlumno(ArrayList<Alumno> alumnos, ArrayList<Voto> votos ){
        System.out.println("");
        for (Alumno alumno : alumnos) {
            
//            System.out.println("Alumno : "+ alumno.getNombreCompleto() + "\n Cantidad de votos: "+ alumno.getCantVotos());
            System.out.println("Alumno/a : "+ alumno.getNombreCompleto());

            for (Voto voto : votos) {

                if(voto.getAlumno().getNombreCompleto().equals(alumno.getNombreCompleto())){
                    mostrarAlumnosVotados(voto);
                }
            }
            System.out.println("");
        }
        
    }
    
    
    /*
    • Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
comienza a hacer el recuento de votos.
    */
    
    public void recuentoVotos(ArrayList<Alumno> alumnos){
        
        alumnos.sort(Comparators.comparaVotos);
        
        System.out.println("-----  Alumnos en orden de cantidad de votos  ----- ");
        System.out.println("");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombreCompleto()+ " Cant Votos: "+ alumno.getCantVotos());
        }
        
    }
    
    /*
    • Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
los 5 facilitadores y los 5 facilitadores suplentes.
    */
    public void crearFacilitadores(ArrayList<Alumno> alumnos){
        
        System.out.println("¡¡¡Felicidades ustedes son los cinco facilitadores!!!");
        System.out.println("¡Sigan trabajando asi!");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            
            System.out.println(alumnos.get(i).getNombreCompleto());
            
        }
        System.out.println("");
        System.out.println("¡¡Felicidades ustedes son los cinco facilitadores suplentes!!");
        System.out.println("¡Van por buen camino!");
        System.out.println("");
        for (int i = 5; i < 10; i++) {
            
            System.out.println(alumnos.get(i).getNombreCompleto());
            
        }
    }

   
}
