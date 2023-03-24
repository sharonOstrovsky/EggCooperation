/*
4. Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).

El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
*/
package herencia.extra4;

import Entidad.Empleado;
import Entidad.Estudiante;
import Entidad.Persona;
import Entidad.PersonalServicio;
import Entidad.Profesor;
import Enumeraciones.Departamento;
import Enumeraciones.EstadoCivil;
import Enumeraciones.Seccion;
import Servicio.ServicioEmpleado;
import Servicio.ServicioEstudiante;
import Servicio.ServicioPersona;
import Servicio.ServicioPersonalServicio;
import Servicio.ServicioProfesor;
import java.util.ArrayList;


public class HerenciaExtra4 {


    public static void main(String[] args) {
        
        ServicioPersona servPersona = new ServicioPersona();
        ServicioEmpleado servEmpleado = new ServicioEmpleado();
        ServicioEstudiante servEstudiante = new ServicioEstudiante();
        ServicioProfesor servProfesor = new ServicioProfesor();
        ServicioPersonalServicio servPersonal = new ServicioPersonalServicio();
        
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<String> cursos = new ArrayList<>();
        cursos.add("Analisis");
        
        Persona persona = new Persona("sharon", "ostrovsky", 39915620, EstadoCivil.soltero);
        Empleado empleado = new Empleado(2020,2,"patrica", "dascal", 18098700, EstadoCivil.casado);
        Estudiante estudiante = new Estudiante( cursos, "Federico", "Lillo", 40945643, EstadoCivil.soltero);
        Profesor profesor = new Profesor(Departamento.Matematica, 2011, 13, "Juan", "Fernandez", 23123456, EstadoCivil.viudo);
        PersonalServicio personal = new PersonalServicio(Seccion.Secretaria, 2015, 7, "Carlos", "Perez", 23456574, EstadoCivil.divorciado);
        
        personas.add(persona);
        personas.add(empleado);
        personas.add(estudiante);
        personas.add(profesor);
        personas.add(personal);
        
        //Imprimir toda la información de cada tipo de individuo.
        servPersona.mostrarPersonas(personas);
       
//        //• Cambio del estado civil de una persona.
//        System.out.println(persona.getEstadoCivil());
//        servPersona.cambioEstadoCivil(persona);
//        System.out.println(persona.getEstadoCivil());
//        
//        //• Reasignación de despacho a un empleado.
//        System.out.println(empleado.getNumDespacho());
//        servEmpleado.reasignacionDespacho(empleado);
//        System.out.println(empleado.getNumDespacho());
//        
//        //• Matriculación de un estudiante en un nuevo curso.
//        servEstudiante.matriculacionCurso(estudiante);
//        servEstudiante.mostrarCursos(estudiante);
//
//        //• Cambio de departamento de un profesor.
//        System.out.println(profesor.getDepartamento());
//        servProfesor.cambioDepartamento(profesor);
//        System.out.println(profesor.getDepartamento());
//        
//        //• Traslado de sección de un empleado del personal de servicio.
//        System.out.println(personal.getSeccion());
//        servPersonal.trasladoSeccion(personal);
//        System.out.println(personal.getSeccion());
    }
    
}
