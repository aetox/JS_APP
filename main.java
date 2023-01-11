class Jouissance {
    /*
    En Java, vous devez utiliser un des mots clés suivants pour désigner un niveau de contrôle :

    public : visible pour tous et par conséquent le moins restrictif ;

    protected (protégé) : visible pour le package et l'ensemble de ses sous-classes ;

    package-protected (protégé par paquet) : généralement visible uniquement par le package dans lequel il se trouve (paramètres par défaut). Ne pas mettre de mot clé déclenche ce niveau de contrôle ;

    private (privé) : accessible uniquement dans le contexte dans lequel les variables sont définies (à l'intérieur de la classe dans laquelle il est situé).

    */ 

    // la fonction main est la fonction principale qui sera appelé en première, dedans on y mettra toutes les opérations.
    public static void main(String[] args) {

        //Appelle la classe Methode juste en dessous et appelle la fonction HelloPrint() définie dans cette classe.
        Methode.HelloPrint();
       
    }

}

class Methode {

    public static void HelloPrint(){

        // Boucle for qui fonctionne comme partout, on par de i (0) avec i=0, la boucle se repete 5 fois car on va à i<5 ( strictement inférieur à 5 donc 0,1,2,3,4)
        // i++ signifie qu'on incrémente, l'inverse est i--
        for (int i=0; i<5;i++) {
            System.out.println("Clap your hands!");
         }
    }
}