package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.components.JSpinField;

import model.DAO;
import net.proteanit.sql.DbUtils;

import com.toedter.components.JLocaleChooser;import com.itextpdf.text.pdf.parser.PdfContentReaderTool;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import javax.swing.JTable;

public class Clientes extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField idcliente;
	private JTextField nomecliente;
	private JTextField Apelidocliente;
	private JTextField cpfcliente;
	private JTextField indentidadecliente;
	private JTextField oecliente;
	private JTextField emailcliente;
	private JTextField sitecliente;
	private JTextField aniversariocliente;
	private JTextField nacionalidadecliente;
	private JTextField naturalidadecliente;
	private JTextField txtcliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes dialog = new Clientes();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Clientes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Clientes.class.getResource("/img/favicon.png")));
		setTitle("Clientes");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 796, 720);
		getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 599, 780, 82);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel btnadicionar = new JLabel("");
		btnadicionar.setIcon(new ImageIcon(Clientes.class.getResource("/img/create.png")));
		btnadicionar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnadicionar.setBounds(608, 11, 64, 64);
		panel.add(btnadicionar);
		
		JLabel btndeletar = new JLabel("");
		btndeletar.setIcon(new ImageIcon(Clientes.class.getResource("/img/delete.png")));
		btndeletar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btndeletar.setBounds(682, 11, 64, 64);
		panel.add(btndeletar);
		
		JLabel btnalterar = new JLabel("New label");
		btnalterar.setIcon(new ImageIcon(Clientes.class.getResource("/img/update.png")));
		btnalterar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnalterar.setBounds(534, 11, 64, 64);
		panel.add(btnalterar);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(21, 183, 46, 14);
		getContentPane().add(lblNewLabel);
		
		idcliente = new JTextField();
		idcliente.setBounds(58, 180, 86, 20);
		getContentPane().add(idcliente);
		idcliente.setColumns(10);
		
		nomecliente = new JTextField();
		nomecliente.setBounds(296, 180, 430, 20);
		getContentPane().add(nomecliente);
		nomecliente.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(253, 183, 57, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apelido:");
		lblNewLabel_2.setBounds(7, 216, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		Apelidocliente = new JTextField();
		Apelidocliente.setBounds(63, 213, 445, 20);
		getContentPane().add(Apelidocliente);
		Apelidocliente.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo:");
		lblNewLabel_3.setBounds(511, 216, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		JComboBox cbogenero = new JComboBox();
		cbogenero.setModel(new DefaultComboBoxModel(new String[] {"", "masculino", "feminino"}));
		cbogenero.setBounds(567, 212, 186, 22);
		getContentPane().add(cbogenero);
		
		JLabel lblNewLabel_4 = new JLabel("CPF");
		lblNewLabel_4.setBounds(21, 250, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		cpfcliente = new JTextField();
		cpfcliente.setBounds(64, 247, 248, 20);
		getContentPane().add(cpfcliente);
		cpfcliente.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Indentidade:");
		lblNewLabel_5.setBounds(322, 250, 113, 14);
		getContentPane().add(lblNewLabel_5);
		
		indentidadecliente = new JTextField();
		indentidadecliente.setBounds(395, 247, 113, 20);
		getContentPane().add(indentidadecliente);
		indentidadecliente.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Org\u00E3o emissor:");
		lblNewLabel_6.setBounds(518, 245, 96, 25);
		getContentPane().add(lblNewLabel_6);
		
		oecliente = new JTextField();
		oecliente.setBounds(606, 247, 141, 20);
		getContentPane().add(oecliente);
		oecliente.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Outros Documentos:");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7.setBounds(10, 288, 160, 45);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Email:");
		lblNewLabel_8.setBounds(10, 360, 46, 14);
		getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("WebSite:");
		lblNewLabel_9.setBounds(322, 360, 63, 14);
		getContentPane().add(lblNewLabel_9);
		
		emailcliente = new JTextField();
		emailcliente.setBounds(53, 357, 256, 20);
		getContentPane().add(emailcliente);
		emailcliente.setColumns(10);
		
		sitecliente = new JTextField();
		sitecliente.setBounds(395, 357, 352, 20);
		getContentPane().add(sitecliente);
		sitecliente.setColumns(10);
		
		JDateChooser dccliente = new JDateChooser();
		dccliente.setBounds(90, 391, 204, 20);
		getContentPane().add(dccliente);
		
		aniversariocliente = new JTextField();
		aniversariocliente.setBounds(400, 394, 353, 20);
		getContentPane().add(aniversariocliente);
		aniversariocliente.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Nacimento:");
		lblNewLabel_10.setBounds(10, 397, 75, 14);
		getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Aniversario:");
		lblNewLabel_11.setBounds(322, 397, 72, 14);
		getContentPane().add(lblNewLabel_11);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(127, 277, 624, 69);
		getContentPane().add(textArea);
		
		JLabel lblNewLabel_12 = new JLabel("Estado civil:");
		lblNewLabel_12.setBounds(10, 438, 75, 14);
		getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Nacionalidade:");
		lblNewLabel_13.setBounds(304, 441, 96, 14);
		getContentPane().add(lblNewLabel_13);
		
		nacionalidadecliente = new JTextField();
		nacionalidadecliente.setBounds(400, 438, 353, 20);
		getContentPane().add(nacionalidadecliente);
		nacionalidadecliente.setColumns(10);
		
		JComboBox cboec = new JComboBox();
		cboec.setModel(new DefaultComboBoxModel(new String[] {"Indefinido", "casado(a)", "solteiro(a) ", "Namorando"}));
		cboec.setBounds(90, 434, 204, 22);
		getContentPane().add(cboec);
		
		JLabel lblNewLabel_14 = new JLabel("Data Auxiliar:");
		lblNewLabel_14.setBounds(10, 472, 75, 14);
		getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Nota:");
		lblNewLabel_15.setBounds(21, 541, 46, 14);
		getContentPane().add(lblNewLabel_15);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(72, 507, 694, 82);
		getContentPane().add(textArea_1);
		
		JDateChooser dcauxiliar = new JDateChooser();
		dcauxiliar.setBounds(100, 466, 108, 20);
		getContentPane().add(dcauxiliar);
		
		JLabel lblNewLabel_16 = new JLabel("Naturidade");
		lblNewLabel_16.setBounds(239, 472, 73, 14);
		getContentPane().add(lblNewLabel_16);
		
		naturalidadecliente = new JTextField();
		naturalidadecliente.setBounds(304, 469, 448, 20);
		getContentPane().add(naturalidadecliente);
		naturalidadecliente.setColumns(10);
		
		JButton btnpesquisar = new JButton("Buscar");
		btnpesquisar.setBounds(154, 179, 89, 23);
		getContentPane().add(btnpesquisar);
		
		JLabel lblNewLabel_17 = new JLabel("Cliente:");
		lblNewLabel_17.setBounds(21, 22, 46, 14);
		getContentPane().add(lblNewLabel_17);
		
		txtcliente = new JTextField();
		txtcliente.setBounds(72, 19, 694, 20);
		getContentPane().add(txtcliente);
		txtcliente.setColumns(10);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(10, 60, 756, 100);
		getContentPane().add(scrollPane);
	
	
		
	}
}




