package Ejercicio14_horasVuelo;

public class Main {
    public static void main(String[] args) {
        Piloto piloto = new Piloto("LIC-5521", "Capitán Herrera", 1200.0);

        double[] jornadas = {6.5, -3.0, 4.25, 0, 8.0};
        for (double horas : jornadas) {
            if (piloto.registrarVuelo(horas)) {
                System.out.println("Jornada de " + horas + " h registrada.");
            } else {
                System.out.println("Jornada de " + horas + " h rechazada: debe ser positiva.");
            }
        }

        System.out.println(piloto.getNombre() + " (" + piloto.getNumeroLicencia() + ") - horas acumuladas: " + piloto.getHorasVuelo());
    }
}
