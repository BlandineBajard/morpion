- description du jeu

Le morpion est un jeu de réflexion se pratiquant à deux joueurs au tour par tour et dont le but est de créer le premier un alignement sur une grille, soit X soit O en l'occurence.

- description de l’implémentation technique du jeu (algorithmes principaux, modeélisation)

Le jeu demande le nom des joueurs puis choisit qui aura le premier tour à l'aide d'une methode Random. Le jeu ensuite commence via une boucle While et affiche la grille (tableau de caractères) grâce à une méthode. A l'aide d'une condition "if", le jeu vérifie : que le chiffre entier demandé se situe bien entre 1 et 9 mais également qu'aucun pion d'un des deux joueurs n'est déjà placé sur la grille. Le jeu se jouant en 9 coups maximum (sinon il y a égalité), on augmente le nombre de coups à chaque tour. Chaque joueur place son pion tour à tour puis des conditions "if" et "if else" vérifient si les colonnes ou les lignes ou les diagonales sont remplies par l'un ou l'autre des pions. Auquel cas le joueur qui a aligné correctement ses pions a gagné. Si toutefois aucun joueur n'a réussi à aligner 3 de ses pions au terme des 9 tours, alors il y a égalité. 

- la notice d’utilisation

Le Joueur 1, saisit son nom
Le Joueur 2, saisit son nom
Le Joueur qui a le premier tour entre un chiffre entre 1 et 9 pour placer son pion sur la grille. Le pion est mis dans la case correspondante. On change de joueur.
Le Joueur qui a le tour suivant entre un chiffre entre 1 et 9 pour placer son pion sur la grille. Les tours s'alternent jusqu'à ce qu'un des joueurs aligne 3 de ses pions ou jusqu'à l'égalité.

- un exemple d’utilisation.

![alt text](https://github.com/BlandineBajard/morpion/blob/8be9a521d5c747aaee7ab9bd0b3b11b1d138beb7/morpion.png "Exemple utilisation")

