/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playfaire;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author walide
 */
public class play_faire extends javax.swing.JFrame {
//hnaya criyina instence men class nta3 play_faire.java samiha f bach na9adro nakhadmo b les methode dyawalha
    foction_playfaire f=new foction_playfaire();
    /**
     * Creates new form play_faire
     */
    public play_faire() {
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

        jLabel1 = new javax.swing.JLabel();
        box_choix = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_crep = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        text_result = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 550));
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("resultat :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 370, 140, 50);

        box_choix.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        box_choix.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "crypter", "decrypter" }));
        getContentPane().add(box_choix);
        box_choix.setBounds(230, 30, 320, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("selectionner votre choix :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 20, 200, 60);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("enter la clé :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 80, 140, 50);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Votre text :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 190, 140, 50);

        txt_cle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_cle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cleKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cleKeyReleased(evt);
            }
        });
        getContentPane().add(txt_cle);
        txt_cle.setBounds(230, 90, 320, 50);

        text_crep.setColumns(20);
        text_crep.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        text_crep.setRows(5);
        text_crep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_crepKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(text_crep);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 150, 330, 140);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("Executer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 300, 140, 30);

        text_result.setColumns(20);
        text_result.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        text_result.setRows(5);
        jScrollPane2.setViewportView(text_result);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(230, 340, 330, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String result="";//hadi bach nsovgardo fiha resultat
String choix=(String) box_choix.getSelectedItem();// hana dina choix wach howa (criptage/decriptage) ... getSelectItem traja3ana resultat type ta3ha objet lazam n7awloh l string 3la dak zadna 9balha (String)
String input=text_crep.getText();//hna dina text li tsiza w dernah f variable input
String[] str1=input.split(" ");// split methode rana ngololha ro7i ll variable input w syparili aljomal 3la 7sab win kayen lespace ... ya3ni traja3alna matrice type ta3ha String fiha ga3 lkalmat li f text ta3na
if(txt_cle.getText().isEmpty()){//hna nvirifo utilisateur ida dakhal cle wala lala .. isempty truturni vri ida kan vide
     JOptionPane.showMessageDialog(this, "SVP entre la clé");
}else if(input.isEmpty()){// hna kifkif nchofo ida text mahoch vide
    JOptionPane.showMessageDialog(this, "SVP remplir le champ de text ");//hadi li tafichier message
}else{
 if(choix=="crypter"){//ida kan choix crypter n3ayto ll methode nta3 crypter li rahi f classe play_faire
    for(int i=0;i<str1.length;i++){//nbocliw matrice nta3na li fiha ga3 alkalmate nta3 text w nacripto kalma par kalma
    String input1=str1[i];
   result=result+" "+f.crypter(input1, txt_cle.getText());
   text_result.setText(result.toUpperCase());  
}  
}else if(choix=="decrypter"){//ida kan choix decrypter n3ayto ll methode nta3 decrypter li rahi f classe play_faire
    for(int i=0;i<str1.length;i++){
      String input1=str1[i];  
      result=result+" "+f.decrypter(input1, txt_cle.getText());
      text_result.setText(result.toUpperCase()); 
    }
  //hada messahe bach n9olo ll utilisateur yvirivier text ta3o mora dicriptage ida kan fih les x zyada wala i rahi f plasset j
      JOptionPane.showMessageDialog(this, "pour le decriptage :\nnotre programme decripty 99% de text \n vous devez vérifier manualment l'emplacement des les lettre suivant : \"I , J , X \"");   
}   
}  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_cleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cleKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cleKeyPressed

    private void txt_cleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cleKeyReleased
   char c=evt.getKeyChar();
   String text1=txt_cle.getText();
        if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'){
    evt.consume();
    
    if(text1.length()<2){
        txt_cle.setText("");
    }else if(text1.length()==2){
    String text2=text1.substring(0, text1.length()-1);
        txt_cle.setText(text2);
    }else{
        String text2=text1.substring(0, text1.length()-1);
        txt_cle.setText(text2);
    }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cleKeyReleased

    private void text_crepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_crepKeyReleased
char c=evt.getKeyChar();
   String text1=text_crep.getText();
        if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'){
    evt.consume();
    
    if(text1.length()<2){
        text_crep.setText("");
    }else if(text1.length()==2){
    String text2=text1.substring(0, text1.length()-1);
        text_crep.setText(text2);
    }else{
        String text2=text1.substring(0, text1.length()-1);
        text_crep.setText(text2);
    }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_text_crepKeyReleased

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
            java.util.logging.Logger.getLogger(play_faire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(play_faire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(play_faire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(play_faire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new play_faire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_choix;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea text_crep;
    private javax.swing.JTextArea text_result;
    private javax.swing.JTextField txt_cle;
    // End of variables declaration//GEN-END:variables
}
