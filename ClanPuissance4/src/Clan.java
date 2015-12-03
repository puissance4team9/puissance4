import java.io.*;
import java.util.*;

public class Clan {

	public String nomClan;
	public int nombreJoueurs;
	public String couleurC;
	public int scores;

	InputStreamReader isr = new InputStreamReader (System.in);
	BufferedReader rep = new BufferedReader (isr);

		public Clan ()throws Exception{

		System.out.print("Saisissez le nom de votre clan: ");
		this.nomClan = rep.readLine();
		System.out.print("Saisissez le nombre de joueurs: ");
		this.nombreJoueurs = Integer.parseInt(rep.readLine());
		System.out.print("Saisissez la couleur de votre clan: ");
		this.couleurC = rep.readLine();
	}


	public void Afficher()
	{
	System.out.println("Information du Clan: \nNom du clan : "+nomClan+"\nNombre de joueurs: "+nombreJoueurs+"\nCouleur: "+couleurC);
	}
}