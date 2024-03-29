package swing.action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class JCadastrarMenuAction extends AbstractAction{
	public static final String CADASTRAR = "CADASTRAR";

	private JPanel principal;
	private CardLayout cards;
	
	public JCadastrarMenuAction(JPanel principal, CardLayout cards) {
		super("Cadastrar");
		this.principal = principal;
		this.cards = cards;
	}
	public void actionPerformed(ActionEvent e) {
		cards.show(principal, CADASTRAR);
	}
}
