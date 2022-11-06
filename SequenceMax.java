
public class SequenceMax {
	public static int sequenceMax(int[]x){
	    int i=0;
	    int max=1;
	   
	    while (i<(x.length-1)) {
	    	int compteur=1;
	    while ((i<(x.length-1)) && (x[i]==x[i+1])) {
	    	compteur++;
	    	i++;
	    			
	    if (compteur>max){
	    	max=compteur;
	    
	    
	    }
	    
	    }
	    i++;
	    
	    }
	    return max;
	}
	

	 

	  public static void main(String[] args) {
	   
	    int[] Tab1 = {1,2,1,3,3,3,6,1,1};
	    int[] Tab2 = {1,5,2,2,2,7,3,3,3,3};
	    int[] Tab3 = {3,1,7,1};
	    
	     System.out.println("La plus longue s�quence d��l�ments cons�cutifs �gaux dans Tab1 est : " + sequenceMax(Tab1));
	     System.out.println("La plus longue s�quence d��l�ments cons�cutifs �gaux dans Tab2 est : " + sequenceMax(Tab2));
	     System.out.println("La plus longue s�quence d��l�ments cons�cutifs �gaux dans Tab3 est : " + sequenceMax(Tab3));
	     System.out.println();
	    }

	  } 
