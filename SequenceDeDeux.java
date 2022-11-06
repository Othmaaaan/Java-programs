
public class SequenceDeDeux {
	public static boolean sequenceDeDeux( int[]  x) {
	   boolean resultat=false;
	   int i=0;
	   while ((i<x.length-1) && (!resultat)){
		   if (x[i]==x[i+1]) {
			   resultat=true;
			   
		   }
	   i++;
	   }
	   return resultat;
	  }

	 
	public static void main(String[] args) {
	   
	    int[] Tab1 = {3,1,1,7,5};
	    int[] Tab2 = {1,6,4,3,3,3};
	    int[] Tab3 = {2,1,5,3,1,2,1};
	    
	     System.out.println("Il y a au moins une s�quence de deux �l�ments cons�cutifs �gaux dans Tab1 : " + sequenceDeDeux(Tab1));
	     System.out.println("Il y a au moins une s�quence de deux �l�ments cons�cutifs �gaux dans Tab2 : " + sequenceDeDeux(Tab2));
	     System.out.println("Il y a au moins une s�quence de deux �l�ments cons�cutifs �gaux dans Tab3 : " + sequenceDeDeux(Tab3));
	     System.out.println();
	    }

	  } 

