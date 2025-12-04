package entrainement;

import java.util.Scanner; /* Import de la bibliothèque Java pour Scanner */

public class message {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //* Initialsiation du scanner */
        String VotreNom;
        int VotreAge;
        boolean response;
        
        System.out.println("Quel est votre nom ? :");
        VotreNom = sc.nextLine(); //* Insertion de la réponse via le clavier dans ma variable */
           System.out.println("Quel est votre âge ? :");   
        VotreAge = sc.nextInt();
                   System.out.println("Aimez-vous les chiens ? :");   
        response = sc.nextBoolean();
         System.out.println("\n Bonjour "+VotreNom+", enchanté !");
        System.out.println("\n Vous avez " +VotreAge+" ans");

        if(!response){ // Par défaut le if vérifie si c'est vrai, si on ajoute ! alors il teste si c'est faux

                    System.out.println("Vous n'aimez pas les chiens"); 

        }else{

                System.out.println("Vous aimez les chiens");      
        }


         
        sc.close(); /* Fermez vos scanner à la fin */


    }
    
}
