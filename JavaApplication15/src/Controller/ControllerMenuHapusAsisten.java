/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.HapusDokumenTubesMhs;
import View.MenuAsisten;
import View.MenuHapusAsisten;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Penguin
 */
public class ControllerMenuHapusAsisten implements ActionListener {

    Aplikasi model;
    MenuHapusAsisten view;

    public ControllerMenuHapusAsisten(Aplikasi model) {
        this.model = model;
        view = new MenuHapusAsisten();
        view.setVisible(true);

        view.getBtnHapusAsisten().addActionListener(this);
        view.getBtnMainMenu1().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(view.getBtnHapusAsisten())) {
            new ControllerMenuAsisten(model);
            view.dispose();
        } else if (o.equals(view.getBtnMainMenu1())) {
            new ControllerHome(model);
            view.dispose();

        }
    }

}
