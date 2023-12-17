package com.sqlapp.frame;

import java.awt.*;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.stream.IntStream;

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

    private void initComponents() {

        rowEditDialogBox = new JDialog();
        JLabel editCellLabel = new JLabel();
        JLabel removeRowLabel = new JLabel();
        JButton editCellButton = new JButton();
        JButton removeRowButton = new JButton();
        dropDatabaseDialogBox = new JDialog();
        JLabel jLabel1 = new JLabel();
        JScrollPane jScrollPane2 = new JScrollPane();
        dropDatabaseTable = new JTable();
        manualQueryDialogBox = new JDialog();
        JScrollPane jScrollPane4 = new JScrollPane();
        tableCreationTextArea = new JTextArea();
        jLabel2 = new JLabel();
        JButton executeQueryButton = new JButton();
        JLabel selectDatabaseMainFrameLabel = new JLabel();
        databaseComboBox = new JComboBox<>();
        JPanel tableMainFrameJPanel = new JPanel();
        JScrollPane mainFrameScrollPane = new JScrollPane();
        tableMainFrame = new JTable();
        chooseDatabaseButton = new JButton();
        JLabel selectTableJLabel = new JLabel();
        tableNameComboBox = new JComboBox<>();
        chooseTableButton = new JButton();
        JSeparator mainFrameSeparator = new JSeparator();
        dropTableMainFrameButton = new JButton();
        createDatabaseMainFrameButton = new JButton();
        viewTableSchemaMainFrameButton = new JButton();
        JButton addTableMainFrameButton = new JButton();
        JButton closeAppMainFrameButton = new JButton();
        JButton helpMainFrameButton = new JButton();
        JButton searchFieldMainFrameButton = new JButton();
        JSeparator mainFrameJSeparator2 = new JSeparator();
        JButton dropDatabaseMainFrameButton = new JButton();
        addRowMainFrameButton = new JButton();

        rowEditDialogBox.setTitle("Editting ");
        rowEditDialogBox.setAlwaysOnTop(false);
        rowEditDialogBox.setMinimumSize(new java.awt.Dimension(375, 165));
        rowEditDialogBox.setResizable(false);

        editCellLabel.setText("Do you Want to Edit This Cell :");

        removeRowLabel.setText("Do you Want to Remove this Cell:");

        editCellButton.setText("Click to Edit");
        editCellButton.addActionListener(evt -> editCellButtonActionPerformed());

        removeRowButton.setText("Click to Remove ");
        removeRowButton.addActionListener(evt -> removeRowButtonActionPerformed());

        GroupLayout rowEditDialogBoxLayout = new GroupLayout(rowEditDialogBox.getContentPane());
        rowEditDialogBox.getContentPane().setLayout(rowEditDialogBoxLayout);
        rowEditDialogBoxLayout.setHorizontalGroup(
                rowEditDialogBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(rowEditDialogBoxLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(rowEditDialogBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(editCellLabel)
                                        .addComponent(removeRowLabel))
                                .addGap(26, 26, 26)
                                .addGroup(rowEditDialogBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(removeRowButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editCellButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        rowEditDialogBoxLayout.setVerticalGroup(
                rowEditDialogBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(rowEditDialogBoxLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(rowEditDialogBoxLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(editCellLabel)
                                        .addComponent(editCellButton))
                                .addGap(27, 27, 27)
                                .addGroup(rowEditDialogBoxLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(removeRowLabel)
                                        .addComponent(removeRowButton))
                                .addGap(20, 20, 20))
        );

        dropDatabaseDialogBox.setTitle("Drop Database");
        dropDatabaseDialogBox.setMinimumSize(new java.awt.Dimension(490, 355));
        dropDatabaseDialogBox.setResizable(false);
        dropDatabaseDialogBox.addWindowListener(new WindowAdapter() {
            public void windowDeactivated(WindowEvent evt) {
                dropDatabaseDialogBoxWindowDeactivated();
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18)); // NOI18N
        jLabel1.setText("Select Database");

        dropDatabaseTable.setModel(new DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Database"
                }
        ));
        dropDatabaseTable.setColumnSelectionAllowed(true);
        dropDatabaseTable.getTableHeader().setReorderingAllowed(false);
        dropDatabaseTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                dropDatabaseTableMouseClicked();
            }
        });
        jScrollPane2.setViewportView(dropDatabaseTable);
        dropDatabaseTable.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        if (dropDatabaseTable.getColumnModel().getColumnCount() > 0) {
            dropDatabaseTable.getColumnModel().getColumn(0).setResizable(false);
        }

        GroupLayout dropDatabaseDialogBoxLayout = new GroupLayout(dropDatabaseDialogBox.getContentPane());
        dropDatabaseDialogBox.getContentPane().setLayout(dropDatabaseDialogBoxLayout);
        dropDatabaseDialogBoxLayout.setHorizontalGroup(
                dropDatabaseDialogBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(dropDatabaseDialogBoxLayout.createSequentialGroup()
                                .addGroup(dropDatabaseDialogBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(dropDatabaseDialogBoxLayout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(dropDatabaseDialogBoxLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dropDatabaseDialogBoxLayout.setVerticalGroup(
                dropDatabaseDialogBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(dropDatabaseDialogBoxLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        manualQueryDialogBox.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        manualQueryDialogBox.setTitle("Table creation query");
        manualQueryDialogBox.setMinimumSize(new java.awt.Dimension(480, 240));
        manualQueryDialogBox.setResizable(false);
        manualQueryDialogBox.addWindowListener(new WindowAdapter() {
            public void windowDeactivated(WindowEvent evt) {
                manualQueryDialogBoxWindowDeactivated();
            }
        });

        tableCreationTextArea.setColumns(20);
        tableCreationTextArea.setRows(5);
        jScrollPane4.setViewportView(tableCreationTextArea);

        jLabel2.setFont(new java.awt.Font("Tahoma", Font.BOLD, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Enter the Table Creation Query");

        executeQueryButton.setText("Click to Execute");
        executeQueryButton.addActionListener(evt -> executeQueryButtonActionPerformed());

        GroupLayout manualQueryDialogBoxLayout = new GroupLayout(manualQueryDialogBox.getContentPane());
        manualQueryDialogBox.getContentPane().setLayout(manualQueryDialogBoxLayout);
        manualQueryDialogBoxLayout.setHorizontalGroup(
                manualQueryDialogBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(manualQueryDialogBoxLayout.createSequentialGroup()
                                .addGroup(manualQueryDialogBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(manualQueryDialogBoxLayout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(manualQueryDialogBoxLayout.createSequentialGroup()
                                                .addGap(116, 116, 116)
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(manualQueryDialogBoxLayout.createSequentialGroup()
                                                .addGap(120, 120, 120)
                                                .addComponent(executeQueryButton, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(78, Short.MAX_VALUE))
        );
        manualQueryDialogBoxLayout.setVerticalGroup(
                manualQueryDialogBoxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(manualQueryDialogBoxLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(executeQueryButton)
                                .addContainerGap(61, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Advanced Sql Relater");
        setResizable(false);

        selectDatabaseMainFrameLabel.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        selectDatabaseMainFrameLabel.setText("Please Select the Database");

        databaseComboBox.addItemListener(evt -> databaseComboBoxItemStateChanged());

        tableMainFrameJPanel.setEnabled(false);

        tableMainFrame.setModel(new DefaultTableModel(new Object[][]{}, new String[]{}));
        tableMainFrame.setCellSelectionEnabled(true);
        tableMainFrame.setFocusCycleRoot(true);
        tableMainFrame.setFocusTraversalPolicyProvider(true);
        tableMainFrame.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent evt) {
                tableMainFrameMouseReleased();
            }
        });
        mainFrameScrollPane.setViewportView(tableMainFrame);

        GroupLayout tableMainFrameJPanelLayout = new GroupLayout(tableMainFrameJPanel);
        tableMainFrameJPanel.setLayout(tableMainFrameJPanelLayout);
        tableMainFrameJPanelLayout.setHorizontalGroup(
                tableMainFrameJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, tableMainFrameJPanelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mainFrameScrollPane, GroupLayout.PREFERRED_SIZE, 833, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        tableMainFrameJPanelLayout.setVerticalGroup(
                tableMainFrameJPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, tableMainFrameJPanelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mainFrameScrollPane, GroupLayout.PREFERRED_SIZE, 368, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        chooseDatabaseButton.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        chooseDatabaseButton.setText("Click To Choose DB");
        chooseDatabaseButton.addActionListener(evt -> chooseDatabaseButtonActionPerformed());

        selectTableJLabel.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        selectTableJLabel.setText("Please Select The Tables");

        tableNameComboBox.setEnabled(false);
        tableNameComboBox.addItemListener(evt -> tableNameComboBoxItemStateChanged());

        chooseTableButton.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        chooseTableButton.setText("Click To Choose Table");
        chooseTableButton.setEnabled(false);
        chooseTableButton.addActionListener(evt -> chooseTableButtonActionPerformed());

        dropTableMainFrameButton.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        dropTableMainFrameButton.setText("Drop Selected Table");
        dropTableMainFrameButton.addActionListener(evt -> dropTableMainFrameButtonActionPerformed());

        createDatabaseMainFrameButton.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        createDatabaseMainFrameButton.setText("Create Database");
        createDatabaseMainFrameButton.addActionListener(evt -> createDatabaseMainFrameButtonActionPerformed());

        viewTableSchemaMainFrameButton.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        viewTableSchemaMainFrameButton.setText("View Table Schema");
        viewTableSchemaMainFrameButton.addActionListener(evt -> viewTableSchemaMainFrameButtonActionPerformed());

        addTableMainFrameButton.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        addTableMainFrameButton.setText("Add Table");
        addTableMainFrameButton.addActionListener(this::addTableMainFrameButtonActionPerformed);

        closeAppMainFrameButton.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        closeAppMainFrameButton.setText("Close App");
        closeAppMainFrameButton.addActionListener(this::closeAppMainFrameButtonActionPerformed);

        helpMainFrameButton.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        helpMainFrameButton.setText("Help");
        helpMainFrameButton.addActionListener(evt -> helpMainFrameButtonActionPerformed());

        searchFieldMainFrameButton.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        searchFieldMainFrameButton.setText("Search Field");
        searchFieldMainFrameButton.addActionListener(evt -> searchFieldMainFrameButtonActionPerformed());

        dropDatabaseMainFrameButton.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        dropDatabaseMainFrameButton.setText("Drop Db");
        dropDatabaseMainFrameButton.addActionListener(evt -> dropDatabaseMainFrameButtonActionPerformed());

        addRowMainFrameButton.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        addRowMainFrameButton.setText("Add Row");
        addRowMainFrameButton.addActionListener(evt -> addRowMainFrameButtonActionPerformed());

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(mainFrameSeparator, GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(databaseComboBox, GroupLayout.Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(selectDatabaseMainFrameLabel, GroupLayout.Alignment.LEADING))
                                                .addGap(28, 28, 28)
                                                .addComponent(chooseDatabaseButton)
                                                .addGap(82, 82, 82)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(tableNameComboBox, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(32, 32, 32)
                                                                .addComponent(chooseTableButton))
                                                        .addComponent(selectTableJLabel)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(createDatabaseMainFrameButton)
                                                .addGap(41, 41, 41)
                                                .addComponent(addTableMainFrameButton, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(dropTableMainFrameButton)
                                                .addGap(27, 27, 27)
                                                .addComponent(viewTableSchemaMainFrameButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(dropDatabaseMainFrameButton, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                        .addComponent(mainFrameJSeparator2, GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE))
                                .addGap(20, 20, 20))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(helpMainFrameButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(closeAppMainFrameButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(addRowMainFrameButton, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(searchFieldMainFrameButton, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8))
                                        .addComponent(tableMainFrameJPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(selectDatabaseMainFrameLabel)
                                        .addComponent(selectTableJLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(databaseComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chooseDatabaseButton)
                                        .addComponent(tableNameComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chooseTableButton))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mainFrameSeparator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(createDatabaseMainFrameButton)
                                        .addComponent(addTableMainFrameButton)
                                        .addComponent(dropTableMainFrameButton)
                                        .addComponent(viewTableSchemaMainFrameButton)
                                        .addComponent(dropDatabaseMainFrameButton))
                                .addGap(18, 18, 18)
                                .addComponent(mainFrameJSeparator2, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tableMainFrameJPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(closeAppMainFrameButton)
                                        .addComponent(searchFieldMainFrameButton)
                                        .addComponent(addRowMainFrameButton)
                                        .addComponent(helpMainFrameButton))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void chooseDatabaseButtonActionPerformed() {
        dropTableMainFrameButton.setEnabled(false);
        addRowMainFrameButton.setEnabled(false);
        tableNameComboBox.setEnabled(true);
        tableNameComboBox.removeAllItems();
        String database = (String) databaseComboBox.getSelectedItem();
        SqlData.getTablesInADatabase(database).forEach(tableNameComboBox::addItem);
        tableMainFrame.setModel(new DefaultTableModel(new Object[][]{}, new String[]{}));
        chooseTableButton.setEnabled(tableNameComboBox.getItemCount() != 0);
    }

    private void chooseTableButtonActionPerformed() {
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

    private void databaseComboBoxItemStateChanged() {
        tableMainFrame.setModel(new DefaultTableModel(new Object[][]{}, new String[]{}));
        tableNameComboBox.setEnabled(false);
        chooseTableButton.setEnabled(false);
        chooseDatabaseButton.setEnabled(true);
        dropTableMainFrameButton.setEnabled(false);
        addRowMainFrameButton.setEnabled(false);
    }

    private void tableNameComboBoxItemStateChanged() {
        tableMainFrame.setModel(new DefaultTableModel(new Object[][]{}, new String[]{}));
        databaseComboBox.setEnabled(true);
        chooseDatabaseButton.setEnabled(false);
        dropTableMainFrameButton.setEnabled(false);
        addRowMainFrameButton.setEnabled(false);
        viewTableSchemaMainFrameButton.setEnabled(false);
    }

    private void dropTableMainFrameButtonActionPerformed() {
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

    private void createDatabaseMainFrameButtonActionPerformed() {
        addRowMainFrameButton.setEnabled(false);
        String databaseName = JOptionPane.showInputDialog("Please enter database name");
        if (databaseName == null) return;
        String res = SqlData.createDatabase(databaseName);
        JOptionPane.showMessageDialog(null, res);
        databaseComboBox.removeAllItems();
        dropTableMainFrameButton.setEnabled(false);
        tableNameComboBox.setEnabled(false);
        chooseTableButton.setEnabled(false);
        SqlData.getDatabases().forEach(databaseComboBox::addItem);
    }

    private void viewTableSchemaMainFrameButtonActionPerformed() {
        tableMainFrame.setModel(new DefaultTableModel(new Object[][]{}, new String[]{}));
        String database = (String) databaseComboBox.getSelectedItem();
        String tableName = (String) tableNameComboBox.getSelectedItem();
        try {
            Object[] data = SqlData.descTable(database, tableName);
            List<String> columns = (List<String>) data[0];
            List<List<String>> rows = (List<List<String>>) data[1];
            DefaultTableModel swingTable = (DefaultTableModel) tableMainFrame.getModel();
            columns.forEach(swingTable::addColumn);
            rows.forEach(row -> swingTable.addRow(new Vector<>(row)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void tableMainFrameMouseReleased() {
        rowEditDialogBox.setVisible(tableMainFrame.getRowCount() > 0);
    }

    private void addTableMainFrameButtonActionPerformed(ActionEvent evt) {
        manualQueryDialogBox.setTitle("Create Table Query");
        jLabel2.setText("Please type create table query");
        manualQueryDialogBox.setVisible(true);
    }

    private void closeAppMainFrameButtonActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    private void editCellButtonActionPerformed() {
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

    private void removeRowButtonActionPerformed() {
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

    private void searchFieldMainFrameButtonActionPerformed() {
        JOptionPane.showMessageDialog(null, "Feature not Supported yet");
    }

    private void helpMainFrameButtonActionPerformed() {
        JOptionPane.showMessageDialog(null, "Feature not Supported yet");
    }

    private void dropDatabaseMainFrameButtonActionPerformed() {
        addRowMainFrameButton.setEnabled(false);
        DefaultTableModel tableModel = (DefaultTableModel) dropDatabaseTable.getModel();
        IntStream.rangeClosed(1, dropDatabaseTable.getRowCount()).forEach(tableModel::removeRow);
        dropDatabaseDialogBox.setVisible(true);
        SqlData.getDatabases().forEach(database -> tableModel.addRow(new Object[]{database}));
        addRowMainFrameButton.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Please Click On That Database  Which \n you Wants to Delete.......");
        addRowMainFrameButton.setEnabled(true);
    }

    private void dropDatabaseTableMouseClicked() {
        int selectedRow = dropDatabaseTable.getSelectedRow();
        int selectedColumn = dropDatabaseTable.getSelectedColumn();
        String databaseName = (String) dropDatabaseTable.getValueAt(selectedRow, selectedColumn);
        int choice = JOptionPane.showConfirmDialog(null, "Are you damm Sure to delete this Database ");
        if (choice == JOptionPane.YES_OPTION) {
            String message = SqlData.dropDatabase(databaseName);
            JOptionPane.showMessageDialog(null, message);
            dropDatabaseDialogBox.setVisible(false);
            databaseComboBox.removeAllItems();
            SqlData.getDatabases().forEach(databaseComboBox::addItem);
        }
    }

    private void executeQueryButtonActionPerformed() {
        String query = tableCreationTextArea.getText();
        String database = (String) databaseComboBox.getSelectedItem();
        String message;
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

    private void manualQueryDialogBoxWindowDeactivated() {
        manualQueryDialogBox.toFront();
    }

    private void dropDatabaseDialogBoxWindowDeactivated() {
        dropDatabaseDialogBox.toFront();
    }

    private void addRowMainFrameButtonActionPerformed() {
        manualQueryDialogBox.setTitle("Insert Row Query");
        jLabel2.setText("Please type insert row query");
        manualQueryDialogBox.setVisible(true);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new NewJFrame().setVisible(true));
    }

    // Variables declaration - do not modify
    private JButton addRowMainFrameButton;
    private JButton chooseDatabaseButton;
    private JButton chooseTableButton;
    private JButton createDatabaseMainFrameButton;
    private JComboBox<String> databaseComboBox;
    private JDialog dropDatabaseDialogBox;
    private JButton dropTableMainFrameButton;
    private JLabel jLabel2;
    private JTable dropDatabaseTable;
    private JDialog manualQueryDialogBox;
    private JDialog rowEditDialogBox;
    private JTextArea tableCreationTextArea;
    private JTable tableMainFrame;
    private JComboBox<String> tableNameComboBox;
    private JButton viewTableSchemaMainFrameButton;
    // End of variables declaration

}
