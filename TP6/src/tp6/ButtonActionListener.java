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
            duree = Integer.parseInt(form.getDuree());
            prix = form.getPrix();
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(form, "Veuillez entrer un nombre");
            return;
        }
        catch(NullPointerException e)// si pas de selection
        {
            JOptionPane.showMessageDialog(form, "Veuillez selectionner un prix");
            return;
        }
        JOptionPane.showMessageDialog(form, "Prix total de l'appel : " + (duree * prix));
        form.dispose();
    }
    
}
