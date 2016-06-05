//LEAN LOS COMENTARIOS PORFA

package simulador_mascota;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author StormyMac
 */
public class MascotaPusheen {
    int estadoActual;
    int estadoAnterior;
    //ESTADOs
        final int q0=0;//Neutral
        final int q1=1;//feliz
        final int q2=2;//triste
        final int q3=3;//nojado
        final int q4=4;//ansioso
        final int q5=5;//miedo
        final int q6=6;//dormido
        final int q7=7;//lleno
        final int q8=8;//enfermo
        final int q9=9;//con_sueño
        final int q10=10;//con_hambre

        //ACCIONES
        final int a0=0;//Acariciar
        final int a1=1;//pegar
        final int a2=2;//bailar
        final int a3=3;//alimentar_pay
        final int a4=4;//alimentar_pollo
        final int a5=5;//alimentar_pollo_y_pay
        final int a6=6;//alimentar_chatarra
        final int a7=7;//medicar
        final int a8=8;//mandar a dormir 


    //Remplazar los numeros con los estados correspondientes de la 
    //siguiente forma ejemplo: q0 (porque es un entero)
    //arriba esta lo que es cada estado
    int[][]matrizEstados={
    //                                                                                 alim        alim                   mandar
    //entradas         Acariciar      Pegar       bailar    alim_pay    alim_pollo  pollo_y_pay  chatarra    medicar     a dormir
                      {q1,    q3,   q10,  q1    ,q1,  q1,   q1,   q5,   q6},//Neutral
                      {q1,    q5,   q9,   q7    ,q7,  q7,   q7,   q0,   q1},//feliz
                      {q1,    q3,   q9,   q1    ,q1,  q1,   q1,   q1,   q2},//triste
                      {q0,    q4,   q4,   q0    ,q0,  q0,   q0,   q3,   q3},//enojado
                      {q0,    q3,   q1,   q1    ,q1,  q1,   q1,   q1,   q6},//ansioso
                      {q0,    q3,   q4,   q1    ,q1,  q1,   q1,   q1,   q5},//miedo
                      {q1,    q3,   q1,   q1    ,q1,  q1,   q1,   q1,   q5},//dormido
                      {q1,    q3,   q1,   q8    ,q8,  q8,   q8,   q1,   q5},//lleno
                      {q8,    q8,   q8,   q8    ,q8,  q8,   q8,   q1,   q8},//enfermo
                      {q9,    q9,   q9,   q9    ,q9,  q9,   q9,   q9,   q6},//con sueño
                      {q9,    q8,   q10,  q1    ,q1,  q1,   q1,   q10,  q10}//con hambre
        };
    
    int entrada;
    
    public MascotaPusheen(){
        estadoAnterior=estadoActual=q0;
    }
    
    //crear metodo modificador de estado
    public String hacer_accion(int a){
        String out="";//salida
        estadoAnterior=estadoActual;
        entrada=a;
        System.out.println("EstadoSIG: "+matrizEstados[estadoActual][entrada]);
        estadoActual=getEstado();
        switch(estadoActual){
            case q0:
                out="Pusheen esta normal... calmado";
                break;
            case q1:
                out="pusheen esta feliz!";
                break;
            case q2:
                out="pusheen esta triste";
                break;
            case q3:
                out="pusheen esta ENOJADO!";
                break;
            case q4:
                out="pusheen esta ansioso";
                break;
            case q5:
                out="pusheen tiene miedo cuidalo!";
                break;
            case q6:
                out="pusheen esta dormido";
                break;
            case q7:
                out="pusheen esta satisfecho";
                break;
            case q8:
                out="pusheen esta enfermo cuidalo!";
                break;   
            case q9:
                out="pusheen esta cansado tiene sueño!";
                break; 
            case q10:
                out="pusheen tiene hambre! (que raro)";
                break; 
        }
        return out;
    }
    
    public int getEstado(){       
        return matrizEstados[estadoActual][entrada];
    }
}
