/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Mahasiswa;
import View.TambahMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class ControllerInputDataMahasiswa implements ActionListener {

    private Aplikasi model;
    private TambahMahasiswa view;

    public ControllerInputDataMahasiswa(Aplikasi model) {
        this.model = model;
        view = new TambahMahasiswa();
        view.setVisible(true);
        view.getBtnSimpanMhs().addActionListener(this);
        view.getBtnMainMenu().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnSimpanMhs())) {
            String nama = view.getNamaMhsText().getText();
            String alamat = view.getAlamatMhsText().getText();
            String jkelamin = view.getJenisKelamin();
            String nohp = view.getNohpMhsText().getText();
            String nim = view.getNimMhsText().getText();
            model.addMahasiswa(nama, alamat, nohp, jkelamin, nim);
            JOptionPane.showMessageDialog(null, "Input Mahasiswa Berhasil");
            view.dispose();
            new ControllerMenuMahasiswa(model);
        } else if (source.equals(view.getBtnMainMenu())){
            view.dispose();
            new ControllerHome(model);
        }
    }
}
