/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author etien
 */
class ButtonListener implements ActionListener
{
    private final Form form;
    private final String msg;

    public ButtonListener(Form form, String msg)
    {
        this.form = form;
        this.msg = msg;
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        form.setMessage(msg);
    }
    
}
