/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

/**
 *
 * @author etien
 */
public class TP6
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Q1Form q1 = new Q1Form();// on créé le formulaire
        q1.setVisible(true);// on le rend visible /!\ cette fonction n'est pas bloquante, elle démarre un autre thread
        // cela signifie qu'une fois le formulaire affiché, la fonction main se termine, et aucun code utilisateur n'est utilisé
        // jusqu'a l'appel d'un Action Listener (appelk fait automatiquement par java)
    }
    
}
