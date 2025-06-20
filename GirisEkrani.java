
public class GirisEkrani extends javax.swing.JFrame {
    OgrenciIslemleri islemler = new OgrenciIslemleri();
    /**
     * Creates new form GirisEkrani
     */
    public GirisEkrani() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kullanici_adi_alani = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        parola_alani = new javax.swing.JPasswordField();
        giris_alani = new javax.swing.JButton();
        cıkıs_alani = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();
        arkaresim = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yurt Giriş Ekranı");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(650, 300));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                  Fidan KIZ-ERKEK ÖZEL ÖĞRENCİ YURDU");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 600, 70);

        kullanici_adi_alani.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(kullanici_adi_alani);
        kullanici_adi_alani.setBounds(270, 150, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Kullanıcı Adı :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 154, 100, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Parola :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(160, 204, 100, 20);

        parola_alani.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(parola_alani);
        parola_alani.setBounds(270, 200, 190, 30);

        giris_alani.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        giris_alani.setForeground(new java.awt.Color(255, 0, 51));
        giris_alani.setText("Giriş");
        giris_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris_alaniActionPerformed(evt);
            }
        });
        jPanel1.add(giris_alani);
        giris_alani.setBounds(210, 280, 220, 29);

        cıkıs_alani.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cıkıs_alani.setForeground(new java.awt.Color(255, 0, 51));
        cıkıs_alani.setText("Çıkış");
        cıkıs_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cıkıs_alaniActionPerformed(evt);
            }
        });
        jPanel1.add(cıkıs_alani);
        cıkıs_alani.setBounds(210, 330, 220, 30);

        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(mesaj_yazisi);
        mesaj_yazisi.setBounds(160, 240, 300, 30);

        arkaresim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim.jpg"))); // NOI18N
        jPanel1.add(arkaresim);
        arkaresim.setBounds(0, 0, 660, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void giris_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giris_alaniActionPerformed
        mesaj_yazisi.setText("");
        String kullanici_adi = kullanici_adi_alani.getText();
        String parola = new String(parola_alani.getPassword());
        
        boolean girisbasarili = islemler.girisYap(kullanici_adi, parola);
        
        if(girisbasarili){
            BlokSec bloksec = new BlokSec();
            bloksec.setVisible(true);
            mesaj_yazisi.setText("Giriş Başarılı...");
            setVisible(false);
        }
        else{
            mesaj_yazisi.setText("Giriş Başarısız Lütfen Tekrar Deneyin...");
            
        }
    }//GEN-LAST:event_giris_alaniActionPerformed

    private void cıkıs_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cıkıs_alaniActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cıkıs_alaniActionPerformed

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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel arkaresim;
    javax.swing.JButton cıkıs_alani;
    javax.swing.JButton giris_alani;
    javax.swing.JDialog jDialog1;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JPanel jPanel1;
    javax.swing.JTextField kullanici_adi_alani;
    javax.swing.JLabel mesaj_yazisi;
    javax.swing.JPasswordField parola_alani;
    // End of variables declaration//GEN-END:variables
}
