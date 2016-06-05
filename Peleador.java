/**
 * @(#)Peleador.java
 *
 *
 * @author Irma Meza & David Galindo & Laura Peralta
 * @version 1.00 2014/5/30
 *Maquina de Estados
 */
 



public class Peleador{
	
//___________ATRIBUTOS_______________________________

	int entrada=0;
	int salida=-1;
	int estado=-1;
	int cambioestado [][];
	int salidas [][];
	

		
	//constructor    en		edo
    public Peleador() {
    		cambioestado = new int [][] {	
		//	--------------------------------------------ESTADOS----------------------------------------------
		//				0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	20
		//				100	95	90	85	80	75	70	65	60	55	50	45	40	35	30	25	20	15	10	5	0
			/* E	0*/{1,	2,	3,	4,	5,	6,	7,	8,	9,	10,	11,	12,	13,	14,	15,	16,	17,	18,	19,	20,	21},  
			/* N	1*/{2,	3,	4,	5,	6,	7,	8,	10,	11,	12,	13,	14,	15,	16,	17,	19,	20,	21,	21,	21,	21},
			/* T	2*/{2,	3,	4,	5,	6,	7,	8,	9,	10,	11,	12,	13,	14,	15,	16,	17,	18,	19,	20,	21, 21},
			/* R	3*/{3,	4,	5,	6,	7,	8,	9,	10,	11,	12,	13,	14,	15,	16,	20,	21,	21,	21,	21,	21,	21},
			/* A	4*/{1,	2,	3,	4,	5,	6,	7,	8,	10,	11,	12,	13,	14,	15,	16,	17,	18,	19,	20,	21,	21},
			/* D	5*/{1,	2,	3,	4,	5,	6,	7,	8,	9,	10,	11,	12,	13,	14,	15,	16,	17,	18,	19,	20,	21}, 
			/* A	6*/{1,	2,	3,	4,	5,	6,	7,	8,	9,	10,	11,	12,	13,	14,	15,	16,	17,	18,	19,	20,	21}, 
			/* S	7*/{1,	2,	3,	4,	5,	6,	7,	8,	9,	10,	11,	12,	13,	14,	15,	16,	17,	18,	19,	20,	21}, 
			/* ?	8*/{2,	3,	4,	5,	6,	7,	8,	9,	10,	11,	12,	14,	15,	16,	17,	19,	20,	21,	21,	21,	21},
			/* ?    9*/{0,	0,	1,	2,	3,	4,	5,	6,	7,	8,	9,	10,	11,	12,	13,	14,	15,	16,	17,	18,	21},
		};//fin matriz de entradas
		
		/*Entradas
		 0 = patada al cuerpo
		 1 = patada a la cara
		 2 = UperCut
		 3 = Recto
		 4 = Jab
		 5 = Codazo
		 6 = Cabezaso
		 7 = Rodillaso
		 9 = mas energia?
		 */
		
		salidas = new int [][] {	
		//	--------------------------------------------ESTADOS----------------------------------------------
		//				0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	20
		//				100	95	90	85	80	75	70	65	60	55	50	45	40	35	30	25	20	15	10	5	0
			/* E	0*/{0,	0,	6,	6,	3,	6,	3,	1,	3,	1,	4,	4,	2,	4,	7,	4,	2,	7,	2,	5,	8},  
			/* N	1*/{0,	6,	6,	3,	6,	1,	2,	2,	3,	4,	1,	4,	2,	4,	1,	7,	5,	8,	8,	8,	8},
			/* T	2*/{0,	6,	6,	3,	3,	2,	2,	1,	2,	1,	3,	2,	1,	2,	1,	2,	4,	4,	5,	8,	8},
			/* R	3*/{6,	6,	3,	2,	2,	2,	2,	2,	2,	2,	2,	2,	2,	2,	5,	8,	8,	8,	8,	8,	8},
			/* A	4*/{0,	6,	6,	3,	3,	1,	3,	1,	4,	4,	2,	1,	3,	4,	2,	7,	2,	1,	5,	8,	8},
			/* D	5*/{0,	6,	6,	3,	3,	3,	6,	1,	1,	4,	4,	4,	2,	4,	2,	2,	4,	2,	4,	5,	8}, 
			/* A	6*/{0,	6,	6,	3,	1,	1,	3,	3,	6,	1,	4,	2,	1,	3,	7,	4,	3,	2,	4,	5,	8}, 
			/* S	7*/{0,	6,	6,	1,	3,	1,	3,	3,	4,	4,	4,	1,	7,	2,	1,	2,	2,	2,	2,	5,	8}, 
			/* ?	8*/{6,	6,	6,	3,	3,	1,	1,	4,	4,	1,	2,	2,	4,	4,	7,	1,	2,	2,	2,	5,	8},
			/* ?    9*/{0,	9,	9,	9,	9,	9,	9,	9,	9,	9,	9,	9,	9,	9,	9,	9,	9,	9,	9,	9,	8},
		};//fin matriz de salidas
		
		/*Salidas
		 0 = nada
		 1 = grito
		 2 = caer
		 3 = RetrocederSaltando
		 4 = Sangrar
		 5 = Perder
		 6 = Gesto
		 7 = Llorar
		 8 = ¿salida invalida?
		 9 = fuerte
		*/

    }//fin constructor
    
    public int cambiarEstado(int entrada1, int estado1){
    	estado = cambioestado[entrada1][estado1];
    	return estado;
    	}
    	
    public int asignarSalida(int entrada1, int estado1){
    	salida = salidas[entrada1][estado1];
    	return salida;
    }
    
    
    
    public void asignarEntrada(int x){
    	entrada=x;
    	}
    public void asignarEstado(int x){
    	estado=x;
    	}
    public int regresarEntrada(){
    	return entrada;
    	}
    public int regresarEstado(){
    	return estado;
    }
    
    public void reiniciarJuego(){
    	estado = 0;
    	entrada = -1;
    	salida = -1;
    }
    
    
}//fin clase peleador