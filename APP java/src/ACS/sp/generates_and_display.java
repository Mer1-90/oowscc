/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ACS.sp;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class generates_and_display {

    static ArrayList<Integer> longueur;// un tableau dynamique qui contient le liste des valeurs de la longueur des taches ;
    static ArrayList<Double> longueurnorm;// un tableau dynamique qui contient le liste des valeurs de la longueur des taches ;
    public static ArrayList<Double> cout;// un tableau dynamique qui contient les couts des VMs
    static ArrayList<Double> coutnorm;// un tableau dynamique qui contient le liste des valeurs de la longueur des taches ;
    static ArrayList<Integer> disponibilitenorm;// un tableau dynamique qui contient le liste des valeurs de la longueur des taches ;
    public static ArrayList<Double> disponibilite;// un tableau dynamique qui contient le liste des vaaleurs de disponibilite des VM;
    public static ArrayList<Double> power;// un tableau dynamique qui contient le liste des valeurs de computers powers;
    public static ArrayList<Double> fiabilite;// un tableau dynamique qui contient le liste des valeurs  fiabilite des VM;
    static ArrayList<Double> powernorm;// un tableau dynamique qui contient le liste des valeurs de la longueur des taches ;
    public static ArrayList<Double> security;// un tableau dynamique qui contient le liste des vaaleurs de disponibilite des VM;
    public static ArrayList<Integer> work;
    public static ArrayList<Double> tomp_réponse;
    static ArrayList<Double> fiabilitee_result;
    static ArrayList<Double> security_result;
    static ArrayList<Double> disponibili_result;
    static ArrayList<Double> QR_n;
    static ArrayList<Double> Qs_n;
    static ArrayList<Double> Qt_n;
    static ArrayList<Double> Qc_n;
    static ArrayList<Double> Qd_n;
     static ArrayList<Double> result;
    public static double meu_fscore;
    public double[][] matrix;
    double valdisp, fiab;
    Random rn;
    int t;
    F_scour G;
    int num_tache;
    int numvm;
    public double cout_total;
    public int temp_totale;

    public generates_and_display() {
        longueur = new ArrayList<>();
        longueurnorm = new ArrayList<>();
        fiabilite = new ArrayList<>();
        power = new ArrayList<>();
        disponibilite = new ArrayList<>();
        disponibilitenorm = new ArrayList<>();
        powernorm = new ArrayList<>();
        coutnorm = new ArrayList<>();
        cout = new ArrayList<>();
        security = new ArrayList<>();
        work = new ArrayList<>();
        fiabilitee_result = new ArrayList<>();
        security_result = new ArrayList<>();
        disponibili_result = new ArrayList<>();
        result = new ArrayList<>();



        rn = new Random();

    }
    public double fiabi;
    public double securitéé;
    public double désponibilité_ant;

    public Object[][] display_resultat(int[] path) {

        Object[][] donnees = new Object[num_tache][8];



        if (path.length != 0) {
            for (int i = 0; i < path.length; i++) {
                work.add(path[i]);
            }

            for (int i = 0; i < num_tache; i++) {
                int x = (work.get(i));

                donnees[i][0] = i + 1;
                donnees[i][1] = work.get(i) + 1;
                donnees[i][2] = longueur.get(i);
                donnees[i][3] = cout.get(x);
                donnees[i][4] = fiabilite.get(x);
                donnees[i][5] = power.get(x);
                donnees[i][6] = security.get(x);
                donnees[i][7] = disponibilite.get(x);

                fiabilitee_result.add(fiabilite.get(x));

                fiabilitee_result.add(fiabilite.get(x));
                security_result.add(security.get(x));
                disponibili_result.add(disponibilite.get(x));



                cout_total += cout.get(x);
                temp_totale += power.get(i);
            }
            form.fss.setText(" " + meu_fscore);

            work.clear();
            try {
                fiabi = Collections.min(fiabilitee_result);

            } catch (Exception e) {
                System.out.println("erreur fiability . . .");
            }


            try {

                securitéé = Collections.min(security_result);

            } catch (Exception e) {
                System.out.println("erreur securitéé result . . .");
            }

            try {


                désponibilité_ant = Collections.min(disponibili_result);

            } catch (Exception e) {
                System.out.println("erreur disponibili_result . . .");
            }


        }

        return donnees;
    }

    public Object[][] display_resultat_clear() {

        Object[][] donnees = new Object[num_tache][8];


        return donnees;
    }

    public Object[][] display_resultat_GA(int[] path) {
        
        Object[][] donnees = new Object[num_tache][8];
        work.clear();
fiabilitee_result.clear();
security_result.clear();
disponibili_result.clear();
         if (path.length != 0) {
            
            for (int i = 0; i < path.length; i++) {
                work.add(path[i]);
            }
 double cout_tt = 0 ; double tomp_tt = 0 ;
            for (int i = 0; i < num_tache; i++) {
                int x = (work.get(i) );
          
                donnees[i][0] = i + 1;
                donnees[i][1] = work.get(i) + 1;
                donnees[i][2] = longueur.get(i);
                donnees[i][3] = cout.get(x);
                donnees[i][4] = fiabilite.get(x);
                donnees[i][5] = power.get(x);
                donnees[i][6] = security.get(x);
                donnees[i][7] = disponibilite.get(x);


                 cout_tt +=cout.get(x);tomp_tt+=power.get(x);
                fiabilitee_result.add(fiabilite.get(x));
                security_result.add(security.get(x));
                disponibili_result.add(disponibilite.get(x));



            }

       
            
 
                  System.err.println( Collections.min(fiabilitee_result) );
                  
                  Frame_GA.ffff.setText(""+Collections.min(fiabilitee_result));
                  Frame_GA.ssss.setText(""+Collections.min(security_result));
                  Frame_GA.dddd.setText(""+Collections.min(disponibili_result));
                  Frame_GA.cccc.setText(""+cout_tt);
                  Frame_GA.tttt.setText(""+tomp_tt);
 
        }
        return donnees;
    }

    public double riability_toutal() {

        return fiabi;
    }

    public double dispo_toutal() {

        return désponibilité_ant;
    }

    public double secru_toutal() {

        return securitéé;
    }

    public double riability_toutal_ga() {

        return fiabi;
    }

    public double dispo_toutal_ga() {

        return désponibilité_ant;
    }

    public double secru_toutal_ga() {

        return securitéé;
    }

    public double get_cout_totale() {
        return cout_total;
    }

    public Object[][] generertaches(int popsize) {
        this.num_tache = popsize;

        for (int i = 0; i < popsize; i++) {
            t = rn.nextInt(100) + 100;
            longueur.add(t);
        }

        //la normalisation des longueur des taches
        for (int i = 0; i < popsize; i++) {
            double j = (double) longueur.get(i) / 199;
            j *= 100;
            j = Math.floor(j + 0.5);
            j /= 100.0;
            longueurnorm.add(j);
        }
        Object[][] donnees = new Object[popsize][3];

        for (int i = 0; i < popsize; i++) {
            donnees[i][0] = i + 1;
            donnees[i][1] = longueur.get(i);
            donnees[i][2] = longueurnorm.get(i);


        }

        return donnees;
    }

    public int get_temp_total() {
        return temp_totale;
    }

    public Object[][] genererVM(int nbreVM, int costmax, int costmin, double pr, double pt, double pc, double ps, double pd) {

        int times = Integer.parseInt(form.ttlimit.getText());


        //génération aleatoire de 300 cout  
        for (int i = 0; i < nbreVM; i++) {
            double tt = rn.nextInt(costmax - costmin + 1) + costmin;
            cout.add(tt);
        }

        for (int i = 0; i < nbreVM; i++) {
        }

        //génération aleatoire de 300 computers security
        for (int i = 0; i < nbreVM; i++) {//powernorm
            double ct = rn.nextInt(times - 50) + 50;

            power.add(ct);
        }

        for (int i = 0; i < nbreVM; i++) {
            double ct = rn.nextInt(7) + rn.nextFloat() + 2;

            security.add(ct + rn.nextFloat());
        }

        for (int i = 0; i < nbreVM; i++) {
            double ct = rn.nextInt(7) + rn.nextFloat() + 2;
            disponibilite.add(ct + rn.nextFloat());
        }

        for (int i = 0; i < nbreVM; i++) {
            double ct = rn.nextInt(7) + rn.nextFloat() + 2;
            fiabilite.add(ct + rn.nextFloat());

        }

        Object[][] donnees = new Object[nbreVM][11];
        //génération aleatoire des fiabilité

        /**
         * *************************normalisation*******************************
         */
        int NB_VM = Integer.parseInt(form.num_vm.getText());

        matrix = new double[NB_VM][NB_VM];

        QR_n = new ArrayList<>();
        Qs_n = new ArrayList<>();
        Qt_n = new ArrayList<>();
        Qc_n = new ArrayList<>();
        Qd_n = new ArrayList<>();

        //// normalisier la fiabilité 
        for (int i = 0; i < NB_VM; i++) {
            double min_r = Collections.max(fiabilite);
            double j = (double) fiabilite.get(i) / min_r;
            j *= 100;
            j = Math.floor(j + 0.5);
            j /= 100.0;

            QR_n.add(j);
        }

        //// normalisier le time
        for (int i = 0; i < NB_VM; i++) {
            double max_tim = Collections.max(power);
            double r = (max_tim - power.get(i)) / max_tim;
            double j = (double) power.get(i) / max_tim;
            j *= 100;
            j = Math.floor(j + 0.5);
            j /= 100.0;
            Qt_n.add(j);

        }

        //// normalisier le couts
        for (int i = 0; i < NB_VM; i++) {
            double max_cou = Collections.max(cout);
            double f = (double) cout.get(i) / max_cou;
            f *= 100;
            f = Math.floor(f + 0.5);
            f /= 100.0;
            Qc_n.add(f);

        }

        //// normalisier la security
        for (int i = 0; i < NB_VM; i++) {
            double min_suc = Collections.max(security);

            double j = (double) security.get(i) / min_suc;
            j *= 100;
            j = Math.floor(j + 0.5);
            j /= 100.0;
            Qs_n.add(j);
        }

        //// normalisier la disponibility
        for (int i = 0; i < NB_VM; i++) {
            double max_cou = Collections.max(disponibilite);
            double f = (double) disponibilite.get(i) / max_cou;
            f *= 100;
            f = Math.floor(f + 0.5);
            f /= 100.0;
            Qd_n.add(f);

        }
        for (int j = 0; j < NB_VM; j++) {
            for (int i = 0; i < NB_VM; i++) {
                double summ;
                summ = (QR_n.get(i) * pr) + (Qs_n.get(i) * ps) + (Qt_n.get(i) * pt) + (Qd_n.get(i) * pd) + (Qc_n.get(i) * pc);

                matrix[i][j] = summ;

            }
        }

        for (int i = 0; i < nbreVM; i++) {
            donnees[i][0] = i + 1;
            donnees[i][1] = cout.get(i);
            donnees[i][2] = Qc_n.get(i);
            donnees[i][3] = new DecimalFormat("##.##").format(fiabilite.get(i));
            donnees[i][4] = QR_n.get(i);
            donnees[i][5] = power.get(i);
            donnees[i][6] = Qt_n.get(i);
            donnees[i][7] = new DecimalFormat("##.##").format(security.get(i));
            donnees[i][8] = Qs_n.get(i);
            donnees[i][9] = new DecimalFormat("##.##").format(disponibilite.get(i));
            donnees[i][10] = Qd_n.get(i);
        }
        return donnees;

    }

    public ArrayList<Double> get_fiability() {
        return fiabilite;
    }

    public ArrayList<Double> get_security() {
        return security;
    }

    public ArrayList<Double> get_power() {
        return power;
    }

    public ArrayList<Double> get_cout() {
        return cout;
    }

    public ArrayList<Double> get_disponibilite() {
        return disponibilite;
    }
}
