 
package ACS.sp;

 
public class Frame_GA extends javax.swing.JFrame {

    
    public Frame_GA() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        aff = new javax.swing.JTable();
        Fs = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tttt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        dddd = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cccc = new javax.swing.JTextField();
        ffff = new javax.swing.JTextField();
        ssss = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Algorithme génétique");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        aff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(aff);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 640, 450);

        Fs.setBackground(new java.awt.Color(223, 227, 232));
        Fs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Fs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FsActionPerformed(evt);
            }
        });
        getContentPane().add(Fs);
        Fs.setBounds(144, 468, 182, 38);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Meilleur F(score):");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 467, 122, 36);

        tttt.setBackground(new java.awt.Color(223, 227, 232));
        tttt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tttt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tttt.setFocusable(false);
        getContentPane().add(tttt);
        tttt.setBounds(490, 570, 85, 17);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("le temps d'execution du workflow(ms):");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(240, 570, 238, 15);

        dddd.setBackground(new java.awt.Color(223, 227, 232));
        dddd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dddd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        dddd.setFocusable(false);
        getContentPane().add(dddd);
        dddd.setBounds(490, 530, 85, 17);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("La disponibilite globale");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(240, 530, 144, 15);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Le cout globale ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 530, 97, 15);

        cccc.setBackground(new java.awt.Color(223, 227, 232));
        cccc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cccc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cccc.setFocusable(false);
        getContentPane().add(cccc);
        cccc.setBounds(130, 530, 69, 17);

        ffff.setBackground(new java.awt.Color(223, 227, 232));
        ffff.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ffff.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ffff.setFocusable(false);
        getContentPane().add(ffff);
        ffff.setBounds(130, 570, 69, 17);

        ssss.setBackground(new java.awt.Color(223, 227, 232));
        ssss.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(ssss);
        ssss.setBounds(130, 600, 69, 18);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("La securité globale");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(10, 600, 115, 15);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("La fiablilité globale");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 570, 119, 15);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/apophysis.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 450, 640, 180);

        setSize(new java.awt.Dimension(647, 663));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FsActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_GA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Fs;
    public static javax.swing.JTable aff;
    public static javax.swing.JTextField cccc;
    public static javax.swing.JTextField dddd;
    public static javax.swing.JTextField ffff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField ssss;
    public static javax.swing.JTextField tttt;
    // End of variables declaration//GEN-END:variables
}
