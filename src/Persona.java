public abstract class Persona {

    protected String nombre;
    protected String cc;
    protected int edad;
    protected String genero;

    public Persona(String nombre, String cc, int edad, String genero) {
        this.nombre = nombre;
        this.cc = cc;
        this.edad = edad;
        this.genero = genero;
    }
    public abstract void presentarse();
}