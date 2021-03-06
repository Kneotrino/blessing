/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.panel.bank;

import app.table.Bank;
import app.table.Saldo;
import com.toedter.calendar.JDateChooserCellEditor;
import java.text.DecimalFormat;
import java.util.Date;

/**
 *
 * @author SEED
 */
public class bankPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public bankPanel() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        blessingPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("blessingPU").createEntityManager();
        bankQuery = java.beans.Beans.isDesignTime() ? null : blessingPUEntityManager.createQuery("SELECT b FROM Bank b");
        bankList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(bankQuery.getResultList());
        saldoQuery = java.beans.Beans.isDesignTime() ? null : blessingPUEntityManager.createQuery("SELECT s FROM Saldo s");
        saldoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(saldoQuery.getResultList());
        jDialog1 = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Simpan = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jDialog1.getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setLayout(new java.awt.GridLayout(0, 2));

        jButton5.setText("SIMPAN");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);

        jButton6.setText("HAPUS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);

        jLabel11.setText("Bank Ref");
        jPanel3.add(jLabel11);

        jTextField11.setEditable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.bankId}"), jTextField11, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanel3.add(jTextField11);

        jLabel5.setText("Bank");
        jPanel3.add(jLabel5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.namaBank}"), jTextField5, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanel3.add(jTextField5);

        jLabel9.setText("No Rekening");
        jPanel3.add(jLabel9);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.norek}"), jTextField9, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanel3.add(jTextField9);

        jLabel1.setText("Nama");
        jPanel3.add(jLabel1);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nama}"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanel3.add(jTextField1);

        jLabel2.setText("Alamat");
        jPanel3.add(jLabel2);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.alamat}"), jTextField2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanel3.add(jTextField2);

        jLabel3.setText("No Identitas");
        jPanel3.add(jLabel3);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nomorKtp}"), jTextField3, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanel3.add(jTextField3);

        jLabel8.setText("No Handphone");
        jPanel3.add(jLabel8);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nomorHp}"), jTextField8, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanel3.add(jTextField8);

        jLabel6.setText("Total Kredit");
        jPanel3.add(jLabel6);

        jTextField6.setEditable(false);
        jTextField6.setText("jTextField1");
        jPanel3.add(jTextField6);

        jLabel7.setText("Total Debit");
        jPanel3.add(jLabel7);

        jTextField7.setEditable(false);
        jTextField7.setText("jTextField1");
        jPanel3.add(jTextField7);

        jLabel10.setText("Total Saldo terakhir");
        jPanel3.add(jLabel10);

        jTextField10.setEditable(false);
        jTextField10.setText("jTextField1");
        jPanel3.add(jTextField10);

        jTabbedPane2.addTab("Info Bank", jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jTable3.setDefaultEditor(Date.class, new JDateChooserCellEditor());
        jTable3.setRowHeight(22);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${selectedElement.saldoList}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, eLProperty, jTable3);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bankId.bankId}"));
        columnBinding.setColumnName("Bank Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${debit}"));
        columnBinding.setColumnName("Debit");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${keterangan}"));
        columnBinding.setColumnName("Keterangan");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kredit}"));
        columnBinding.setColumnName("Kredit");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${saldo}"));
        columnBinding.setColumnName("Saldo");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${saldoId}"));
        columnBinding.setColumnName("Saldo Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tanggal}"));
        columnBinding.setColumnName("Tanggal");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${s}"), jTable3, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jScrollPane3.setViewportView(jTable3);

        jPanel4.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jButton7.setText("TAMBAH");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7);

        jButton8.setText("SIMPAN");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8);

        jButton9.setText("HAPUS");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton9);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jTabbedPane2.addTab("Rekam Jejak", jPanel4);

        jDialog1.getContentPane().add(jTabbedPane2);

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bankList, jTable1);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bankId}"));
        columnBinding.setColumnName("Bank Ref");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${namaBank}"));
        columnBinding.setColumnName("Nama Bank");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomorKtp}"));
        columnBinding.setColumnName("Nomor Ktp");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomorHp}"));
        columnBinding.setColumnName("Nomor Hp");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${alamat}"));
        columnBinding.setColumnName("Alamat");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nama}"));
        columnBinding.setColumnName("Nama");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${norek}"));
        columnBinding.setColumnName("Norek");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${b}"), jTable1, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jButton1.setText("LIHAT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setText("BARU");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        Simpan.setText("SIMPAN");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        jPanel2.add(Simpan);

        Hapus.setText("HAPUS");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel2.add(Hapus);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.addTab("BANK", jPanel1);

        jTable2.setDefaultEditor(Date.class, new JDateChooserCellEditor());
        jTable2.setRowHeight(25);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, saldoList, jTable2);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bankId.bankId}"));
        columnBinding.setColumnName("Ref Bank");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${keterangan}"));
        columnBinding.setColumnName("Keterangan");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${saldo}"));
        columnBinding.setColumnName("Saldo");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${debit}"));
        columnBinding.setColumnName("Debit");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kredit}"));
        columnBinding.setColumnName("Kredit");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tanggal}"));
        columnBinding.setColumnName("Tanggal");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${saldoId}"));
        columnBinding.setColumnName("Saldo Id");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jTable2);

        jTabbedPane1.addTab("SALDO", jScrollPane2);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.out.println("app.view.panel.bank.bankPanel.jButton2ActionPerformed()");        
        Bank bank = new app.table.Bank();       
        this.persist(bank);        
        this.bankList.add(bank);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        System.out.println("app.view.panel.bank.bankPanel.jButton4ActionPerformed()");
        if (!this.blessingPUEntityManager.getTransaction().isActive()) 
                this.blessingPUEntityManager.getTransaction().begin();
        this.blessingPUEntityManager.getTransaction().commit();         // TODO add your handling code here:
    }//GEN-LAST:event_SimpanActionPerformed
    Bank B = new app.table.Bank();

    public Bank getB() {
        return B;
    }

    public void setB(Bank B) {
        this.B = B;
    }
    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        System.out.println("app.view.panel.bank.bankPanel.jButton3ActionPerformed()");
        if (!this.blessingPUEntityManager.getTransaction().isActive()) 
                this.blessingPUEntityManager.getTransaction().begin();        
        this.blessingPUEntityManager.remove(this.getB());
        this.blessingPUEntityManager.getTransaction().commit();
        boolean re = this.B.getSaldoList().remove(S);
        boolean remove = this.saldoList.remove(S);
        javax.swing.JOptionPane.showMessageDialog(this.getRootPane(), 
                (remove ? "Berhasil":"Gagal" )+" Menghapus\n" + this.jTextField5.getText()
        );        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_HapusActionPerformed
        private void UpdatePDP()
    {   
        System.out.println("app.view.panel.mobil.panelMobil.UpdatePDP()");
        long tk =
                this.B.getSaldoList()
                .stream()
                .mapToLong(i -> i.getKredit())
                .sum();
        long td =
                this.B.getSaldoList()
                .stream()
                .mapToLong(i -> i.getDebit())
                .sum();
        long p = tk -td;
        this.jTextField6.setText(Rp.format(tk) );
        this.jTextField7.setText(Rp.format(td) );
        this.jTextField10.setText(Rp.format(p) );
        
    }
                private final DecimalFormat Rp = new DecimalFormat("#,##0");

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean pilihan = (this.jTable1.isCellSelected(jTable1.getSelectedRow(), jTable1.getSelectedColumn()));
        if (pilihan) {
        this.UpdatePDP();
        this.jDialog1.setSize(500, 400);
        this.jDialog1.setLocationRelativeTo(null);        
        this.jDialog1.setVisible(true);
//        this.UpdatePDP();
        }
        else
        {
            javax.swing.JOptionPane.showMessageDialog(null, "Silahkan pilih mobil yang ingin di lihat terlebih dahulu");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.UpdatePDP();
        this.SimpanActionPerformed(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.HapusActionPerformed(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          Saldo saldo = new Saldo();
          saldo.setBankId(B);
          saldo.setTanggal(new java.util.Date());
          this.saldoList.add(saldo);
          this.persist(saldo);
          this.B.getSaldoList().add(saldo);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.UpdatePDP();
        this.SimpanActionPerformed(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed
    private Saldo S = new Saldo();

    public Saldo getS() {
        return S;
    }

    public void setS(Saldo S) {
        this.S = S;
    }
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (!this.blessingPUEntityManager.getTransaction().isActive()) 
                this.blessingPUEntityManager.getTransaction().begin();        
        this.blessingPUEntityManager.remove(S);
        this.blessingPUEntityManager.getTransaction().commit();
        boolean remove = this.saldoList.remove(S);
        boolean remo = this.B.getSaldoList().remove(S);
        
        javax.swing.JOptionPane.showMessageDialog(this.getRootPane(), 
                (remove ? "Berhasil":"Gagal" )+" Menghapus\n"
        );        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    public void persist(Object object) {
        if (!this.blessingPUEntityManager.getTransaction().isActive())         
            blessingPUEntityManager.getTransaction().begin();
        try {
            blessingPUEntityManager.persist(object);
            blessingPUEntityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            blessingPUEntityManager.getTransaction().rollback();
        } finally {
//            blessingPUEntityManager.close();
            System.out.println(object+"=persisted");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Simpan;
    private java.util.List<app.table.Bank> bankList;
    private javax.persistence.Query bankQuery;
    private javax.persistence.EntityManager blessingPUEntityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private java.util.List<app.table.Saldo> saldoList;
    private javax.persistence.Query saldoQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
