    //en cada accion se usara un timer para dejar la imagen de pusheen un rato
    //ejemplo: cuando esta comiendo pollo poner la imagen comiendopollo.gif por 5 segundos
    //ejemplo: cuando duerme poner la imagen durmiendo.gif
    // etc

package simulador_mascota;

//IMPORTA LAS ACCIONES Y ESTADOS
//ES DECIR QUE PUEDES USAR a0,a1,q0,q1 etc
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.UIManager;


/**
 *
 * @author StormyMac
 */
public class Gui extends javax.swing.JFrame {

    /**
     * Creates new form Gui
     */
    
    //en cada accion se usara un timer para dejar la imagen de pusheen un rato
    //ejemplo: cuando esta comiendo pollo poner la imagen comiendopollo.gif por 5 segundos
    //ejemplo: cuando duerme poner la imagen durmiendo.gif
    // etc
    MascotaPusheen pusheen;
    
    public Gui() {     
        pusheen=new MascotaPusheen();
        initComponents();
        l_estado.setText("q0");
        l_salida.setText("");
        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/neutral.gif")));
        
        //INSTANCIA (DE AQUI SE SACARAN LOS METODOS PARA CAMBIAR EL ESTADO DE PUSHEEN
        //EJEMPLO: pusheen
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_acariciar = new javax.swing.JButton();
        b_pegar = new javax.swing.JButton();
        b_bailar = new javax.swing.JButton();
        b_medicar = new javax.swing.JButton();
        b_pollo = new javax.swing.JButton();
        b_pay = new javax.swing.JButton();
        b_pollo_y_pay = new javax.swing.JButton();
        b_chatarra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        l_estado = new javax.swing.JLabel();
        l_imagen = new javax.swing.JLabel();
        b_dormir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        l_salida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mascota virtual: pusheen");
        setBackground(new java.awt.Color(240, 233, 231));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 238, 220));
        setIconImage(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/icon.png")).getImage());
        setResizable(false);

        b_acariciar.setText("Acariciar a pusheen");
        b_acariciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_acariciarActionPerformed(evt);
            }
        });

        b_pegar.setText("Pegarle a pusheen");
        b_pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_pegarActionPerformed(evt);
            }
        });

        b_bailar.setText("Bailar con pusheen");
        b_bailar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_bailarActionPerformed(evt);
            }
        });

        b_medicar.setText("Medicar a pusheen");
        b_medicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_medicarActionPerformed(evt);
            }
        });

        b_pollo.setText("Alimentar con pollo");
        b_pollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_polloActionPerformed(evt);
            }
        });

        b_pay.setText("Alimentar con pay");
        b_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_payActionPerformed(evt);
            }
        });

        b_pollo_y_pay.setText("Alimentar con pollo y pay");
        b_pollo_y_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_pollo_y_payActionPerformed(evt);
            }
        });

        b_chatarra.setText("Alimentar con comida chatarra");
        b_chatarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_chatarraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Estado: ");

        l_estado.setText("Estado de pusheen");

        l_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_imagen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pusheen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        b_dormir.setText("Mandar a dormir a pusheen");
        b_dormir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_dormirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Mensaje: ");

        l_salida.setText("Mensaje de pusheen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(b_dormir, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(b_pay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_pollo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_pollo_y_pay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_medicar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_chatarra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(b_bailar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_pegar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_acariciar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(l_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_salida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_acariciar)
                    .addComponent(jLabel1)
                    .addComponent(l_estado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(l_salida)
                    .addComponent(b_pegar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_bailar)
                        .addGap(3, 3, 3)
                        .addComponent(b_pay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_pollo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_pollo_y_pay)
                        .addGap(4, 4, 4)
                        .addComponent(b_chatarra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_medicar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_dormir))
                    .addComponent(l_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_pegarActionPerformed
        setPusheenImagePegar();
        
    }//GEN-LAST:event_b_pegarActionPerformed

    private void b_acariciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_acariciarActionPerformed
        setPusheenImageAcariciando();
        
    }//GEN-LAST:event_b_acariciarActionPerformed

    private void b_bailarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_bailarActionPerformed
       setPusheenImageBailar();
       
    }//GEN-LAST:event_b_bailarActionPerformed

    private void b_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_payActionPerformed
        setPusheenImageAlimPay();
        
    }//GEN-LAST:event_b_payActionPerformed

    private void b_polloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_polloActionPerformed
       setPusheenImageAlimPollo();
       
    }//GEN-LAST:event_b_polloActionPerformed

    private void b_pollo_y_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_pollo_y_payActionPerformed
        // TODO add your handling code here:
        setPusheenImageAlimPayPollo();
        
    }//GEN-LAST:event_b_pollo_y_payActionPerformed

    private void b_chatarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_chatarraActionPerformed
        // TODO add your handling code here:
        setPusheenImageAlimChatarra();
        
    }//GEN-LAST:event_b_chatarraActionPerformed

    private void b_medicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_medicarActionPerformed
        // TODO add your handling code here:
        setPusheenImageMedicar();
        
    }//GEN-LAST:event_b_medicarActionPerformed

    private void b_dormirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_dormirActionPerformed
        // TODO add your handling code here:
        setPusheenImageDormir();
        
    }//GEN-LAST:event_b_dormirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            //para que tenga el aspecto del Sistema operativo que corre el sistema
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
    
    public void setPusheenImageAcariciando(){  
        String out=pusheen.hacer_accion(pusheen.a0);
        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/acariciar.gif")));
        disableAllButtons();
        ActionListener act=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev){
                switch(pusheen.estadoActual){
                    case 0:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/neutral.gif")));
                        break;
                    case 1:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/feliz.gif")));
                        break;
                    case 2:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/triste.gif")));
                        break;
                    case 3:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enojado.gif")));
                        break;
                    case 4:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/ansioso.gif")));
                        break;
                    case 5:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/miedo.gif")));
                        break;
                    case 6:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/dormido.gif")));
                        break;
                    case 7:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/lleno.gif")));
                        break;
                    case 8:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enfermo.gif")));
                        break;
                    case 9:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/sueño.gif")));
                        break;
                    case 10:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/hambre.gif")));
                        break;
                }
                enableAllButtons();
                l_salida.setText(out);
                checkEstado(pusheen.estadoActual);
            }            
        };
        Timer t=new Timer(4000,act);
        t.setRepeats(false);
        t.start();       
    }
    
    public void setPusheenImagePegar(){
        String out=pusheen.hacer_accion(pusheen.a1);
        disableAllButtons();
        ActionListener act=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev){
                switch(pusheen.estadoActual){
                    case 0:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/neutral.gif")));
                        break;
                    case 1:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/feliz.gif")));
                        break;
                    case 2:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/triste.gif")));
                        break;
                    case 3:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enojado.gif")));
                        break;
                    case 4:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/ansioso.gif")));
                        break;
                    case 5:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/miedo.gif")));
                        break;
                    case 6:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/dormido.gif")));
                        break;
                    case 7:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/lleno.gif")));
                        break;
                    case 8:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enfermo.gif")));
                        break;
                    case 9:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/sueño.gif")));
                        break;
                    case 10:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/hambre.gif")));
                        break;
                }
                enableAllButtons();
                l_salida.setText(out);
                checkEstado(pusheen.estadoActual);
            }            
        };
        Timer t=new Timer(2000,act);
        t.setRepeats(false);
        t.start();       
    }
    
    public void setPusheenImageBailar(){
        String out=pusheen.hacer_accion(pusheen.a2);
        disableAllButtons();
        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/bailando.gif")));
        ActionListener act=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev){
                switch(pusheen.estadoActual){
                    case 0:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/neutral.gif")));
                        break;
                    case 1:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/feliz.gif")));
                        break;
                    case 2:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/triste.gif")));
                        break;
                    case 3:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enojado.gif")));
                        break;
                    case 4:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/ansioso.gif")));
                        break;
                    case 5:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/miedo.gif")));
                        break;
                    case 6:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/dormido.gif")));
                        break;
                    case 7:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/lleno.gif")));
                        break;
                    case 8:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enfermo.gif")));
                        break;
                    case 9:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/sueño.gif")));
                        break;
                    case 10:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/hambre.gif")));
                        break;
                }
                enableAllButtons();
                l_salida.setText(out);
                checkEstado(pusheen.a2);
            }            
        };
        Timer t=new Timer(4000,act);
        t.setRepeats(false);
        t.start();       
    }
    
    public void setPusheenImageAlimPay(){  
        String out=pusheen.hacer_accion(pusheen.a3);
        disableAllButtons();
        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/comiendopay.gif")));
        ActionListener act=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev){
                switch(pusheen.estadoActual){
                    case 0:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/neutral.gif")));
                        break;
                    case 1:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/feliz.gif")));
                        break;
                    case 2:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/triste.gif")));
                        break;
                    case 3:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enojado.gif")));
                        break;
                    case 4:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/ansioso.gif")));
                        break;
                    case 5:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/miedo.gif")));
                        break;
                    case 6:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/dormido.gif")));
                        break;
                    case 7:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/lleno.gif")));
                        break;
                    case 8:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enfermo.gif")));
                        break;
                    case 9:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/sueño.gif")));
                        break;
                    case 10:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/hambre.gif")));
                        break;
                }
                enableAllButtons();
                l_salida.setText(out);
                checkEstado(pusheen.estadoActual);
            }            
        };
        Timer t=new Timer(4000,act);
        t.setRepeats(false);
        t.start();       
    }
    
    public void setPusheenImageAlimPollo(){ 
        String out=pusheen.hacer_accion(pusheen.a4);
        disableAllButtons();
        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/comiendopollo.gif")));
        ActionListener act=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev){
                switch(pusheen.estadoActual){
                    case 0:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/neutral.gif")));
                        break;
                    case 1:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/feliz.gif")));
                        break;
                    case 2:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/triste.gif")));
                        break;
                    case 3:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enojado.gif")));
                        break;
                    case 4:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/ansioso.gif")));
                        break;
                    case 5:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/miedo.gif")));
                        break;
                    case 6:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/dormido.gif")));
                        break;
                    case 7:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/lleno.gif")));
                        break;
                    case 8:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enfermo.gif")));
                        break;
                    case 9:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/sueño.gif")));
                        break;
                    case 10:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/hambre.gif")));
                        break;
                }
                enableAllButtons();
                l_salida.setText(out);
                checkEstado(pusheen.estadoActual);
            }            
        };
        Timer t=new Timer(4000,act);
        t.setRepeats(false);
        t.start();              
    }
    
    public void setPusheenImageAlimPayPollo(){  
        String out=pusheen.hacer_accion(pusheen.a5);
        disableAllButtons();
        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/comiendopollopay.gif")));
        ActionListener act=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev){
                switch(pusheen.estadoActual){
                    case 0:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/neutral.gif")));
                        break;
                    case 1:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/feliz.gif")));
                        break;
                    case 2:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/triste.gif")));
                        break;
                    case 3:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enojado.gif")));
                        break;
                    case 4:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/ansioso.gif")));
                        break;
                    case 5:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/miedo.gif")));
                        break;
                    case 6:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/dormido.gif")));
                        break;
                    case 7:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/lleno.gif")));
                        break;
                    case 8:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enfermo.gif")));
                        break;
                    case 9:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/sueño.gif")));
                        break;
                    case 10:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/hambre.gif")));
                        break;
                }
                enableAllButtons();
                l_salida.setText(out);
                checkEstado(pusheen.estadoActual);
            }            
        };
        Timer t=new Timer(4000,act);
        t.setRepeats(false);
        t.start();       
    }
    
    public void setPusheenImageAlimChatarra(){ 
        String out=pusheen.hacer_accion(pusheen.a6);
        disableAllButtons();
        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/comiendochatarra.gif")));
        ActionListener act=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev){
                switch(pusheen.estadoActual){
                    case 0:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/neutral.gif")));
                        break;
                    case 1:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/feliz.gif")));
                        break;
                    case 2:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/triste.gif")));
                        break;
                    case 3:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enojado.gif")));
                        break;
                    case 4:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/ansioso.gif")));
                        break;
                    case 5:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/miedo.gif")));
                        break;
                    case 6:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/dormido.gif")));
                        break;
                    case 7:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/lleno.gif")));
                        break;
                    case 8:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enfermo.gif")));
                        break;
                    case 9:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/sueño.gif")));
                        break;
                    case 10:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/hambre.gif")));
                        break;
                }
                enableAllButtons();
                l_salida.setText(out);
                checkEstado(pusheen.estadoActual);
            }            
        };
        Timer t=new Timer(4000,act);
        t.setRepeats(false);
        t.start();       
    }
    
    public void setPusheenImageMedicar(){  
        String out=pusheen.hacer_accion(pusheen.a7);
        disableAllButtons();
        ActionListener act=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev){
                switch(pusheen.estadoActual){
                    case 0:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/neutral.gif")));
                        break;
                    case 1:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/feliz.gif")));
                        break;
                    case 2:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/triste.gif")));
                        break;
                    case 3:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enojado.gif")));
                        break;
                    case 4:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/ansioso.gif")));
                        break;
                    case 5:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/miedo.gif")));
                        break;
                    case 6:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/dormido.gif")));
                        break;
                    case 7:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/lleno.gif")));
                        break;
                    case 8:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enfermo.gif")));
                        break;
                    case 9:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/sueño.gif")));
                        break;
                    case 10:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/hambre.gif")));
                        break;
                }
                enableAllButtons();
                l_salida.setText(out);
                checkEstado(pusheen.estadoActual);
            }            
        };
        Timer t=new Timer(2000,act);
        t.setRepeats(false);
        t.start();       
    }
    
    public void setPusheenImageDormir(){   
        String out=pusheen.hacer_accion(pusheen.a8);
        disableAllButtons();
        ActionListener act=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev){
                switch(pusheen.estadoActual){
                    case 0:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/neutral.gif")));
                        break;
                    case 1:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/feliz.gif")));
                        break;
                    case 2:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/triste.gif")));
                        break;
                    case 3:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enojado.gif")));
                        break;
                    case 4:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/ansioso.gif")));
                        break;
                    case 5:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/miedo.gif")));
                        break;
                    case 6:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/dormido.gif")));
                        break;
                    case 7:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/lleno.gif")));
                        break;
                    case 8:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/enfermo.gif")));
                        break;
                    case 9:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/sueño.gif")));
                        break;
                    case 10:
                        l_imagen.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("simulador_mascota/pusheen/hambre.gif")));
                        break;
                }
                enableAllButtons();
                l_salida.setText(out);
                checkEstado(pusheen.estadoActual);
            }            
        };
        Timer t=new Timer(2000,act);
        t.setRepeats(false);
        t.start();
        
    }
    
    public void checkEstado(int q){
        switch(q){
            case 0:
                l_estado.setText("q0");
                break;
            case 1:
                l_estado.setText("q1");
                break;
            case 2:
                l_estado.setText("q2");
                break;
            case 3:
                l_estado.setText("q3");
                break;
            case 4:
                l_estado.setText("q4");
                break;
            case 5:
                l_estado.setText("q5");
                break;
            case 6:
                l_estado.setText("q6");
                break;
            case 7:
                l_estado.setText("q7");
                break;
            case 8:
                l_estado.setText("q8");
                break;
            case 9:
                l_estado.setText("q9");
                break;
            case 10:
                l_estado.setText("q10");
                break;
        }
    }
    
    public void disableAllButtons(){
        b_acariciar.setEnabled(false);
        b_bailar.setEnabled(false);
        b_chatarra.setEnabled(false);
        b_dormir.setEnabled(false);
        b_medicar.setEnabled(false);
        b_pay.setEnabled(false);
        b_pegar.setEnabled(false);
        b_pollo.setEnabled(false);
        b_pollo_y_pay.setEnabled(false);
    }
    
    public void enableAllButtons(){
        b_acariciar.setEnabled(true);
        b_bailar.setEnabled(true);
        b_chatarra.setEnabled(true);
        b_dormir.setEnabled(true);
        b_medicar.setEnabled(true);
        b_pay.setEnabled(true);
        b_pegar.setEnabled(true);
        b_pollo.setEnabled(true);
        b_pollo_y_pay.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_acariciar;
    private javax.swing.JButton b_bailar;
    private javax.swing.JButton b_chatarra;
    private javax.swing.JButton b_dormir;
    private javax.swing.JButton b_medicar;
    private javax.swing.JButton b_pay;
    private javax.swing.JButton b_pegar;
    private javax.swing.JButton b_pollo;
    private javax.swing.JButton b_pollo_y_pay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l_estado;
    private javax.swing.JLabel l_imagen;
    private javax.swing.JLabel l_salida;
    // End of variables declaration//GEN-END:variables
}
