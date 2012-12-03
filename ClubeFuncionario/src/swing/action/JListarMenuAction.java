package swing.action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JPanel;

public class JListarMenuAction extends AbstractAction{

	private static final long serialVersionUID = 1L;

	public static final String LISTAR = "LISTAR";

	private JPanel principal;
	private CardLayout cards;
	
	public JListarMenuAction(JPanel principal, CardLayout cards) {
		super("Listar");
		this.principal = principal;
		this.cards = cards;
	}
	public void actionPerformed(ActionEvent e) {
		cards.show(principal, LISTAR);
	}
}
