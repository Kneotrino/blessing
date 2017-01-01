/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.panel.perjalanan;

import app.table.Bank;
import app.table.Pemasukan;
import app.table.Pengeluaran;
import app.table.Perjalanan;
import app.table.PerjalananPemasukan;
import app.table.PerjalananPengeluaran;
import app.table.Saldo;
import app.table.Trips;
import app.table.Util;
import com.toedter.calendar.JDateChooserCellEditor;
import java.awt.EventQueue;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
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
public class panelPerjalanan extends JPanel {
    Bank Peter;
    public panelPerjalanan() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
//        this.Refresh();
    }

    public List<Bank> getBankList() {
        return bankList;
    }

    public void setBankList(List<Bank> bankList) {
        this.bankList = bankList;
    }
    
    public void Refresh()
    {
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM Trips t");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        jDialog1 = new javax.swing.JDialog();
        inputPanel1 = new app.utils.inputPanel(app.table.Trips.class);
        newButton = new javax.swing.JButton();
        bankQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bank b");
        bankList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bankQuery.getResultList();
        newDetailButton = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        inputPanel2 = new app.utils.inputPanel(app.table.PerjalananPemasukan.class);
        newButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDialog3 = new javax.swing.JDialog();
        inputPanel3 = new app.utils.inputPanel(app.table.PerjalananPengeluaran.class);
        newButton3 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jDialog4 = new javax.swing.JDialog();
        inputPanel4 = new app.utils.inputPanel(app.table.PerjalananPengeluaran.class);
        newButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        newButton1 = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        refreshButton1 = new javax.swing.JButton();
        saveButton1 = new javax.swing.JButton();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        newDetailButton1 = new javax.swing.JButton();
        newDetailButton2 = new javax.swing.JButton();
        newDetailButton3 = new javax.swing.JButton();
        deleteDetailButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        detailScrollPane = new javax.swing.JScrollPane();
        detailTable = new javax.swing.JTable();

        FormListener formListener = new FormListener();

        jDialog1.setTitle("Data Laporan Perjalanan");
        jDialog1.setModal(true);

        inputPanel1.setLayout(new java.awt.GridLayout(0, 2));
        jDialog1.getContentPane().add(inputPanel1, java.awt.BorderLayout.CENTER);

        newButton.setText("Simpan");
        newButton.addActionListener(formListener);
        jDialog1.getContentPane().add(newButton, java.awt.BorderLayout.PAGE_START);

        newDetailButton.setText("New");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), newDetailButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newDetailButton.addActionListener(formListener);

        jDialog2.setTitle("Input data Transfer Uang");
        jDialog2.setModal(true);

        inputPanel2.setLayout(new java.awt.GridLayout(0, 2));
        jDialog2.getContentPane().add(inputPanel2, java.awt.BorderLayout.CENTER);

        newButton2.setText("Simpan");
        newButton2.addActionListener(formListener);
        jDialog2.getContentPane().add(newButton2, java.awt.BorderLayout.PAGE_START);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${bankList}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jComboBox2);
        bindingGroup.addBinding(jComboBoxBinding);

        jDialog2.getContentPane().add(jComboBox2, java.awt.BorderLayout.PAGE_END);

        jDialog3.setTitle("Input Data Kembalikan");
        jDialog3.setModal(true);

        inputPanel3.setLayout(new java.awt.GridLayout(0, 2));
        jDialog3.getContentPane().add(inputPanel3, java.awt.BorderLayout.CENTER);

        newButton3.setText("Simpan");
        newButton3.addActionListener(formListener);
        jDialog3.getContentPane().add(newButton3, java.awt.BorderLayout.PAGE_START);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${bankList}");
        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jComboBox3);
        bindingGroup.addBinding(jComboBoxBinding);

        jDialog3.getContentPane().add(jComboBox3, java.awt.BorderLayout.PAGE_END);

        jDialog4.setTitle("Input Data Pakai");
        jDialog4.setModal(true);

        inputPanel4.setLayout(new java.awt.GridLayout(0, 2));
        jDialog4.getContentPane().add(inputPanel4, java.awt.BorderLayout.CENTER);

        newButton4.setText("Simpan");
        newButton4.addActionListener(formListener);
        jDialog4.getContentPane().add(newButton4, java.awt.BorderLayout.PAGE_START);

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        newButton1.setText("Tambah");
        newButton1.addActionListener(formListener);
        jPanel1.add(newButton1);

        deleteButton.setText("Hapus");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);
        jPanel1.add(deleteButton);

        refreshButton1.setText("Refresh");
        refreshButton1.addActionListener(formListener);
        jPanel1.add(refreshButton1);

        saveButton1.setText("Simpan");
        saveButton1.addActionListener(formListener);
        jPanel1.add(saveButton1);

        add(jPanel1);

        masterTable.setAutoCreateRowSorter(true);
        masterTable.setCellSelectionEnabled(true);
        masterTable.setRowHeight(30);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tripsId}"));
        columnBinding.setColumnName("Trips Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${keterangan}"));
        columnBinding.setColumnName("Keterangan");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${perjalananke}"));
        columnBinding.setColumnName("Perjalananke");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tanggalBerangkat}"));
        columnBinding.setColumnName("Tanggal Berangkat");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tanggalKembali}"));
        columnBinding.setColumnName("Tanggal Kembali");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);

        add(masterScrollPane);

        newDetailButton1.setText("Transfer");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), newDetailButton1, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newDetailButton1.addActionListener(formListener);
        jPanel2.add(newDetailButton1);

        newDetailButton2.setText("Kembalikan");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), newDetailButton2, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newDetailButton2.addActionListener(formListener);
        jPanel2.add(newDetailButton2);

        newDetailButton3.setText("Pengeluaran Perjalanan");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), newDetailButton3, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newDetailButton3.addActionListener(formListener);
        jPanel2.add(newDetailButton3);

        deleteDetailButton.setText("Hapus");

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

        detailTable.setDefaultEditor(String.class, new app.utils.TablePopupEditor());
        detailTable.setDefaultEditor(java.math.BigInteger.class, new app.utils.TablePopupEditor());
        detailTable.setDefaultEditor(Date.class, new JDateChooserCellEditor());
        detailTable.setDefaultRenderer(java.math.BigInteger.class, new app.utils.NominalRender());
        masterTable.setDefaultEditor(String.class, new app.utils.TablePopupEditor());
        masterTable.setDefaultEditor(Date.class, new JDateChooserCellEditor());
        masterTable.setDefaultEditor(java.math.BigInteger.class, new app.utils.TablePopupEditor());
        masterTable.setDefaultRenderer(java.math.BigInteger.class, new app.utils.NominalRender());
        detailTable.setAutoCreateRowSorter(true);
        detailTable.setRowHeight(30);

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${selectedElement.perjalananList}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, eLProperty, detailTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("REF");
        columnBinding.setColumnClass(Long.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${keterangan}"));
        columnBinding.setColumnName("Keterangan");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tanggal}"));
        columnBinding.setColumnName("Tanggal");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${transfer.pengeluaran}"));
        columnBinding.setColumnName("Transfer");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kembali.pemasukan}"));
        columnBinding.setColumnName("Kembalikan");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pemasukan}"));
        columnBinding.setColumnName("Pemasukan Perjalanan");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pengeluaran}"));
        columnBinding.setColumnName("Pengeluaran Perjalanan");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${saldo}"));
        columnBinding.setColumnName("Saldo");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tripsTripsId.perjalananke}"));
        columnBinding.setColumnName("Perjalanan KE");
        columnBinding.setColumnClass(Integer.class);
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
            if (evt.getSource() == newButton1) {
                panelPerjalanan.this.newButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                panelPerjalanan.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton1) {
                panelPerjalanan.this.refreshButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == saveButton1) {
                panelPerjalanan.this.saveButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == newDetailButton2) {
                panelPerjalanan.this.newDetailButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == newDetailButton1) {
                panelPerjalanan.this.newDetailButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == newDetailButton3) {
                panelPerjalanan.this.newDetailButton3ActionPerformed(evt);
            }
            else if (evt.getSource() == deleteDetailButton) {
                panelPerjalanan.this.deleteDetailButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                panelPerjalanan.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == saveButton) {
                panelPerjalanan.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newButton) {
                panelPerjalanan.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newDetailButton) {
                panelPerjalanan.this.newDetailButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newButton2) {
                panelPerjalanan.this.newButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == newButton3) {
                panelPerjalanan.this.newButton3ActionPerformed(evt);
            }
            else if (evt.getSource() == newButton4) {
                panelPerjalanan.this.newButton4ActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    
    private void deleteDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDetailButtonActionPerformed
        int index = masterTable.getSelectedRow();
        app.table.Trips t = list.get(masterTable.convertRowIndexToModel(index));
        Collection<app.table.Perjalanan> ps = t.getPerjalananList();
        int[] selected = detailTable.getSelectedRows();
        List<app.table.Perjalanan> toRemove = new ArrayList<app.table.Perjalanan>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            selected[idx] = detailTable.convertRowIndexToModel(selected[idx]);
            int count = 0;
            Iterator<app.table.Perjalanan> iter = ps.iterator();
            while (count++ < selected[idx]) {
                iter.next();
            }
            app.table.Perjalanan p = iter.next();
            toRemove.add(p);
            entityManager.remove(p);
        }
        ps.removeAll(toRemove);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
    }//GEN-LAST:event_deleteDetailButtonActionPerformed

    private void newDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDetailButtonActionPerformed
        int index = masterTable.getSelectedRow();
        app.table.Trips t = list.get(masterTable.convertRowIndexToModel(index));
        Collection<app.table.Perjalanan> ps = t.getPerjalananList();
        if (ps == null) {
            ps = new LinkedList<app.table.Perjalanan>();
            t.setPerjalananList((List) ps);
        }
        app.table.Perjalanan p = new app.table.Perjalanan();
        Saldo ts  = new Saldo();
        Saldo ts1 = new Saldo();

        if (evt.getSource() == newButton2) {
                p = (Perjalanan) this.inputPanel2.getTarget();
                ts.setBankId((Bank) this.jComboBox2.getSelectedItem());
                Pengeluaran p1 = new app.table.Pengeluaran();
//                app.table.PerjalananPengeluaran p1 = new PerjalananPengeluaran();
                p1.setJumlah(p.getJumlah());
                p1.setKeterangan(p.getKeterangan());
                p1.setTanggal(p.getTanggal());
                ts1.setBankId(Peter);
                p.setTransaksi(ts1);                
                p1.setTransaksi(ts);
                p.setTransfer(p1);
//                entityManager.persist(p1);
            }
            else if (evt.getSource() == newButton3) {
                System.out.println("Kirim/Pengeluaran");
                p = (Perjalanan) this.inputPanel3.getTarget();
                ts.setBankId((Bank) this.jComboBox3.getSelectedItem());
                Pemasukan p1 = new Pemasukan();
//                app.table.PerjalananPemasukan p1 = new PerjalananPemasukan();
                p1.setJumlah(p.getJumlah());
                p1.setKeterangan(p.getKeterangan());
                p1.setTanggal(p.getTanggal());
                ts1.setBankId(Peter);
                p1.setTransaksi(ts);
                p.setTransaksi(ts1);
                p.setKembali(p1);
//                entityManager.persist(p1);
            }
            else if (evt.getSource() == newButton4) {
                System.out.println("Pakai");
                p = (Perjalanan) this.inputPanel4.getTarget();
                ts.setBankId(Peter);
                p.setTransaksi(ts);
            }
//        p.setTransaksi(ts);
        p.setTripsTripsId(t);
        entityManager.persist(p);
        ps.add(p);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
        int row = ps.size() - 1;
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
//        Util.RefreshLaporan();
        list.clear();
        list.addAll(data);
        bankList.clear();
        bankList.addAll(bankQuery.getResultList());
        Peter = this.entityManager.find(app.table.Bank.class, -2);
//        bankList.remove(Peter);
        bankList.remove(Peter);
        Hitung();

    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] selected = masterTable.getSelectedRows();
        List<app.table.Trips> toRemove = new ArrayList<app.table.Trips>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            app.table.Trips t = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(t);
            entityManager.remove(t);
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        app.table.Trips t = (app.table.Trips) this.inputPanel1.getTarget();
        entityManager.persist(t);
        list.add(t);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
        this.jDialog1.hide();
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
            Util.RefreshLaporan();

        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<app.table.Trips> merged = new ArrayList<app.table.Trips>(list.size());
            for (app.table.Trips t : list) {
                merged.add(entityManager.merge(t));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void newDetailButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDetailButton1ActionPerformed
        this.jDialog2.setSize(500, 400);
        this.jDialog2.setLocationRelativeTo(null);
        this.jDialog2.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_newDetailButton1ActionPerformed

    private void newDetailButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDetailButton2ActionPerformed
        // TODO add your handling code here:
        this.jDialog3.setSize(500, 400);
        this.jDialog3.setLocationRelativeTo(null);
        this.jDialog3.show();

    }//GEN-LAST:event_newDetailButton2ActionPerformed

    private void newDetailButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDetailButton3ActionPerformed
        // TODO add your handling code here:
        this.jDialog4.setSize(500, 400);
        this.jDialog4.setLocationRelativeTo(null);
        this.jDialog4.show();

    }//GEN-LAST:event_newDetailButton3ActionPerformed

    private void newButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButton1ActionPerformed
        this.jDialog1.setSize(500, 400);
        this.jDialog1.setLocationRelativeTo(null);
        this.jDialog1.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_newButton1ActionPerformed

    private void newButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButton2ActionPerformed
        this.newDetailButtonActionPerformed(evt);
        jDialog2.hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_newButton2ActionPerformed

    private void newButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButton3ActionPerformed
        this.newDetailButtonActionPerformed(evt);
        jDialog3.hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_newButton3ActionPerformed

    private void newButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButton4ActionPerformed
        this.newDetailButtonActionPerformed(evt);
        jDialog4.hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_newButton4ActionPerformed

    private void refreshButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton1ActionPerformed
        // TODO add your handling code here:
        this.refreshButtonActionPerformed(evt);
    }//GEN-LAST:event_refreshButton1ActionPerformed

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
        // TODO add your handling code here:
        this.saveButtonActionPerformed(evt);
    }//GEN-LAST:event_saveButton1ActionPerformed


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
    private app.utils.inputPanel inputPanel4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.util.List<app.table.Trips> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.swing.JButton newButton1;
    private javax.swing.JButton newButton2;
    private javax.swing.JButton newButton3;
    private javax.swing.JButton newButton4;
    private javax.swing.JButton newDetailButton;
    private javax.swing.JButton newDetailButton1;
    private javax.swing.JButton newDetailButton2;
    private javax.swing.JButton newDetailButton3;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton refreshButton1;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton saveButton1;
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
            java.util.logging.Logger.getLogger(panelPerjalanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelPerjalanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelPerjalanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelPerjalanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new panelPerjalanan());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    
    private void Hitung() {
    for (Trips trips : list) {
            List<Perjalanan> mop = trips.getPerjalananList();
//            mop.sort((o1,o2) -> o1.getTanggal().compareTo(o2.getTanggal()));
            //list.sort((o1,o2) -> o1.getDateTime().compareTo(o2.getDateTime()));
//            mop.sort(Comparator.comparing(o -> o.getTanggal()));
            java.math.BigInteger saldo = new java.math.BigInteger("0");            
            for (Perjalanan a : mop) {
                saldo = saldo.subtract(a.getPengeluaran());
                saldo = saldo.add(a.getPemasukan());
                a.setSaldo(saldo);
            }
        }
//    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
