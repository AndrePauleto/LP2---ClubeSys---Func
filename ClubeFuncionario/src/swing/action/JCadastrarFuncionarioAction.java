package swing.action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Funcionario;
import dao.FuncionarioDAO;

public class JCadastrarFuncionarioAction extends AbstractAction{

	private static final long serialVersionUID = 1L;
	private JPanel principal;
	private CardLayout cards;

	private JTextField txtNome;
	private JTextField txtMorada;
	private JTextField txtIdade;
	private JTextField txtUsuario;
	private JTextField txtSenha;
	private String nome;
	private String morada;
	private int idade;
	private String login;
	private String senha;

	public JCadastrarFuncionarioAction(JPanel principal, CardLayout cards,
			JTextField txtNome, JTextField txtMorada, JTextField txtIdade, JTextField txtUsuario, JTextField txtSenha) {
		super("Cadastrar");
		this.principal = principal;
		this.cards = cards;
		this.txtNome = txtNome;
		this.txtMorada = txtMorada;
		this.txtIdade = txtIdade;
		this.txtUsuario = txtUsuario;
		this.txtSenha = txtSenha;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		//try {
			getCampos();

			System.out.println("Nome: " + nome);
			System.out.println("Morada: " + morada);
			System.out.println("Idade: " + idade);
			System.out.println("Login: " + login);
			System.out.println("Senha: " + senha);
			
			System.out.println("Nome: " + txtNome);
			System.out.println("Morada: " + txtMorada);
			System.out.println("Idade: " + txtIdade);
			System.out.println("Login: " + txtUsuario);
			System.out.println("Senha: " + txtSenha);
			
			FuncionarioDAO funcDao = new FuncionarioDAO();
			funcDao.conectar();
			System.out.println("Conectou");
			Funcionario func = new Funcionario(1, nome, morada, idade, login, senha);
			System.out.println(func);
			
			funcDao.insert(func);
			
			funcDao.desconectar();
			
			
			/*FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
			System.out.println("Instanciou DAOFunc");
			funcionarioDAO.conectar();
			System.out.println("Conectou");
			Funcionario f = new Funcionario(1, nome, morada, idade,
					login, senha);
			System.out.println("Instanciou Funcionario");
			System.out.println("");
			System.out.println(f);
			funcionarioDAO.insert(f);
			System.out.println("Inseriu");
			funcionarioDAO.desconectar();*/

			limpaCampos();

			JOptionPane.showMessageDialog(null,
					"Funcionário Cadastrado com Sucesso", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);

		/*} catch (Exception e2) {

			JOptionPane.showMessageDialog(null,
					"Não foi possível cadastrar funcionário", "Error",
					JOptionPane.ERROR_MESSAGE);
		}*/

	}
	
	private void getCampos() {
		nome = txtNome.getText();
		morada = txtMorada.getText();
		idade = Integer.parseInt(txtIdade.getText());
		login = txtUsuario.getText();
		senha = txtSenha.getText();
	}

	private void limpaCampos() {
		txtNome.setText("");
		txtMorada.setText("");
		txtIdade.setText("");
		txtUsuario.setText("");
		txtSenha.setText("");
	}
}
