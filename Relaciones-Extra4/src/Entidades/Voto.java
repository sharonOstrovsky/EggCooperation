
package Entidades;

import java.util.HashSet;


public class Voto {
    
    private Alumno alumno; //objeto Alumno que será el alumno que vota
    private HashSet<Alumno> alumnosVotados; //una lista de los alumnos a los que votó.

    public Voto() {
    }

    public Voto(Alumno alumno, HashSet<Alumno> alumnosVotados) {
        this.alumno = alumno;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public HashSet<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(HashSet<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", alumnosVotados=" + alumnosVotados + '}';
    }
    
    
}
