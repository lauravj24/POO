public class MedicoCirujano extends Medico implements ICirujano {

    private int numeroQuirofano;

    public MedicoCirujano(String nombre, String cc, int edad, String genero,
                          String especialidad, String registro, int numeroQuirofano) {

        super(nombre, cc, edad, genero, especialidad, registro);
        this.numeroQuirofano = numeroQuirofano;
    }

    @Override
    public void realizarOperacion(boolean disponible) {

        if (disponible) {
            System.out.println("El cirujano " + nombre +
                    " realizó operación en quirófano " + numeroQuirofano);
        } else {
            System.out.println("El cirujano " + nombre +
                    " NO pudo operar, quirófano ocupado");
        }
    }
}