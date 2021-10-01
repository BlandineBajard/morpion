package fr.bajard.morpion;

import java.util.Scanner;
import java.util.Random;

public class morpion {

	public static void main(String[] args) {

		char j1='O';
		char j2='X';
		char joueurActuel =j1;
		int pion;
		boolean estTermine;
		int nombreCoups = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bienvenue dans votre jeu de Morpion ! "+"\n");

		//demande le nom des joueurs

		System.out.print("Joueur 1, veuillez saisir votre nom : ");
		String joueur1 = scanner.nextLine();
		System.out.print("Joueur 2, veuillez saisir votre nom : ");
		String joueur2 = scanner.nextLine();
		System.out.print("Le joueur 1 est : " +joueur1 + "\n");
		System.out.print("Le joueur 2 est : " +joueur2 +"\n");

		// choisit qui aura le premier tour 

		String noms []= {joueur1,joueur2}; 
		Random Tirage = new Random(); 
		int n = Tirage.nextInt(2); 

		System.out.println("Le premier tour est pour : " + noms[n]+"\n");
		System.out.println("Le pion pour ce joueur est : " +j1+"\n");
		System.out.println("Le pion pour le second joueur est : " +j2+ "\n");

		char[] grille = {
				'1','2','3',
				'4','5','6',
				'7','8','9'
		};


		//le jeu commence
		estTermine = false;
		while( ! estTermine) {

			// affichage de la grille
			afficherGrille(grille);

			// on entre un nombre entre 1 et 9

			while (true) {
				System.out.println("Entrez un chiffre entre 1 et 9 pour placer votre pion sur la grille");
				pion = scanner.nextInt();
				pion--;
				if (pion < 0 || pion > 8) {
					System.out.println("Vous devez saisir une valeur entre 1 et 9 !");
				} else if (grille[pion] == j1 || grille[pion] == j2)  {
					System.out.println("Case dèjà jouée !");
				} else {
					break;
				}
			}
			

			// on augmente d'un coup à chaque tour 
			
			nombreCoups++;
			
			// on met le pion dans la case correspondante
			grille[pion]= joueurActuel;	   

			// on verifie si le joueur a gagné
			estTermine = true;
			if (grille[0]==joueurActuel && grille[4]==joueurActuel && grille[8]==joueurActuel) { // diagonales
				System.out.print("Le joueur "+ joueurActuel + " a gagné"+ "\n");
			} else if 	(grille[2]==joueurActuel && grille[4]==joueurActuel && grille[6]==joueurActuel) { // diagonales
				System.out.print("Le joueur "+ joueurActuel + " a gagné"+ "\n");
			} else if 	(grille[0]==joueurActuel && grille[1]==joueurActuel && grille[2]==joueurActuel) { // ligne 1
				System.out.print("Le joueur "+ joueurActuel + " a gagné"+ "\n");
			} else if 	(grille[3]==joueurActuel && grille[4]==joueurActuel && grille[5]==joueurActuel) { // ligne 2
				System.out.print("Le joueur "+ joueurActuel + " a gagné"+ "\n");
			} else if 	(grille[6]==joueurActuel && grille[7]==joueurActuel && grille[8]==joueurActuel) { // ligne 3
				System.out.print("Le joueur "+ joueurActuel + " a gagné"+ "\n");
			} else if 	(grille[0]==joueurActuel && grille[3]==joueurActuel && grille[6]==joueurActuel) { // colonne 1
				System.out.print("Le joueur "+ joueurActuel + " a gagné"+ "\n");
			} else if 	(grille[1]==joueurActuel && grille[4]==joueurActuel && grille[7]==joueurActuel) { // colonne 2
				System.out.print("Le joueur "+ joueurActuel + " a gagné"+ "\n");
			} else if 	(grille[2]==joueurActuel && grille[5]==joueurActuel && grille[8]==joueurActuel) { // colonne 3
							System.out.print("Le joueur "+ joueurActuel + " a gagné"+ "\n");
			} else if (nombreCoups==9) {
				System.out.println("Egalité ! ");
			} else {
				estTermine = false;
			}				
			if( ! estTermine ) {
				afficherGrille(grille);
			}		

			// on change de joueur 

			if (joueurActuel == j1) {
				joueurActuel = j2;
			} else {
				joueurActuel = j1;
			}
		}       
	}
	
	public static void afficherGrille(char[] grille )  {
		System.out.println("|" + grille[0]+ '|' + grille[1]+ '|' + grille[2]+ '|');
		System.out.println("|" + grille[3]+ '|' + grille[4]+ '|' + grille[5]+ '|');
		System.out.println("|" + grille[6]+ '|' + grille[7]+ '|' + grille[8]+ '|'+ "\n");
	}
}



