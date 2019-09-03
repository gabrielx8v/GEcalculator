package pacoteprincipal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GEcalculator {

	private JFrame frmCalculadoraDePfs;
	private JTextField valorP1;
	private JTextField valorP2;
	private JTextField valorP3;
	private JTextField valorP4;
	private JTextField valorP5;
	private JTextField txtTotal;
	private int PFposadc = 0;
	private int posadc = 6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GEcalculator window = new GEcalculator();
					window.frmCalculadoraDePfs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GEcalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraDePfs = new JFrame();
		frmCalculadoraDePfs.setTitle("Calculadora de PFs em GEs");
		frmCalculadoraDePfs.setBounds(100, 100, 450, 300);
		frmCalculadoraDePfs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraDePfs.getContentPane().setLayout(null);
		
		JCheckBox chbP1 = new JCheckBox("");
		chbP1.setBounds(48, 72, 21, 23);
		frmCalculadoraDePfs.getContentPane().add(chbP1);
		
		JCheckBox chbP2 = new JCheckBox("");
		chbP2.setBounds(48, 99, 21, 23);
		frmCalculadoraDePfs.getContentPane().add(chbP2);
		
		JCheckBox chbP3 = new JCheckBox("");
		chbP3.setBounds(48, 126, 21, 23);
		frmCalculadoraDePfs.getContentPane().add(chbP3);
		
		JCheckBox chbP4 = new JCheckBox("");
		chbP4.setBounds(48, 153, 21, 23);
		frmCalculadoraDePfs.getContentPane().add(chbP4);
		
		JCheckBox chbP5 = new JCheckBox("");
		chbP5.setBounds(48, 180, 21, 23);
		frmCalculadoraDePfs.getContentPane().add(chbP5);
		
		JTextPane txtpnValorFixo = new JTextPane();
		txtpnValorFixo.setBackground(UIManager.getColor("Button.background"));
		txtpnValorFixo.setText("valor fixo");
		txtpnValorFixo.setBounds(12, 41, 62, 23);
		frmCalculadoraDePfs.getContentPane().add(txtpnValorFixo);
		
		valorP1 = new JTextField();
		valorP1.setText("0");
		valorP1.setBounds(81, 72, 95, 19);
		frmCalculadoraDePfs.getContentPane().add(valorP1);
		valorP1.setColumns(10);
		
		valorP2 = new JTextField();
		valorP2.setText("0");
		valorP2.setBounds(81, 99, 95, 19);
		frmCalculadoraDePfs.getContentPane().add(valorP2);
		valorP2.setColumns(10);
		
		valorP3 = new JTextField();
		valorP3.setText("0");
		valorP3.setBounds(81, 130, 95, 19);
		frmCalculadoraDePfs.getContentPane().add(valorP3);
		valorP3.setColumns(10);
		
		valorP4 = new JTextField();
		valorP4.setText("0");
		valorP4.setBounds(81, 157, 95, 19);
		frmCalculadoraDePfs.getContentPane().add(valorP4);
		valorP4.setColumns(10);
		
		valorP5 = new JTextField();
		valorP5.setText("0");
		valorP5.setBounds(81, 184, 95, 19);
		frmCalculadoraDePfs.getContentPane().add(valorP5);
		valorP5.setColumns(10);
		
		JTextPane txtpnValorPosio = new JTextPane();
		txtpnValorPosio.setText("valor posição");
		txtpnValorPosio.setBackground(UIManager.getColor("Button.background"));
		txtpnValorPosio.setBounds(86, 41, 90, 23);
		frmCalculadoraDePfs.getContentPane().add(txtpnValorPosio);
		
		txtTotal = new JTextField();
		txtTotal.setText("0");
		txtTotal.setBounds(81, 12, 95, 19);
		frmCalculadoraDePfs.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JTextPane txtpnValorTotal = new JTextPane();
		txtpnValorTotal.setText("valor total");
		txtpnValorTotal.setBackground(UIManager.getColor("Button.background"));
		txtpnValorTotal.setBounds(12, 12, 70, 23);
		frmCalculadoraDePfs.getContentPane().add(txtpnValorTotal);
		
		JTextPane txtpnP = new JTextPane();
		txtpnP.setText("P1");
		txtpnP.setBackground(UIManager.getColor("Button.background"));
		txtpnP.setBounds(12, 72, 28, 23);
		frmCalculadoraDePfs.getContentPane().add(txtpnP);
		
		JTextPane txtpnP_1 = new JTextPane();
		txtpnP_1.setText("P2");
		txtpnP_1.setBackground(UIManager.getColor("Button.background"));
		txtpnP_1.setBounds(12, 99, 28, 23);
		frmCalculadoraDePfs.getContentPane().add(txtpnP_1);
		
		JTextPane txtpnP_2 = new JTextPane();
		txtpnP_2.setText("P3");
		txtpnP_2.setBackground(UIManager.getColor("Button.background"));
		txtpnP_2.setBounds(12, 126, 28, 23);
		frmCalculadoraDePfs.getContentPane().add(txtpnP_2);
		
		JTextPane txtpnP_3 = new JTextPane();
		txtpnP_3.setText("P4");
		txtpnP_3.setBackground(UIManager.getColor("Button.background"));
		txtpnP_3.setBounds(12, 153, 28, 23);
		frmCalculadoraDePfs.getContentPane().add(txtpnP_3);
		
		JTextPane txtpnP_4 = new JTextPane();
		txtpnP_4.setText("P5");
		txtpnP_4.setBackground(UIManager.getColor("Button.background"));
		txtpnP_4.setBounds(12, 180, 28, 23);
		frmCalculadoraDePfs.getContentPane().add(txtpnP_4);
		
		JTextPane txtDeposite = new JTextPane();
		txtDeposite.setBackground(UIManager.getColor("Button.background"));
		txtDeposite.setBounds(12, 208, 390, 23);
		frmCalculadoraDePfs.getContentPane().add(txtDeposite);
		
		JTextPane txtSomaDasPosies = new JTextPane();
		txtSomaDasPosies.setText("");
		txtSomaDasPosies.setBackground(UIManager.getColor("Button.background"));
		txtSomaDasPosies.setBounds(285, 99, 159, 36);
		frmCalculadoraDePfs.getContentPane().add(txtSomaDasPosies);
		
		JTextPane txtUltimaP = new JTextPane();
		txtUltimaP.setBackground(UIManager.getColor("Button.background"));
		txtUltimaP.setBounds(285, 72, 149, 23);
		frmCalculadoraDePfs.getContentPane().add(txtUltimaP);
		
		JButton btnAdicionarPosio = new JButton("Adicionar posição");
		btnAdicionarPosio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String valorP = JOptionPane.showInputDialog(null, "Digite o valor da posição adcional "+ posadc);
				PFposadc += Integer.parseInt(valorP);
				txtSomaDasPosies.setText("Soma das posições adicionais: " + PFposadc);
				txtUltimaP.setText("P" + posadc + ": " + valorP);
				posadc += 1;
			}
		});
		btnAdicionarPosio.setBounds(275, 41, 159, 25);
		frmCalculadoraDePfs.getContentPane().add(btnAdicionarPosio);
		
		JTextPane P1 = new JTextPane();
		P1.setBackground(UIManager.getColor("Button.background"));
		P1.setBounds(188, 72, 90, 23);
		frmCalculadoraDePfs.getContentPane().add(P1);
		
		JTextPane P2 = new JTextPane();
		P2.setBackground(UIManager.getColor("Button.background"));
		P2.setBounds(188, 99, 90, 23);
		frmCalculadoraDePfs.getContentPane().add(P2);
		
		JTextPane P3 = new JTextPane();
		P3.setBackground(UIManager.getColor("Button.background"));
		P3.setBounds(188, 126, 90, 23);
		frmCalculadoraDePfs.getContentPane().add(P3);
		
		JTextPane P4 = new JTextPane();
		P4.setBackground(UIManager.getColor("Button.background"));
		P4.setBounds(188, 153, 90, 23);
		frmCalculadoraDePfs.getContentPane().add(P4);
		
		JTextPane P5 = new JTextPane();
		P5.setBackground(UIManager.getColor("Button.background"));
		P5.setBounds(188, 180, 90, 23);
		frmCalculadoraDePfs.getContentPane().add(P5);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int valorpos = 0;
				
				if(chbP1.isSelected()) {
					valorpos += Integer.parseInt(valorP1.getText());
					P1.setText(valorP1.getText());
				}else {
					valorpos += Math.ceil((Integer.parseInt(valorP1.getText()) * 1.9));
					P1.setText("" + Math.ceil((Integer.parseInt(valorP1.getText()) * 1.9)));
				}
				
				if(chbP2.isSelected()) {
					valorpos += Integer.parseInt(valorP2.getText());
					P2.setText(valorP2.getText());
				}else {
					valorpos += Math.ceil((Integer.parseInt(valorP2.getText()) * 1.9));
					P2.setText("" + Math.ceil((Integer.parseInt(valorP2.getText()) * 1.9)));
				}
				
				if(chbP3.isSelected()) {
					valorpos += Integer.parseInt(valorP3.getText());
					P3.setText(valorP3.getText());
				}else {
					valorpos += Math.ceil((Integer.parseInt(valorP3.getText()) * 1.9));
					P3.setText("" + Math.ceil((Integer.parseInt(valorP3.getText()) * 1.9)));
				}
				
				if(chbP4.isSelected()) {
					valorpos += Integer.parseInt(valorP4.getText());
					P4.setText(valorP4.getText());
				}else {
					valorpos += Math.ceil((Integer.parseInt(valorP4.getText()) * 1.9));
					P4.setText("" + Math.ceil((Integer.parseInt(valorP4.getText()) * 1.9)));
				}
				
				if(chbP5.isSelected()) {
					valorpos += Integer.parseInt(valorP5.getText());
					P5.setText(valorP5.getText());
				}else {
					valorpos += Math.ceil((Integer.parseInt(valorP5.getText()) * 1.9));
					P5.setText("" + Math.ceil((Integer.parseInt(valorP5.getText()) * 1.9)));
				}
				
				int depos = Integer.parseInt(txtTotal.getText()) - valorpos - PFposadc;
				txtDeposite.setText("deposite " + depos + " PFs para virar seu GE.");
			}
		});
		btnCalcular.setBounds(34, 230, 117, 25);
		frmCalculadoraDePfs.getContentPane().add(btnCalcular);
		
	}
}
