package game_WitchHunt;

import Java.util.Random;

import game_WitchHunt.Bot;
import game_WitchHunt.Identite;
import game_WitchHunt.Partie;
import game_WitchHunt.Joueur;
import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;



/**
 * Interface de la classe Strat�gie pour d�finir un comportement de jeux "Doux" pour le BOT
 * Mod�lisation d'un cycle de jeu
 * @author aurel
 *
 */
public class Doux implements Strategie {
	int n;
	
	// trouver un moyen de faire passer l'attribut personnage de Identit� ici
	private String personnage;
	
	private String identite;

	private int compteur_cartes;
	
	public Joueur accuserJoueur(Joueur c, Rumeur rumeur, Partie Partie) {
		System.out.println("Le BOT va accuser un joueur d'�tre une sorci�re ! \n");
		//Choisir un joueur au hasard parmi la liste de joueurs
		int randomNumber = (int) Math.random();
    	int i = randomNumber * Partie.get_nbJoueurs();
	    //System.out.println(Partie.joueur.get(i) + "vous �tes accus� par le BOT d'�tre une sorci�re !\n");
	    return Partie.joueur.get(i);
	}
	
	
	
    public void jouer(Joueur c, Rumeur rumeur, Identite Identite, Partie Partie) {
    	 //diff�rente strategie selon l'identit� du BOT
    	// si Sorci�re = �viter � tout pris de r�v�ler son identit�
    	// si Vilageois c'est pas si grave
    	
    	String test="Villageois";
		if (test == "Sorci�re") {
    		compteur_cartes = 12/Partie.get_nbJoueurs();
    		while (compteur_cartes != 1) {
    			this.accuserJoueur(c, rumeur, Partie);
    			compteur_cartes--;
    		}
    	}
    	
    	else if(this.identite = "Villageois") {
    		
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	//Adopter une strat�gie de jeux au hasard qui suit une loi uniforme
    	int randNumber = (int) Math.random();
    	int d = randNumber * 2;
    	
    	//Adopter une strat�gie de jeux au hasard qui ne suit pas une loi uniforme
    	
    	

    	if (d == 0) {
    		System.out.println("Le Bot va accuser"+c.accuserJoueur()+"d'�tre une sorci�re !");
    		this.Rumeur();
    		
    	}
    	else if( d == 1) {
    		System.out.println("Le BOT va jouer sa carte Identit� ! \n");
    		if Bot.Identite == 
    	}
    	oko
    	ok
    	
    	
    	 //s�lection du joueur � accuser
    	 //Joueur joueur = new Joueur(personnage);
    	 //List<Joueur> joueur1 = Partie.getList();
 		
    	
    	
    }




	@Override
	public void jouer(Joueur c) {
		// TODO Auto-generated method stub
		
	}

}
