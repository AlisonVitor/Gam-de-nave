import java.awt.Button;
import java.awt.Frame;

import javax.swing.JFrame;

import meujogo.Modelo.Fase;

public class Container extends JFrame {

	public Container() {
		add (new Fase());
		setTitle("meu jogo");
		setSize(1024, 728);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new Container();
	}
	
	}

