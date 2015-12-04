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