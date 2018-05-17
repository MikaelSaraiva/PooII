package Exercicio_2;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;

public class Reconhecimento {
	private int acertos;
	private int erros;
	String[] teclas;
	String texto;

	public Reconhecimento() {
		geraTexto();
	}

	public Reconhecimento(String[] teclas) {
		this.teclas = teclas;
	}

	public String geraTexto() {
		ArrayList<String> linhas = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(
				this.getClass().getResource("pangramas.txt").getFile()))) {
			while (true) {
				String linha = reader.readLine();
				if (linha == null) {
					break;
				}
				linhas.add(linha);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		texto = linhas.get(new Random().nextInt(linhas.size()));

		return texto;
	}

	public String getTexto() {
		return texto;
	}

	public boolean tc(KeyEvent e, JButton[] buttons, Color color) {
		int key = e.getKeyCode();
		String c = String.valueOf(e.getKeyChar()).toUpperCase();
		boolean deuCerto = false;

		switch (key) {
		case KeyEvent.VK_SHIFT:
			c = "Shift";
			break;
		case KeyEvent.VK_BACK_SPACE:
			c = "Backspace";
			break;
		case KeyEvent.VK_ENTER:
			e.consume();
			c = "Enter";
			deuCerto = true;
			break;
		case KeyEvent.VK_UP:
			c = "/\\";
			break;
		case KeyEvent.VK_DOWN:
			c = "\\/";
			break;
		case KeyEvent.VK_LEFT:
			c = "<";
			break;
		case KeyEvent.VK_RIGHT:
			c = ">";
			break;
		case KeyEvent.VK_CAPS_LOCK:
			c = "Caps";
			break;
		case KeyEvent.VK_TAB:
			c = "Tab";
			break;
		case KeyEvent.VK_SPACE:
			c = " ";
			break;
		case KeyEvent.VK_DEAD_TILDE:
			c = "~";
			break;
		default:
		}

		int index = Arrays.asList(teclas).indexOf(c);
		if (index != -1) {
			if (buttons[index].getText().equals(c)) {
				buttons[index].setBackground(color);
				deuCerto = true;
			} else {
				System.out.println("Deu merda");
			}
		}

		return deuCerto;
	}

	public int[] precisao(String digitado, KeyEvent e) {
		int key = e.getKeyCode();
		char tecla = e.getKeyChar();

		if (digitado.length() < texto.length() &&
				tecla == texto.charAt(digitado.length())) {
			acertos++;
		} else {
			switch (key) {
			case KeyEvent.VK_SHIFT:
			case KeyEvent.VK_DEAD_TILDE:
			case KeyEvent.VK_BACK_SPACE:
			case KeyEvent.VK_ENTER:
			case KeyEvent.VK_UP:
			case KeyEvent.VK_LEFT:
			case KeyEvent.VK_RIGHT:
			case KeyEvent.VK_DOWN:
			case KeyEvent.VK_ALT:
			case KeyEvent.VK_CONTROL:
			case KeyEvent.VK_CAPS_LOCK:
				break;
			default:
				erros++;
			}
		}

		return new int[] { acertos, erros };
	}
	
	public void setAcertosErros(int acertos, int erros) {
		this.acertos = acertos;
		this.erros = erros;
	}

	public void salvar(String digitado) {
		try (ObjectOutputStream writer = new ObjectOutputStream(
				new FileOutputStream("digitado.txt"))) {
			writer.writeObject(digitado);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String carrega() throws IOException, ClassNotFoundException {
		try (ObjectInputStream reader = new ObjectInputStream(
				new FileInputStream("digitado.txt"))) {
			return (String) reader.readObject();
		}
	}

	// Comparo input a linha de texto que eu tenho
}
