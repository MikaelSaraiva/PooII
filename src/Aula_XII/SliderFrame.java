package Aula_XII;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderFrame extends JFrame {
	private JSlider diameterJSlider; // slider para selecionar o diametro
	private JSlider verticalSlider;
	private OvalPanel myPanel; // panel para desenhar circulo
	private RectPanel retangulo;
	
	// constructor
	public SliderFrame() {
		super("Slider Demo");
		myPanel = new OvalPanel(); // criar panel para desenhar circulo
		myPanel.setBackground(Color.BLUE); // set background amarelo
		retangulo = new RectPanel();

		// configura o JSlider para controlar o valor do diametro
		//new Slider (orientacao, minimo, maximo, valorInicial)
		diameterJSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 100);
		myPanel.setDiameter(100);
		diameterJSlider.setMajorTickSpacing(10); // criar tick cada 10
		diameterJSlider.setPaintTicks(true);// pinta marcas de medida no controle deslizante
									
		// registra o ouvinte do evento do JSlider
		diameterJSlider.addChangeListener(new ChangeListener() // classe anonima interna
				{
					// trata da alterao de valor do controle deslizante
					public void stateChanged(ChangeEvent e) {
						myPanel.setDiameter(diameterJSlider.getValue()); //retorna posicao do marcador
					} // fim do metodo stateChanged
				} // fim da classe anonima
				); // fim da chamada a addChangeListener

		add(diameterJSlider, BorderLayout.SOUTH); // adicionar slider ao frame
		add(myPanel); // adicionar panel ao frame
//		
//		verticalSlider = new JSlider(SwingConstants.VERTICAL, 0, 200, 100);
//		retangulo.setDiameter(100);
//		verticalSlider.setMajorTickSpacing(10);
//		verticalSlider.setPaintTicks(true);
//		verticalSlider.addChangeListener(new ChangeListener() // classe anonima interna
//		{
//			// trata da alterao de valor do controle deslizante
//			public void stateChanged(ChangeEvent e) {
//				retangulo.setDiameter(diameterJSlider.getValue()); //retorna posicao do marcador
//			} // fim do metodo stateChanged
//		} // fim da classe anonima
//		); // fim da chamada a addChangeListener
//		add(verticalSlider, BorderLayout.EAST);
//		add(retangulo);
		
	} // fim do construtor SliderFrame

	public static void main(String[] args) {
		SliderFrame sliderFrame = new SliderFrame();
		sliderFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		sliderFrame.setSize( 500, 500 ); // configura o tamanho do frame
		sliderFrame.setVisible( true ); // exibe o frame
	}

}
