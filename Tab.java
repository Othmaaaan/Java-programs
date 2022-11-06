
public class Tab {
	public static void trier( int [ ] tab ){
		for (int i=0; i<tab.length-1;i++) {
			for (int j=i+1;j<tab.length;j++) {
				if (tab[i]>tab[j]) {
					int var=tab[i];
					tab[i]=tab[j];
					tab[j]=var;
			}
			
		}
	 }
	}
	public static int moyenne(int[] tab){
		int compteur=0;
		for (int i=0; i<tab.length;i++) {
			 compteur=compteur+tab[i];
			
		}
		int Moyenne=(compteur)/(tab.length);
		return Moyenne;
	}

	public static int count(int[] tab, int val){
		int compteur=0;
		for (int i=0; i<tab.length;i++) {
			if (val>tab[i]) {
				 compteur++;
			}
		}
	return compteur;
	}

	public static void split(int[] tab,int[] petit, int val){ 
		val=moyenne(tab);
		for (int i=0; i<tab.length;i++) {
			if (val>tab[i]) {
				petit[i]=tab[i];
			}
		}
	        
	}

	public static void main (String args [ ] )
	{

	int tab1 [ ] = { 3,55,7, 1, 88, 9 , 4, -10 };
	int i,moyenne, size;
	int[] petitTab,tab2;
	tab2 = new int[]{10,34,62,56,82,7,95};
	trier(tab1 ) ;
	trier(tab2 ) ;
	moyenne=moyenne(tab2);
	size = count(tab2, moyenne); 
	petitTab = new int[size];

	System.out.println ("Les �l�ments de tab1 et tab2 tri�s sont : " ) ;
	for ( i =0; i<tab1.length ; i++) {
	/*Impression du contenu de tab1 tri�*/
	  if ( i >0) {
	  System.out.print ( " , " ) ;
	 }
	 System.out.print (tab1 [ i ] ) ;
	 }
	System.out.println ( ) ;
	for ( i =0; i<tab2.length ; i++) {
	/*Impression du contenu de tab2 tri�*/
	  if ( i >0) {
	  System.out.print ( " , " ) ;
	 }
	 System.out.print (tab2 [ i ] ) ;
	 }
	System.out.println ( ) ;
	System.out.print ("La valeur moyenne de tab2 est " + moyenne(tab2)) ;
	System.out.println ( ) ;
	moyenne=moyenne(tab2);
	split(tab2,petitTab,moyenne);
	 System.out.print("Les �l�ments de petitTab sont : ");           
	        for(i=0; i<petitTab.length; i++) {
	            if (i>0) {
	                System.out.print(", ");
	            }
	            System.out.print(petitTab[i]);           
	        }
	System.out.println ( ) ;
	 }

	}

