/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package user_interface;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.EmployeeDataHistory;

/**
 *
 * @author chandukongara
 */
public class ViewJPanel extends javax.swing.JPanel {

    EmployeeDataHistory history;
    
    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(EmployeeDataHistory history) {
        initComponents();
        this.history = history;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblPositionTitle = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtTeamInfo = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        lblStartDate = new javax.swing.JLabel();
        txtPositionTitle = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        lblEmpID = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmpID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        lblTeamInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployeeDetails = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Employee Details");

        lblContact.setText("Contact:");

        lblPositionTitle.setText("Position Title:");

        lblEmail.setText("Email");

        lblStartDate.setText("Start Date:");

        lblName1.setText("Name:");

        lblEmpID.setText("Emp ID:");

        lblAge.setText("Age:");

        lblGender.setText("Gender:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblLevel.setText("Level:");

        txtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelActionPerformed(evt);
            }
        });

        lblTeamInfo.setText("Team Info:");

        tblEmployeeDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "EmpID", "Age", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployeeDetails);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblName1)
                                            .addComponent(lblAge))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnView)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete)
                                        .addGap(15, 15, 15)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnUpdate)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblName))
                                    .addComponent(lblLevel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEmpID, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(lblPositionTitle)
                                    .addComponent(lblEmail)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTeamInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblStartDate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(164, 164, 164)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblContact)
                        .addGap(18, 18, 18)
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51))
                        .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAge, txtContact, txtName, txtStartDate, txtTeamInfo});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmail, txtEmpID, txtGender, txtLevel, txtPositionTitle});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnView)
                            .addComponent(btnDelete)
                            .addComponent(btnUpdate))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpID)
                    .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLevel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPositionTitle)
                    .addComponent(lblTeamInfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContact)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblEmployeeDetails.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblEmployeeDetails.getModel();
        Employee selectedEmployees = (Employee) model.getValueAt(selectedRowIndex, 0);
        
        history.deleteEmployees(selectedEmployees);
        
        JOptionPane.showMessageDialog(this, "Selected row is deleted successfully");
        
        populateTable();

        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblEmployeeDetails.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblEmployeeDetails.getModel();
        Employee selectedEmployees = (Employee) model.getValueAt(selectedRowIndex, 0);
        
        txtName.setText(selectedEmployees.getName());
        txtEmpID.setText(selectedEmployees.getEmpID());
        txtAge.setText(selectedEmployees.getAge());
        txtGender.setText(selectedEmployees.getGender());
        txtStartDate.setText(selectedEmployees.getStartDate());
        txtLevel.setText(selectedEmployees.getLevel());
        txtPositionTitle.setText(selectedEmployees.getPositionTitle());
        txtTeamInfo.setText(selectedEmployees.getTeamInfo());
        txtContact.setText(selectedEmployees.getContact());
        txtEmail.setText(selectedEmployees.getEmail());
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblEmployeeDetails.getModel();
        if(tblEmployeeDetails.getSelectedRowCount() == 1){
            String name= txtName.getText();
            String empID = txtEmpID.getText();
            String age = txtAge.getText();
            String gender = txtGender.getText();
            
            model.setValueAt(name, tblEmployeeDetails.getSelectedRow(), 0);
            model.setValueAt(empID, tblEmployeeDetails.getSelectedRow(), 1);
            model.setValueAt(age, tblEmployeeDetails.getSelectedRow(), 2);
            model.setValueAt(gender, tblEmployeeDetails.getSelectedRow(), 3);

            JOptionPane.showMessageDialog(this, "Successfully Updated");            
        }
        else{
            if(tblEmployeeDetails.getRowCount() == 0){
                        JOptionPane.showMessageDialog(this, "Table has no records");            
            }
            else{
                        JOptionPane.showMessageDialog(this, "Please select a row for updation");            

            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEmployeeDetails;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables


    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEmployeeDetails.getModel();
        model.setRowCount(0);
        
        for(Employee e : history.getHistory()){
            
            Object[] row = new Object[4];
            row[0] = e; 
            row[1] = e.getEmpID();
            row[2] = e.getAge();
            row[3] = e.getGender();
            
            model.addRow(row);
        }
    }
}
