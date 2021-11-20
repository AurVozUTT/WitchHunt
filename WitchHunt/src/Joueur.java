import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.String;
import WitchHunt.src.Rumeur.java;
import src.Partie;

public class Joueur {

	//mettre tous les attributs en private
	
    private int points; 

    private String pseudo;
    
    private String identite;
    
    private boolean Est_revele;

    public List<Rumeur> rumeur = new ArrayList<Rumeur> ();

    public String accuserJoueur() {
    	Scanner scan4 = new Scanner(System.in);
    	System.out.println("Quel joueur accuser ?");
    	String Joueur_accuse = scan4.nextLine();
    	return Joueur_accuse;
    }

    public Joueur(String username) {
    	this.setPseudo(username);
    	this.points = 0;
    	this.Est_revele = false;
    }
    
    
    void setPseudo(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.pseudo = value;
    }
    
    public String getPseudo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.pseudo;
    }
    
    public void setIdentite(String value) {
    	this.identite = value;
    }
    
    public String getIdentite() {
    	return this.identite;
    }

    // pas besoin de cartes identit�, juste un attribut identit� dans joueur suffit
    // cr�er un attribut bool�en estR�v�l� qui est vrai quand le joueur est r�v�l�
    //et faux quand le joueur n'est pas r�v�l� (permet de savoir quand c'est la fin du round ->
    // quand plus que 1 joueur n'est pas r�v�l�)

    public void jouer(Joueur c, Rumeur Rumeur) {
    	
    	// diff�rentes formes de jeu
    	System.out.println("--- Trois formes de jeu possibles --- \n");
    	System.out.println("Quel type de cartes jouer ? Identit� (I) / Rumeur (R) \n");
    	Scanner scan5 = new Scanner(System.in);
    	String Type_cartes = scan5.nextLine();
    	
    	//jouer la carte Identit�
    	if(Type_cartes == "I") {
    		System.out.println("Je suis un(e)"+ this.getIdentite() +"!");
    		if(this.getIdentite() == "Sorciere") {
    			this.Est_revele = true;
    			c.points += 1;
    		}
    		else {
    			System.out.println(this.pseudo + " c'est votre tour !");
    		}
    	}
    	
    	//jouer la carte rumeur
    	if (Type_cartes == "R") {
    		Scanner scan6 = new Scanner(System.in);
    		System.out.println("Quelle carte rumeur jouer ?");
    		String Rumeur = scan6.nextLine(); 

    		//ajouter une m�thode qui permet de jouer une carte rumeur une fois la carte rumeur jou�e
    		
    		//Rumeur.jouerHunt;
    	}
    }


    public static void main(String args[]) {
    	/*
    	//d�lcration variables
    	int i;
    	
    	// cr�ation des scanners
    	Scanner scan = new Scanner(System.in);
    	Scanner scan2 = new Scanner(System.in);
    	Scanner scan3 = new Scanner(System.in);
    	
    	
    	// cr�ation d'une collection d'objets joueurs de type joueur
    	List<Joueur> joueurs = new ArrayList<Joueur>();
    	List<Joueur> bot = new ArrayList<Joueur>();
    	
    	    	
    	System.out.println("Entrez le nombre de joueurs r�els: \n");
    	int Nb_joueurs = scan2.nextInt();
    	System.out.println("Voici le nombre de joueurs r�els : "+ Nb_joueurs);
    	int Nb_joueurs_fictifs = 6-Nb_joueurs;
    	for(i=0; i<Nb_joueurs; i++)
    	{
    		System.out.println("Entrez le pseudo du joueur :"+i);
    		String pseudo1 = scan3.nextLine();
    	    Joueur Joueurtmp = new Joueur(pseudo1);
    	    joueurs.add(Joueurtmp);
    	}
    	for(i=0; i<6-Nb_joueurs; i++)
    	{
    		//System.out.println("Entrez le pseudo du joueur :"+i);
    		//String pseudo1 = scan3.nextLine();
    	    Joueur Joueurtmp = new Joueur();
    	    bot.add(Joueurtmp);
    	}
    	*/
    	//cr�ation de joueur de type joueur (juste pour l'essai)
    	/*
    	Joueur joueur1 = new Joueur("joueur1");
    	Joueur joueur2 = new Joueur("joueur2");
    	joueurs.add(joueur1);
    	joueurs.add(joueur2);
    	
    	System.out.println("Entrez nom du premier joueur : ");
    	String pseudo1 = scan.nextLine();
    	joueur1.setPseudo(pseudo1);
    	System.out.println("Le nom du joueur 1 est : ");
    	System.out.println(joueur1.getPseudo());
    	*/
    }
    
    
    
    
    
    
    
}