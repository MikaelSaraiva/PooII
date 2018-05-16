package Exercicio_2;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Reconhecimento {

//	FileReader fileReader = new FileReader("PooII/src/Exercicio_2/Pangramas.txt");
	String[] teclas;
	
	public Reconhecimento(String[] teclas) {
		this.teclas = teclas;
	}
	
	public void tc(KeyEvent e, JButton[] buttons, Color color) {
		JButton button = null;
		int key = e.getKeyCode();
		char c = e.getKeyChar();
		
		System.out.printf("Tecla: \"%c\"\n", c);
		
		button = buttons[Arrays.asList(teclas).indexOf(String.valueOf(c))];
		
//		
//		switch (key) {
//		case KeyEvent.VK_DEAD_TILDE:
//			button = buttons;
//			break;
//		case KeyEvent.VK_1:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_2:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_3:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_4:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_5:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_6:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_7:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_8:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_9:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_0:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_MINUS:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_EQUALS:
//			if ((e.getModifiers() & KeyEvent.SHIFT_MASK) > 0) {
//				button = buttons;
//			}
//			break;
//
//		case KeyEvent.VK_BACK_SPACE:
//			button = buttons;
//			break;
//
//		// TODO Eventos da segunda linha de botoes
//		case KeyEvent.VK_TAB:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_Q:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_W:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_E:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_R:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_T:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_Y:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_U:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_I:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_O:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_P:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_OPEN_BRACKET:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_CLOSE_BRACKET:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_SLASH:
//			if ((e.getModifiers() & KeyEvent.SHIFT_MASK) > 0) {
//				button = buttons;
//			} else {
//				button = buttons;
//			}
//			break;
//
//		// TODO Eventos da terceira linha
//		case KeyEvent.VK_CAPS_LOCK:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_A:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_S:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_D:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_F:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_G:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_H:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_J:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_K:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_L:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_SEMICOLON:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_QUOTE:
//			if ((e.getModifiers() & KeyEvent.SHIFT_MASK) > 0)
//				button = buttons;
//			break;
//
//		case KeyEvent.VK_ENTER:
//			button = buttons;
//			break;
//
//		// TODO Eventos da quarta linha de botoes
//		case KeyEvent.VK_SHIFT:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_Z:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_X:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_C:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_V:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_B:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_N:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_M:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_COMMA:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_PERIOD:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_UP:
//			button = buttons;
//			break;
//
//		// TODO Eventos da quinta linha de botoes
//		case KeyEvent.VK_SPACE:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_LEFT:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_DOWN:
//			button = buttons;
//			break;
//
//		case KeyEvent.VK_RIGHT:
//			button = buttons;
//			break;
//		default:
//			e.consume();
//			JOptionPane.showMessageDialog(null, "Tecla invalida");
//		}

		if (button != null) {
			button.setBackground(color);
		}
	}
	
//	Comparo input a linha de texto que eu tenho
}
