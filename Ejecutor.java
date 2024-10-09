
import javax.swing.*;
public class Ejecutor {
    public static void main(String[] args) {
        try {
            //muestra la instancias
            Planeta tierra = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
            Planeta jupiter = new Planeta("Júpiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);
            
           

            JOptionPane.showMessageDialog(null, tierra.toString(), "Información de la Tierra", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, jupiter.toString(), "Información de Júpiter", JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

/* Se agrego un bloque try-catch al crear los objetos Planeta y mostrar sus atributos.
Uso de toString(): Se reemplazó el método imprimirAtributos() por toString(), lo que simplifica el código lo nos da mejoras
codigo mas limpio */



/*  codigo antiguo
public class Ejecutor {

    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        Planeta jupiter = new Planeta("Júpiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);
        
        JOptionPane.showMessageDialog(null, tierra.imprimirAtributos(), "Información de la Tierra", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, jupiter.imprimirAtributos(), "Información de Júpiter", JOptionPane.INFORMATION_MESSAGE);
    }
}
*/