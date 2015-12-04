 /*  code pas finaliser avec erreur a revoir
    et a ré-adapter avec le code initiale */


 public class PoserPion {

  public final static int VIDE = 0;
   public final static int BLEU = 1;
   public final static int ROUGE = 2;

   private int taille;
   private int[][] grille;   // 0 = vide, 1 = joueur bleu, 2 = joueur rouge

// "joueur" est à revoir et redefinir selon le code initiale avec la grille


   private void initJeu(int taille) {
     this.taille = taille;
     grille = new int[taille][taille];
     for (int colone = 0; colone < taille ; colone++) {
       for (int ligne = 0; ligne < taille; ligne++) {
         grille[colone][ligne] = VIDE;
       }
     }
   }

   public boolean joueCoup(int col, int joueur) {
     if ((colone < 0) || (colone >= taille)) {
       return false;
     }

     // Trouve la première place vide dans la colonne
     for (int ligne = 0; ligne < taille; ligne++) {
       if (grille[colone][ligne] == VIDE) {
         grille[colone][ligne] = joueur;
         return true;
       }
     }

     // La colonne est pleine
     return false;
   }


// On cherche une case vide. S'il n'y en a aucune, le tableau est plein
  public boolean estPlein() {

    for (int colone = 0; colone < taille; colone++) {
      for (int ligne = 0; ligne < taille; ligne++) {
        if (grille[colone][ligne] == "  ") {
          return false;
        }
      }
    }

    return true;
  }

}
