/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.FixPanel;

import app.table.Bank;
import app.table.Laporan;
import app.table.Pemasukan;
import app.table.Saldo;
import com.toedter.calendar.JDateChooserCellEditor;
import java.awt.EventQueue;
import java.beans.Beans;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.persistence.Query;
import javax.persistence.RollbackException;
import javax.persistence.TypedQuery;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author SEED
 */
public class panelMaster extends JPanel {
    
    public panelMaster() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
        
    }
    
    private Class<? extends Laporan> clazz;
    private Object table;

    public Object getTable() {
        return table;
    }

    public List<Bank> getBankList() {
        return bankList;
    }

    public void setBankList(List<Bank> bankList) {
        this.bankList = bankList;
    }
    
    
    public panelMaster(Object kelas) {
        this.table = kelas;
        this.clazz = (Class) kelas;
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
        this.refreshButtonActionPerformed(null);
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("blessingPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT l FROM Laporan l");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        jDialog1 = new javax.swing.JDialog();
        tanggalLabel = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jumlahLabel = new javax.swing.JLabel();
        jumlahField = new javax.swing.JTextField();
        keteranganLabel = new javax.swing.JLabel();
        keteranganField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        bankQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bank b");
        bankList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(bankQuery.getResultList());
        jDialog2 = new javax.swing.JDialog();
        inputPanel1 = new app.utils.inputPanel();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        newButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        jDialog1.setTitle("Data Baru");
        jDialog1.setAlwaysOnTop(true);
        jDialog1.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        jDialog1.setType(java.awt.Window.Type.POPUP);
        jDialog1.getContentPane().setLayout(new java.awt.GridLayout(0, 1));

        tanggalLabel.setText("Tanggal:");
        jDialog1.getContentPane().add(tanggalLabel);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.tanggal}"), jDateChooser1, org.jdesktop.beansbinding.BeanProperty.create("date"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jDateChooser1, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jDialog1.getContentPane().add(jDateChooser1);

        jumlahLabel.setText("Jumlah:");
        jDialog1.getContentPane().add(jumlahLabel);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.jumlah}"), jumlahField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jumlahField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jDialog1.getContentPane().add(jumlahField);

        keteranganLabel.setText("Keterangan:");
        jDialog1.getContentPane().add(keteranganLabel);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.keterangan}"), keteranganField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), keteranganField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jDialog1.getContentPane().add(keteranganField);

        jLabel1.setText("Bank Tujuan");
        jDialog1.getContentPane().add(jLabel1);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${bankList}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.transaksi.bankId}"), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jDialog1.getContentPane().add(jComboBox1);

        saveButton.setText("Simpan");
        saveButton.addActionListener(formListener);
        jDialog1.getContentPane().add(saveButton);

        jDialog2.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        inputPanel1.setLayout(new java.awt.GridLayout(0, 2));
        jDialog2.getContentPane().add(inputPanel1, java.awt.BorderLayout.CENTER);

        setLayout(new java.awt.BorderLayout());

        masterTable.setDefaultEditor(Date.class, new JDateChooserCellEditor());
        masterTable.setDefaultEditor(String.class, new app.utils.TablePopupEditor());
        masterTable.setDefaultEditor(java.math.BigInteger.class, new app.utils.TablePopupEditor());
        masterTable.setDefaultRenderer(java.math.BigInteger.class, new app.utils.NominalRender());
        masterTable.setAutoCreateRowSorter(true);
        masterTable.setRowHeight(25);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Ref");
        columnBinding.setColumnClass(Long.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tanggal}"));
        columnBinding.setColumnName("Tanggal");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${keterangan}"));
        columnBinding.setColumnName("Keterangan");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${jumlah}"));
        columnBinding.setColumnName("Jumlah");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${jenis}"));
        columnBinding.setColumnName("type");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);

        add(masterScrollPane, java.awt.BorderLayout.CENTER);

        newButton.setText("Baru");
        newButton.addActionListener(formListener);
        jPanel1.add(newButton);

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(formListener);
        jPanel1.add(refreshButton);

        deleteButton.setText("Hapus");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);
        jPanel1.add(deleteButton);

        jButton1.setText("Simpan");
        jButton1.addActionListener(formListener);
        jPanel1.add(jButton1);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == newButton) {
                panelMaster.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                panelMaster.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                panelMaster.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                panelMaster.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == saveButton) {
                panelMaster.this.saveButtonActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        
        String clzName = this.clazz.getSimpleName();
        String que = "SELECT en FROM " + clzName + " en";
        TypedQuery<? extends Laporan> createQuery = entityManager.createQuery(que, clazz);
        List<? extends Laporan> res = createQuery.getResultList();
        
        java.util.List data = query.getResultList();
        java.util.List Res = this.bankQuery.getResultList();
        this.bankList.clear();
        this.bankList.addAll(Res);
        List<Laporan> laps = data;
        Predicate<Laporan> predPem = lp -> lp instanceof app.table.Pengeluaran;
        
        List<Laporan> collect = laps.stream()
                .filter(predPem)
                .collect(Collectors.toList());
        
        for (Object entity : res) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll((Collection<? extends Laporan>) res);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] selected = masterTable.getSelectedRows();
        List<app.table.Laporan> toRemove = new ArrayList<app.table.Laporan>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            app.table.Laporan l = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(l);
            entityManager.remove(l);
        }
        list.removeAll(toRemove);
        this.saveButtonActionPerformed(evt);
    }//GEN-LAST:event_deleteButtonActionPerformed
        public  void Refresh()
        {
                this.refreshButtonActionPerformed(null);
        }
    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        Laporan nw = null;
        try {
            Constructor<? extends Laporan> cons = clazz.getConstructor();
            nw = cons.newInstance();
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(panelMaster.class.getName()).log(Level.SEVERE, null, ex);
        }
//        app.table.Laporan l = new app.table.Laporan();
        nw.setTransaksi(new Saldo());
        nw.getTransaksi().setBankId((Bank) this.jComboBox1.getSelectedItem());
        entityManager.persist(nw);
        list.add(nw);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
        this.jDialog1.setSize(400,300);
        this.jDialog1.setLocationRelativeTo(null);
        this.jDialog1.show();
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        this.jDialog1.setVisible(false);
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<app.table.Laporan> merged = new ArrayList<app.table.Laporan>(list.size());
            for (app.table.Laporan l : list) {
                merged.add(entityManager.merge(l));
            }
            list.clear();
            list.addAll(merged);
        }
        this.refreshButtonActionPerformed(evt);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.saveButtonActionPerformed(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<app.table.Bank> bankList;
    private javax.persistence.Query bankQuery;
    private javax.swing.JButton deleteButton;
    private javax.persistence.EntityManager entityManager;
    private app.utils.inputPanel inputPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jumlahField;
    private javax.swing.JLabel jumlahLabel;
    private javax.swing.JTextField keteranganField;
    private javax.swing.JLabel keteranganLabel;
    private java.util.List<app.table.Laporan> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel tanggalLabel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(panelMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new panelMaster(app.table.KeuanganMobil.class));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
