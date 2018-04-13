package Aula_IX;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TesteFrame2 extends JFrame {

	private JLabel label;
	private JTextField campoT;
	private JButton botao;
	private JTextField textoNaoEdit;
	private JTextField textoNaoEdit2;
	private JCheckBox boldCheckBox;
	private JCheckBox italicCheckBox;
	private JRadioButton italicRadioButton;
	private JRadioButton boldRadioButton;
	private JRadioButton plainRadioButton;
	private JComboBox combobox;
	private JLabel label2;
	private static final String[] names = {"1", "2", "3"};
	private JList listaCores;
	private static final String[] nomesCores = {"Branco", "Preto", "Azul", "Amarelo", "Vermelho", "Verde", "Rosa"};
	private static final Color[] cores = {Color.WHITE, Color.BLACK, Color.BLUE, Color.YELLOW, Color.RED, Color.GREEN, Color.PINK};
	private JList listaCores2;
	private JList listaCopia;
	private JButton botaoCopia;
		
	
//	private Icon[] icons = {new ImageIcon(getClass().getResource(name[0]))}
	
	
	public TesteFrame2() {
		super("Meu Frame");

		setLayout(new FlowLayout());
		
		label = new JLabel("Escreva seu nome: ");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setVerticalAlignment(SwingConstants.TOP);
		add(label);

		campoT = new JTextField(15);
		campoT.setHorizontalAlignment(SwingConstants.CENTER);
		campoT.setAlignmentY(TOP_ALIGNMENT);
		add(campoT);

		botao = new JButton("Clique Aqui");
		botao.setHorizontalAlignment(SwingConstants.RIGHT);
		botao.setVerticalAlignment(SwingConstants.TOP);
		add(botao);

		OuvidorTexto ouvidorTexto = new OuvidorTexto();
		campoT.addActionListener(ouvidorTexto);

		OuvidorBotao ouvidorBotao = new OuvidorBotao();
		botao.addActionListener(ouvidorBotao);
		
		textoNaoEdit = new JTextField("Testando", 20);
		textoNaoEdit.setFont(new Font("Serif", Font.PLAIN, 14));
		textoNaoEdit.setEditable(false);
		add(textoNaoEdit);
		
		textoNaoEdit2 = new JTextField("Testando", 20);
		textoNaoEdit2.setFont(new Font("Serif", Font.PLAIN, 14));
		textoNaoEdit2.setEditable(false);
		add(textoNaoEdit2);
		
		boldCheckBox = new JCheckBox("Negrito");
		italicCheckBox = new JCheckBox("Italico");
		add(boldCheckBox);
		add(italicCheckBox);
		
		OuvidorCheckBox ouvidorCheckBox = new OuvidorCheckBox();
		boldCheckBox.addItemListener(ouvidorCheckBox);
		italicCheckBox.addItemListener(ouvidorCheckBox);
		
		boldRadioButton = new JRadioButton("Negrito");
		italicRadioButton = new JRadioButton("Italico");
		plainRadioButton = new JRadioButton("Normal");
		add(plainRadioButton);
		add(boldRadioButton);
		add(italicRadioButton);
		
		ButtonGroup grupoRadio = new ButtonGroup();
		grupoRadio.add(boldRadioButton);
		grupoRadio.add(italicRadioButton);
		grupoRadio.add(plainRadioButton);
		
		OuvidorRadioButton ouvidorRadio = new OuvidorRadioButton();
		boldRadioButton.addItemListener(ouvidorRadio);
		italicRadioButton.addItemListener(ouvidorRadio);
		plainRadioButton.addItemListener(ouvidorRadio);
		
		combobox = new JComboBox(names);
		combobox.setMaximumRowCount(3);
		add(combobox);
		
		listaCores = new JList(nomesCores);
		listaCores.setVisibleRowCount(4);
		listaCores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(listaCores));
		
		listaCores.addListSelectionListener(
				new ListSelectionListener() {
					
					public void valueChanged(ListSelectionEvent e) {
						getContentPane().setBackground(cores[listaCores.getSelectedIndex()]);
					}
				}
				);
		listaCores2 = new JList(nomesCores);
		listaCores2.setVisibleRowCount(5);
		listaCores2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(listaCores2));
		
		botaoCopia = new JButton("Copia >>>");
		
		botaoCopia.addActionListener(
				new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						listaCopia.setListData(listaCores2.getSelectedValues());
					}
				}
				
				);
		add(botaoCopia);
		
		listaCopia = new JList();
		listaCopia.setVisibleRowCount(5);
		listaCopia.setFixedCellWidth(100);
		listaCopia.setFixedCellHeight(15);
		listaCopia.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add(new JScrollPane(listaCopia));
	}

	private class OuvidorTexto implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			String string = "";

			if (event.getSource() == campoT)
				string = String.format("Nome: %s", campoT.getText());

			JOptionPane.showMessageDialog(null, string);
		}
	}

	private class OuvidorBotao implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			JOptionPane.showMessageDialog(TesteFrame2.this,
					String.format("O seu nome é: %s", campoT.getText()));

		}
	}
	private class OuvidorCheckBox implements ItemListener{
		
		public void itemStateChanged(ItemEvent arg0){
			
			Font font = null;
			
			if(boldCheckBox.isSelected() && italicCheckBox.isSelected())
				font = new Font("Arial", Font.BOLD + Font.ITALIC, 14);
			else if(boldCheckBox.isSelected())
				font = new Font("Serif", Font.BOLD, 14);
			else if (italicCheckBox.isSelected())
				font = new Font("Courier New", Font.ITALIC, 14);
			else
				font = new Font("Serif", Font.PLAIN, 14);
			
			textoNaoEdit.setFont(font);
		}
	}
	private class OuvidorRadioButton implements ItemListener{
		
		public void itemStateChanged(ItemEvent arg0){
			
			Font font = null;
			if(boldRadioButton.isSelected())
				font = new Font("Times", Font.BOLD,16);
			else if (italicRadioButton.isSelected())
				font = new Font("Times", Font.ITALIC, 16);
			else 
				font = new Font("Times", Font.PLAIN, 16);
			
			textoNaoEdit2.setFont(font);

		}
	}
	
//	private class OuvidorComboBox implements ItemListener{
//		
//		public void itemStateChanged(ItemEvent e){
//			label2.setIcon(icons[combobox.getSelectedIndex()]);
//			
//		}
//	}
	
}
