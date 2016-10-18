# TD tests automatiques

## Utilisation de Junit

Ce TD est inspiré d'un exercice proposé par Pascal Graffion dans son cours "Tests et validation des Logiciels".
Nous voulons calculer le lendemain d’une date définie par trois entiers : jour, mois, et année.

Les contraintes sur les paramètres sont :
- jour ∈ [1, 31], mois ∈ [1, 12] et année ∈ [1, 4000]
- jour ∈ [1, 30] si mois ∈ {2,4,6,9,11}
- jour ∈ [1, 29] si mois = 2 et année bissextile
- jour ∈ [1, 28] si mois = 2 et année non bissextile

## Question 1 :

Créer avec votre IDE préféré (Eclipse, Netbeans, . . .) un projet java contenant un package 'date'.

Note pour les plus courageux : vous pouvez utiliser les commandes en lignes pour compiler le projet.
Pour cela, créez un fichier build.xml (voir [ici](https://ant.apache.org/manual/tutorial-HelloWorldWithAnt.html#prepare)).
Commencez par compiler le projet (sans la classe de test, puis ajoutez les bibliothèques junit dans le répertoire lib).
Un corrigé se trouve [ici](https://github.com/pemoreau/iss7ab-se1/tree/master/labs/code/junit/src/date).

## Question 2 :

Ajouter la classe MyDate (on vous fournit le fichier [MyDate.java](https://github.com/pemoreau/iss7ab-se1/tree/master/labs/code/junit/src/date)).

Dans le répertoire du projet, ajoutez une classe JUnit test case MyDateTest.

Écrire une méthode test pour la méthode GetDay(). 
La méthode test contient plusieurs tests et utilise au moins une fois les assertions AssertEquals(), AssertTrue() et AssertFalse().

Lancer les tests (Dans Eclipse, cliquer sur “Run as” → “JUnit Test”).

## Question 3 :

Télécharger la classe de test MyDateTest (MyDateTest.java).
Compléter les tests pour les méthodes pour les méthodes GetMonth(), GetYear(), CheckData(). 

Les fichiers fournis peuvent contenir des erreurs.
Suivre le cycle de développement vu dans le cours.

## Question 4 :

Vérifier et compléter les tests de validité des dates : testSimpleValidDates(), testSimpleInvalidDates(), testValidLimitDates(), etc.

Penser à ajouter des jeux de valeurs de tests de sorte à couvrir tous les cas limites.

## Question 5 :

Écrire et tester la méthode nextDay() (Cycle de développement!)
Pour utiliser AssertEquals avec des objets MyDate, il faut réécrire la méthode equals() : @Override public boolean equals(Object obj) 
