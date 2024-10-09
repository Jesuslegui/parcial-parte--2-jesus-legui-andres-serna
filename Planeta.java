
import javax.swing.*;

public class Planeta {
    private String nombre;
    private int cantidadSatelites;
    private double masa; // en kg
    private double volumen; // en km³
    private int diametro; // en km
    private long distanciaAlSol; // en km
    private boolean esObservable;

    // Constructor con validaciones
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, long distanciaAlSol, boolean esObservable) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (cantidadSatelites < 0) {
            throw new IllegalArgumentException("La cantidad de satélites no puede ser negativa.");
        }
        if (masa <= 0) {
            throw new IllegalArgumentException("La masa debe ser mayor que cero.");
        }
        if (volumen <= 0) {
            throw new IllegalArgumentException("El volumen debe ser mayor que cero.");
        }
        if (diametro <= 0) {
            throw new IllegalArgumentException("El diámetro debe ser mayor que cero.");
        }
        if (distanciaAlSol < 0) {
            throw new IllegalArgumentException("La distancia al sol no puede ser negativa.");
        }

        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.esObservable = esObservable;
    }

    
    public double calcularDensidad() {
        return masa / volumen;
    }

    
    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Nombre: ").append(nombre).append("\n")
            .append("Cantidad de Satélites: ").append(cantidadSatelites).append("\n")
            .append("Masa: ").append(masa).append(" kg\n")
            .append("Volumen: ").append(volumen).append(" km³\n")
            .append("Diámetro: ").append(diametro).append(" km\n")
            .append("Distancia al Sol: ").append(distanciaAlSol).append(" km\n")
            .append("Es observable: ").append(esObservable ? "Sí" : "No").append("\n")
            .append("Densidad: ").append(calcularDensidad()).append(" kg/km³\n");
        return info.toString();
    }
}
/*mejoras 

El nombre del planeta no sea nulo ni esté vacío.
La cantidad de satélites no sea un número negativo.
La masa, el volumen y el diámetro del planeta sean siempre mayores que cero.
La distancia al sol no pueda ser negativa.
*/



/* codigo primero
import javax.swing.*;
public class Planeta {

    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private long distanciaAlSol;
    private boolean esObservable;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, long distanciaAlSol, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.esObservable = esObservable;
    }

    public double calcularDensidad() {
        return masa / volumen;
    }

    public String imprimirAtributos() {
        StringBuilder info = new StringBuilder();
        info.append("Nombre: ").append(nombre).append("\n")
            .append("Cantidad de Satélites: ").append(cantidadSatelites).append("\n")
            .append("Masa: ").append(masa).append(" kg\n")
            .append("Volumen: ").append(volumen).append(" km³\n")
            .append("Diámetro: ").append(diametro).append(" km\n")
            .append("Distancia al Sol: ").append(distanciaAlSol).append(" km\n")
            .append("Es observable: ").append(esObservable ? "Sí" : "No").append("\n")
            .append("Densidad: ").append(calcularDensidad()).append(" kg/km³\n");
        return info.toString();
    }
}
*/