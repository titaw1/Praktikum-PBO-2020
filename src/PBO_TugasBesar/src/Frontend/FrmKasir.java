package Frontend;

import Backend.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FrmKasir extends javax.swing.JFrame {

    /**
     * Creates new form FrmKasir
     */
    public void kosongkanForm(){
        txtIdKasir.setText("0");
        txtNamaKasir.setText("");
        txtAlamat.setText(""); 
        txtTelepon.setText("");
        txtJabatan.setText("");
        txtGaji.setText("");
    }
    
    public void tampilkanData(){
        String[] kolom = {"ID Kasir", "Nama", "Alamat", "Telepon", "Jabatan", "Gaji"};
        ArrayList<Kasir> list = new Kasir().getAll();
        Object rowData[] = new Object[6];
        
        tblKasir.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for(Kasir ka : list){
            rowData[0] = ka.getIdKasir();
            rowData[1] = ka.getNamaKasir();
            rowData[2] = ka.getAlamat();
            rowData[3] = ka.getTelepon();
            rowData[4] = ka.getJabatan();
            rowData[5] = ka.getGaji();
            
            ((DefaultTableModel)tblKasir.getModel()).addRow(rowData);
        }
    }
    
    public void cari(String keyword){
        String[] kolom = {"ID Kasir", "Nama", "Alamat", "Telepon", "Jabatan", "Gaji"};
        ArrayList<Kasir> list = new Kasir().search(keyword);
        Object rowData[] = new Object[6];
        
        tblKasir.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for(Kasir ka : list){
            rowData[0] = ka.getIdKasir();
            rowData[1] = ka.getNamaKasir();
            rowData[2] = ka.getAlamat();
            rowData[3] = ka.getTelepon();
            rowData[4] = ka.getJabatan();
            rowData[5] = ka.getGaji();
            
            ((DefaultTableModel) tblKasir.getModel()).addRow(rowData);
        }
    }
    
    public FrmKasir() {
        initComponents();
        tampilkanData();
        kosongkanForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNamaKasir = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();
        txtJabatan = new javax.swing.JTextField();
        txtGaji = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKasir = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        txtIdKasir = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kasir");

        jLabel1.setText("ID Kasir");

        jLabel2.setText("Nama Kasir");

        jLabel3.setText("Alamat");

        jLabel4.setText("Telepon");

        jLabel5.setText("Jabatan");

        jLabel6.setText("Gaji/Bulan");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblKasir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblKasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKasirMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKasir);

        jLabel7.setText("Pencarian");

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        txtIdKasir.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel8.setText("FORM DATA KASIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamaKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnTambah)
                                                .addGap(84, 84, 84)
                                                .addComponent(btnSimpan)
                                                .addGap(95, 95, 95)
                                                .addComponent(btnHapus))
                                            .addComponent(txtCari))
                                        .addGap(26, 26, 26)
                                        .addComponent(btnCari))
                                    .addComponent(txtIdKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNamaKasir)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        kosongkanForm();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        Kasir ka = new Kasir();
        ka.setIdKasir(Integer.parseInt(txtIdKasir.getText()));
        ka.setNamaKasir(txtNamaKasir.getText());
        ka.setAlamat(txtAlamat.getText());
        ka.setTelepon(txtTelepon.getText());
        ka.setJabatan(txtJabatan.getText());
        ka.setGaji(Integer.parseInt(txtGaji.getText()));
        ka.save();
        txtIdKasir.setText(Integer.toString(ka.getIdKasir()));
        tampilkanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblKasir.getModel();
        int row = tblKasir.getSelectedRow();
        
        Kasir ka = new Kasir().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        ka.delete();
        kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

    private void tblKasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKasirMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblKasir.getModel();
        int row = tblKasir.getSelectedRow();
        
        txtIdKasir.setText(model.getValueAt(row, 0).toString());
        txtNamaKasir.setText(model.getValueAt(row, 1).toString());
        txtAlamat.setText(model.getValueAt(row, 2).toString());
        txtTelepon.setText(model.getValueAt(row, 3).toString());
        txtJabatan.setText(model.getValueAt(row, 4).toString());
        txtGaji.setText(model.getValueAt(row, 5).toString());
    }//GEN-LAST:event_tblKasirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmKasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblKasir;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtGaji;
    private javax.swing.JTextField txtIdKasir;
    private javax.swing.JTextField txtJabatan;
    private javax.swing.JTextField txtNamaKasir;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables
}
