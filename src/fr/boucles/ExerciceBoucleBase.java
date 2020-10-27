package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args){
        //Affichage des nombres de 1 à 10
        for(int i=1; i<11; i++){
            System.out.println(i);
        }

        //Afficher 20 fois mon prénom
        for(int i=1; i<20; i++){
            System.out.println("Maureen");
        }

        //Afficher les éléments pairs de 2 à 100
        for(int i=2; i<101; i+=2){
            System.out.println(i);
        }

        //Afficher les élements impairs de 1 à 99
        for(int i=1; i<100; i++){
            if(i%2 != 0) System.out.println(i);
        }
    }
}
