# TD outils de build

## Utilisation de ant et maven

Récupération du dépôt [Git](https://github.com/czanni/TestProject.git)

Suivre la branche :
	`git checkout WIP`

L’objectif du TD va être de suivre l’historique de la branche
en mettant à jour les fichier `build.xml` et `pom.xml`
afin de permettre la compilation avec les outils de build Ant ou Maven?

Pour chacune des étapes suivantes, il faudra placer le dépôt dans l’état
du commit correspondant. Cela peut être réalisé avec la commande :

	git checkout ID

L’identifiant du commit ID peut facilement être récupéré dans l’historique du projet 
sur GitHub.

## Etape 1  

Ecrire un fichier `build.xml` et `pom.xml` pour générer le projet avec ant et maven.
Le gestionnaire de build doit notamment gérer la génération de la documentation
et le déplacement des resources vers le répertoire de build.

**Note :** vous pouvez télécharger Maven [ici](http://apache.mirrors.ovh.net/ftp.apache.org/dist/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.zip)

## Etape 2

1 - Récupérer le projet GitHub suivant et définir un fichier `build.xml` pour générer une archive ‘.jar’.
	[jhlabs](https://github.com/axet/jhlabs)
	
2 - Adapter le fichier `build.xml` de l’étape 1 afin d’utiliser jhlabs comme un sous-projet.

## Etape 3

Adapter le fichier `pom.xml`.

NB : le site web http://www.mvnrepository.com permet de trouver des informations
sur les librairies java gérer par maven. 
