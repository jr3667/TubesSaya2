/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.MenuAsisten;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author acer
 */
public class ControllerMenuAsisten implements ActionListener {

    private MenuAsisten view;
    private Aplikasi model;

    public ControllerMenuAsisten(Aplikasi model) {
        this.model = model;
        view = new MenuAsisten();
        view.setVisible(true);
        view.getBtnAdd().addActionListener(this);
        view.getBtnCariAs().addActionListener(this);
        view.getBtnHapusAs().addActionListener(this);
        view.getBtnMainMenu().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(view.getBtnCariAs())) {
            new ControllerLoginAsisten(model);
            view.dispose();
        } else if (o.equals(view.getBtnAdd())) {
            new ControllerInputDataAsisten(model);
            view.dispose();
        } else if (o.equals(view.getBtnHapusAs())) {
            new ControllerMenuHapusAsisten(model);
            view.dispose();
        } else if (o.equals(view.getBtnMainMenu())){
            new ControllerHome(model);
            view.dispose();
        }
    }
}