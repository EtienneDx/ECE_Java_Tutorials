/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author etien
 */
class ButtonActionListener implements ActionListener
{
    private final Q1Form form;
    
    public ButtonActionListener(Q1Form form)
    {
        this.form = form;
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        int duree;
        double prix;
        try
        {
            duree = Integer.parseInt(form.getDuree());// on essai de récuperer la valeur du TextField duree et de la convertir
            prix = form.getPrix();// on essai de recuperer le prix
        }
        catch(NumberFormatException e)// si le nombre est mal formatté
        {
            JOptionPane.showMessageDialog(form, "Veuillez entrer un nombre");
            return;// on s'arrete la
        }
        catch(NullPointerException e)// si pas de selection
        {
            JOptionPane.showMessageDialog(form, "Veuillez selectionner un prix");
            return;// on s'arrete la
        }
        JOptionPane.showMessageDialog(form, "Prix total de l'appel : " + (duree * prix));// on affiche le resultat final
        form.dispose();// on ferme et detruit la fenetre, ce qui va arreter le programme
        // sans le dispose, le programme continuera de tourner en arriere plan
    }
    
}
