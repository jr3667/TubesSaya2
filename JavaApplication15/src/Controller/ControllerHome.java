/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.Home;
import View.MenuAsisten;
import View.MenuMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class ControllerHome implements ActionListener {

    private Home view;
    private Aplikasi model;
    private ControllerMenuMahasiswa m=null;
    private ControllerMenuAsisten a=null;

    public ControllerHome(Aplikasi model) {
        this.model = model;
        view = new Home();
        view.setVisible(true);

        view.getAsisten().addActionListener(this);
        view.getMahasiswa().addActionListener(this);
        view.getLogout().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if (o.equals(view.getMahasiswa())) {
            m = new ControllerMenuMahasiswa(model);
            view.dispose();
        } else if (o.equals(view.getAsisten())) {
            a = new ControllerMenuAsisten(model);
            view.dispose();
        } else if (o.equals(view.getLogout())) {
            JOptionPane.showMessageDialog(view, "Terimakasih!!!");
            view.dispose();
        }
    }

}
