/**
 * @(#)Ventana.java
 *
 *
 * @author Irma Meza & David Galindo & Laura Peralta
 * @version 1.00 2014/6/2
 */
 
 //__________PAQUETES___________
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


class Ventana extends WindowAdapter implements ActionListener  {
	
	
	int entrada, estado, energia,salida;
	//________________________________________::ATRIBUTOS::_______________________________________
	Peleador mono = new Peleador();
	
	//Frame Principal
	Frame f_principal, f_llorar, f_gesto, f_perder, f_nula, f_grito, f_sangre, f_salto,f_fuerte, f_caer;
	Button b_patadacuerpo, b_patadacara, b_upercut, b_gancho, b_recto,b_jab, b_codazo, b_cabezazo, b_rodillazo, b_vidas, b_iniciar;//bonotes o acciones del peleador
	Label l_estado,l_entrada, l_energia, l_msj, l_entrada2, l_caer, l_fuerte, l_gesto, l_gritar, l_llorar, l_nada, l_perder, l_saltar, l_sangrar;
	TextField tf_estado, tf_entrada, tf_energia;
	//dialogo salida
	Dialog d_salida;
	
	//imagenes
	BufferedImage imagen; 
	JLabel imgLabel;

	//________________________________________::CONSTRUCTOR::______________________________________________
    public Ventana() throws IOException {
    	//frame llorar
    	f_llorar=new Frame("llorar");
    	l_llorar = new Label("ho, está llorando");
		l_llorar.setFont(new Font("Serif", Font.BOLD,20));
    	
    	    	//frame gesto
    	f_gesto=new Frame("Gesto");
    	l_gesto = new Label("hace un gesto");
		l_gesto.setFont(new Font("Serif", Font.BOLD,20));
    
		    	//frame perder
    	f_perder=new Frame("Fin del juego");
    	l_perder = new Label("suerte para la proxima");
		l_perder.setFont(new Font("Serif", Font.BOLD,20));
		imagen = ImageIO.read(new File("sangrar.jpg"));
		imgLabel = new JLabel(new ImageIcon(imagen));
    
		    	//frame caer
    	f_caer=new Frame("Se cayó");
    	l_caer = new Label("Se ha caído");
		l_caer.setFont(new Font("Serif", Font.BOLD,20));
    	
		    	//frame nada
    	f_nula=new Frame("No hace nada");
    	l_nada = new Label("No hay respuesta");
		l_nada.setFont(new Font("Serif", Font.BOLD,20));
    	
		    	//frame grito
    	f_grito=new Frame("Esta gritando");
    	l_gritar = new Label("Da un fuerte grito");
		l_gritar.setFont(new Font("Serif", Font.BOLD,20));
    	
		
		//frame sangre
    	f_sangre=new Frame("Esta sangrando");
    	l_sangrar = new Label("oh no, \n está sangrando");
		l_sangrar.setFont(new Font("Serif", Font.BOLD,20));
    
		//frame salto
    	f_salto=new Frame("Da un brinco");
    	l_saltar = new Label("Da un salto \n hacia atrás");
		l_saltar.setFont(new Font("Serif", Font.BOLD,20));
		//frame grito
    	f_fuerte=new Frame("Se pone fuerte");
    	l_fuerte = new Label("Energía +5");
		l_fuerte.setFont(new Font("Serif", Font.BOLD,20));
    	
    	//Frame principal____________________________________________________
    	f_principal=new Frame("Maquina de Estados");
    	
    	l_msj = new Label("Vamos a pelear C=");
		l_msj.setFont(new Font("Serif", Font.BOLD,20));
		
		l_entrada2 = new Label("Golpea: ");
		l_entrada2.setFont(new Font("Serif", Font.BOLD,20));
		
		
		l_entrada = new Label("Entrada: ");
		l_entrada.setFont(new Font("Serif", Font.BOLD,20));
		tf_entrada = new TextField(10);
		
		
		l_estado = new Label("Estado: ");
		l_estado.setFont(new Font("Serif", Font.BOLD,20));
		tf_estado = new TextField(10);
		
		l_energia = new Label("Energia: ");
		l_energia.setFont(new Font("Serif", Font.BOLD,20));
		tf_energia = new TextField(10);
		
		b_iniciar  = new Button("Iniciar");
    	b_patadacuerpo  = new Button("Patada al cuerpo");
    	b_jab  = new Button("Jab");
    	b_jab  = new Button("Jab");
    	b_patadacara  = new Button("patala a la cara");
    	b_upercut  = new Button("UperCut");
    	b_gancho = new Button("Gancho");
    	b_recto  = new Button("Recto");
    	b_codazo  = new Button("Codazo");
    	b_cabezazo  = new Button("Cabezazo");
    	b_rodillazo  = new Button("Rodillazo");
    	b_vidas  = new Button("+Energy");
    	
    	//d_Salida = new Dialog("Salida");
    	
    }//fin constructor
    
    //_________________________MOSTRAR MARCO_____________________________________________________
    public void MostrarMarco(){
    	//salida llorar
    	f_llorar.setLayout(new FlowLayout(FlowLayout.CENTER));
    	f_llorar.add(l_llorar);
    	f_llorar.setBounds(400, 200, 250, 75);
    	f_llorar.addWindowListener(this);
    	f_llorar.setVisible(false);
    	f_llorar.setResizable(true);
    	
    	//salida gesto
    	f_gesto.setLayout(new FlowLayout(FlowLayout.CENTER));
    	f_gesto.add(l_gesto);
    	f_gesto.setBounds(400, 200, 250, 75);
    	f_gesto.addWindowListener(this);
    	f_gesto.setVisible(false);
    	f_gesto.setResizable(true);
    	
    	//salida perder
    	f_perder.setLayout(new FlowLayout(FlowLayout.CENTER));
    	f_perder.add(l_perder);
    	f_perder.setBounds(400, 200, 250, 325);
    	f_perder.add(imgLabel);
    	f_perder.addWindowListener(this);
    	f_perder.setVisible(false);
    	f_perder.setResizable(true);
    	
    	//salida caer
    	f_caer.setLayout(new FlowLayout(FlowLayout.CENTER));
    	f_caer.add(l_caer);
    	f_caer.setBounds(400, 200, 250, 75);
    	f_caer.addWindowListener(this);
    	f_caer.setVisible(false);
    	f_caer.setResizable(true);
    	
    	//salida nula
    	f_nula.setLayout(new FlowLayout(FlowLayout.CENTER));
    	f_nula.add(l_nada);
    	f_nula.setBounds(400, 200, 250, 75);
    	f_nula.addWindowListener(this);
    	f_nula.setVisible(false);
    	f_nula.setResizable(true);
    	//salida grito
    	f_grito.setLayout(new FlowLayout(FlowLayout.CENTER));
    	f_grito.add(l_gritar);
    	f_grito.setBounds(400, 200, 250, 75);
    	f_grito.addWindowListener(this);
    	f_grito.setVisible(false);
    	f_grito.setResizable(true);
    	//salida sangre
    	f_sangre.setLayout(new FlowLayout(FlowLayout.CENTER));
    	f_sangre.setLayout(new FlowLayout(FlowLayout.CENTER));
    	f_sangre.add(l_sangrar);
    	f_sangre.setBounds(400, 200, 250, 75);
    	f_sangre.addWindowListener(this);
    	f_sangre.setVisible(false);
    	f_sangre.setResizable(true);
    	//salida salto
    	f_salto.setLayout(new FlowLayout(FlowLayout.CENTER));
    	f_salto.add(l_saltar);
    	f_salto.setBounds(400, 200, 250, 75);
    	f_salto.addWindowListener(this);
    	f_salto.setVisible(false);
    	f_salto.setResizable(true);
    	//salida fuerte
    	f_fuerte.setLayout(new FlowLayout(FlowLayout.CENTER));
    	f_fuerte.add(l_fuerte);
    	f_fuerte.setBounds(400, 200, 250, 75);
    	f_fuerte.addWindowListener(this);
    	f_fuerte.setVisible(false);
    	f_fuerte.setResizable(true);
    	
//Frame Principal____________________________________________________________________________________________________________
    	f_principal.setLayout(new FlowLayout(FlowLayout.CENTER));
    	f_principal.add(l_msj);
    	f_principal.add(b_iniciar);
    	b_iniciar.addActionListener(this);
    	f_principal.add(l_energia);
    	f_principal.add(tf_energia);
    	tf_energia.addActionListener(this);
    	f_principal.add(l_entrada);
    	f_principal.add(tf_entrada);
    	tf_entrada.addActionListener(this);
    	f_principal.add(l_estado);
    	f_principal.add(tf_estado);
    	tf_estado.addActionListener(this);
    	f_principal.add(l_entrada2);
    	
    	
    	f_principal.add(b_patadacuerpo);
    	b_patadacuerpo.addActionListener(this);
    	
    	f_principal.add(b_patadacara);
    	b_patadacara.addActionListener(this);
   	
    	
    	f_principal.add(b_upercut);
    	b_upercut.addActionListener(this);
    	
    	f_principal.add(b_gancho);
    	b_gancho.addActionListener(this);
    	
    	f_principal.add(b_recto);
    	b_recto.addActionListener(this);
    	
    	f_principal.add(b_jab);
    	b_jab.addActionListener(this);
    	
    	f_principal.add(b_codazo);
    	b_codazo.addActionListener(this);
    	
    	f_principal.add(b_cabezazo);
    	b_cabezazo.addActionListener(this);
    	
    	f_principal.add(b_rodillazo);
    	b_rodillazo.addActionListener(this);
    	
    	f_principal.add(b_vidas);
    	b_vidas.addActionListener(this);
  	
    	f_principal.addWindowListener(this);//oreja frame principal
    	f_principal.setBounds(400, 30, 250, 325);
		f_principal.setVisible(true);
		f_principal.setResizable(false);
		//iniciarJuego();
    }//fin mostrar marco
    
    
 //___________________________actionPerformed______________________________________    	
    	public void actionPerformed(ActionEvent e) {
    		
//______________________________________________________________________________patadacuerpo 
    		if(e.getSource() == b_patadacuerpo){	
    			entrada=0;
    			if(estado>=0 && estado<20){
    				darSalida();
    				tf_entrada.setText("0");
    				}
    			
    			}//patadacuerpo
    			
//______________________________________________________________________________patadacara    			
    		else if(e.getSource() == b_patadacara){
    			entrada=1;
    			
    			if(estado>=0 && estado<20){
    				darSalida();
    				tf_entrada.setText("1");
    				}
    			
    			
    			}//patadacara
//______________________________________________________________________________upercut
    		else if(e.getSource() == b_upercut){
    			entrada = 2;
    			
    			if(estado>=0 && estado<20){
    				darSalida();
    				tf_entrada.setText("2");
    				}
    			
    			
    			}//upercut
 //______________________________________________________________________________gancho
    		else if(e.getSource() == b_gancho){
    			entrada=3;
    			
    			if(estado>=0 && estado<20){
    				darSalida();
    				tf_entrada.setText("3");
    				}
    			
    			
    			}//gancho
//______________________________________________________________________________recto
    		else if(e.getSource() == b_recto){
    			entrada=4;
    			
    			if(estado>=0 && estado<20){
    				darSalida();
    				tf_entrada.setText("4");
    				}
    			
    			
    			}//jaB
//______________________________________________________________________________jab
    		else if(e.getSource() == b_jab){
    			entrada=5;
    			
    			if(estado>=0 && estado<20){
    				darSalida();
    				tf_entrada.setText("5");
    				}
    			
    			
    			}//jaB
//______________________________________________________________________________codazo
    		else if(e.getSource() == b_codazo){
    			entrada=6;
    			
    			if(estado>=0 && estado<20){
    				darSalida();tf_entrada.setText("6");
    				}
    			
    			
    			}//codazo
//______________________________________________________________________________cabezazo
    		else if(e.getSource() == b_cabezazo){
    			entrada=7;
    			if(estado>=0 && estado<20){
    				darSalida();
    			tf_entrada.setText("7");
    				}
    			
    			}//cabezaso
//______________________________________________________________________________rodillazo
    			else if(e.getSource() == b_rodillazo){
    			entrada=8;
    			
    			if(estado>=0 && estado<20){
    				darSalida();
    			tf_entrada.setText("8");
    				}
    			
    			}//rodillazo
//______________________________________________________________________________vidas
    		else if(e.getSource() == b_vidas){
    			entrada=9;
    			if(estado>=0 && estado<20){
    				darSalida();
    			tf_entrada.setText("9");
    				}
    			
    			}//vidas
//________________________________________________________________________________________________iniciar
    		else if(e.getSource() == b_iniciar){
    			    				
    				iniciarJuego();
    				estado=mono.regresarEstado();
    				entrada=mono.regresarEntrada();
    			}//iniciar
    		
    		}//fin ActionPerformed
    		
  //__________________________windowClosing_______________________________________
    	public void windowClosing(WindowEvent e){
    		if(e.getSource() == f_principal)
    			System.exit(0);
    		else if(e.getSource() == f_llorar)
    				f_llorar.setVisible(false);
    		else if(e.getSource() == f_gesto)
    				f_gesto.setVisible(false);
    		else if(e.getSource() == f_perder)
    				f_perder.setVisible(false);
    			else if(e.getSource() == f_caer)
    				f_caer.setVisible(false);
    		else if(e.getSource() == f_nula)
    				f_nula.setVisible(false);
    		else if(e.getSource() == f_grito)
    				f_grito.setVisible(false);
    		else if(e.getSource() == f_sangre)
    				f_sangre.setVisible(false);
    		else if(e.getSource() == f_salto)
    				f_salto.setVisible(false);
    		else if(e.getSource() == f_fuerte)
    				f_fuerte.setVisible(false);
    		}//Fin WindowClosing
    		
    		
    		
  //_____________iniciarMaquina_______________
  
 		public void iniciarJuego(){
 			mono.reiniciarJuego();
 			tf_entrada.setText("NULL");
 			tf_estado.setText("Q0");
 			tf_energia.setText("100%");
 		}
 
  //_____________________________metodo principal_______________________________________   	
    	public static void main(String arg[]) throws IOException{
    		Ventana usuario = new Ventana();
    		usuario.MostrarMarco();
    		}
    		
    		
  public void darSalida(){
  	
  	
  	
  	    			mono.asignarEntrada(entrada);
    			salida=mono.asignarSalida(entrada,estado);
    			estado=mono.cambiarEstado(entrada,estado);
    			
    			
    			
    			
    			switch(salida){
    				case 0://nula
    				f_nula.setVisible(true);
    					break;
    				case 1://grito
    				f_grito.setVisible(true);
    					break;
    				case 2://caer
    				f_caer.setVisible(true);
    					break;
    				case 3://salta
    				f_salto.setVisible(true);
    					break;
    				case 4://sangrar
    				f_sangre.setVisible(true);
    					break;
    				case 5://perder
    				f_perder.setVisible(true);
    					break;
    				case 6://gesto
    				f_gesto.setVisible(true);
    					break;
    				case 7://llorar
    				f_llorar.setVisible(true);
    					break;
    				case 9://fuerte
    				f_fuerte.setVisible(true);
    					break;
    				default: //perdiste

    					f_perder.setVisible(true);
    				break;
    					
    			}//casos
    			switch(estado){
    				case 0://100
    				tf_energia.setText("100%");
    				tf_estado.setText("Q0");
    					break;
    				case 1://95
    				tf_energia.setText("95%");
    				tf_estado.setText("Q1");
    					break;
    				case 2://90
    				tf_energia.setText("90%");
    				tf_estado.setText("Q2");
    					break;
    				case 3://85
    				tf_energia.setText("85%");
    				tf_estado.setText("Q3");
    					break;
    				case 4://80
    				tf_energia.setText("80%");
    				tf_estado.setText("Q4");
    					break;
    				case 5://75
    				tf_energia.setText("75%");
    				tf_estado.setText("Q5");
    					break;
    				case 6://70
    				tf_energia.setText("70%");
    				tf_estado.setText("Q6");
    					break;
    				case 7://65
    				tf_energia.setText("65%");
    				tf_estado.setText("Q7");
    					break;
    				case 8://60
    				tf_energia.setText("60%");
    				tf_estado.setText("Q8");
    					break;
    				case 9://55
    				tf_energia.setText("55%");
    				tf_estado.setText("Q9");
    					break;
    				case 10://50
    				tf_energia.setText("50%");
    				tf_estado.setText("Q10");
    					break;
    				case 11://45
    				tf_energia.setText("45%");
    				tf_estado.setText("Q11");
    					break;
    				case 12://40
    				tf_energia.setText("40%");
    				tf_estado.setText("Q12");
    					break;
    				case 13://35
    				tf_energia.setText("35%");
    				tf_estado.setText("Q13");
    					break;
    				case 14://30
    				tf_energia.setText("30%");
    				tf_estado.setText("Q14");
    					break;
    				case 15://25
    				tf_energia.setText("25%");
    				tf_estado.setText("Q15");
    					break;
    				case 16://20
    				tf_energia.setText("20%");
    				tf_estado.setText("Q16");
    					break;
    				case 17://15
    				tf_energia.setText("15%");
    				tf_estado.setText("Q17");
    					break;
    				case 18://10
    				tf_energia.setText("10%");
    				tf_estado.setText("Q18");
    					break;
    				case 19://5
    				tf_energia.setText("5%");
    				tf_estado.setText("Q19");
    					break;
    				case 20://0
    				tf_energia.setText("0%");
    				tf_estado.setText("Q20");
    					break;	
    				}//casos estados
    
  	
  	}//fin metodo dar salida
  	
  	
}//Fin Clase Ventana