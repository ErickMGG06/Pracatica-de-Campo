package Mascotas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblAos;
	private JLabel lblAnimal;
	private JLabel lblAnimal_1;
	private JTextField txtDueño;
	private JTextField txtNombreMasc;
	private JTextField txtAños;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton;
	private JComboBox <String> cbAnimal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Nombre de la mascota:");
			lblNewLabel.setBounds(12, 38, 183, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblAos = new JLabel("Años:");
			lblAos.setBounds(12, 63, 183, 14);
			contentPane.add(lblAos);
		}
		{
			lblAnimal = new JLabel("Animal:");
			lblAnimal.setBounds(12, 88, 131, 14);
			contentPane.add(lblAnimal);
		}
		{
			lblAnimal_1 = new JLabel("Dueño:");
			lblAnimal_1.setBounds(12, 13, 131, 14);
			contentPane.add(lblAnimal_1);
		}
		{
			txtDueño = new JTextField();
			txtDueño.setBounds(153, 10, 143, 20);
			contentPane.add(txtDueño);
			txtDueño.setColumns(10);
		}
		{
			txtNombreMasc = new JTextField();
			txtNombreMasc.setColumns(10);
			txtNombreMasc.setBounds(153, 35, 143, 20);
			contentPane.add(txtNombreMasc);
		}
		{
			txtAños = new JTextField();
			txtAños.setColumns(10);
			txtAños.setBounds(153, 60, 143, 20);
			contentPane.add(txtAños);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 126, 401, 124);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(324, 59, 89, 23);
			contentPane.add(btnNewButton);
		}
		{
			cbAnimal = new JComboBox<>();
			cbAnimal.setModel(new DefaultComboBoxModel<>(new String[] {"Perro", "Gato"}));
			cbAnimal.setBounds(153, 84, 143, 22);
			contentPane.add(cbAnimal);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		String nom = txtDueño.getText();
		int años = Integer.parseInt(txtAños.getText());
		String nombreMas = txtNombreMasc.getText();
		String animal =cbAnimal.getSelectedItem().toString();
		Can can = new Can(nom, nombreMas, animal, años);
		txtS.setText("");
		Listado(can);
	}
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	void Listado(Can c) {
		
		Imprimir("Dueño\tMascota\tAños\tAnimal");
		Imprimir(""+ c.getNombre()+"\t"+c.getNombreMas()+"\t"+c.getAños()+"\t"+c.getAnimal());
		
		if(c.getAños()<=2) {
			Imprimir("Cachorro");
		}
	}
}
