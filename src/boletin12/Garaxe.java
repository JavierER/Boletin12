package boletin12;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Garaxe {

    private int numeroCoches;
    private final String[] matriculas = new String[5];

    public void Aparcar() {
        if (numeroCoches == 5) {
            JOptionPane.showMessageDialog(null, "garaxe cheo");
        } else {
            JOptionPane.showMessageDialog(null, "Plazas dispoñibles");
            for (int i = 0; i < matriculas.length; i++) {
                if (matriculas[i] == null) {
                    matriculas[i] = JOptionPane.showInputDialog("Matricula do coche:");
                    JOptionPane.showMessageDialog(null, "Coche aparcado");
                    numeroCoches++;
                    break;
                }
            }
        }

    }

    public void calcularFactura() {
        float precioHoras = 0;
        float diñeiroPagado;
        boolean cocheNotFound = true;
        do {
            String matricula = JOptionPane.showInputDialog("inserte matricula de su coche para retirarlo:");

            for (int i = 0; i < matriculas.length; i++) {
                if (matricula.equals(matriculas[i])) {
                    JOptionPane.showMessageDialog(null, "Coche atopado");
                    cocheNotFound = false;
                    break;
                }
            }
        } while (cocheNotFound);

        if (!cocheNotFound) {
            int horas = Integer.parseInt(JOptionPane.showInputDialog("horas aparcado o coche?"));

            if (horas <= 3) {
                precioHoras += 1.5f;
            } else {
                precioHoras += 1.5f + ((horas - 3) * 0.2f);
            }

            JOptionPane.showMessageDialog(null, "O prezo é " + precioHoras + "€");

            do {
                diñeiroPagado = Float.parseFloat(JOptionPane.showInputDialog("Introduzca diñeiro:"));
            } while (diñeiroPagado < precioHoras);

            JOptionPane.showMessageDialog(null, "A súa volta é " + (diñeiroPagado - precioHoras) + "€");
        }
    }
}
