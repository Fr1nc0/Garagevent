import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");
        boolean continuar = true;

        while (continuar) {
            String Nombre = JOptionPane.showInputDialog("Tu nombre");
            if (Nombre == null) {
                continuar = false;
                break;
            }

            String opcion = JOptionPane.showInputDialog("Ingresa una opción 1 para un jueguete opcion 2 para un reloj intelligente");
            if (opcion == null) {
                continuar = false;
                break;
            }

            int opcionNumerica = Integer.parseInt(opcion);

            switch (opcionNumerica) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Has comprado un juguete por 19bs.");
                    System.out.println(Nombre + " compró un juguete por 19bs.");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Has comprado un reloj intelligente por 150bs");
                    System.out.println(Nombre + " compró un reloj intelligente por 150bs.");
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }
}
