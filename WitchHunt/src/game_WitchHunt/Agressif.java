package game_WitchHunt;

import Java.util.Random;

import game_WitchHunt.Bot;
import game_WitchHunt.Identite;
import game_WitchHunt.Partie;
import game_WitchHunt.Joueur;
import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;

public class Agressif implements Strategie {

    public void jouer(Joueur c) {
    	int m;
    	
    	// trouver un moyen de faire passer l'attribut personnage de Identit� ici
    	private String personnage;
    	
    	public Joueur accuserJoueur(Joueur c, Rumeur rumeur, Identite Identite, Partie Partie) {
    		System.out.println("Le BOT va accuser un joueur d'�tre une sorci�re ! \n");
    		//Choisir un joueur au hasard parmi la liste de joueurs
    		int randomNumber = (int) Math.random();
        	int i = randomNumber * Partie.get_nbJoueurs();
    	    //System.out.println(Partie.joueur.get(i) + "vous �tes accus� par le BOT d'�tre une sorci�re !\n");
    	    return Partie.joueur.get(i);
    	}
    	
    	
    	
        public void jouer(Joueur c, Rumeur rumeur, Identite Identite, Partie Partie) {
        	 
        	//Adopter une strat�gie de jeux au hasard
        	
        	int randNumber = (int) Math.random();
        	int d = randNumber * 2;

        	if (d == 0) {
        		System.out.println("Le Bot va accuser"+c.accuserJoueur()+"d'�tre une sorci�re !");
        		this.Rumeur();
        		
        	}
        	else if( d == 1) {
        		System.out.println("Le BOT va jouer sa carte Identit� ! \n");
        		if Bot.Identite == 
        	}
        	
        	
        	
        	 //s�lection du joueur � accuser
        	 //Joueur joueur = new Joueur(personnage);
        	 //List<Joueur> joueur1 = Partie.getList();
     		
        	
        	
        }

    	
    }

	

}
