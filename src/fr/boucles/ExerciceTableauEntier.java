package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args){
        int tableau[] = {1,2,3,4,5,6,7,8,9,10};
        //Afficher le prmier élément du tableau
        System.out.println(tableau[0]);

        //Afficher la longueur du tableau
        System.out.println(tableau.length);

        //Afficher le dernier élément du tableau
        System.out.println(tableau[tableau.length-1]);

        //Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8.
        System.out.println(tableau[4]=8);
    }
}
