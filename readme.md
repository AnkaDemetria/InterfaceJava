##BASES PACKAGES
pour faire des packages on utilise souvent com
Main ou App : c 'est le point d'entrée de l application

##INTERFACE
pour la classe write, le nom de l'interface devient: writable
pour read : nom interface devient: Readable
pour BankCard : nom interface devient : CardBankable
ON GARDE UN NOM EN -able POUR LES INTERFACES

La portée est toujours public et abstract (qu'on le mette ou pas dans le code)
Heritage: interface peut avoir plusieurs parents, donc peut implements plusieurs interfaces  (différent d'une classe abstraite qui ne peut extends qu'une classe parente)

On ne fait pas de getter et setter car pas de private
mais on peut mettre une variable protected et final si on veut garder la variable utilisable seulement dans un dossier

Une interface a accès à une autre interface meme d'un package différent
il faut implémenter la manière dont ces méthodes vont etre utilisées

![interface java](interface.png)

Implémentation: elle peut être multiple contrairement aux classes qui ne peuvent avoir d'héritage multiple (implémentation multiple d'interface)

Syntaxe: 
une interface peut étendre une autre interface: extends (comme pour les classes)
et quand une interface utilise une autre interface: implements, 
On met les extensions en premier et apres les implémentations dc on met toujours les extends avant les implements

On implemente les méthodes abstraites de l'interface dans le fichier qui va utiliser l'interface et seulement là, sans modifier le code de l'interface
il faut utiliser toutes les méthodes qu'il y a dans l'interface donc si le code de l'interface utilise 10méthodes, il faut implémenter les 10méthodes de l'interface dans le fichier de la classe qui utilise l'interface (ou les classes).

Il n'y a pas d'instance d 'interface comme dans les classes abstraites donc on n'a pas de constructeur dans une interface.

On peut utiliser les méthodes static  et  final (c'est une constante avec final) dans une interface.
Exception: avec les méthodes par défauts qui permettent d'implémenter dans une interface: default public void name()

classes abstraites ont des éléments communs, et sont proches
Interface: classes qui n'ont pas forcément de lien entre elles mais qui vont factoriser un certain nombre de fonctionnalités (attributs et méthodes)
![exemple tuto interface](exinterface.PNG)



##LES CLASSES ABSTRAITES

L'intérêt principal de définir une classe comme abstraite va être justement de fournir un cadre plus strict lorsqu'ils vont utiliser notre code en les forçant à définir certaines méthodes et etc. 

Une classe abstraite est une classe qui ne peut pas être directement instanciée. Une classe abstraite encapsule des attributs et méthodes qui peuvent être utilisés par les instances des classes qui en héritent.
elle ne peut pas être instanciée, mais ses sous-classes non abstraites le peuvent. une classe abstraite est déclarée avec le modificateur abstract.

Une classe abstraite est généralement utilisée pour construire des classes similaires. Elles auront toutes une implémentation en commun, celle de la classe abstraite. Une interface est généralement utilisée pour définir des capacités (le « contrat »), même si les classes n'ont pas grand chose en commun.
C'est la bonne manière de faire pour qu'une classe mère ait plusieurs classes enfants.
La classe abstraite va nous permettre de définir plusieurs choses
On est obligé d'utiliser cette méthode, ça maintient la solidité du code pour les développeurs.
La méthode abstraite n'est pas implémentée, pas de constructeur pour les classes abstraites CAR elle ne peut pas être instanciée dc il serait inutile

Les 3 règles des classes abstraites:
-doit avoir minimum une méthode abstraite
-n'a pas de getter ni de setter: puisque c'est abstrait, il n'y a rien à renvoyer
-oblige ses enfants à utiliser/implémenter les méthodes abstraites (n'a pas le choix)

![Les classes abstraites](/abstract.PNG)



