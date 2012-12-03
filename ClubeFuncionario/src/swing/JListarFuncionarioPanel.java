package swing;

import java.awt.CardLayout;
import java.util.Collection;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.Funcionario;
import dao.FuncionarioDAO;

@SuppressWarnings("serial")
public class JListarFuncionarioPanel extends JPanel {
	private JTextArea dados;
	public JListarFuncionarioPanel(JPanel principal, CardLayout cards) {
		dados = new JTextArea(20,60); 
		dados.setEditable(false);
		add(dados);
		
	}

	public JListarFuncionarioPanel() {
		this(null, null);
	}
	
	@Override
	public void setVisible(boolean aFlag) {
		super.setVisible(aFlag);
		if (aFlag == false) {
			return;
		}
		System.out.printf("JDepositarPanel::setVisible %b\n", aFlag);
		
		FuncionarioDAO funcDao = new FuncionarioDAO();
		funcDao.conectar();
		
		
		Collection<Funcionario> funcionarioCol = funcDao.select();
		String s = "";
		for (Funcionario f : funcionarioCol) {
			s += String.format("Nome: %s\n", f.getNome());
		}
		
		funcDao.desconectar();
		dados.setText(s);		
	}	
	
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("SysClube");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel painel = new JListarFuncionarioPanel();
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
