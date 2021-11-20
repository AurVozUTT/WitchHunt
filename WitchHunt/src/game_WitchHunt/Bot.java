package game_WitchHunt;

import game_WitchHunt.Doux;
import game_WitchHunt.Agressif;
import game_WitchHunt.Joueur;

/**
 * Class Bot h�ritage de la classe Joueur
 * Sp�cialise la classe Joueur
 * @author aurel
 *
 */
public class Bot extends Joueur {

	/**
	 * 
	 * @param username
	 * @param identite
	 */
    public Bot(String username, String identite) {
		super(username,identite);
		// TODO Auto-generated constructor stub
	}
    
  //initialisation de l'identit� du BOT
	n = (int)(Math.random() * 2);
	 if (n == 0) {
		 this.identite = "Villageois";
	 }
	 else {
		 this.identite = "Sorci�re";
	 }
    
	 /**
	  * M�thode pour accuser un joueur 
	  * M�thode h�rit�e de la classe Joueur
	  * @return
	  */
    public String accuser() {
    	return super.accuserJoueur();
    }

    /**
     * 
     * @param strategiemethode
     * @param a
     */
    public jouer(Strategie strategiemethode,Joueur a) {
    	super.jouer(a);
    }
	
    public static void JouerDoux(Joueur a) {
    	System.out.println("Le BOT joue facile.");
    	jouer(new Doux(),a);
    }
    
    public static void JouerAgressif(Joueur a) {
    	System.out.println("Le BOT joue agressif.");
    	jouer(new Agressif(),a);
    }
	
	


}
