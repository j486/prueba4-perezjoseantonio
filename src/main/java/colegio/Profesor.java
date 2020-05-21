package colegio;

import java.util.GregorianCalendar;


public abstract class Profesor implements Asignable {
    private String nombre;
    private String apellidos;
    private GregorianCalendar nacimiento;
    private String [] asignaturas;
    private static int numProfesores = 0;
    
    private boolean jefatura = false;
    private Escolarizable.Curso tutoria = null;
    
    public Profesor() {
        this.nombre = "Sin nombre";
        this.apellidos = "Sin apellidos";
        this.nacimiento = new GregorianCalendar(2000 , 01, 01);
        this.asignaturas = new String[] {"Física", "Química", "Matemáticas"};
        this.jefatura = false;
        this.tutoria = null;
        this.numProfesores ++;
    }

    
    public Profesor(String nombre, String apellidos, GregorianCalendar nacimiento, 
                    String[] asignaturas, boolean jefatura, Escolarizable.Curso tutoria) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.asignaturas = asignaturas;
        this.jefatura = jefatura;
        this.tutoria = tutoria;
        this.numProfesores ++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public GregorianCalendar getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(GregorianCalendar nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public static int getNumProfesores() {
        return numProfesores;
    }

    public static void setNumProfesores(int numProfesores) {
        Profesor.numProfesores = numProfesores;
    }

    public boolean isJefatura() {
        return jefatura;
    }

    public void setJefatura(boolean jefatura) {
        this.jefatura = jefatura;
    }

    public Escolarizable.Curso getTutoria() {
        return tutoria;
    }

    public void setTutoria(Escolarizable.Curso tutoria) {
        this.tutoria = tutoria;
    }

    
    
    @Override
    public void asignarTutoría(Escolarizable.Curso curso) {
        this.tutoria = curso;
    }

    @Override
    public void asignarJefatura(boolean asignada) {
        this.jefatura = asignada;
    }
    
    @Override
    protected void finalize() throws Throwable {
        numProfesores--;
        super.finalize();        
    }
    
    
}
