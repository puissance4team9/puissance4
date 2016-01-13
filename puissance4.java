/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puissance4;

import java.io.*;
import java.util.*;

    public class Puissance4 {

        public static int longueur, largeur;
        public static String jeu[][];

        public static void main(String args[]) throws Exception {

            InputStreamReader isr= new InputStreamReader(System.in);
            BufferedReader rep = new BufferedReader(isr);

            int condition,longueur,i,j,largeur,numColonne,numero;
            int j1=0;
            int j2=0;
            int j3=0;
            int j4=0;
            numColonne=1;
            longueur=7;
            longueur=6;
            int condSup;
            int nbsDeJoueurs;
            String bis;
            char parDefaut;
            boolean stopDiagBas=false;
            boolean stopDiagHaut=false;
            boolean stopPlein=false;
            boolean stopLigne=false;
            boolean stopColonne=false;
            int auTourDe=0;
            int ind;
            String bis2;
            char rejouer;
            
    
            System.out.print("\n\n        BIENVENUE au puissance 4 nouvelle generation !  \n\n");
    
    // taille du tableau

            System.out.print("          JOUEZ EN MODE CLASSIQUE ? (Y/N) : ");
            bis=rep.readLine();
            parDefaut=bis.charAt(0);
            if (parDefaut == 'Y')
            {
                System.out.print("\n\n  MODE CLASSIQUE \n\n");
                longueur=7;
                largeur=8;
                condition=4;
                nbsDeJoueurs=2;
            }
            else
            {

                        // nombre de joueurs
                System.out.print("\n\n  MODE PERSONNALISE \n");
                System.out.print("\n   Nombre de joueurs (2 à 4 joueurs) : ");
                nbsDeJoueurs=Integer.parseInt(rep.readLine());
                System.out.print("\n");
                while (nbsDeJoueurs < 2 || nbsDeJoueurs > 4)
                {
                    System.out.print("      Erreur sur lE NOMBRE DE JOUEURS.\n   Nombre de joueurs (compris entre 2 et 4) : ");
                    nbsDeJoueurs=Integer.parseInt(rep.readLine());
                    System.out.print("\n");
                }

                        // longueur et largeur
                System.out.print("\n   Longueur du puissance 4 : ");
                longueur=Integer.parseInt(rep.readLine());
                while (longueur < 1)
                {
                    System.out.print("      Erreur LONGUEUR NEGATIF ou EGALE A 0.\n  Longueur : ");
                    longueur=Integer.parseInt(rep.readLine());
                    System.out.print("\n");
                }
                System.out.print("\n   Largeur du puissance 4 : ");
                largeur=Integer.parseInt(rep.readLine());
                while (largeur < 1)
                {
                    System.out.print("      Erreur LARGEUR NEGATIF ou EGALE A 0.\n   Largeur : ");
                    largeur=Integer.parseInt(rep.readLine());
                    System.out.print("\n");
                }

                        // condition de victoire
                if (longueur > largeur) condSup=longueur;
                else condSup=largeur;
                System.out.print("\n    Chosir la condition de victoire (entre 1 et " + condSup + ") : ");
                condition=Integer.parseInt(rep.readLine());
                System.out.print("\n");
                while ((condition > longueur && condition > largeur) || condition < 1)
                {
                    System.out.print("      Erreur sur la condition.\n   Chosir la condition de victoire (entre 1 et " + condSup + ") : ");
                    condition=Integer.parseInt(rep.readLine());
                    System.out.print("\n\n");
                }
            }
            System.out.print("\n");

    do //Pour rejouer
    {        
    //Construction du tableau intial

            jeu = new String[longueur][largeur];
            for(i=0;i<largeur;i++)
            {
                System.out.print("|" + numColonne+" ");
                numColonne=numColonne+1;
            }
            System.out.print("|");
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
            numColonne=1;
            for(i=0;i<largeur;i++)
            {
                System.out.print("|" + numColonne+" ");
                numColonne=numColonne+1;
            }
            System.out.print("|");

    // BOUCLE JEU
            
            while (stopPlein == false && stopLigne == false && stopColonne == false && stopDiagHaut == false && stopDiagBas == false)                              // si quelqu'un a gagné ou match nul
            {
                if (auTourDe%nbsDeJoueurs==0)
                {
                    System.out.print("\n\n Joueur1 : \n  quel colonne joue ? ");
                    numero=Integer.parseInt(rep.readLine());
                    System.out.print("\n\n");

                    while (numero < 1 || numero > largeur)
                    {
                        System.out.print("Erreur indice. Rejouez sur quelle colonne ? ");
                        numero=Integer.parseInt(rep.readLine());
                        System.out.print("\n\n");
                    }
                    ind = ajoutColonne(numero,longueur);

                    while(ind==-1)
                    {
                        System.out.print("COLONNE PLEINE. Rejouez sur une autre colonne :  ");
                        numero=Integer.parseInt(rep.readLine());
                        while (numero < 1 || numero > largeur)
                        {
                            System.out.print("Erreur indice. Rejouez sur quelle colonne ? ");
                            numero=Integer.parseInt(rep.readLine());
                            System.out.print("\n\n");
                        }
                        ind = ajoutColonne(numero,longueur);
                    }

                    jeu[ind][numero-1]="O ";
                    afficherJeu(longueur, largeur);
                    auTourDe++;
                }

                else
                {
                    if (auTourDe%nbsDeJoueurs==1)
                    {
                        System.out.print("\n\n Joueur2 : \n  quel colonne joue ? ");
                        numero=Integer.parseInt(rep.readLine());
                        System.out.print("\n\n");
                        while (numero < 1 || numero > largeur)
                        {
                            System.out.print("Erreur indice. Rejouez sur quelle colonne ? ");
                            numero=Integer.parseInt(rep.readLine());
                            System.out.print("\n\n");
                        }
                        ind = ajoutColonne(numero,longueur);

                        while(ind==-1)
                        {
                            System.out.print("COLONNE PLEINE. Rejouez sur une autre colonne :  ");
                            numero=Integer.parseInt(rep.readLine());
                            while (numero < 1 || numero > largeur)
                            {
                                System.out.print("Erreur indice. Rejouez sur quelle colonne ? ");
                                numero=Integer.parseInt(rep.readLine());
                                System.out.print("\n\n");
                            }
                            ind = ajoutColonne(numero,longueur);
                        }

                        jeu[ind][numero-1]="X ";
                        afficherJeu(longueur, largeur);
                        auTourDe++;
                    }
                    else
                    {
                        if (auTourDe%nbsDeJoueurs==2)
                        {
                            System.out.print("\n\n Joueur3 : \n  quel colonne joue ? ");
                            numero=Integer.parseInt(rep.readLine());
                            System.out.print("\n\n");
                            while (numero < 1 || numero > largeur)
                            {
                                System.out.print("Erreur indice. Rejouez sur quelle colonne ? ");
                                numero=Integer.parseInt(rep.readLine());
                                System.out.print("\n\n");
                            }
                            ind = ajoutColonne(numero,longueur);

                            while(ind==-1)
                            {
                                System.out.print("COLONNE PLEINE. Rejouez sur une autre colonne :  ");
                                numero=Integer.parseInt(rep.readLine());
                                while (numero < 1 || numero > largeur)
                                {
                                    System.out.print("Erreur indice. Rejouez sur quelle colonne ? ");
                                    numero=Integer.parseInt(rep.readLine());
                                    System.out.print("\n\n");
                                }
                                ind = ajoutColonne(numero,longueur);
                            }

                            jeu[ind][numero-1]="* ";
                            afficherJeu(longueur, largeur);
                            auTourDe++;
                        }
                        else
                        {
                            System.out.print("\n\n Joueur4 : \n  quel colonne joue ? ");
                            numero=Integer.parseInt(rep.readLine());
                            System.out.print("\n\n");
                            while (numero < 1 || numero > largeur)
                            {
                                System.out.print("Erreur indice. Rejouez sur quelle colonne ? ");
                                numero=Integer.parseInt(rep.readLine());
                                System.out.print("\n\n");
                            }
                            ind = ajoutColonne(numero,longueur);

                            while(ind==-1)
                            {
                                System.out.print("COLONNE PLEINE. Rejouez sur une autre colonne :  ");
                                numero=Integer.parseInt(rep.readLine());
                                while (numero < 1 || numero > largeur)
                                {
                                    System.out.print("Erreur indice. Rejouez sur quelle colonne ? ");
                                    numero=Integer.parseInt(rep.readLine());
                                    System.out.print("\n\n");
                                }
                                ind = ajoutColonne(numero,longueur);
                            }

                            jeu[ind][numero-1]="^ ";
                            afficherJeu(longueur, largeur);
                            auTourDe++;
                        }
                    }

                }

                stopDiagBas=verifDiagBas(longueur,largeur,condition);
                stopDiagHaut=verifDiagHaut(longueur,largeur,condition);
                stopLigne=verifLigne(longueur,largeur,condition);
                stopColonne=verifColonne(longueur,largeur,condition);
                stopPlein=estPlein(longueur,largeur);
            }

        // FIN DE PARTIE : RESULTAT
            auTourDe--;
            int gagnant= (auTourDe%nbsDeJoueurs)+1;
            if (stopLigne==true || stopColonne == true || stopDiagHaut == true || stopDiagBas == true) System.out.print("\n\n\n\n  FELICITATION LE JOUEUR " + gagnant + " GAGNE :) \n\n\n");
            else System.out.print("\n\n\n\n         MATCH NUL \n\n\n");
            if((auTourDe%nbsDeJoueurs)+1 == 1) j1++;
            if((auTourDe%nbsDeJoueurs)+1 == 2) j2++;
            if((auTourDe%nbsDeJoueurs)+1 == 3) j3++;
            if((auTourDe%nbsDeJoueurs)+1 == 4) j4++;
            System.out.print("\n\nVoulez vous rejouer ? (Y/N) ");
            bis2=rep.readLine();
            rejouer=bis2.charAt(0);
            for(i=0;i<longueur;i++)
            {
                for(j=0;j<largeur;j++)
                {
                    jeu[i][j]="  ";
                } 
            }
            stopLigne=false;stopColonne=false;stopDiagHaut=false;stopDiagBas=false;stopPlein=false;       
    }while(rejouer == 'Y');
    
    
    System.out.print("\n\n\n        ***SCORE FINAL*** \n\n\n");
    System.out.print("joueur 1 : " + j1 + "\n\n");
    System.out.print("joueur 2 : " + j2 + "\n\n");
    if (nbsDeJoueurs==3 || nbsDeJoueurs==4) System.out.print("joueur 3 : " + j3 + "\n\n");
    if (nbsDeJoueurs==4) System.out.print("joueur 4 : " + j4 + "\n\n");
       
    }




    // Methodes

        public static int ajoutColonne(int num, int longu)
        {
            int ind;
            ind=longu-1;
            while (ind != -1 && jeu[ind][num-1] != "  ")
            {
                ind--;
            }
            return(ind);

        }

        public static void afficherJeu(int longu,int large)
        {
            int i,j;
            longueur=longu;
            largeur=large;
            int numColonne=1;
            for(i=0;i<largeur;i++)
            {
                System.out.print("|" + numColonne+" ");
                numColonne=numColonne+1;
            }
            System.out.print("|");

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
            numColonne=1;
            for(i=0;i<largeur;i++)
            {
                System.out.print("|" + numColonne+" ");
                numColonne=numColonne+1;
            }
            System.out.print("|");
        }

        public static boolean estPlein(int longu, int large)
        {
            for(int i=0;i<longu;i++)
            {
                for(int j=0;j<large;j++)
                {
                    if (jeu[i][j]=="  ") return false;
                }
            }
            return true;
        }

        public static boolean verifLigne(int longu,int large, int condition)
        {
            int cond=condition;
            int newLarge=large-cond;
            boolean rep;
            for(int i=0;i<longu;i++)
            {
                for(int j=0;j<=newLarge;j++)
                {
                    if (jeu[i][j] == "O ")
                    {
                        int l=j;
                        int z=0;
                        rep=true;
                        while(z<cond-1)
                        {
                            if (jeu[i][l]!=jeu[i][l+1])
                            {
                                rep=false;
                            }
                            z++;
                            l++;
                        }
                        if (rep == true) return true;
                    }
                    if (jeu[i][j] == "X ")
                    {
                        int l=j;
                        int z=0;
                        rep=true;
                        while(z<cond-1)
                        {
                            if (jeu[i][l]!=jeu[i][l+1])
                            {
                                rep=false;
                            }
                            z++;
                            l++;
                        }
                        if (rep == true) return true;
                    }
                    if (jeu[i][j] == "* ")
                    {
                        int l=j;
                        int z=0;
                        rep=true;
                        while(z<cond-1)
                        {
                            if (jeu[i][l]!=jeu[i][l+1])
                            {
                                rep=false;
                            }
                            z++;
                            l++;
                        }
                        if (rep == true) return true;
                    }
                    if (jeu[i][j] == "^ ")
                    {
                        int l=j;
                        int z=0;
                        rep=true;
                        while(z<cond-1)
                        {
                            if (jeu[i][l]!=jeu[i][l+1])
                            {
                                rep=false;
                            }
                            z++;
                            l++;
                        }
                        if (rep == true) return true;
                    }
                }
            }
            return(false);
        }

        public static boolean verifColonne(int longu,int large, int condition)
        {
            int cond=condition;
            int newLongu=longu-cond;
            boolean rep;
            for(int i=0;i<large;i++)
            {
                for(int j=0;j<=newLongu;j++)
                {
                    if (jeu[j][i] == "O ")
                    {
                        int l=j;
                        int z=0;
                        rep=true;
                        while(z<cond-1)
                        {
                            if (jeu[l][i]!=jeu[l+1][i])
                            {
                                rep=false;
                            }
                            z++;
                            l++;
                        }
                        if (rep == true) return true;
                    }
                    if (jeu[j][i] == "X ")
                    {
                        int l=j;
                        int z=0;
                        rep=true;
                        while(z<cond-1)
                        {
                            if (jeu[l][i]!=jeu[l+1][i])
                            {
                                rep=false;
                            }
                            z++;
                            l++;
                        }
                        if (rep == true) return true;
                    }
                    if (jeu[j][i] == "* ")
                    {
                        int l=j;
                        int z=0;
                        rep=true;
                        while(z<cond-1)
                        {
                            if (jeu[l][i]!=jeu[l+1][i])
                            {
                                rep=false;
                            }
                            z++;
                            l++;
                        }
                        if (rep == true) return true;
                    }
                    if (jeu[j][i] == "^ ")
                    {
                        int l=j;
                        int z=0;
                        rep=true;
                        while(z<cond-1)
                        {
                            if (jeu[l][i]!=jeu[l+1][i])
                            {
                                rep=false;
                            }
                            z++;
                            l++;
                        }
                        if (rep == true) return true;
                    }
                }
            }
            return(false);
        }

        public static boolean verifDiagHaut(int longu, int large, int condition)
        {
            int cond=condition;
            boolean rep;
            int z,ibis,jbis;
            int l=(longu-cond)+1;
            int t=(large-cond)+1;
            for (int i=0;i<l;i++)
            {
                for (int j=0;j<t;j++)
                {
                     if (jeu[i][j] == "O ")
                     {
                         rep=true;
                         ibis=i;
                         jbis=j;
                         z=0;
                         while (z<cond-1)
                         {
                             if (jeu[ibis][jbis] != jeu[ibis+1][jbis+1])
                             {
                                 rep = false;
                             }
                             z++;
                             ibis++;
                             jbis++;
                         }
                         if (rep==true) return true;
                     }
                     if (jeu[i][j] == "X ")
                     {
                         rep=true;
                         ibis=i;
                         jbis=j;
                         z=0;
                         while (z<cond-1)
                         {
                             if (jeu[ibis][jbis] != jeu[ibis+1][jbis+1])
                             {
                                 rep = false;
                             }
                             z++;
                             ibis++;
                             jbis++;
                         }
                         if (rep==true) return true;
                     }
                     if (jeu[i][j] == "* ")
                     {
                         rep=true;
                         ibis=i;
                         jbis=j;
                         z=0;
                         while (z<cond-1)
                         {
                             if (jeu[ibis][jbis] != jeu[ibis+1][jbis+1])
                             {
                                 rep = false;
                             }
                             z++;
                             ibis++;
                             jbis++;
                         }
                         if (rep==true) return true;
                     }
                     if (jeu[i][j] == "^ ")
                     {
                         rep=true;
                         ibis=i;
                         jbis=j;
                         z=0;
                         while (z<cond-1)
                         {
                             if (jeu[ibis][jbis] != jeu[ibis+1][jbis+1])
                             {
                                 rep = false;
                             }
                             z++;
                             ibis++;
                             jbis++;
                         }
                         if (rep==true) return true;
                     }
                }
            }
            return false;
        }

        public static boolean verifDiagBas(int longu, int large, int condition)
        {
            int cond=condition;
            boolean rep;
            int z,ibis,jbis;
            int l=(longu-cond)+1;
            int t=cond-1;
            for (int i=0;i<l;i++)
            {
                for (int j=large-1;j>=t;j--)
                {
                     if (jeu[i][j] == "O ")
                     {
                         rep=true;
                         ibis=i;
                         jbis=j;
                         z=0;
                         while (z<cond-1)
                         {
                             if (jeu[ibis][jbis] != jeu[ibis+1][jbis-1])
                             {
                                 rep = false;
                             }
                             z++;
                             ibis++;
                             jbis--;
                         }
                         if (rep==true) return true;
                     }
                     if (jeu[i][j] == "X ")
                     {
                         rep=true;
                         ibis=i;
                         jbis=j;
                         z=0;
                         while (z<cond-1)
                         {
                             if (jeu[ibis][jbis] != jeu[ibis+1][jbis-1])
                             {
                                 rep = false;
                             }
                             z++;
                             ibis++;
                             jbis--;
                         }
                         if (rep==true) return true;
                     }
                     if (jeu[i][j] == "* ")
                     {
                         rep=true;
                         ibis=i;
                         jbis=j;
                         z=0;
                         while (z<cond-1)
                         {
                             if (jeu[ibis][jbis] != jeu[ibis+1][jbis-1])
                             {
                                 rep = false;
                             }
                             z++;
                             ibis++;
                             jbis--;
                         }
                         if (rep==true) return true;
                     }
                     if (jeu[i][j] == "^ ")
                     {
                         rep=true;
                         ibis=i;
                         jbis=j;
                         z=0;
                         while (z<cond-1)
                         {
                             if (jeu[ibis][jbis] != jeu[ibis+1][jbis-1])
                             {
                                 rep = false;
                             }
                             z++;
                             ibis++;
                             jbis--;
                         }
                         if (rep==true) return true;
                     }
                }
            }
            return false;
        }

    }
