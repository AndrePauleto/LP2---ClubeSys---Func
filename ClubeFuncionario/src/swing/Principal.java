package swing;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import swing.action.JCadastrarMenuAction;
import swing.action.JSobreMenuAction;

public class Principal {
	public static final String PRINCIPAL = "PRINCIPAL";

	private static void createAndShowGUI() {
		JFrame frame = new JFrame("SysClube");
		CardLayout cards = new CardLayout();		
		JPanel principal = new JPanel(cards);

		
		JPanel cadastrar = new JCadastrarFuncionarioPanel(principal, cards);
		JPanel vazio = new JPanel();
		JLabel label = new JLabel("Bem Vindo ao sistema SysClube!");
		vazio.add(label);
		
		principal.add(vazio, PRINCIPAL);
		principal.add(cadastrar, JCadastrarMenuAction.CADASTRAR);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		frame.getContentPane().add(principal);

		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("Arquivo");
		menubar.add(file);
		JMenu funcionario = new JMenu("Funcionario");
		menubar.add(funcionario);
		JMenu help = new JMenu("Ajuda");
		menubar.add(help);		
		
		Action cadastrarAction = new JCadastrarMenuAction(principal, cards);		
		funcionario.add(cadastrarAction);		
		
		Action sobreAction = new JSobreMenuAction(frame);
		help.add(sobreAction);

		frame.setJMenuBar(menubar);
		
		frame.setMinimumSize(new Dimension(400,200));

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
