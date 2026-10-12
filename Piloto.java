package Ejercicio14_horasVuelo;

public class Piloto {
    private String numeroLicencia;
    private String nombre;
    private double horasVuelo;

    public Piloto(String numeroLicencia, String nombre, double horasVueloIniciales) {
        if (horasVueloIniciales < 0) {
            throw new IllegalArgumentException("Las horas iniciales no pueden ser negativas.");
        }
        this.numeroLicencia = numeroLicencia;
        this.nombre = nombre;
        this.horasVuelo = horasVueloIniciales;
    }

    public boolean registrarVuelo(double horas) {
        if (horas <= 0) {
            return false;
        }
        horasVuelo += horas;
        return true;
    }

    public double getHorasVuelo() {
        return horasVuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }
}
