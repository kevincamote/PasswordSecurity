/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package passwordsecurity;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author 98kev
 */
public class MenuInicio extends javax.swing.JFrame {

    /**
     * Creates new form MenuInicio
     */
    public MenuInicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPassword2 = new javax.swing.JTextField();
        txtPassword3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPalabra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 280, -1));
        jPanel1.add(txtPassword3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 280, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 110, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SecurePassGen");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 83));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Escribe una frase o palabra:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));
        jPanel1.add(txtPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 279, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña generada:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 279, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/9c7cfca0e6759e434a276be6469eebf1.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 580, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String frase,remplace1="i", aux= "",nueva1="!",frase2, aux2= "",frase3,aux3= "",nuevaa1="1";
         String remplace2="ñ",nueva2="n";
         String remplace3="e",nueva3="3";
         String remplace4="b",nueva4="6";
         String remplace5="s",nueva5="5";
         String remplace6="a",nueva6="4";
         int numero=0;
         
       
        Random random = new Random();
        frase = txtPalabra.getText();
        frase2 = txtPalabra.getText();
        frase3 = txtPalabra.getText();
        
        for(int i = 0;i < frase.length();i++){
            if(frase.charAt(i)!=' '){
                aux += frase.charAt(i);// Quitar espacios
                aux2 += frase2.charAt(i);
                aux3 += frase3.charAt(i);
                numero++;// contar las letras
            }
            
                     
        }
        frase3=aux3;
        frase2=aux2;
        frase=aux;
        
        //Frase 1
        frase= frase.replaceAll(remplace1, nueva1);
        frase= frase.replaceAll(remplace2, nueva2);
      //  frase= frase.replaceAll(remplace3, nueva3);
        frase= frase.replaceAll(remplace4, nueva4);
        //frase 2
        frase2= frase2.replaceAll(remplace2, nueva2);
        frase2= frase2.replaceAll(remplace3, nueva3);
        frase2= frase2.replaceAll(remplace5,nueva5 );
        frase2= frase2.replaceAll(remplace6,nueva6 );
        frase2= frase2.replaceAll(remplace1, nuevaa1);
        //frase 3
        frase3= frase3.replaceAll(remplace2, nueva2);
        frase3= frase3.replaceAll(remplace3, nueva3);
        frase2= frase2.replaceAll(remplace5,nueva5 );
        frase2= frase2.replaceAll(remplace6,nueva6 );

        if(numero < 12){
                 for(int x = numero; x!= 12;x++){
   
                 int randomNumber = random.nextInt(9);//numero random de 0 al 9
                 int randomNumber2 = random.nextInt(9);
                 frase2 = frase2 + randomNumber2;
                 frase = frase + randomNumber;     
                 frase3 = randomNumber + frase3;
                 }
        }
        
                 int randomNumber = random.nextInt(9);//numero random de 0 al 9
                 frase = frase + randomNumber; 
                 frase3 = randomNumber + frase3;
                 frase2 = frase2 + randomNumber;
                 
                 randomNumber = random.nextInt(9);
                 frase = frase + randomNumber; 
                 frase3 = randomNumber + frase3;
                 frase2 = frase2 + randomNumber;
                 
        if(numero>28){
            JOptionPane.showMessageDialog(null," Tu frase supera los limites intenta de nuevo :c");
        }else{
             txtPassword.setText(frase);//que se muestre en el label
             txtPassword2.setText(frase2);
             txtPassword3.setText(frase3);

        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtPalabra;
    public javax.swing.JTextField txtPassword;
    public javax.swing.JTextField txtPassword2;
    public javax.swing.JTextField txtPassword3;
    // End of variables declaration//GEN-END:variables
}
