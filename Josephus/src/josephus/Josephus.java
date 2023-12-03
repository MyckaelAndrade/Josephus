package josephus;

import javax.swing.JOptionPane;

/**
 * @since 26/11/2023
 * @author myckazs
 */
public class Josephus {

    public static void main(String[] args) {
        Soldado soldado = new Soldado();

        String numInput = JOptionPane.showInputDialog("Digite um valor: ");
        int num = Integer.parseInt(numInput);

        int soldadoNumero = soldado.localizarSoldado(num);

        Soldado.Soldados soldadoData = null;

        for (Soldado.Soldados soldados : soldado.getListSoldado()) {
            if (soldados.getNumero() == soldadoNumero) {
                soldadoData = soldados;
                break;
            }
        }

        String s = "O soldado sobrevivente é o de número: " + soldadoNumero + "\n";
        s += "Dados da pessoa sobrevivente:\n";
        s += "Nome: " + soldadoData.getNome() + "\n";
        s += "Telefone: " + soldadoData.getTelefone() + "\n";
        s += "Endereço: " + soldadoData.getEndereco() + "\n";
        s += "CPF: " + soldadoData.getCpf();

        JOptionPane.showMessageDialog(null, s);
    }
}
