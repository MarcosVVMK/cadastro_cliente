import javax.swing.*;
import java.awt.Color;

public class TelaClienteBlack {
  public static void main(String[] args) {

     JFrame frame = new JFrame("Primeira Tela - BLack");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(830, 449);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#1e1e1e"));

     JButton btnSave = new JButton("Save");
     btnSave.setBounds(364, 326, 106, 29);
     btnSave.setBackground(Color.decode("#2e2e2e"));
     btnSave.setForeground(Color.decode("#D9D9D9"));
     btnSave.setFocusPainted(false);
     panel.add(btnSave);

     JLabel lblNome = new JLabel("Nome");
     lblNome.setBounds(63, 44, 106, 17);
     lblNome.setForeground(Color.decode("#D9D9D9"));
     panel.add(lblNome);

     JTextField txtNome = new JTextField();
     txtNome.setBounds(54, 76, 273, 21);
     txtNome.setBackground(Color.decode("#B2B2B2"));
     txtNome.setForeground(Color.decode("#656565"));
     panel.add(txtNome);

     JLabel lblCPF = new JLabel("CPF");
     lblCPF.setBounds(61, 125, 106, 17);
     lblCPF.setForeground(Color.decode("#D9D9D9"));
     panel.add(lblCPF);

     JTextField txtCPF = new JTextField();
     txtCPF.setBounds(53, 157, 269, 21);
     txtCPF.setBackground(Color.decode("#B2B2B2"));
     txtCPF.setForeground(Color.decode("#656565"));
     panel.add(txtCPF);

   

     JLabel lblRG = new JLabel("RG");
     lblRG.setBounds(64, 200, 106, 17);
     lblRG.setForeground(Color.decode("#D9D9D9"));
     panel.add(lblRG);

     JTextField txtRG = new JTextField("");
     txtRG.setBounds(52, 244, 265, 21);
     txtRG.setBackground(Color.decode("#B2B2B2"));
     txtRG.setForeground(Color.decode("#656565"));
     panel.add(txtRG);

     JLabel lblEndereco = new JLabel("Endereço");
     lblEndereco.setBounds(439, 41, 106, 17);
     lblEndereco.setForeground(Color.decode("#D9D9D9"));
     panel.add(lblEndereco);

     JTextField txtEndereco = new JTextField();
     txtEndereco.setBounds(445, 78, 304, 18);
     txtEndereco.setBackground(Color.decode("#B2B2B2"));
     txtEndereco.setForeground(Color.decode("#656565"));
     panel.add(txtEndereco);

     JLabel lblTelefone = new JLabel("Telefone");
     lblTelefone.setBounds(443, 145, 106, 17);
     lblTelefone.setForeground(Color.decode("#D9D9D9"));
     panel.add(lblTelefone);

     JTextField txtTelefone = new JTextField("");
     txtTelefone.setBounds(444, 182, 301, 21);
     txtTelefone.setBackground(Color.decode("#B2B2B2"));
     txtTelefone.setForeground(Color.decode("#656565"));
     panel.add(txtTelefone);

     frame.add(panel);
     frame.setVisible(true);



  }
}