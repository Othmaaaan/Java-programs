import java.util.Random;

public class Dé {

	   private int value; // Numero figurant sur le de.

	   /**
	    * Le constructeur cree un de et le lance de sorte qu'il
	    * montre initialement une valeur aleatoire entre 1 et 6.
	    */
	   public Dé() {
	      lancer();
	   }

	   /**
	    * Lancez le de pour qu'il indique un nombre aleatoire entre 1 et 6.
	    */
	   public void lancer() {
	      Random objet = new Random();
	      value = objet.nextInt(6);
	      if (value == 0) {
	         value++;
	      }
	   }

	   /**
	    * Renvoie le nombre indique sur le de.
	    */
	   public int getValue() {
	      return value;
	   }

	   /**
	    * Definit la valeur du de. Imprime Valeur iIllegale du de
	    * si la valeur n'est pas comprise entre 1 et 6.
	    */
	   public void setValue(int val) {

	      if (val >= 1 && val <= 6) {
	         this.value = val;
	      } else {
	         System.out.println("la valeur " + val + " est illegale");
	      }
	   }

	   // Programme principal main

	   /**
	    * lancer deux des jusqu'a ce qu'ils indiquent la meme valeur
	    * et afficher le nombre de fois que ces des ont ete lances.
	    */

	   public static void main(String[] args) {

	      Dé dé1; // 1er de
	      Dé dé2; // second de

	      dé1 = new Dé();
	      dé2 = new Dé();
	      int nLancer = 1;
	      int premierevalue = dé1.getValue();
	      int deuxiemevalue = dé2.getValue();
	      while (premierevalue != deuxiemevalue) {
	         nLancer++;
	         dé1.lancer();
	         dé2.lancer();
	         premierevalue = dé1.getValue();
	         deuxiemevalue = dé2.getValue();

	      }

	      /* Affiche le nombre de lances. */
	      System.out.println("ca a pris " + nLancer + " lancés pour que les deux dés affichent la même valeur");

	      System.out.println(dé1.getValue());
	      System.out.println(dé2.getValue());
	      System.out.println();

	      /* generer une exception. */
	      System.out.println("Ce programme va maintenant se terminer avec un message d'erreur ");
	      System.out.println("lorsqu'il essaie de fixer la valeur d'un de à 100. ");
	      Dé dé; // variable referant au de.
	      dé = new Dé(); // creer l'objet
	      dé.setValue(100);
	   }

	} // end class De
