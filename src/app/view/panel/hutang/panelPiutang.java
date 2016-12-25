/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.panel.hutang;

import app.table.Bank;
import app.table.Bayarpihutang;
import app.table.Saldo;
import com.toedter.calendar.JDateChooserCellEditor;
import java.awt.EventQueue;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author SEED
 */
public class panelPiutang extends JPanel {
    
    public panelPiutang() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Piutang p");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        bankQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bank b");
        bankList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(bankQuery.getResultList());
        jDialog1 = new javax.swing.JDialog();
        inputPanel1 = new app.utils.inputPanel(app.table.Piutang.class);
        jComboBox5 = new javax.swing.JComboBox<>();
        newButton = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        inputPanel2 = new app.utils.inputPanel(app.table.BayarPihutangPemasukan.class);
        jComboBox6 = new javax.swing.JComboBox<>();
        newButton2 = new javax.swing.JButton();
        jDialog3 = new javax.swing.JDialog();
        inputPanel3 = new app.utils.inputPanel(app.table.BayarPihutangPengeluaran.class);
        jComboBox7 = new javax.swing.JComboBox<>();
        newButton3 = new javax.swing.JButton();
        newDetailButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        newButton1 = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        newDetailButton1 = new javax.swing.JButton();
        newDetailButton2 = new javax.swing.JButton();
        deleteDetailButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        detailScrollPane = new javax.swing.JScrollPane();
        detailTable = new javax.swing.JTable();

        FormListener formListener = new FormListener();

        jDialog1.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        jDialog1.setType(java.awt.Window.Type.POPUP);

        inputPanel1.setLayout(new java.awt.GridLayout(0, 2));
        jDialog1.getContentPane().add(inputPanel1, java.awt.BorderLayout.CENTER);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${bankList}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jComboBox5);
        bindingGroup.addBinding(jComboBoxBinding);

        jDialog1.getContentPane().add(jComboBox5, java.awt.BorderLayout.PAGE_END);

        newButton.setText("Tambah");
        newButton.addActionListener(formListener);
        jDialog1.getContentPane().add(newButton, java.awt.BorderLayout.PAGE_START);

        jDialog2.setTitle("Pemasukan");
        jDialog2.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        jDialog2.setType(java.awt.Window.Type.POPUP);
        jDialog2.getContentPane().add(inputPanel2, java.awt.BorderLayout.CENTER);

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${bankList}");
        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jComboBox6);
        bindingGroup.addBinding(jComboBoxBinding);

        jDialog2.getContentPane().add(jComboBox6, java.awt.BorderLayout.PAGE_END);

        newButton2.setText("Tambah");
        newButton2.addActionListener(formListener);
        jDialog2.getContentPane().add(newButton2, java.awt.BorderLayout.PAGE_START);

        jDialog3.setTitle("Pengeluaran");
        jDialog3.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        jDialog3.setType(java.awt.Window.Type.POPUP);
        jDialog3.getContentPane().add(inputPanel3, java.awt.BorderLayout.CENTER);

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${bankList}");
        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jComboBox7);
        bindingGroup.addBinding(jComboBoxBinding);

        jDialog3.getContentPane().add(jComboBox7, java.awt.BorderLayout.PAGE_END);

        newButton3.setText("Tambah");
        newButton3.addActionListener(formListener);
        jDialog3.getContentPane().add(newButton3, java.awt.BorderLayout.PAGE_START);

        newDetailButton.setText("new");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), newDetailButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newDetailButton.addActionListener(formListener);

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        newButton1.setText("Tambah");
        newButton1.addActionListener(formListener);
        jPanel1.add(newButton1);

        deleteButton.setText("Hapus Pinjaman");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);
        jPanel1.add(deleteButton);

        add(jPanel1);

        masterTable.setAutoCreateRowSorter(true);
        masterTable.setCellSelectionEnabled(true);
        masterTable.setRowHeight(25);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${piutangid}"));
        columnBinding.setColumnName("Piutangid");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pimjaman}"));
        columnBinding.setColumnName("Pimjaman");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${keterangan}"));
        columnBinding.setColumnName("Keterangan");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${jaminan}"));
        columnBinding.setColumnName("Jaminan");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nominal}"));
        columnBinding.setColumnName("Nominal");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tglbyr}"));
        columnBinding.setColumnName("Tglbyr");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tglawal}"));
        columnBinding.setColumnName("Tglawal");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tglakhir}"));
        columnBinding.setColumnName("Tglakhir");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);
        masterTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        add(masterScrollPane);

        newDetailButton1.setText("Pemasukan");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), newDetailButton1, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newDetailButton1.addActionListener(formListener);
        jPanel2.add(newDetailButton1);

        newDetailButton2.setText("Pengeluaran");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), newDetailButton2, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newDetailButton2.addActionListener(formListener);
        jPanel2.add(newDetailButton2);

        deleteDetailButton.setText("Hapus Transaksi");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteDetailButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteDetailButton.addActionListener(formListener);
        jPanel2.add(deleteDetailButton);

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(formListener);
        jPanel2.add(refreshButton);

        saveButton.setText("Simpan");
        saveButton.addActionListener(formListener);
        jPanel2.add(saveButton);

        add(jPanel2);

        masterTable.setDefaultEditor(Date.class, new JDateChooserCellEditor());
        masterTable.setDefaultEditor(String.class, new app.utils.TablePopupEditor());
        masterTable.setDefaultRenderer(java.math.BigInteger.class, new app.utils.NominalRender());
        masterTable.setDefaultEditor(java.math.BigInteger.class, new app.utils.TablePopupEditor());
        detailTable.setDefaultEditor(Date.class, new JDateChooserCellEditor());
        detailTable.setDefaultEditor(String.class, new app.utils.TablePopupEditor());
        detailTable.setDefaultEditor(java.math.BigInteger.class, new app.utils.TablePopupEditor());
        detailTable.setDefaultRenderer(java.math.BigInteger.class, new app.utils.NominalRender());
        detailTable.setAutoCreateRowSorter(true);
        detailTable.setCellSelectionEnabled(true);
        detailTable.setRowHeight(25);

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${selectedElement.bayarpihutangList}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, eLProperty, detailTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Pinjaman REF");
        columnBinding.setColumnClass(Long.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Transaksi REF");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tanggal}"));
        columnBinding.setColumnName("Tanggal");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${keterangan}"));
        columnBinding.setColumnName("Keterangan");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${jumlah}"));
        columnBinding.setColumnName("Jumlah");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pemasukan}"));
        columnBinding.setColumnName("Pemasukan");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pengeluaran}"));
        columnBinding.setColumnName("Pengeluaran");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${jenis}"));
        columnBinding.setColumnName("Jenis");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${transaksi}"));
        columnBinding.setColumnName("Transaksi");
        columnBinding.setColumnClass(app.table.Saldo.class);
        columnBinding.setEditable(false);
        jTableBinding.setSourceUnreadableValue(java.util.Collections.emptyList());
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        detailScrollPane.setViewportView(detailTable);

        add(detailScrollPane);

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == newButton) {
                panelPiutang.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                panelPiutang.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newDetailButton) {
                panelPiutang.this.newDetailButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteDetailButton) {
                panelPiutang.this.deleteDetailButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                panelPiutang.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == saveButton) {
                panelPiutang.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newButton1) {
                panelPiutang.this.newButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == newDetailButton1) {
                panelPiutang.this.newDetailButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == newDetailButton2) {
                panelPiutang.this.newDetailButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == newButton2) {
                panelPiutang.this.newButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == newButton3) {
                panelPiutang.this.newButton3ActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    
    private void deleteDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDetailButtonActionPerformed
        int index = masterTable.getSelectedRow();
        app.table.Piutang p = list.get(masterTable.convertRowIndexToModel(index));
        Collection<app.table.Bayarpihutang> bs = p.getBayarpihutangList();
        int[] selected = detailTable.getSelectedRows();
        List<app.table.Bayarpihutang> toRemove = new ArrayList<app.table.Bayarpihutang>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            selected[idx] = detailTable.convertRowIndexToModel(selected[idx]);
            int count = 0;
            Iterator<app.table.Bayarpihutang> iter = bs.iterator();
            while (count++ < selected[idx]) {
                iter.next();
            }
            app.table.Bayarpihutang b = iter.next();
            toRemove.add(b);
            entityManager.remove(b);
        }
        bs.removeAll(toRemove);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
    }//GEN-LAST:event_deleteDetailButtonActionPerformed

    private void newDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDetailButtonActionPerformed
        boolean pem = evt.getSource() == newButton2;
        int index = masterTable.getSelectedRow();
        app.table.Piutang p = list.get(masterTable.convertRowIndexToModel(index));
        Collection<app.table.Bayarpihutang> bs = p.getBayarpihutangList();
        if (bs == null) {
            bs = new LinkedList<app.table.Bayarpihutang>();
            p.setBayarpihutangList((List) bs);
        }
        app.table.Bayarpihutang b = new app.table.Bayarpihutang();
        Saldo ts = new app.table.Saldo();
        if (pem) {
            System.out.println("pemasukan = " + pem);
            b = (Bayarpihutang) this.inputPanel2.getTarget();
            ts.setBankId((Bank) this.jComboBox6.getSelectedItem());
        }
        else
        {
            System.out.println("pengeluaran = " + pem);
            b = (Bayarpihutang) this.inputPanel3.getTarget();
            ts.setBankId((Bank) this.jComboBox7.getSelectedItem());        
        }
        b.setTransaksi(ts);
        entityManager.persist(b);
        b.setPihutangid(p);
        bs.add(b);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
        int row = bs.size() - 1;
        detailTable.setRowSelectionInterval(row, row);
        detailTable.scrollRectToVisible(detailTable.getCellRect(row, 0, true));
    }//GEN-LAST:event_newDetailButtonActionPerformed
    
    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
        bankList.clear();
        bankList.addAll(bankQuery.getResultList());
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] selected = masterTable.getSelectedRows();
        List<app.table.Piutang> toRemove = new ArrayList<app.table.Piutang>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            app.table.Piutang p = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(p);
            entityManager.remove(p);
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        app.table.Piutang p = (app.table.Piutang) this.inputPanel1.getTarget();
        entityManager.persist(p);
        list.add(p);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
        jDialog1.hide();
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<app.table.Piutang> merged = new ArrayList<app.table.Piutang>(list.size());
            for (app.table.Piutang p : list) {
                merged.add(entityManager.merge(p));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void newButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButton1ActionPerformed
        this.jDialog1.setSize(700, 500);
        this.jDialog1.setLocationRelativeTo(null);
        this.jDialog1.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_newButton1ActionPerformed

    private void newDetailButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDetailButton1ActionPerformed
        this.jDialog2.setSize(300, 500);
        this.jDialog2.setLocationRelativeTo(null);
        this.jDialog2.show();        // TODO add your handling code here:
    }//GEN-LAST:event_newDetailButton1ActionPerformed

    private void newDetailButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDetailButton2ActionPerformed
        this.jDialog3.setSize(300, 500);
        this.jDialog3.setLocationRelativeTo(null);
        this.jDialog3.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_newDetailButton2ActionPerformed

    private void newButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButton2ActionPerformed
        this.newDetailButtonActionPerformed(evt);
        this.jDialog2.hide();
        // TODO add your handling code here:

    }//GEN-LAST:event_newButton2ActionPerformed

    private void newButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButton3ActionPerformed
        this.newDetailButtonActionPerformed(evt);
        this.jDialog3.hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_newButton3ActionPerformed

    public List<Bank> getBankList() {
        return bankList;
    }

    public void setBankList(List<Bank> bankList) {
        this.bankList = bankList;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<app.table.Bank> bankList;
    private javax.persistence.Query bankQuery;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteDetailButton;
    private javax.swing.JScrollPane detailScrollPane;
    private javax.swing.JTable detailTable;
    private javax.persistence.EntityManager entityManager;
    private app.utils.inputPanel inputPanel1;
    private app.utils.inputPanel inputPanel2;
    private app.utils.inputPanel inputPanel3;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.util.List<app.table.Piutang> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.swing.JButton newButton1;
    private javax.swing.JButton newButton2;
    private javax.swing.JButton newButton3;
    private javax.swing.JButton newDetailButton;
    private javax.swing.JButton newDetailButton1;
    private javax.swing.JButton newDetailButton2;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
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
            java.util.logging.Logger.getLogger(panelPiutang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelPiutang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelPiutang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelPiutang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new panelPiutang());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    public void Refresh()
    {
        this.refreshButtonActionPerformed(null);
    }
    
}
