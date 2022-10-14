 
package ACS.sp;

import java.util.ArrayList;

 


/*          _________*****  une class qui calcule le f scoure of chaque pathe  Eq : 20   *****_________*/

public class F_scour {
    
    
     ArrayList<Double> QR;            // table  fiability
     ArrayList<Double> Qs;            // table  security 
     ArrayList<Double> Qt;            // table temp 
     ArrayList<Double> Qc;            // table of cout
     ArrayList<Double> Qd;            // table de disponibility
     
     
   int  Path[];
      
        double pc=Double.parseDouble(form.tpcost.getText());
        double pd = Double.parseDouble(form.tpdisp.getText());
        double pt = Double.parseDouble(form.tptom.getText());
        double pr = Double.parseDouble(form.tpfiab.getText());
        double ps = Double.parseDouble(form.tpsuc.getText());
          
          
   
   
   
   
     public  F_scour (int path[]){
        
         this.Path = path;
        
        QR = generates_and_display.fiabilite;
        Qs = generates_and_display.security;
        Qt = generates_and_display.power;
        Qc = generates_and_display.cout;
        Qd = generates_and_display.disponibilite;
                                       }
          
          
      
       
 
      
       

     public double F_sorce(double min_seur ,double max_time,double budget ,double min_fiability,double min_dispo){
         
         
         double  SFr= min_fiab();
         
        
         double  SFs =min_sucy( );
         
          
      
        
          double SFd  =min_dispo( );
          double  SFt  = max_tim();
          double SFc  =max_cout( );      
         
         
         
         double F_cout=0.0;
         double F_fiab=0.0;
         double F_dispo=0.0;
         double F_tomp=0.0;
         double F_sec=0.0;
         
     
         
           try {
               F_cout =(double)(pc*(budget-SFc )/budget);
              
         }catch(Exception e){F_cout=0.0;}
          try {
               F_fiab =(double)   (pr*   ( SFr-min_fiability)/  min_fiability  );
           
            
            
           }catch(Exception e){ }
          
           try {
               F_dispo =(double)(pd*(   SFd-min_dispo)/min_dispo);
            
         }catch(Exception e){ }
            try {
               F_sec =(double)(ps*(    SFs-min_seur)/min_seur); 
          }catch(Exception e){ }
             try {
               F_tomp =(double)(pt*(  max_time-SFt )/max_time);
                       
            
         }catch(Exception e){ }
         
       
         double F_sourcee=5+(F_fiab)+(F_dispo+F_tomp)+(F_sec+F_cout);
                    
          return F_sourcee ;
                              }
          
       
    
    
      public double min_fiab(   ){
       double min =QR.get(Path[0]);
       
    for (int i=1;i<Path.length ;i++){
       if (min>QR.get(Path[i])){min=QR.get(Path[i]);}
      }
               
      
     return min;
      }
     
      
      
      
       public double min_sucy(   ){
      double min =Qs.get(Path[0]);
    for (int i=1;i<Path.length;i++){
       if (min>Qs.get(Path[i])){min=Qs.get(Path[i]);}
           }
    return min;
     }
   
     public double min_dispo(   ){
     double min =Qd.get(Path[0]);
    for (int i=1;i<Path.length;i++){
       if (min>Qd.get(Path[i])){min=Qd.get(Path[i]);}
           }
    return min;
     }
     
       public double max_tim(){
    double max =Qt.get(Path[0]);
    for (int i=1;i<Path.length;i++){
       max+=Qt.get(Path[i]);
           }
    return max;
     }
          public double max_cout( ){
   double max =0;
   
     for (int i=0;i<Path.length;i++){
       max+=Qc.get((Path[i])); 
       
            }
    return max;
     }

    
}
