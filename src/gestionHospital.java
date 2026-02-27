import java.util.ArrayList;
import java.util.List;

public class gestionHospital {

    public static void main(String[] args) {

        // Médicos
        Medico m1 = new Medico("Thomas", "1", 45, "M", "General", "R1");
        Medico m2 = new Medico("Laura", "2", 38, "F", "Pediatra", "R2");

        // Cirujanos
        MedicoCirujano c1 = new MedicoCirujano("Tomas","3",50,"M","Cardiaco","R3",1);
        MedicoCirujano c2 = new MedicoCirujano("Sarita","4",42,"F","Neuro","R4",2);

        // Pacientes
        Paciente p1 = new Paciente("Juanmi","10",30,"M","H1","Sura",100);
        Paciente p2 = new Paciente("Gaby","11",25,"F","H2","NuevaEPS",30);
        Paciente p3 = new Paciente("Pablo","12",60,"M","H3","Sura",70);

        // Polimorfismo
        List<Persona> personas = new ArrayList<>();

        personas.add(m1);
        personas.add(m2);
        personas.add(c1);
        personas.add(c2);
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        System.out.println("=== Presentación ===");
        for (Persona per : personas) {
            per.presentarse();
        }

        // Asignar pacientes
        m1.agregarPaciente(p1);
        m1.agregarPaciente(p2);

        m1.revisarPacientes();
        m1.asignarPrioridad("Infarto");

        // Pago consulta
        p1.pagarConsulta(50.0);
        p2.pagarConsulta(50.0);

        // Operaciones
        c1.realizarOperacion(true);
        c2.realizarOperacion(false);

        // Atención hospitalaria
        Atencion.procesarIngreso(p1);
        Atencion.procesarIngreso(p2);
    }
}