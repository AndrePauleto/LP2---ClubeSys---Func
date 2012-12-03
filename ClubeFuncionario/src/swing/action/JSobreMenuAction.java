package swing.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class JSobreMenuAction extends AbstractAction{

	private JFrame frame;
	public JSobreMenuAction(JFrame frame) {
		super("Sobre");
		this.frame = frame;
		putValue(SHORT_DESCRIPTION, "Sobre a aplicação.");
	}
	@Override
	public void actionPerformed(ActionEvent e) {		
		JOptionPane.showMessageDialog(frame, "SysClube.\n(c) 2012 André Pauleto Mello \n Versão: 1.0", "Sobre...", JOptionPane.INFORMATION_MESSAGE);		
	}
	
}
