package visual;
import modelo.Persona;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class panelCrear extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtNacimiento;
	private JTextField txtDni;

	/**
	 * Create the panel.
	 */
	public panelCrear() {
		setBackground(new Color(189, 171, 211));
		setLayout(null);
		
		
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(44, 42, 106, 14);
		add(lblNombre);
		
		JLabel lblNacimiento = new JLabel("Nacimiento:");
		lblNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNacimiento.setBounds(44, 86, 106, 14);
		add(lblNacimiento);
		
		JLabel lblEstudios = new JLabel("Estudios:\r\n");
		lblEstudios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEstudios.setBounds(44, 168, 106, 14);
		add(lblEstudios);
		
		JCheckBox cbHijos = new JCheckBox("Hijos");
		cbHijos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbHijos.setBackground(new Color(189, 171, 211));
		cbHijos.setBounds(138, 201, 97, 23);
		add(cbHijos);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			
			}
		});
		
		
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGuardar.setBounds(138, 231, 106, 33);
		add(btnGuardar);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNombre.setBounds(138, 38, 106, 23);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtNacimiento = new JTextField();
		txtNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNacimiento.setColumns(10);
		txtNacimiento.setBounds(138, 82, 106, 23);
		add(txtNacimiento);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(138, 166, 106, 22);
		add(comboBox);
		
		JLabel txtdni = new JLabel("DNI:");
		txtdni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtdni.setBounds(44, 127, 106, 14);
		add(txtdni);
		
		txtDni = new JTextField();
		txtDni.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtDni.setColumns(10);
		txtDni.setBounds(138, 123, 106, 23);
		add(txtDni);

		
	}
	public Persona capturarDatos() {
		String nombre = txtNombre.getText();
		String nacimiento = txtNombre.getText();
		Long dni = Long.valueOf(txtDni.getText());
		boolean tienehijos = 
	}
}
