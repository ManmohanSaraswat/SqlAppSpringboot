package com.sqlapp.frame;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.sqlapp.dao.SqlData;

public class NewJFrame extends JFrame {

    public NewJFrame() throws ClassNotFoundException {
        initComponents();
        addRowMainFrameButton.setEnabled(false);
        List<String> databases = SqlData.getDatabases();
        for (String database : databases) {
            databaseComboBox.addItem(database);
        }
        jButton3.setEnabled(false);
        viewTableSchemaMainFrameButton.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rowEditDialogBox = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        dropDatabaseDialogBox = new javax.swing.JDialog();
        jLabel136 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        manualQueryDialogBox = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableCreationTextArea = new javax.swing.JTextArea();
        jLabel138 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        databaseComboBox = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMainFrame = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tableNameComboBox = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        separator1MainFrame = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        viewTableSchemaMainFrameButton = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        separator2MainFrame = new javax.swing.JSeparator();
        jButton8 = new javax.swing.JButton();
        addRowMainFrameButton = new javax.swing.JButton();

        rowEditDialogBox.setTitle("Editting ");
        rowEditDialogBox.setAlwaysOnTop(false);
        rowEditDialogBox.setMinimumSize(new java.awt.Dimension(375, 165));
        rowEditDialogBox.setResizable(false);

        jLabel3.setText("Do you Want to Edit This Cell :");

        jLabel4.setText("Do you Want to Remove this Cell:");

        jButton12.setText("Click to Edit");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Click to Remove ");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rowEditDialogBoxLayout = new javax.swing.GroupLayout(rowEditDialogBox.getContentPane());
        rowEditDialogBox.getContentPane().setLayout(rowEditDialogBoxLayout);
        rowEditDialogBoxLayout.setHorizontalGroup(
                rowEditDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rowEditDialogBoxLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(rowEditDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addGap(26, 26, 26)
                                .addGroup(rowEditDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        rowEditDialogBoxLayout.setVerticalGroup(
                rowEditDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rowEditDialogBoxLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(rowEditDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jButton12))
                                .addGap(27, 27, 27)
                                .addGroup(rowEditDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jButton13))
                                .addGap(20, 20, 20))
        );

        dropDatabaseDialogBox.setTitle("Drop Database");
        dropDatabaseDialogBox.setMinimumSize(new java.awt.Dimension(490, 355));
        dropDatabaseDialogBox.setResizable(false);
        dropDatabaseDialogBox.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                dropDatabaseDialogBoxWindowDeactivated(evt);
            }
        });

        jLabel136.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel136.setText("Select Database");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Database"
                }
        ));
        jTable2.setColumnSelectionAllowed(true);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout dropDatabaseDialogBoxLayout = new javax.swing.GroupLayout(dropDatabaseDialogBox.getContentPane());
        dropDatabaseDialogBox.getContentPane().setLayout(dropDatabaseDialogBoxLayout);
        dropDatabaseDialogBoxLayout.setHorizontalGroup(
                dropDatabaseDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dropDatabaseDialogBoxLayout.createSequentialGroup()
                                .addGroup(dropDatabaseDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(dropDatabaseDialogBoxLayout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(dropDatabaseDialogBoxLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dropDatabaseDialogBoxLayout.setVerticalGroup(
                dropDatabaseDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dropDatabaseDialogBoxLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        manualQueryDialogBox.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        manualQueryDialogBox.setTitle("Table creation query");
        manualQueryDialogBox.setMinimumSize(new java.awt.Dimension(480, 240));
        manualQueryDialogBox.setResizable(false);
        manualQueryDialogBox.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                manualQueryDialogBoxWindowDeactivated(evt);
            }
        });

        tableCreationTextArea.setColumns(20);
        tableCreationTextArea.setRows(5);
        jScrollPane4.setViewportView(tableCreationTextArea);

        jLabel138.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel138.setText("Enter the Table Creation Query");

        jButton27.setText("Click to Execute");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manualQueryDialogBoxLayout = new javax.swing.GroupLayout(manualQueryDialogBox.getContentPane());
        manualQueryDialogBox.getContentPane().setLayout(manualQueryDialogBoxLayout);
        manualQueryDialogBoxLayout.setHorizontalGroup(
                manualQueryDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(manualQueryDialogBoxLayout.createSequentialGroup()
                                .addGroup(manualQueryDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(manualQueryDialogBoxLayout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(manualQueryDialogBoxLayout.createSequentialGroup()
                                                .addGap(116, 116, 116)
                                                .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(manualQueryDialogBoxLayout.createSequentialGroup()
                                                .addGap(120, 120, 120)
                                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(78, Short.MAX_VALUE))
        );
        manualQueryDialogBoxLayout.setVerticalGroup(
                manualQueryDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(manualQueryDialogBoxLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel138)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton27)
                                .addContainerGap(61, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Advanced Sql Relater");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Please Select the Database");

        databaseComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                databaseComboBoxItemStateChanged(evt);
            }
        });

        jPanel1.setEnabled(false);

        tableMainFrame.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{

                }
        ));
        tableMainFrame.setCellSelectionEnabled(true);
        tableMainFrame.setFocusCycleRoot(true);
        tableMainFrame.setFocusTraversalPolicyProvider(true);
        tableMainFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMainFrameMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableMainFrame);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Click To Choose DB");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Please Select The Tables");

        tableNameComboBox.setEnabled(false);
        tableNameComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tableNameComboBoxItemStateChanged(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Click To Choose Table");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Drop Selected Table");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Create Database");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        viewTableSchemaMainFrameButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewTableSchemaMainFrameButton.setText("View Table Schema");
        viewTableSchemaMainFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTableSchemaMainFrameButtonActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("Add Table");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("Close App");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setText("Help");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setText("Search Field");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("Drop Db");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        addRowMainFrameButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addRowMainFrameButton.setText("Add Row");
        addRowMainFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRowMainFrameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(separator1MainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(databaseComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(28, 28, 28)
                                                .addComponent(jButton1)
                                                .addGap(82, 82, 82)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(tableNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(32, 32, 32)
                                                                .addComponent(jButton2))
                                                        .addComponent(jLabel2)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton4)
                                                .addGap(41, 41, 41)
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(jButton3)
                                                .addGap(27, 27, 27)
                                                .addComponent(viewTableSchemaMainFrameButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                        .addComponent(separator2MainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE))
                                .addGap(20, 20, 20))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(addRowMainFrameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8))
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(databaseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1)
                                        .addComponent(tableNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(separator1MainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4)
                                        .addComponent(jButton7)
                                        .addComponent(jButton3)
                                        .addComponent(viewTableSchemaMainFrameButton)
                                        .addComponent(jButton8))
                                .addGap(18, 18, 18)
                                .addComponent(separator2MainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton9)
                                        .addComponent(jButton11)
                                        .addComponent(addRowMainFrameButton)
                                        .addComponent(jButton10))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton3.setEnabled(false);
        addRowMainFrameButton.setEnabled(false);
        tableNameComboBox.setEnabled(true);
        tableNameComboBox.removeAllItems();
        String database = (String) databaseComboBox.getSelectedItem();
        List<String> tables = SqlData.getTablesInADatabase(database);
        for (String table : tables) {
            tableNameComboBox.addItem(table);
        }
        tableMainFrame.setModel(new DefaultTableModel(new Object[][]{}, new String[]{}));
        jButton2.setEnabled(tableNameComboBox.getItemCount() != 0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        viewTableSchemaMainFrameButton.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        addRowMainFrameButton.setEnabled(true);
        tableMainFrame.setModel(new DefaultTableModel(new Object[][]{}, new String[]{}));

        String database = (String) databaseComboBox.getSelectedItem();
        String tableName = (String) tableNameComboBox.getSelectedItem();
        List<String> columns = SqlData.getColumnNames(database, tableName);
        DefaultTableModel swingTable = (DefaultTableModel) tableMainFrame.getModel();
        columns.forEach(swingTable::addColumn);
        DefaultTableModel dm1 = (DefaultTableModel) tableMainFrame.getModel();
        List<List<String>> rows = SqlData.getDataFromTable(database, tableName, columns);
        rows.forEach(row -> dm1.addRow(new Vector<>(row)));
    }

    private void databaseComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_databaseComboBoxItemStateChanged
        tableMainFrame.setModel(new DefaultTableModel(new Object[][]{}, new String[]{}));
        tableNameComboBox.setEnabled(false);
        jButton2.setEnabled(false);
        jButton1.setEnabled(true);
        jButton3.setEnabled(false);
        addRowMainFrameButton.setEnabled(false);
    }//GEN-LAST:event_databaseComboBoxItemStateChanged

    private void tableNameComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tableNameComboBoxItemStateChanged
        tableMainFrame.setModel(new DefaultTableModel(new Object[][]{}, new String[]{}));
        databaseComboBox.setEnabled(true);
        jButton1.setEnabled(false);
        jButton3.setEnabled(false);
        addRowMainFrameButton.setEnabled(false);
        viewTableSchemaMainFrameButton.setEnabled(false);
    }//GEN-LAST:event_tableNameComboBoxItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        addRowMainFrameButton.setEnabled(false);
        tableMainFrame.setModel(new DefaultTableModel(new Object[][]{}, new String[]{}));
        String database = (String) databaseComboBox.getSelectedItem();
        String tableName = (String) tableNameComboBox.getSelectedItem();
        String result = SqlData.dropTable(database, tableName);
        if (!result.isEmpty()) {
            JOptionPane.showMessageDialog(null, result);
        } else {
            JOptionPane.showMessageDialog(null, "Table Deleted Successfully");
        }
        jButton3.setEnabled(false);
        tableNameComboBox.setEnabled(false);
        jButton2.setEnabled(false);
        jButton1.setEnabled(true);
        viewTableSchemaMainFrameButton.setEnabled(false);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        addRowMainFrameButton.setEnabled(false);
        String databaseName = JOptionPane.showInputDialog("Please enter database name");
        if (databaseName == null) {
            return;
        }
        String res = SqlData.createDatabase(databaseName);
        JOptionPane.showMessageDialog(null, res);
        databaseComboBox.removeAllItems();
        jButton3.setEnabled(false);
        tableNameComboBox.setEnabled(false);
        jButton2.setEnabled(false);
        List<String> databases = SqlData.getDatabases();
        for (String database : databases) {
            databaseComboBox.addItem(database);
        }
    }

    private void viewTableSchemaMainFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTableSchemaMainFrameButtonActionPerformed
        tableMainFrame.setModel(new DefaultTableModel(new Object[][]{}, new String[]{}));
        String database = (String) databaseComboBox.getSelectedItem();
        String tableName = (String) tableNameComboBox.getSelectedItem();
        try {
            Object[] data = SqlData.descTable(database, tableName);
            List<String> columns = (List<String>) data[0];
            List<List<String>> rows = (List<List<String>>) data[1];
            DefaultTableModel swingTable = (DefaultTableModel) tableMainFrame.getModel();
            columns.forEach(swingTable::addColumn);
            DefaultTableModel dm1 = (DefaultTableModel) tableMainFrame.getModel();
            rows.forEach(row -> dm1.addRow(new Vector<>(row)));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_viewTableSchemaMainFrameButtonActionPerformed

    private void tableMainFrameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMainFrameMouseReleased
        rowEditDialogBox.setVisible(tableMainFrame.getRowCount() > 0);
    }//GEN-LAST:event_tableMainFrameMouseReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        manualQueryDialogBox.setTitle("Create Table Query");
        jLabel138.setText("Please type create table query");
        manualQueryDialogBox.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure to edit the data...");
        if (choice == JOptionPane.YES_OPTION) {
            String input = JOptionPane.showInputDialog("Please Enter the new Data....");
            int selectedColumn = tableMainFrame.getSelectedColumn();
            int selectedRow = tableMainFrame.getSelectedRow();
            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the new data first!!");
                jButton2.doClick();
            } else {
                String database = (String) databaseComboBox.getSelectedItem();
                String tableName = (String) tableNameComboBox.getSelectedItem();
                int totalColumns = tableMainFrame.getColumnCount();
                String[] columns = new String[totalColumns];
                String[] row = new String[totalColumns];
                for (int i = 0; i < totalColumns; i++) {
                    row[i] = (String) tableMainFrame.getValueAt(selectedRow, i);
                    columns[i] = tableMainFrame.getColumnName(i);
                }
                String res = SqlData.updateColumn(database, tableName, columns, row, input, selectedColumn);
                jButton2.doClick();
                JOptionPane.showMessageDialog(null, res);
            }
        }
        rowEditDialogBox.setVisible(false);

    }

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String database = (String) databaseComboBox.getSelectedItem();
        String tableName = (String) tableNameComboBox.getSelectedItem();
        int selectedRow = tableMainFrame.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please Select the Cell First.....");
            rowEditDialogBox.setVisible(false);
        }
        int totalColumns = tableMainFrame.getColumnCount();
        String[] columns = new String[totalColumns];
        String[] row = new String[totalColumns];
        for (int i = 0; i < totalColumns; i++) {
            row[i] = (String) tableMainFrame.getValueAt(selectedRow, i);
            columns[i] = tableMainFrame.getColumnName(i);
        }
        String res = SqlData.deleteRow(database, tableName, columns, row);
        viewTableSchemaMainFrameButton.doClick();
        jButton2.doClick();
        JOptionPane.showMessageDialog(null, res);
        rowEditDialogBox.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        JOptionPane.showMessageDialog(null, "Feature not Supported yet");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        JOptionPane.showMessageDialog(null, "Feature not Supported yet");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        addRowMainFrameButton.setEnabled(false);
        DefaultTableModel dm15 = (DefaultTableModel) jTable2.getModel();
        int i = jTable2.getRowCount();
        while (i > 0) {
            i--;
            dm15.removeRow(i);
        }
        dropDatabaseDialogBox.setVisible(true);
        List<String> databases = SqlData.getDatabases();
        for (String database : databases) {
            dm15.addRow(new Object[]{database});
        }
        addRowMainFrameButton.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Please Click On That Database  Which \n you Wants to Delete.......");
        addRowMainFrameButton.setEnabled(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int i = jTable2.getSelectedRow();
        int k = jTable2.getSelectedColumn();
        String databaseName = (String) jTable2.getValueAt(i, k);
        int l = JOptionPane.showConfirmDialog(null, "Are you damm Sure to delete this Database ");
        if (l == JOptionPane.YES_OPTION) {
            String message = SqlData.dropDatabase(databaseName);
            JOptionPane.showMessageDialog(null, message);
            dropDatabaseDialogBox.setVisible(false);
            databaseComboBox.removeAllItems();
            List<String> databases = SqlData.getDatabases();
            for (String database : databases) {
                databaseComboBox.addItem(database);
            }
        }

    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        String query = tableCreationTextArea.getText();
        String database = (String) databaseComboBox.getSelectedItem();
        String message = "";
        if (manualQueryDialogBox.getTitle().equals("Insert Row Query"))
            message = SqlData.insertRow(query, database);
        else
            message = SqlData.createTable(query, database);
        JOptionPane.showMessageDialog(null, message);
        if (message.equals("Table created successfully") || message.equals("Row inserted successfully")) {
            if (message.equals("Row inserted successfully")) jButton2.doClick();
            tableCreationTextArea.setText("");
            manualQueryDialogBox.dispose();
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void manualQueryDialogBoxWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_manualQueryDialogBoxWindowDeactivated
        manualQueryDialogBox.toFront();
    }//GEN-LAST:event_manualQueryDialogBoxWindowDeactivated

    private void dropDatabaseDialogBoxWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dropDatabaseDialogBoxWindowDeactivated
        dropDatabaseDialogBox.toFront();
    }//GEN-LAST:event_dropDatabaseDialogBoxWindowDeactivated

    private void addRowMainFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRowMainFrameButtonActionPerformed
        manualQueryDialogBox.setTitle("Insert Row Query");
        jLabel138.setText("Please type insert row query");
        manualQueryDialogBox.setVisible(true);
    }//GEN-LAST:event_addRowMainFrameButtonActionPerformed

    /**
     *
     */
    public static void main() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewJFrame().setVisible(true);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRowMainFrameButton;
    private javax.swing.JComboBox databaseComboBox;
    private javax.swing.JDialog dropDatabaseDialogBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator separator1MainFrame;
    private javax.swing.JSeparator separator2MainFrame;
    private javax.swing.JTable tableMainFrame;
    private javax.swing.JTable jTable2;
    private javax.swing.JDialog manualQueryDialogBox;
    private javax.swing.JDialog rowEditDialogBox;
    private javax.swing.JTextArea tableCreationTextArea;
    private javax.swing.JComboBox tableNameComboBox;
    private javax.swing.JButton viewTableSchemaMainFrameButton;
    // End of variables declaration//GEN-END:variables

}
