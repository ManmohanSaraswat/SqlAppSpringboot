package com.sqlapp.frame;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.sqlapp.dao.SqlData;

public class NewJFrame extends JFrame {

    public NewJFrame() {
        initComponents();
        addRowMainFrameButton.setEnabled(false);
        List<String> databases = SqlData.getDatabases();
        for (String database : databases) {
            databaseComboBox.addItem(database);
        }
        dropTableMainFrameButton.setEnabled(false);
        viewTableSchemaMainFrameButton.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        rowEditDialogBox = new javax.swing.JDialog();
        editCellLabel = new javax.swing.JLabel();
        removeRowLabel = new javax.swing.JLabel();
        editCellButton = new javax.swing.JButton();
        removeRowButton = new javax.swing.JButton();
        dropDatabaseDialogBox = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dropDatabaseTable = new javax.swing.JTable();
        manualQueryDialogBox = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableCreationTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        executeQueryButton = new javax.swing.JButton();
        selectDatabaseMainFrameLabel = new javax.swing.JLabel();
        databaseComboBox = new javax.swing.JComboBox();
        tableMainFrameJPanel = new javax.swing.JPanel();
        mainFrameScrollPane = new javax.swing.JScrollPane();
        tableMainFrame = new javax.swing.JTable();
        chooseDatabaseButton = new javax.swing.JButton();
        selectTableJLabel = new javax.swing.JLabel();
        tableNameComboBox = new javax.swing.JComboBox();
        chooseTableButton = new javax.swing.JButton();
        mainFrameSeparator = new javax.swing.JSeparator();
        dropTableMainFrameButton = new javax.swing.JButton();
        createDatabaseMainFrameButton = new javax.swing.JButton();
        viewTableSchemaMainFrameButton = new javax.swing.JButton();
        addTableMainFrameButton = new javax.swing.JButton();
        closeAppMainFrameButton = new javax.swing.JButton();
        helpMainFrameButton = new javax.swing.JButton();
        searchFieldMainFrameButton = new javax.swing.JButton();
        mainFrameJSeparator2 = new javax.swing.JSeparator();
        dropDatabaseMainFrameButton = new javax.swing.JButton();
        addRowMainFrameButton = new javax.swing.JButton();

        rowEditDialogBox.setTitle("Editting ");
        rowEditDialogBox.setAlwaysOnTop(false);
        rowEditDialogBox.setMinimumSize(new java.awt.Dimension(375, 165));
        rowEditDialogBox.setResizable(false);

        editCellLabel.setText("Do you Want to Edit This Cell :");

        removeRowLabel.setText("Do you Want to Remove this Cell:");

        editCellButton.setText("Click to Edit");
        editCellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCellButtonActionPerformed(evt);
            }
        });

        removeRowButton.setText("Click to Remove ");
        removeRowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rowEditDialogBoxLayout = new javax.swing.GroupLayout(rowEditDialogBox.getContentPane());
        rowEditDialogBox.getContentPane().setLayout(rowEditDialogBoxLayout);
        rowEditDialogBoxLayout.setHorizontalGroup(
                rowEditDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rowEditDialogBoxLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(rowEditDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(editCellLabel)
                                        .addComponent(removeRowLabel))
                                .addGap(26, 26, 26)
                                .addGroup(rowEditDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(removeRowButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editCellButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        rowEditDialogBoxLayout.setVerticalGroup(
                rowEditDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rowEditDialogBoxLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(rowEditDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(editCellLabel)
                                        .addComponent(editCellButton))
                                .addGap(27, 27, 27)
                                .addGroup(rowEditDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(removeRowLabel)
                                        .addComponent(removeRowButton))
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Select Database");

        dropDatabaseTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Database"
                }
        ));
        dropDatabaseTable.setColumnSelectionAllowed(true);
        dropDatabaseTable.getTableHeader().setReorderingAllowed(false);
        dropDatabaseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dropDatabaseTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(dropDatabaseTable);
        dropDatabaseTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (dropDatabaseTable.getColumnModel().getColumnCount() > 0) {
            dropDatabaseTable.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout dropDatabaseDialogBoxLayout = new javax.swing.GroupLayout(dropDatabaseDialogBox.getContentPane());
        dropDatabaseDialogBox.getContentPane().setLayout(dropDatabaseDialogBoxLayout);
        dropDatabaseDialogBoxLayout.setHorizontalGroup(
                dropDatabaseDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dropDatabaseDialogBoxLayout.createSequentialGroup()
                                .addGroup(dropDatabaseDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(dropDatabaseDialogBoxLayout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(dropDatabaseDialogBoxLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dropDatabaseDialogBoxLayout.setVerticalGroup(
                dropDatabaseDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dropDatabaseDialogBoxLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter the Table Creation Query");

        executeQueryButton.setText("Click to Execute");
        executeQueryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeQueryButtonActionPerformed(evt);
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
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(manualQueryDialogBoxLayout.createSequentialGroup()
                                                .addGap(120, 120, 120)
                                                .addComponent(executeQueryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(78, Short.MAX_VALUE))
        );
        manualQueryDialogBoxLayout.setVerticalGroup(
                manualQueryDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(manualQueryDialogBoxLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(executeQueryButton)
                                .addContainerGap(61, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Advanced Sql Relater");
        setResizable(false);

        selectDatabaseMainFrameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        selectDatabaseMainFrameLabel.setText("Please Select the Database");

        databaseComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                databaseComboBoxItemStateChanged(evt);
            }
        });

        tableMainFrameJPanel.setEnabled(false);

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
        mainFrameScrollPane.setViewportView(tableMainFrame);

        javax.swing.GroupLayout tableMainFrameJPanelLayout = new javax.swing.GroupLayout(tableMainFrameJPanel);
        tableMainFrameJPanel.setLayout(tableMainFrameJPanelLayout);
        tableMainFrameJPanelLayout.setHorizontalGroup(
                tableMainFrameJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableMainFrameJPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mainFrameScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        tableMainFrameJPanelLayout.setVerticalGroup(
                tableMainFrameJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableMainFrameJPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mainFrameScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        chooseDatabaseButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chooseDatabaseButton.setText("Click To Choose DB");
        chooseDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseDatabaseButtonActionPerformed(evt);
            }
        });

        selectTableJLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        selectTableJLabel.setText("Please Select The Tables");

        tableNameComboBox.setEnabled(false);
        tableNameComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tableNameComboBoxItemStateChanged(evt);
            }
        });

        chooseTableButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chooseTableButton.setText("Click To Choose Table");
        chooseTableButton.setEnabled(false);
        chooseTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseTableButtonActionPerformed(evt);
            }
        });

        dropTableMainFrameButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dropTableMainFrameButton.setText("Drop Selected Table");
        dropTableMainFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropTableMainFrameButtonActionPerformed(evt);
            }
        });

        createDatabaseMainFrameButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createDatabaseMainFrameButton.setText("Create Database");
        createDatabaseMainFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDatabaseMainFrameButtonActionPerformed(evt);
            }
        });

        viewTableSchemaMainFrameButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewTableSchemaMainFrameButton.setText("View Table Schema");
        viewTableSchemaMainFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTableSchemaMainFrameButtonActionPerformed(evt);
            }
        });

        addTableMainFrameButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addTableMainFrameButton.setText("Add Table");
        addTableMainFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTableMainFrameButtonActionPerformed(evt);
            }
        });

        closeAppMainFrameButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        closeAppMainFrameButton.setText("Close App");
        closeAppMainFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAppMainFrameButtonActionPerformed(evt);
            }
        });

        helpMainFrameButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        helpMainFrameButton.setText("Help");
        helpMainFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMainFrameButtonActionPerformed(evt);
            }
        });

        searchFieldMainFrameButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchFieldMainFrameButton.setText("Search Field");
        searchFieldMainFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldMainFrameButtonActionPerformed(evt);
            }
        });

        dropDatabaseMainFrameButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dropDatabaseMainFrameButton.setText("Drop Db");
        dropDatabaseMainFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropDatabaseMainFrameButtonActionPerformed(evt);
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
                                        .addComponent(mainFrameSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(databaseComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(selectDatabaseMainFrameLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(28, 28, 28)
                                                .addComponent(chooseDatabaseButton)
                                                .addGap(82, 82, 82)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(tableNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(32, 32, 32)
                                                                .addComponent(chooseTableButton))
                                                        .addComponent(selectTableJLabel)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(createDatabaseMainFrameButton)
                                                .addGap(41, 41, 41)
                                                .addComponent(addTableMainFrameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(dropTableMainFrameButton)
                                                .addGap(27, 27, 27)
                                                .addComponent(viewTableSchemaMainFrameButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(dropDatabaseMainFrameButton, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                        .addComponent(mainFrameJSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE))
                                .addGap(20, 20, 20))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(helpMainFrameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(closeAppMainFrameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(addRowMainFrameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(searchFieldMainFrameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8))
                                        .addComponent(tableMainFrameJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(selectDatabaseMainFrameLabel)
                                        .addComponent(selectTableJLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(databaseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chooseDatabaseButton)
                                        .addComponent(tableNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chooseTableButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mainFrameSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(createDatabaseMainFrameButton)
                                        .addComponent(addTableMainFrameButton)
                                        .addComponent(dropTableMainFrameButton)
                                        .addComponent(viewTableSchemaMainFrameButton)
                                        .addComponent(dropDatabaseMainFrameButton))
                                .addGap(18, 18, 18)
                                .addComponent(mainFrameJSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tableMainFrameJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(closeAppMainFrameButton)
                                        .addComponent(searchFieldMainFrameButton)
                                        .addComponent(addRowMainFrameButton)
                                        .addComponent(helpMainFrameButton))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void chooseDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dropTableMainFrameButton.setEnabled(false);
        addRowMainFrameButton.setEnabled(false);
        tableNameComboBox.setEnabled(true);
        tableNameComboBox.removeAllItems();
        String database = (String) databaseComboBox.getSelectedItem();
        List<String> tables = SqlData.getTablesInADatabase(database);
        for (String table : tables) {
            tableNameComboBox.addItem(table);
        }
        tableMainFrame.setModel(new DefaultTableModel(new Object[][]{}, new String[]{}));
        chooseTableButton.setEnabled(tableNameComboBox.getItemCount() != 0);
    }

    private void chooseTableButtonActionPerformed(java.awt.event.ActionEvent evt) {
        viewTableSchemaMainFrameButton.setEnabled(true);
        dropTableMainFrameButton.setEnabled(true);
        createDatabaseMainFrameButton.setEnabled(true);
        addRowMainFrameButton.setEnabled(true);
        tableMainFrame.setModel(new DefaultTableModel(new Object[][]{}, new String[]{}));

        String database = (String) databaseComboBox.getSelectedItem();
        String tableName = (String) tableNameComboBox.getSelectedItem();
        List<String> columns = SqlData.getColumnNames(database, tableName);
        DefaultTableModel swingTable = (DefaultTableModel) tableMainFrame.getModel();
        columns.forEach(swingTable::addColumn);
        List<List<String>> rows = SqlData.getDataFromTable(database, tableName, columns);
        rows.forEach(row -> swingTable.addRow(new Vector<>(row)));
    }

    private void databaseComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {
        tableMainFrame.setModel(new DefaultTableModel(new Object[][]{}, new String[]{}));
        tableNameComboBox.setEnabled(false);
        chooseTableButton.setEnabled(false);
        chooseDatabaseButton.setEnabled(true);
        dropTableMainFrameButton.setEnabled(false);
        addRowMainFrameButton.setEnabled(false);
    }

    private void tableNameComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {
        tableMainFrame.setModel(new DefaultTableModel(new Object[][]{}, new String[]{}));
        databaseComboBox.setEnabled(true);
        chooseDatabaseButton.setEnabled(false);
        dropTableMainFrameButton.setEnabled(false);
        addRowMainFrameButton.setEnabled(false);
        viewTableSchemaMainFrameButton.setEnabled(false);
    }

    private void dropTableMainFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {
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
        dropTableMainFrameButton.setEnabled(false);
        tableNameComboBox.setEnabled(false);
        chooseTableButton.setEnabled(false);
        chooseDatabaseButton.setEnabled(true);
        viewTableSchemaMainFrameButton.setEnabled(false);
    }

    private void createDatabaseMainFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {
        addRowMainFrameButton.setEnabled(false);
        String databaseName = JOptionPane.showInputDialog("Please enter database name");
        if (databaseName == null) {
            return;
        }
        String res = SqlData.createDatabase(databaseName);
        JOptionPane.showMessageDialog(null, res);
        databaseComboBox.removeAllItems();
        dropTableMainFrameButton.setEnabled(false);
        tableNameComboBox.setEnabled(false);
        chooseTableButton.setEnabled(false);
        List<String> databases = SqlData.getDatabases();
        for (String database : databases) {
            databaseComboBox.addItem(database);
        }
    }

    private void viewTableSchemaMainFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {
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

    }

    private void tableMainFrameMouseReleased(java.awt.event.MouseEvent evt) {
        rowEditDialogBox.setVisible(tableMainFrame.getRowCount() > 0);
    }

    private void addTableMainFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {
        manualQueryDialogBox.setTitle("Create Table Query");
        jLabel2.setText("Please type create table query");
        manualQueryDialogBox.setVisible(true);
    }

    private void closeAppMainFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void editCellButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure to edit the data...");
        if (choice == JOptionPane.YES_OPTION) {
            String input = JOptionPane.showInputDialog("Please Enter the new Data....");
            int selectedColumn = tableMainFrame.getSelectedColumn();
            int selectedRow = tableMainFrame.getSelectedRow();
            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the new data first!!");
                chooseTableButton.doClick();
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
                chooseTableButton.doClick();
                JOptionPane.showMessageDialog(null, res);
            }
        }
        rowEditDialogBox.setVisible(false);
    }

    private void removeRowButtonActionPerformed(java.awt.event.ActionEvent evt) {
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
        chooseTableButton.doClick();
        JOptionPane.showMessageDialog(null, res);
        rowEditDialogBox.setVisible(false);
    }

    private void searchFieldMainFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Feature not Supported yet");
    }

    private void helpMainFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Feature not Supported yet");
    }

    private void dropDatabaseMainFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {
        addRowMainFrameButton.setEnabled(false);
        DefaultTableModel dm15 = (DefaultTableModel) dropDatabaseTable.getModel();
        int i = dropDatabaseTable.getRowCount();
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
    }

    private void dropDatabaseTableMouseClicked(java.awt.event.MouseEvent evt) {
        int i = dropDatabaseTable.getSelectedRow();
        int k = dropDatabaseTable.getSelectedColumn();
        String databaseName = (String) dropDatabaseTable.getValueAt(i, k);
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

    }

    private void executeQueryButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String query = tableCreationTextArea.getText();
        String database = (String) databaseComboBox.getSelectedItem();
        String message = "";
        if (manualQueryDialogBox.getTitle().equals("Insert Row Query"))
            message = SqlData.insertRow(query, database);
        else
            message = SqlData.createTable(query, database);
        JOptionPane.showMessageDialog(null, message);
        if (message.equals("Table created successfully") || message.equals("Row inserted successfully")) {
            if (message.equals("Row inserted successfully")) chooseTableButton.doClick();
            tableCreationTextArea.setText("");
            manualQueryDialogBox.dispose();
        }
    }

    private void manualQueryDialogBoxWindowDeactivated(java.awt.event.WindowEvent evt) {
        manualQueryDialogBox.toFront();
    }

    private void dropDatabaseDialogBoxWindowDeactivated(java.awt.event.WindowEvent evt) {
        dropDatabaseDialogBox.toFront();
    }

    private void addRowMainFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {
        manualQueryDialogBox.setTitle("Insert Row Query");
        jLabel2.setText("Please type insert row query");
        manualQueryDialogBox.setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addRowMainFrameButton;
    private javax.swing.JButton addTableMainFrameButton;
    private javax.swing.JButton chooseDatabaseButton;
    private javax.swing.JButton chooseTableButton;
    private javax.swing.JButton closeAppMainFrameButton;
    private javax.swing.JButton createDatabaseMainFrameButton;
    private javax.swing.JComboBox databaseComboBox;
    private javax.swing.JDialog dropDatabaseDialogBox;
    private javax.swing.JButton dropDatabaseMainFrameButton;
    private javax.swing.JButton dropTableMainFrameButton;
    private javax.swing.JButton helpMainFrameButton;
    private javax.swing.JButton editCellButton;
    private javax.swing.JButton removeRowButton;
    private javax.swing.JButton executeQueryButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel editCellLabel;
    private javax.swing.JLabel removeRowLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable dropDatabaseTable;
    private javax.swing.JSeparator mainFrameJSeparator2;
    private javax.swing.JScrollPane mainFrameScrollPane;
    private javax.swing.JSeparator mainFrameSeparator;
    private javax.swing.JDialog manualQueryDialogBox;
    private javax.swing.JDialog rowEditDialogBox;
    private javax.swing.JButton searchFieldMainFrameButton;
    private javax.swing.JLabel selectDatabaseMainFrameLabel;
    private javax.swing.JLabel selectTableJLabel;
    private javax.swing.JTextArea tableCreationTextArea;
    private javax.swing.JTable tableMainFrame;
    private javax.swing.JPanel tableMainFrameJPanel;
    private javax.swing.JComboBox tableNameComboBox;
    private javax.swing.JButton viewTableSchemaMainFrameButton;
    // End of variables declaration

}
