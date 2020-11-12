/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author etien
 */
public class Multithreading
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Form form = new Form();
        form.setVisible(true);
        form.waitForMessage();
        System.out.println(form.getMessage());
        form.setVisible(false);
    }
    
}
