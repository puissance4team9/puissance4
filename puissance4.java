import java.io.*;
import java.util.*;

	public class puissance4 {

		public static void main(String args[]) throws Exception {

			InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader rep = new BufferedReader(isr);

			int longueur,i,j,largeur,numColonne,numero;
			numColonne=1;
			longueur=7;
			longueur=6;

			// taille du tableau
			System.out.print("longueur du puissance 4 : ");
			longueur=Integer.parseInt(rep.readLine());
			System.out.print("largeur du puissance 4 : ");
			largeur=Integer.parseInt(rep.readLine());
			System.out.print("\n\n");

			//Construction du tableau intial
			String jeu[][] = new String[longueur][largeur];

			for(i=0;i<largeur;i++)
			{
				System.out.print("  " + numColonne);
				numColonne=numColonne+1;
			}
			System.out.print("\n\n");

			for(i=0;i<longueur;i++)
			{
				for(j=0;j<largeur;j++)
				{
					jeu[i][j]= "  ";
					System.out.print("|" + jeu[i][j]);
				}
				System.out.print("|\n");
				for(j=0;j<largeur;j++)
				{
					System.out.print("---");
				}
				System.out.print("-\n");
			}



			System.out.print("\n\n quel colonne joue ? ");
			numero=Integer.parseInt(rep.readLine());
			System.out.print("\n\n");
			jeu[longueur-1][numero-1]="O ";

			numColonne=1;
			for(i=0;i<largeur;i++)
			{
				System.out.print("  " + numColonne);
				numColonne=numColonne+1;
			}

			System.out.print("\n\n");

			for(i=0;i<longueur;i++)
			{
				for(j=0;j<largeur;j++)
				{
					System.out.print("|" + jeu[i][j]);
				}
				System.out.print("|\n");
				for(j=0;j<largeur;j++)
				{
					System.out.print("---");
				}
				System.out.print("-\n");
			}

		}
	}