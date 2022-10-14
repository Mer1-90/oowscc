package ACS.sp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class form extends javax.swing.JFrame implements ActionListener {

    static Object[][] donnees3 = {};
    private static final Random s_ran = new Random(System.currentTimeMillis());
    public static int nu_utiration;
    public static int repp;
    public static double f_sco;
    private JTable Jprepar, Jplanif, Jworkflow;
    private JScrollPane JSprepar, JSplanif, JSworkflow;
    DefaultTableModel DM, DM2;
   
    static String[] entetes1 = {"N° de la tache", "Durée de la tache", "La normalisation"};
    static String[] entetes = {"Machine virtuelle", "Coùt", "Coùt/N", "Fiabilité", "Fiabilité/N", "Réponse temps", "Réponse temps/N", "Sécurité", "Sécurité/N", "Disponibilite", "Disponibilite/N"};
    static String[] entetesf = {"N° de la tache", "Machine virtuelle", "Durée de la tache", "Coùt", "Fiabilité", "Réponse temps", "Sécurité", "Disponibilite"};
    static String[] entetesf_1 = {" N éturation ", "Le cout globale ", "Fiabilité    ", "Réponse temps ", "Sécurité    ", "Disponibilite   "};
    public int path[];
    public static ArrayList<Double> F_scor;// un tableau dynamique qui contient le liste des valeurs de F_scor ;
    public static ArrayList<Double> cout_stat;
    public static ArrayList<Double> fiab_stat;
    public static ArrayList<Double> suc_stat;
    public static ArrayList<Double> tomp_stat;
    public static ArrayList<Double> dispo_stat;
    public static ArrayList<Integer> ga_stat_utération;
    generates_and_display g = new generates_and_display();
    Frame_GA fre = new Frame_GA();
    // point Po= new point ();
    public static ArrayList<Integer> VMS;
    public static ArrayList<Integer> Vt;
    int id_VM = 1;
    Map<Integer, Integer> WF;

    public form() {
        initComponents();
        t_aff.setVisible(false);
        F_scor = new ArrayList<>();
        cout_stat = new ArrayList<>();
        fiab_stat = new ArrayList<>();
        suc_stat = new ArrayList<>();
        tomp_stat = new ArrayList<>();
        dispo_stat = new ArrayList<>();
        VMS = new ArrayList<>();
        Vt = new ArrayList<>();
        ga_stat_utération = new ArrayList<>();
        jButton2.setVisible(false);


        mutation.setVisible(false);
        jLabel25.setVisible(false);
        croisment.setVisible(false);
        jLabel14.setVisible(false);


        WF = new Hashtable<Integer, Integer>();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cfiab = new javax.swing.JCheckBox();
        cdisp = new javax.swing.JCheckBox();
        ccout = new javax.swing.JCheckBox();
        ccout1 = new javax.swing.JCheckBox();
        ccout2 = new javax.swing.JCheckBox();
        tptom = new javax.swing.JTextField();
        tpsuc = new javax.swing.JTextField();
        tpcost = new javax.swing.JTextField();
        tpdisp = new javax.swing.JTextField();
        tpfiab = new javax.swing.JTextField();
        ttlimit = new javax.swing.JTextField();
        tcmax = new javax.swing.JTextField();
        tcmin = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        j = new javax.swing.JLabel();
        workflow = new javax.swing.JPanel();
        generer1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_tache = new javax.swing.JTable();
        nm_tache = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        num_vm = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_vm = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        tt_cout = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        fii = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        tomp_ex = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        sec_tt = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nume = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fss = new javax.swing.JTextField();
        x = new javax.swing.JPanel();
        cout = new javax.swing.JSlider();
        cout_aff = new javax.swing.JTextField();
        fiab = new javax.swing.JSlider();
        txt_fiab = new javax.swing.JTextField();
        txt_tomp = new javax.swing.JTextField();
        fiab2 = new javax.swing.JSlider();
        fiab3 = new javax.swing.JSlider();
        txt_scu = new javax.swing.JTextField();
        fiab4 = new javax.swing.JSlider();
        txt_dis = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        t_aff = new javax.swing.JTable();
        p = new javax.swing.JPanel();
        ant = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        generer = new javax.swing.JButton();
        utiration = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        q = new javax.swing.JTextField();
        b = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        quitter = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        mutation = new javax.swing.JTextField();
        croisment = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        info_fscor = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 0, 153), null, null));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        cfiab.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cfiab.setSelected(true);
        cfiab.setText("Fiabilité");
        cfiab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfiabActionPerformed(evt);
            }
        });
        jPanel1.add(cfiab);
        cfiab.setBounds(580, 160, 121, 27);

        cdisp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cdisp.setSelected(true);
        cdisp.setText("Disponibilité");
        cdisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdispActionPerformed(evt);
            }
        });
        jPanel1.add(cdisp);
        cdisp.setBounds(580, 200, 127, 27);

        ccout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ccout.setSelected(true);
        ccout.setText("Coût");
        ccout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccoutActionPerformed(evt);
            }
        });
        jPanel1.add(ccout);
        ccout.setBounds(580, 240, 120, 27);

        ccout1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ccout1.setSelected(true);
        ccout1.setText("Securité");
        ccout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccout1ActionPerformed(evt);
            }
        });
        jPanel1.add(ccout1);
        ccout1.setBounds(580, 280, 120, 27);

        ccout2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ccout2.setSelected(true);
        ccout2.setText("Temps de réponse");
        ccout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccout2ActionPerformed(evt);
            }
        });
        jPanel1.add(ccout2);
        ccout2.setBounds(580, 320, 170, 27);

        tptom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tptom.setText("0.1");
        jPanel1.add(tptom);
        tptom.setBounds(780, 320, 59, 34);

        tpsuc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tpsuc.setText("0.1");
        tpsuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpsucActionPerformed(evt);
            }
        });
        jPanel1.add(tpsuc);
        tpsuc.setBounds(780, 280, 59, 34);

        tpcost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tpcost.setText("0.6");
        tpcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpcostActionPerformed(evt);
            }
        });
        jPanel1.add(tpcost);
        tpcost.setBounds(780, 240, 59, 34);

        tpdisp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tpdisp.setText("0.1");
        jPanel1.add(tpdisp);
        tpdisp.setBounds(780, 200, 59, 34);

        tpfiab.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tpfiab.setText("0.1");
        jPanel1.add(tpfiab);
        tpfiab.setBounds(780, 160, 59, 34);

        ttlimit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ttlimit.setText("100");
        jPanel1.add(ttlimit);
        ttlimit.setBounds(250, 300, 70, 34);

        tcmax.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tcmax.setText("99");
        jPanel1.add(tcmax);
        tcmax.setBounds(250, 230, 70, 34);

        tcmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tcmin.setText("50");
        jPanel1.add(tcmin);
        tcmin.setBounds(250, 190, 70, 34);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("temps limit");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(90, 300, 120, 22);

        jLabel20.setBackground(new java.awt.Color(153, 153, 153));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Paramètres de l'utilisateur");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(90, 120, 270, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Cout min");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(90, 190, 90, 20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Cout max");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(90, 230, 80, 22);

        jLabel22.setBackground(new java.awt.Color(153, 153, 153));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Paramétres QoS");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(620, 120, 190, 22);

        j.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iPad12.jpg"))); // NOI18N
        jPanel1.add(j);
        j.setBounds(10, 20, 1024, 740);

        jTabbedPane1.addTab("paramètres", jPanel1);

        workflow.setBackground(new java.awt.Color(255, 255, 255));
        workflow.setLayout(null);

        generer1.setBackground(new java.awt.Color(51, 204, 255));
        generer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/vm_gener.png"))); // NOI18N
        generer1.setText("Générer");
        generer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generer1ActionPerformed(evt);
            }
        });
        workflow.add(generer1);
        generer1.setBounds(60, 30, 140, 40);

        table_tache.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N° de la tache", "Durée de la tache", "La Normalisation"
            }
        ));
        table_tache.setFocusable(false);
        table_tache.setOpaque(false);
        table_tache.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(table_tache);

        workflow.add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 1320, 550);

        nm_tache.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nm_tache.setText("20");
        workflow.add(nm_tache);
        nm_tache.setBounds(230, 30, 90, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/digital-tunnel-wallpaper1.jpg"))); // NOI18N
        workflow.add(jLabel12);
        jLabel12.setBounds(20, 10, 980, 80);

        jTabbedPane1.addTab("Génération des parametres du workflow", workflow);

        jPanel2.setBackground(new java.awt.Color(120, 153, 153));
        jPanel2.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Lucida Console", 0, 9)); // NOI18N
        jLabel13.setText("nombre de machines");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(190, 70, 110, 10);

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/vm_gener.png"))); // NOI18N
        jButton1.setText("Générer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(20, 30, 140, 40);

        num_vm.setBackground(new java.awt.Color(204, 255, 255));
        num_vm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        num_vm.setText("100");
        num_vm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255), 2));
        num_vm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_vmActionPerformed(evt);
            }
        });
        jPanel2.add(num_vm);
        num_vm.setBounds(190, 30, 80, 37);

        table_vm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(table_vm);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 130, 1340, 570);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/vm.jpeg"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 10, 1030, 110);

        jTabbedPane1.addTab("Simulation des parametres de l'environnement cloud", jPanel2);

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(216, 255, 255));

        jPanel4.setBackground(jPanel5.getBackground());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Le cout globale ");

        tt_cout.setBackground(p.getBackground());
        tt_cout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tt_cout.setFocusable(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("La fiablilité globale");

        fii.setBackground(p.getBackground());
        fii.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fii.setFocusable(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("La disponibilité globale");

        jTextField3.setBackground(p.getBackground());
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.setFocusable(false);

        tomp_ex.setBackground(p.getBackground());
        tomp_ex.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tomp_ex.setFocusable(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("le temps d'execution du workflow(ms):");

        sec_tt.setBackground(p.getBackground());

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("La securité globale");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tt_cout)
                    .addComponent(fii, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(sec_tt))
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tomp_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(tt_cout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(fii, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(tomp_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sec_tt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Iteration N°: ");

        nume.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nume.setDisabledTextColor(new java.awt.Color(51, 51, 255));
        nume.setEnabled(false);
        nume.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Meilleur  F (score) :");

        fss.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fss.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        fss.setEnabled(false);
        fss.setFocusable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(fss, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(119, 119, 119))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(22, 22, 22)
                .addComponent(nume, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        x.setBackground(p.getBackground());

        cout.setBackground(x.getBackground());
        cout.setMajorTickSpacing(20);
        cout.setMaximum(99);
        cout.setMinimum(55);
        cout.setMinorTickSpacing(1);
        cout.setPaintTicks(true);
        cout.setSnapToTicks(true);
        cout.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "choisissez le cout", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 0, 14))); // NOI18N
        cout.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                coutMouseWheelMoved(evt);
            }
        });
        cout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coutMouseClicked(evt);
            }
        });
        cout.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                coutStateChanged(evt);
            }
        });
        cout.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                coutFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                coutFocusLost(evt);
            }
        });

        cout_aff.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cout_aff.setText("1500");
        cout_aff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cout_affActionPerformed(evt);
            }
        });

        fiab.setBackground(x.getBackground());
        fiab.setMajorTickSpacing(20);
        fiab.setMaximum(99);
        fiab.setMinorTickSpacing(1);
        fiab.setPaintTicks(true);
        fiab.setSnapToTicks(true);
        fiab.setValue(0);
        fiab.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "choisissez la fiabilité ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 0, 14))); // NOI18N
        fiab.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                fiabMouseWheelMoved(evt);
            }
        });
        fiab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiabMouseClicked(evt);
            }
        });
        fiab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fiabStateChanged(evt);
            }
        });
        fiab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fiabFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fiabFocusLost(evt);
            }
        });

        txt_fiab.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_fiab.setText("9");
        txt_fiab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fiabActionPerformed(evt);
            }
        });

        txt_tomp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_tomp.setText("100");

        fiab2.setBackground(x.getBackground());
        fiab2.setMaximum(5);
        fiab2.setMinorTickSpacing(1);
        fiab2.setPaintTicks(true);
        fiab2.setSnapToTicks(true);
        fiab2.setValue(0);
        fiab2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "choisissez le temps de réponse", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 0, 14))); // NOI18N
        fiab2.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                fiab2MouseWheelMoved(evt);
            }
        });
        fiab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiab2MouseClicked(evt);
            }
        });
        fiab2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fiab2StateChanged(evt);
            }
        });
        fiab2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fiab2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fiab2FocusLost(evt);
            }
        });

        fiab3.setBackground(x.getBackground());
        fiab3.setMajorTickSpacing(20);
        fiab3.setMaximum(9);
        fiab3.setMinorTickSpacing(1);
        fiab3.setPaintTicks(true);
        fiab3.setSnapToTicks(true);
        fiab3.setValue(0);
        fiab3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "choisissez la securité ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 0, 14))); // NOI18N
        fiab3.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                fiab3MouseWheelMoved(evt);
            }
        });
        fiab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiab3MouseClicked(evt);
            }
        });
        fiab3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fiab3StateChanged(evt);
            }
        });
        fiab3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fiab3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fiab3FocusLost(evt);
            }
        });

        txt_scu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_scu.setText("9");

        fiab4.setBackground(x.getBackground());
        fiab4.setMajorTickSpacing(50);
        fiab4.setMaximum(99);
        fiab4.setMinorTickSpacing(10);
        fiab4.setPaintTicks(true);
        fiab4.setSnapToTicks(true);
        fiab4.setValue(0);
        fiab4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "choisissezde la disponibilité", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 0, 14))); // NOI18N
        fiab4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fiab4StateChanged(evt);
            }
        });
        fiab4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fiab4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fiab4FocusLost(evt);
            }
        });
        fiab4.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                fiab4MouseWheelMoved(evt);
            }
        });
        fiab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiab4MouseClicked(evt);
            }
        });

        txt_dis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_dis.setText("9");
        txt_dis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_disActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout xLayout = new javax.swing.GroupLayout(x);
        x.setLayout(xLayout);
        xLayout.setHorizontalGroup(
            xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(xLayout.createSequentialGroup()
                        .addComponent(fiab4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dis))
                    .addGroup(xLayout.createSequentialGroup()
                        .addGroup(xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fiab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fiab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tomp)
                            .addComponent(txt_fiab)
                            .addComponent(cout_aff, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
                    .addGroup(xLayout.createSequentialGroup()
                        .addComponent(fiab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_scu))))
        );
        xLayout.setVerticalGroup(
            xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xLayout.createSequentialGroup()
                .addGroup(xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fiab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(xLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_fiab, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, xLayout.createSequentialGroup()
                        .addComponent(cout_aff, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fiab2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, xLayout.createSequentialGroup()
                        .addComponent(txt_tomp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(xLayout.createSequentialGroup()
                        .addComponent(fiab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, xLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_scu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fiab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(xLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txt_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fiab4.getAccessibleContext().setAccessibleName("choix de la disponibilité");

        t_aff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N° de la tache", "Machine virtuelle", "Durée de la tache", "Coùt", "Fiabilité", "Réponse temps", "Sécurité", "Disponibilite"
            }
        ));
        jScrollPane4.setViewportView(t_aff);

        p.setBackground(new java.awt.Color(225, 253, 253));
        p.setLayout(null);

        ant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ant.setText("50");
        ant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antActionPerformed(evt);
            }
        });
        p.add(ant);
        ant.setBounds(190, 20, 50, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nbre de fourmis :");
        p.add(jLabel1);
        jLabel1.setBounds(10, 26, 130, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nbre d'iterations   :");
        p.add(jLabel2);
        jLabel2.setBounds(10, 52, 120, 17);

        generer.setBackground(p.getBackground());
        generer.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        generer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/backup-update-icone-7103-48.png"))); // NOI18N
        generer.setText("démarrer ACO");
        generer.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 153), null));
        generer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genererActionPerformed(evt);
            }
        });
        p.add(generer);
        generer.setBounds(30, 140, 190, 40);

        utiration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        utiration.setText("60");
        utiration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utirationActionPerformed(evt);
            }
        });
        p.add(utiration);
        utiration.setBounds(190, 50, 50, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        p.add(jLabel4);
        jLabel4.setBounds(100, 230, 0, 0);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("q0 :");
        p.add(jLabel6);
        jLabel6.setBounds(130, 90, 30, 20);

        q.setText("0.5");
        p.add(q);
        q.setBounds(190, 90, 33, 30);

        b.setText("2");
        p.add(b);
        b.setBounds(60, 90, 33, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("B :");
        p.add(jLabel7);
        jLabel7.setBounds(10, 90, 20, 20);

        jButton2.setBackground(p.getBackground());
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/backup-update-icone-7103-48.png"))); // NOI18N
        jButton2.setText("algorithme génétique");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        p.add(jButton2);
        jButton2.setBounds(30, 190, 174, 40);

        jButton4.setBackground(p.getBackground());
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/restart-icone-6568-32.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        p.add(jButton4);
        jButton4.setBounds(140, 300, 50, 40);

        quitter.setBackground(p.getBackground());
        quitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/release-icone-4863-48.png"))); // NOI18N
        quitter.setBorder(null);
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });
        p.add(quitter);
        quitter.setBounds(190, 300, 70, 40);

        jLabel25.setText("mutation :");
        p.add(jLabel25);
        jLabel25.setBounds(20, 270, 70, 16);

        jLabel14.setText("croisement :");
        p.add(jLabel14);
        jLabel14.setBounds(20, 246, 80, 16);

        mutation.setText("0.5");
        p.add(mutation);
        mutation.setBounds(120, 270, 40, 28);

        croisment.setText("0.5");
        p.add(croisment);
        croisment.setBounds(120, 240, 40, 28);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/f.jpeg"))); // NOI18N
        p.add(jLabel10);
        jLabel10.setBounds(0, 0, 270, 330);

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setForeground(new java.awt.Color(102, 255, 102));
        jProgressBar1.setToolTipText("");
        jProgressBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jProgressBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jProgressBar1.setStringPainted(true);

        info_fscor.setColumns(20);
        info_fscor.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        info_fscor.setRows(5);
        jScrollPane2.setViewportView(info_fscor);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(x, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(121, 121, 121))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Planification des taches", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 1370, 740);

        setSize(new java.awt.Dimension(1387, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void generer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generer1ActionPerformed

        int vtnum = Integer.parseInt(nm_tache.getText());
        int tach_num = Integer.parseInt(nm_tache.getText());
        DM = new DefaultTableModel(g.generertaches(tach_num), entetes1);

        table_tache.setModel(DM);


    }//GEN-LAST:event_generer1ActionPerformed

    public double get_poi_fiab() {

        return Double.parseDouble(tpfiab.getText());

    }

    public double get_pdisp() {

        return Double.parseDouble(tpdisp.getText());

    }

    public double get_poi_suc() {

        return Double.parseDouble(tpsuc.getText());

    }

    public double get_poi_tom() {

        return Double.parseDouble(tptom.getText());

    }

    public double get_poi_cost() {

        return Double.parseDouble(tpcost.getText());

    }

    public int get_tachenum() {

        return Integer.parseInt(nm_tache.getText());

    }

    @SuppressWarnings("empty-statement")
    private void genererActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genererActionPerformed

        Thread po1 = new Thread() {
            public void run() {
                x.enable(false);
                nume.setText("");

                int nbreVM = Integer.parseInt(num_vm.getText());
                int nbreant = Integer.parseInt(ant.getText());
                int utira = Integer.parseInt(utiration.getText());
                int repti = 1;
                int tach_num = Integer.parseInt(nm_tache.getText());



                /**
                 * *****************************
                 */
                /**
                 * *****************************
                 */
                Execute_AntColony a = new Execute_AntColony(g.matrix, nbreant, nbreVM, tach_num, utira, repti);
                a.fs = 0.1;
                DM = new DefaultTableModel(g.display_resultat(a.get_path()), entetesf);

                path = a.get_path();

                t_aff.setModel(DM);
                t_aff.setVisible(true);
                jProgressBar1.setValue(100);
                jProgressBar1.setStringPainted(true);
                nume.setText(utiration.getText());

                tt_cout.setText(g.get_cout_totale() + "");
                tomp_ex.setText(g.get_temp_total() + "");

                fii.setText(g.riability_toutal() + "");

                jTextField3.setText(g.dispo_toutal() + "");

                sec_tt.setText(g.secru_toutal() + "");

                jButton2.setVisible(true);


                mutation.setVisible(true);
                jLabel25.setVisible(true);
                croisment.setVisible(true);
                jLabel14.setVisible(true);






                Ant.reset();
                F_scor.clear();
                cout_stat.clear();
                fiab_stat.clear();
                tomp_stat.clear();
                suc_stat.clear();
                dispo_stat.clear();

            }
        };

        Thread po = new Thread() {
            public void run() {

                double fsco = 0.2;
                int uu = 1;
                int rR = 1;
                int utira = Integer.parseInt(utiration.getText());
                int repti = 1 ;

                while (repp < repti) {

                    if (rR != repp) {
                        info_fscor.setText(info_fscor.getText() + "\n" + " ______________ Lancer  les fourmis .. . " + (repp + 1));
                        rR = repp;
                    }
                    //nume1.setText("" + (repp + 1));

                    while (utira > nu_utiration) {

                        jProgressBar1.setValue(((nu_utiration * 100) / utira));

                        jProgressBar1.setStringPainted(true);
                        nume.setText("" + (nu_utiration));
                        //  fss.setText("" + f_sco);

                        if (f_sco != fsco) {
                            info_fscor.setText(info_fscor.getText() + "\n      Ant Score : " + f_sco + "     Itération :" + nu_utiration);

                            fsco = f_sco;
                        }

                    }

                }

            }
        };

        po1.start();
        po.start();

    }//GEN-LAST:event_genererActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double poit_temp, pot_cout, poit_dis, poit_fiab, poitsuc;

        poit_fiab = Double.parseDouble(tpfiab.getText());
        pot_cout = Double.parseDouble(tpcost.getText());
        poit_dis = Double.parseDouble(tpdisp.getText());
        poitsuc = Double.parseDouble(tpsuc.getText());
        poit_temp = Double.parseDouble(tptom.getText());

        int nbreVM = Integer.parseInt(num_vm.getText());
        int costmax = Integer.parseInt(tcmax.getText());
        int costmin = Integer.parseInt(tcmin.getText());
        int tache_number = Integer.parseInt(nm_tache.getText());
        if (((poit_fiab + pot_cout + poit_dis + poit_fiab + poitsuc) > 1.1) || (nbreVM > 99 || (tache_number) < nbreVM) || tache_number < 10) {

            DM = new DefaultTableModel(g.genererVM(nbreVM, costmax, costmin, poit_fiab, poit_temp, pot_cout, poitsuc, poit_dis), entetes);
            table_vm.setModel(DM);
        } else {
            JOptionPane.showMessageDialog(null, "   Paramétres QoS > 1 ");

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void utirationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utirationActionPerformed
    }//GEN-LAST:event_utirationActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

        int cmin = Integer.parseInt(tcmin.getText());
        int cm = Integer.parseInt(tcmax.getText());
        int ta = Integer.parseInt(nm_tache.getText());
        cout.setMinimum((cmin * (ta)) + (2 * ta));
        cout.setMaximum(cm * ta);

        int tt = 50;
        int tm = Integer.parseInt(ttlimit.getText());

        fiab2.setMinimum(50 * ta);
        fiab2.setMaximum(tm * ta);


    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
    }//GEN-LAST:event_jPanel3MouseClicked

    private void fiabFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fiabFocusLost
    }//GEN-LAST:event_fiabFocusLost

    private void fiabFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fiabFocusGained
    }//GEN-LAST:event_fiabFocusGained

    private void fiabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiabMouseClicked
    }//GEN-LAST:event_fiabMouseClicked

    private void fiabMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_fiabMouseWheelMoved
    }//GEN-LAST:event_fiabMouseWheelMoved

    private void fiabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fiabStateChanged

        int X = fiab.getValue();

        double x = (double) X;
        txt_fiab.setText("" + x);

    }//GEN-LAST:event_fiabStateChanged

    private void coutMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_coutMouseWheelMoved
    }//GEN-LAST:event_coutMouseWheelMoved

    private void coutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coutMouseClicked
    }//GEN-LAST:event_coutMouseClicked

    private void coutStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_coutStateChanged
        cout_aff.setText("" + cout.getValue());
    }//GEN-LAST:event_coutStateChanged

    private void coutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_coutFocusGained
    }//GEN-LAST:event_coutFocusGained

    private void coutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_coutFocusLost
    }//GEN-LAST:event_coutFocusLost

    private void fiab2MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_fiab2MouseWheelMoved
    }//GEN-LAST:event_fiab2MouseWheelMoved

    private void fiab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiab2MouseClicked
    }//GEN-LAST:event_fiab2MouseClicked

    private void fiab2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fiab2StateChanged
        txt_tomp.setText("" + fiab2.getValue());

        System.out.println(fiab2.getValue());

    }//GEN-LAST:event_fiab2StateChanged

    private void fiab2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fiab2FocusGained
    }//GEN-LAST:event_fiab2FocusGained

    private void fiab2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fiab2FocusLost
    }//GEN-LAST:event_fiab2FocusLost

    private void fiab3MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_fiab3MouseWheelMoved
    }//GEN-LAST:event_fiab3MouseWheelMoved

    private void fiab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiab3MouseClicked
    }//GEN-LAST:event_fiab3MouseClicked

    private void fiab3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fiab3StateChanged

        int X = fiab3.getValue();

        double xX = (double) (X);
        txt_scu.setText("" + xX);


    }//GEN-LAST:event_fiab3StateChanged

    private void fiab3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fiab3FocusGained
    }//GEN-LAST:event_fiab3FocusGained

    private void fiab3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fiab3FocusLost
    }//GEN-LAST:event_fiab3FocusLost

    private void fiab4MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_fiab4MouseWheelMoved
    }//GEN-LAST:event_fiab4MouseWheelMoved

    private void fiab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiab4MouseClicked
    }//GEN-LAST:event_fiab4MouseClicked

    private void fiab4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fiab4StateChanged

        int X = fiab4.getValue();

        double x = (double) (X);
        txt_dis.setText("" + x);


    }//GEN-LAST:event_fiab4StateChanged

    private void fiab4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fiab4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_fiab4FocusGained

    private void fiab4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fiab4FocusLost
    }//GEN-LAST:event_fiab4FocusLost

    private void antActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antActionPerformed
    }//GEN-LAST:event_antActionPerformed

    private void txt_fiabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fiabActionPerformed
    }//GEN-LAST:event_txt_fiabActionPerformed

    private void txt_disActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_disActionPerformed
    }//GEN-LAST:event_txt_disActionPerformed

    private void cout_affActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cout_affActionPerformed
    }//GEN-LAST:event_cout_affActionPerformed

    private void num_vmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_vmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_vmActionPerformed

    private void cfiabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfiabActionPerformed

        if (cfiab.isSelected() == true) {
            tpfiab.setText("0.1");
            tpfiab.enable();
        }
        if (cfiab.isSelected() == false) {
            tpfiab.setText("0.0");
            tpfiab.enable(false);
        }


    }//GEN-LAST:event_cfiabActionPerformed

    private void cdispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdispActionPerformed
        if (cdisp.isSelected() == true) {
            tpdisp.setText("0.1");
            tpdisp.enable();
        }
        if (cdisp.isSelected() == false) {
            tpdisp.setText("0.0");
            tpdisp.enable(false);
        }
    }//GEN-LAST:event_cdispActionPerformed

    private void ccoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccoutActionPerformed
        if (ccout.isSelected() == true) {
            tpcost.setText("0.1");
            tpcost.enable();
        }
        if (ccout.isSelected() == false) {
            tpcost.setText("0.0");
            tpcost.enable(false);
        }
    }//GEN-LAST:event_ccoutActionPerformed

    private void ccout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccout1ActionPerformed
        if (ccout1.isSelected() == true) {
            tpsuc.setText("0.1");
            tpsuc.enable();
        }
        if (ccout1.isSelected() == false) {
            tpsuc.setText("0.0");
            tpsuc.enable(false);
        }
    }//GEN-LAST:event_ccout1ActionPerformed

    private void ccout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccout2ActionPerformed
        if (ccout2.isSelected() == true) {
            tptom.setText("0.1");
            tptom.enable();
        }
        if (ccout2.isSelected() == false) {
            tptom.setText("0.0");
            tptom.enable(false);
        }
    }//GEN-LAST:event_ccout2ActionPerformed

    public ArrayList<Double> modify(ArrayList<Double> al) {

// add elements to al, including duplicates
        HashSet hs = new HashSet();
        hs.addAll(al);
        al.clear();
        al.addAll(hs);
        return al;

    }
    int GA_U;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


        Thread Ga1 = new Thread() {
            public void run() {


                cout_stat.clear();
                fiab_stat.clear();
                tomp_stat.clear();
                suc_stat.clear();
                dispo_stat.clear();

                int tach_num = Integer.parseInt(nm_tache.getText());
                int nbreVM = Integer.parseInt(num_vm.getText());
                int utiration_ga = Integer.parseInt(utiration.getText());
                double m_dPathValue = 0.1;
                double s_dBestPathValue = Double.parseDouble(fss.getText());

                String Xx = "";
                VMS = new ArrayList<>();
                Vt = new ArrayList<>();

                int path2[] = new int[tach_num];
                int best_bath[] = new int[tach_num];

                double p_fiab = Double.parseDouble(txt_fiab.getText());
                double p_cout = Double.parseDouble(cout_aff.getText());
                double p_dis = Double.parseDouble(txt_dis.getText());
                double p_suc = Double.parseDouble(txt_scu.getText());
                double p_temp = Double.parseDouble(txt_tomp.getText());
                double met = Double.parseDouble(mutation.getText());
                double croi = Double.parseDouble(croisment.getText());
                double Mm = 0;
                double fibility_s = 0;
                double scu_st = 0;
                double tomp_st = 0;
                double dis_st = 0;

                Gaa N = new Gaa();
                N.setVisible(true);
                for (int k = 0; k < utiration_ga; k++) {
                    GA_U = (int) (k * 100) / utiration_ga;



                    Gaa.bar_ga.setValue(GA_U);



                    Gaa.bar_ga.setStringPainted(true);

                    for (int L = 0; L < utiration_ga; L++) {
                        WF.clear();

                        try {
                            try {
                                for (int i = 0; i < tach_num; i++) {
                                    int tau = init_codage(nbreVM);
                                    if (best_bath[i] != tau) {
                                        VMS.add(tau);
                                    }

                                }
                            } catch (Exception e) {
                                WF.clear();
                                for (int i = 0; i < tach_num; i++) {
                                    int tau = init_codage(nbreVM);
                                    if (best_bath[i] != tau) {
                                        VMS.add(tau);
                                    }
                                }

                            }
                        } catch (Exception e) {
                        }

                        GA ga = new GA(croi, met);
                        for (int i = 0; i < tach_num; i++) {
                            Vt.add(path[i]);

                        }
                        try {
                            for (int i = 0; i < tach_num; i++) {
                                Xx = ga.croisement(Vt, VMS, i);

                                Xx = Xx.substring(0, Xx.indexOf(' '));
                                path2[i] = Integer.parseInt(Xx);

                            }
                        } catch (Exception e) {
                        }
                        F_scour fj = new F_scour(path2);
                         m_dPathValue = fj.F_sorce(p_suc, p_temp, p_cout, p_fiab, p_dis);
                     if (m_dPathValue > s_dBestPathValue) {
                            System.arraycopy(path2, 0, best_bath, 0, path2.length);

                            s_dBestPathValue = m_dPathValue;
                            info_fscor.setText(info_fscor.getText() + "\n" + "      GA Score :  " + s_dBestPathValue + "          itération n°: " + k);

                            for (int PL = 0; PL < best_bath.length; PL++) {
                                Mm += generates_and_display.cout.get(best_bath[PL]);
                                tomp_st += generates_and_display.power.get(best_bath[PL]);

                            }

                            try {
                                ga_stat_utération.add(k);
                                cout_stat.add(Mm);
                                tomp_stat.add(tomp_st);

                                fiab_stat.add(g.riability_toutal_ga());
                                suc_stat.add(g.secru_toutal_ga());
                                dispo_stat.add(g.dispo_toutal_ga());

                                Mm = 0;
                                fibility_s = 0;
                                scu_st = 0;
                                tomp_st = 0;
                                dis_st = 0;
                            } catch (Exception e) {
                            }
                        }

                    }

                }  // fin éturation de algorithme génétique

                /* DM = new DefaultTableModel(display_info_Ga(), entetesf_1);
                 Frame_GA.info_ga.setModel(DM);
                 Frame_GA.info_ga.setVisible(true);*/

                DM = new DefaultTableModel(g.display_resultat_GA(best_bath), entetesf);
                Frame_GA.aff.setModel(DM);
                Frame_GA.aff.setVisible(true);
                //Frame_GA.cout_GA.setText(cout_stat.get(cout_stat.size()-1)+"");
                Frame_GA.Fs.setText("" + s_dBestPathValue);
                Gaa.bar_ga.setValue(100);
                Gaa.bar_ga.setStringPainted(true);
                fre.setVisible(true);
                N.setVisible(false);
                if (Integer.parseInt("" + Frame_GA.aff.getValueAt(1, 1)) == 1 && Integer.parseInt("" + Frame_GA.aff.getValueAt(2, 1)) == 1) {
                    fre.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Désole ... pas d'amélioration par l'algorithme génétique  \n        réessayer");
                }
            }
        };

        Ga1.start();


    }//GEN-LAST:event_jButton2ActionPerformed
    public boolean better(double dPathValue1, double dPathValue2) {

        boolean xg;
        xg = dPathValue1 > dPathValue2;

        return xg;
    }

    public int init_codage(int nbreVM) {

        Random rn = new Random();
        id_VM = rn.nextInt(nbreVM);

        if (!WF.containsKey(id_VM)) {
            WF.put(id_VM, id_VM);
            return id_VM;
        } else {
            return init_codage(id_VM);
        }
    }

    public Object[][] display_info() {

        int compter = cout_stat.size();

        Object[][] donnees = new Object[compter][6];
        int aan = Integer.parseInt(ant.getText());

        int Kybol = 1000;
        for (int i = 0; i < compter; i++) {

            double Kk = ((i + 1) / aan);
            int Vv = (int) Kk + 1;
            if (Vv >= nu_utiration) {
                Vv = Vv - 1;
            }

            if (Vv != Kybol) {
                donnees[Vv - 1][0] = Vv;
                donnees[Vv - 1][1] = cout_stat.get(i);
                donnees[Vv - 1][2] = new DecimalFormat("##.####").format(fiab_stat.get(i));
                donnees[Vv - 1][3] = new DecimalFormat("##.####").format(tomp_stat.get(i));
                donnees[Vv - 1][4] = new DecimalFormat("##.####").format(suc_stat.get(i));
                donnees[Vv - 1][5] = new DecimalFormat("##.####").format(dispo_stat.get(i));
            }
            Kybol = Vv;
        }
        cout_stat.clear();
        fiab_stat.clear();
        tomp_stat.clear();
        suc_stat.clear();
        dispo_stat.clear();
        return donnees;
    }

    public Object[][] display_info_Ga() {

        int compter = ga_stat_utération.size();

        Object[][] donnees = new Object[compter][6];
        int aan = Integer.parseInt(ant.getText());
        int Kybol = 1000;
        for (int i = 0; i < compter; i++) {

            donnees[i][0] = ga_stat_utération.get(i);
            donnees[i][1] = cout_stat.get(i);
            donnees[i][2] = new DecimalFormat("##.####").format(fiab_stat.get(i));
            donnees[i][3] = new DecimalFormat("##.####").format(tomp_stat.get(i));
            donnees[i][4] = new DecimalFormat("##.####").format(suc_stat.get(i));
            donnees[i][5] = new DecimalFormat("##.####").format(dispo_stat.get(i));
        }

        return donnees;
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Ant.reset();
        F_scor.clear();
        cout_stat.clear();
        fiab_stat.clear();
        tomp_stat.clear();
        suc_stat.clear();
        dispo_stat.clear();
        WF.clear();
        nume.setText("");
        //nume1.setText("");
        fss.setText("");
        Ant4TSP.reset();
        DM = new DefaultTableModel(g.display_resultat_clear(), entetesf);
        t_aff.setModel(DM);
        t_aff.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
new fenetreconfirm();        // TODO add your handling code here:
    }//GEN-LAST:event_quitterActionPerformed

    private void tpcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpcostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpcostActionPerformed

    private void tpsucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpsucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpsucActionPerformed

    public static void main(String args[]) {
        Thread frem = new Thread() {
            public void run() {
                new form().setVisible(true);
            }
        };

        frem.start();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ant;
    public static javax.swing.JTextField b;
    private javax.swing.JCheckBox ccout;
    private javax.swing.JCheckBox ccout1;
    private javax.swing.JCheckBox ccout2;
    private javax.swing.JCheckBox cdisp;
    private javax.swing.JCheckBox cfiab;
    private javax.swing.JSlider cout;
    public static javax.swing.JTextField cout_aff;
    private javax.swing.JTextField croisment;
    private javax.swing.JSlider fiab;
    private javax.swing.JSlider fiab2;
    private javax.swing.JSlider fiab3;
    private javax.swing.JSlider fiab4;
    private javax.swing.JTextField fii;
    public static javax.swing.JTextField fss;
    private javax.swing.JButton generer;
    private javax.swing.JButton generer1;
    private javax.swing.JTextArea info_fscor;
    private javax.swing.JLabel j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField mutation;
    public static javax.swing.JTextField nm_tache;
    public static javax.swing.JTextField num_vm;
    private javax.swing.JTextField nume;
    private javax.swing.JPanel p;
    public static javax.swing.JTextField q;
    private javax.swing.JButton quitter;
    private javax.swing.JTextField sec_tt;
    private javax.swing.JTable t_aff;
    public javax.swing.JTable table_tache;
    private javax.swing.JTable table_vm;
    private javax.swing.JTextField tcmax;
    private javax.swing.JTextField tcmin;
    private javax.swing.JTextField tomp_ex;
    public static javax.swing.JTextField tpcost;
    public static javax.swing.JTextField tpdisp;
    public static javax.swing.JTextField tpfiab;
    public static javax.swing.JTextField tpsuc;
    public static javax.swing.JTextField tptom;
    private javax.swing.JTextField tt_cout;
    public static javax.swing.JTextField ttlimit;
    public static javax.swing.JTextField txt_dis;
    public static javax.swing.JTextField txt_fiab;
    public static javax.swing.JTextField txt_scu;
    public static javax.swing.JTextField txt_tomp;
    private javax.swing.JTextField utiration;
    public javax.swing.JPanel workflow;
    private javax.swing.JPanel x;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
