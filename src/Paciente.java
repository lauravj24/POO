public class Paciente extends Persona {

    private String historial;
    private String eps;
    private double saldo;

    public Paciente(String nombre, String cc, int edad, String genero,
                    String historial, String eps, double saldo) {

        super(nombre, cc, edad, genero);
        this.historial = historial;
        this.eps = eps;
        this.saldo = saldo;
    }

    @Override
    public void presentarse() {
        System.out.println("Paciente: " + nombre);
    }

    public void mostrarSintomas() {
        System.out.println(nombre + " presenta síntomas generales.");
    }

    public void pagarConsulta(double costo) {
        System.out.print("El paciente " + nombre +
                " intenta pagar $" + costo +
                " Saldo actual $" + saldo + " Resultado ");

        if (saldo >= costo) {
            saldo -= costo;
            System.out.println("Éxito");
        } else {
            System.out.println("Rechazado");
        }
    }

    public String getEps() {
        return eps;
    }

    public String getNombre() {
        return nombre;
    }
}