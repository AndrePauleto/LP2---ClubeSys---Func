package swing;

import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import swing.action.JCadastrarFuncionarioAction;

@SuppressWarnings("serial")
public class JCadastrarFuncionarioPanel extends JPanel {

	private JTextField txtNome;
	private JTextField txtMorada;
	private JTextField txtIdade;
	private JTextField txtUsuario;
	private JTextField txtSenha;

	public JCadastrarFuncionarioPanel(JPanel principal, CardLayout cards) {
		
		//principal = new JPanel(new GridLayout(6, 1));	
				
		add(new JLabel("Nome: "));
		txtNome = new JTextField(15);
		add(txtNome);
		
		add(new JLabel("Morada: "));
		txtMorada = new JTextField(15);
		add(txtMorada);

		add(new JLabel("Idade: "));
		txtIdade = new JTextField(15);
		add(txtIdade);

		add(new JLabel("Usuário: "));
		txtUsuario = new JTextField(15);
		add(txtUsuario);

		add(new JLabel("Senha: "));
		txtSenha = new JPasswordField(15);
		add(txtSenha);

		add(new JButton(new JCadastrarFuncionarioAction(principal, cards,
				txtNome, txtMorada, txtIdade, txtUsuario, txtSenha)));

	}

	@Override
	public void setVisible(boolean aFlag) {
		super.setVisible(aFlag);
		System.out.printf("JDepositarPanel::setVisible %b\n", aFlag);
		txtNome.setText("");
	}

	public JCadastrarFuncionarioPanel() {
		this(null, null);
	}

	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Banco Pindorama - Teste do Painel Depositar");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel painel = new JCadastrarFuncionarioPanel();
		frame.getContentPane().add(painel);

		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

}
