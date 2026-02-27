public class Atencion {

    public static void procesarIngreso(Paciente p) {

        String pabellon;

        switch (p.getEps()) {
            case "Sura":
                pabellon = "A";
                break;
            case "NuevaEPS":
                pabellon = "B";
                break;
            default:
                pabellon = "General";
        }

        System.out.println("Paciente " + p.getNombre()
                + " enviado al pabellón " + pabellon);
    }
}