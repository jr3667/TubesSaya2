/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.CariTugasBesarAsisten;
import View.LoginAsisten;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Penguin
 */
public class ControllerCariTubesAsisten implements ActionListener {

    Aplikasi model;
    CariTugasBesarAsisten view;
    LoginAsisten view1;

    public ControllerCariTubesAsisten(Aplikasi model) {
        this.model = model;
        view1 = new LoginAsisten();
        view = new CariTugasBesarAsisten();
        view.setVisible(true);
        view.getBtnLihatDokumentasi().addActionListener(this);
        view.getBtnMainMenu().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(view.getBtnLihatDokumentasi())) {
            model.menuShowAllAsistenTubes();
            int b = Integer.valueOf(view.getTextIndexTubes().getText());
            String a = view1.getBoxIDAsisten().getText();
            model.getAsisten(a).getTugasBesar(b);
            new ControllerViewDokumentasi(model);
            view.dispose();

        } else if (o.equals(view.getBtnMainMenu())) {
            new ControllerHome(model);
            view.dispose();
        }
    }

}
