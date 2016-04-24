/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.LoginMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Penguin
 */
public class ControllerLoginMhs implements ActionListener{
    Aplikasi model;
    LoginMahasiswa view;

    public ControllerLoginMhs(Aplikasi model) {
        this.model = model;
        view = new LoginMahasiswa();
        view.setVisible(true);
        view.getBtnMainMenu1().addActionListener(this);
        view.getBtnloginmhs().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    Object o = e.getSource();
    if (o.equals(view.getBtnMainMenu1())){
        new ControllerHome(model);
        view.dispose();
    }else if (o.equals(view.getBtnloginmhs())){
        model.getMahasiswa(view.getBoxNIMMhs().getText());
        new ControllerSubMenuMahasiswa(model);
        view.dispose();
    }
    
    }
    
    
}
