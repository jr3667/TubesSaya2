/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;

/**
 *
 * @author Penguin
 */
public class MenuTugasBesarMhs extends javax.swing.JFrame {

    /**
     * Creates new form SubMenuMahasiswa
     */
    public MenuTugasBesarMhs() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnTambahKeTugasBesar = new javax.swing.JButton();
        BtnTambahDokumentasiKeTugasBesar = new javax.swing.JButton();
        BtnHapusDokumentasiTugasBesar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnHalamanUtama = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnTambahKeTugasBesar.setText("Tambah Ke tugas besar");

        BtnTambahDokumentasiKeTugasBesar.setText("Tambah Dokumentasi ke tugas besar");
        BtnTambahDokumentasiKeTugasBesar.setToolTipText("");

        BtnHapusDokumentasiTugasBesar.setText("Hapus dokumentasi tugas besar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Menu Tugas Besar Mahasiswa");

        BtnHalamanUtama.setText("Kembali Ke Menu Utama");

        jLabel7.setText("Menu Utama>Mahasiwa>Login Mahasiswa>Sub Menu Mahasiswa");

        jLabel2.setText(">Tugas Besar Mahasiswa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnHapusDokumentasiTugasBesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnTambahKeTugasBesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnTambahDokumentasiKeTugasBesar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnHalamanUtama)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnTambahKeTugasBesar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnTambahDokumentasiKeTugasBesar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(BtnHapusDokumentasiTugasBesar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(BtnHalamanUtama)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  public JButton getBtnHalamanUtama() {
        return BtnHalamanUtama;
    }

    public JButton getBtnTambahDokumentasiKeTugasBesar() {
        return BtnTambahDokumentasiKeTugasBesar;
    }

    public JButton getBtnHapusDokumentasiTugasBesar() {
        return BtnHapusDokumentasiTugasBesar;
    }

    public JButton getBtnTambahKeTugasBesar() {
        return BtnTambahKeTugasBesar;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHalamanUtama;
    private javax.swing.JButton BtnHapusDokumentasiTugasBesar;
    private javax.swing.JButton BtnTambahDokumentasiKeTugasBesar;
    private javax.swing.JButton BtnTambahKeTugasBesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
  


}
