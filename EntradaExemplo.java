import javax.swing.JOptionPane;

public class EntradaExemplo {
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null,"Deseja continuar?", 
        "Confirmação" , JOptionPane.YES_NO_CANCEL_OPTION );

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,"Voce escolheu continuar!" );
        } else {
            JOptionPane.showMessageDialog(null, "Voce escolhue sair ");   
        }
    }
}