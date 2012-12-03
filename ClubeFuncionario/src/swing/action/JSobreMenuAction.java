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
		putValue(SHORT_DESCRIPTION, "Sobre a aplica��o.");
	}
	@Override
	public void actionPerformed(ActionEvent e) {		
		JOptionPane.showMessageDialog(frame, "SysClube.\n(c) 2012 Andr� Pauleto Mello \n Vers�o: 1.0", "Sobre...", JOptionPane.INFORMATION_MESSAGE);		
	}
	
}
