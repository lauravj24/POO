import java.util.ArrayList;
import java.util.List;
public class Medico extends Persona {

    protected String especialidad;
    protected String registro;
    protected List<Paciente> pacientes = new ArrayList<>();

    public Medico(String nombre, String cc, int edad, String genero,
                  String especialidad, String registro) {

        super(nombre, cc, edad, genero);
        this.especialidad = especialidad;
        this.registro = registro;
    }

    @Override
    public void presentarse() {
        System.out.println("Dr. " + nombre + " - " + especialidad);
    }

    public void agregarPaciente(Paciente p) {
        pacientes.add(p);
    }

    // CICLO
    public void revisarPacientes() {
        System.out.println("Pacientes del Dr. " + nombre);
        for (Paciente p : pacientes) {
            System.out.println("- " + p.getNombre());
        }
    }

    // SWITCH
    public int asignarPrioridad(String sintoma) {

        int prioridad;

        switch (sintoma) {
            case "Infarto":
                prioridad = 1;
                break;
            case "Fiebre":
                prioridad = 2;
                break;
            case "Dolor":
                prioridad = 3;
                break;
            default:
                prioridad = 4;
        }

        System.out.println("El Dr. " + nombre +
                " evaluó el síntoma " + sintoma +
                " y asignó Prioridad " + prioridad);

        return prioridad;
    }
}