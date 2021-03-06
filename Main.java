/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudJframe;

import java.sql.*;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author 2ndyrGroupA
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public Main() {
        initComponents();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        for (int x = 0; x < this.employeeTable.getColumnCount(); x++) {
            this.employeeTable.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);
        }
        getdata();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        createBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LastNameField = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FirstnameField = new javax.swing.JTextField();
        LastnameField = new javax.swing.JTextField();
        AgeField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        createBtn.setBackground(new java.awt.Color(0, 255, 0));
        createBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createBtn.setText("CREATE");
        createBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createBtnMouseClicked(evt);
            }
        });
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        jPanel2.add(createBtn);

        UpdateBtn.setBackground(new java.awt.Color(102, 255, 0));
        UpdateBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateBtn.setText("UPDATE");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateBtn);

        DeleteBtn.setBackground(new java.awt.Color(255, 0, 0));
        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteBtn);

        viewBtn.setBackground(new java.awt.Color(0, 153, 255));
        viewBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        viewBtn.setText("VIEW");
        viewBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewBtnMouseClicked(evt);
            }
        });
        jPanel2.add(viewBtn);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 440, 70));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 318, 610, -1));

        employeeTable.setBackground(new java.awt.Color(153, 153, 153));
        employeeTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        employeeTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        employeeTable.setForeground(new java.awt.Color(102, 102, 102));
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Firstname", "Lastname", "Age", "Email", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        employeeTable.setGridColor(new java.awt.Color(0, 0, 0));
        employeeTable.setSurrendersFocusOnKeystroke(true);
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);
        if (employeeTable.getColumnModel().getColumnCount() > 0) {
            employeeTable.getColumnModel().getColumn(0).setMinWidth(5);
            employeeTable.getColumnModel().getColumn(0).setPreferredWidth(2);
            employeeTable.getColumnModel().getColumn(1).setPreferredWidth(15);
            employeeTable.getColumnModel().getColumn(2).setPreferredWidth(15);
            employeeTable.getColumnModel().getColumn(3).setMinWidth(0);
            employeeTable.getColumnModel().getColumn(3).setPreferredWidth(1);
            employeeTable.getColumnModel().getColumn(5).setPreferredWidth(5);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 540, 170));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Firstname");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 180, 35));

        LastNameField.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LastNameField.setForeground(new java.awt.Color(204, 204, 204));
        LastNameField.setText("Lastname");
        jPanel3.add(LastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 190, 35));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Age");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 180, 35));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Email");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 200, 35));

        FirstnameField.setBackground(new java.awt.Color(0, 0, 0));
        FirstnameField.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(FirstnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 280, 35));

        LastnameField.setBackground(new java.awt.Color(0, 0, 0));
        LastnameField.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(LastnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 280, 35));

        AgeField.setBackground(new java.awt.Color(0, 0, 0));
        AgeField.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(AgeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 280, 35));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Password");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 190, 35));

        EmailField.setBackground(new java.awt.Color(0, 0, 0));
        EmailField.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 280, 35));

        PasswordField.setBackground(new java.awt.Color(0, 0, 0));
        PasswordField.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 280, 35));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 730, 320));

        setSize(new java.awt.Dimension(749, 746));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBtnMouseClicked
        String Firstname = FirstnameField.getText();
        String Lastname = LastnameField.getText();
        String Age = AgeField.getText();
        String Email = EmailField.getText();
        String Password = PasswordField.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstdb", "root", "");
           
            Statement stmt = con.createStatement();
            String query = "INSERT INTO `scholars_data` (`firstname`, `lastname`, `age`, `email`, `password`) VALUES ('" + Firstname + "', '" + Lastname + "', " + Age + ", '" + Email + "', '" + Password + "');";
            stmt.executeUpdate(query);
            FirstnameField.setText("");
            LastnameField.setText("");
            AgeField.setText("");
            EmailField.setText("");
            PasswordField.setText("");
            JOptionPane.showMessageDialog(this, "Data was Successfully Added");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Please fiil up the field");
        }

    }//GEN-LAST:event_createBtnMouseClicked

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked

    }

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        new updateData().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        new deleteData().setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed

    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed

    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void viewBtnMouseClicked(java.awt.event.MouseEvent evt) {
        new Main().setVisible(true);
        this.setVisible(false);
        JOptionPane.showMessageDialog(this, "Refresh");
    }//GEN-LAST:event_viewBtnMouseClicked

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) 
       
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public void getdata() {
        int count = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstdb", "root", "");
     
            Statement stmt = con.createStatement();

            ResultSet datas = stmt.executeQuery("select * from `scholars_data`");
            DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
            while (datas.next()) {
                count = 1;
                model.addRow(new Object[]{datas.getInt("id"), datas.getString("firstname"), datas.getString("lastname"), datas.getString("age"), datas.getString("email"), datas.getString("password")});
            }
            if (count == 0) {
                JOptionPane.showMessageDialog(null, "No data found this time!.", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeField;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField FirstnameField;
    private javax.swing.JLabel LastNameField;
    private javax.swing.JTextField LastnameField;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JTable employeeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
