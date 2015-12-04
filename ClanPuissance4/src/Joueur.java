import java.io.*;
import java.util.*;

public class Joueur extends Clan {

	private String nomJoueur;


	InputStreamReader isr = new InputStreamReader (System.in);
	BufferedReader rep = new BufferedReader (isr);

		public Joueur ()throws Exception{

		System.out.print("Nom du joueur : ");
		this.nomJoueur= rep.readLine();
	}

	public void Affiche()
	{
	System.out.println("\nNom du joueur: "+nomJoueur+"\nNom du clan : "+nomClan+"\nCouleur: "+couleurC);
	}
}