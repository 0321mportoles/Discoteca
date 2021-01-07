package misAlbums;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import DI2021.Discoteca.models.Album;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MisAlbums {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MisAlbums window = new MisAlbums();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MisAlbums() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(43, 43, 48, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Año");
		lblNewLabel_1.setBounds(43, 81, 48, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Artista");
		lblNewLabel_2.setBounds(43, 118, 48, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Formato");
		lblNewLabel_3.setBounds(43, 157, 48, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Album");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(184, 11, 48, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_Nombre = new JLabel("New label");
	//	lblNewLabel_Nombre = Album.getNombre();
		lblNewLabel_Nombre.setBounds(127, 43, 48, 14);
		frame.getContentPane().add(lblNewLabel_Nombre);

		
		JLabel lblNewLabel_Anno = new JLabel("New label");
		lblNewLabel_Anno.setBounds(127, 81, 48, 14);
		frame.getContentPane().add(lblNewLabel_Anno);
		//	lblNewLabel_Anno = Album.getAnno();
		
		JLabel lblNewLabel_Artista = new JLabel("New label");
		lblNewLabel_Artista.setBounds(127, 118, 48, 14);
		frame.getContentPane().add(lblNewLabel_Artista);
		//lblNewLabel_Artista = Album.this.getArtista();
		
		JRadioButton Vinilo = new JRadioButton("Vinilo");
		Vinilo.setBounds(127, 153, 109, 23);
		frame.getContentPane().add(Vinilo);
		
		JRadioButton CD = new JRadioButton("CD");
		CD.setBounds(127, 179, 109, 23);
		frame.getContentPane().add(CD);
		
		JRadioButton Casete = new JRadioButton("Casette");
		Casete.setBounds(127, 207, 109, 23);
		frame.getContentPane().add(Casete);
		
		final ButtonGroup formato = new ButtonGroup();
		formato.add(Vinilo);
		formato.add(CD);
		formato.add(Casete);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] options = {"Salir", "Cancelar"};
				int m = JOptionPane.showOptionDialog(frame, "¿Está seguro que quiere salir de la aplicación?", "Salir del programa", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
				if (m == 0) {
					System.exit(0);
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(335, 9, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Anterior");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	if ()
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//if()
			}
		});
		btnNewButton_1.setBounds(235, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Siguiente");
		btnNewButton_2.setBounds(323, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
