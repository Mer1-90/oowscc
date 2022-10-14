package ACS.sp;



import java.util.ArrayList;
public class GA {
	double croisrate,mutrate;
	double croisprob,muteprob;
	public GA(double croisprob, double muteprob)
	{
		// TODO Auto-generated constructor stub
		this.croisprob=croisprob;
		this.muteprob=muteprob;
	}
	//la fonction de croisement 
	 String croisement (ArrayList<Integer> ant1,ArrayList <Integer>ant2, int i)
	{
		 croisrate = Math.random();
		 if(croisrate<=croisprob)
		 {
			 permutation(ant1,ant2,i);
			 }
		 return ant1.get(i)+" "+ant2.get(i);
		 }
	 //la fonction de permutation entre deux entiers
	void permutation (ArrayList<Integer> ant1,ArrayList <Integer>ant2, int i)
	 {
 		 int ant3;
		 ant3=ant1.get(i);
		 ant1.set(i, ant2.get(i));
		 ant2.set(i,ant3);	
		 }
	 void Affectation(ArrayList<Integer> ant,int i,Integer valeur)
	 {
             
		 ant.set(i, valeur);
	 }
	 void mutation(ArrayList<Integer> ant,int i,Integer valeur)
	 {
		 mutrate=Math.random();
		 if(mutrate<=muteprob)
		 {
			 Affectation(ant,i,valeur);
		 }
		 else ant.set(i, ant.get(i));
		 
	 }
	 }
