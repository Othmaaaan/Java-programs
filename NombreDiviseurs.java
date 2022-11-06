
public class NombreDiviseurs {
    /**
     * fonction qui prend un entier n comme param�tre d'entr�e et
     * renvoie le nombre d'�l�ments qui sont divisibles par n.
     * Si n est n�gatif (n<0), elle renvoie 0
     */
    public static int nombreDiviseurs(int n) {
            int count = 0;
            
            if (n < 0) 
                    return count ;
                    System.out.println("Votre entier n'est pas postif");
            
            int resultat = 1;
            int x = 2;
            for (int i = 2; i <= n; i++) {
                    if ((n % i) == 0) {
                            if (i == x) {
                                    count++;
                            } else if (i != x) {
                                    resultat *= count + 1;
                                    count = 1;
                            }
                            n = n / i;
                            x = i;
                            i -= 1;
                            
                    }
                    
            }
            resultat *= count + 1;
            
            return resultat;
    }

    public static void main(String[] args) {

            int N1 = 100, N2 = 17, N3 = -3;

            /* Affichage */
            System.out.println();
            System.out.println("Le nombre de diviseurs de " + N1
                            + " est " + nombreDiviseurs(N1));
            System.out.println("Le nombre de diviseurs de " + N2
                            + " est " + nombreDiviseurs(N2));
            System.out.println("Le nombre de diviseurs de " + N3
                            + " est " + nombreDiviseurs(N3));

    } // end main()

} // end class NombreDiviseurss
