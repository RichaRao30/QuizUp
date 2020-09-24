
package quizup;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Timer;
import static quizup.QuestionFrame2.id;
public class QuestionFrame2 extends javax.swing.JFrame {

    static int id=1;
    int qn;
    static String cor,opt1,opt2,opt3,opt4;
    
    public QuestionFrame2(int qid) {
        initComponents();
        MyTimer mt=new MyTimer(timer1, this);
        Timer timer=new Timer(true);
        timer.scheduleAtFixedRate(mt,0,1000);
        id=qid;
        try {
            Statement st= Quizup.getConn().createStatement();
            String sql= "SELECT * FROM vocabtable WHERE qid="+qid+";";
            ResultSet rs= st.executeQuery(sql);
            rs.next();
            String ques=rs.getString("question");
            opt1=rs.getString("o1");
            opt2=rs.getString("o2");
            opt3=rs.getString("o3");
            opt4=rs.getString("o4");
            cor=rs.getString("c");
            quesdisp.setText(ques);
            qno.setText("    "+String.valueOf(id));
            op1.setText(opt1);
            op2.setText(opt2);
            op3.setText(opt3);
            op4.setText(opt4);
            st.close();
            rs.close();
            st=Quizup.getConn().createStatement();
            sql= "SELECT count(*) FROM vocabtable;";
            rs= st.executeQuery(sql);
            rs.next();
            qn=rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(QuestionFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ch1 = new javax.swing.ButtonGroup();
        op1 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        quesdisp = new javax.swing.JTextArea();
        qno = new javax.swing.JLabel();
        timer1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ch1.add(op1);

        ch1.add(op3);

        ch1.add(op2);

        ch1.add(op4);
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        quesdisp.setEditable(false);
        quesdisp.setColumns(20);
        quesdisp.setRows(5);
        jScrollPane1.setViewportView(quesdisp);

        qno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        timer1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        timer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Time:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(op3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(op1)
                                        .addGap(119, 119, 119)))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(op2)
                                    .addComponent(op4))))
                        .addContainerGap(202, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timer1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(qno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(timer1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(op1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(op2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(op3)
                    .addComponent(op4))
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(92, 92, 92))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    if(!op1.isSelected()&&!op2.isSelected()&&!op3.isSelected()&&!op4.isSelected())
        {
            JOptionPane.showMessageDialog(null,"Please select an answer.");
            return;
        }
    if((op1.isSelected()&&cor.equals(opt1)) || (op2.isSelected()&&cor.equals(opt2)) ||(op3.isSelected()&&cor.equals(opt3)) ||(op4.isSelected()&&cor.equals(opt4)))
    {
        Category.score++;
        JOptionPane.showMessageDialog(null,"Correct!");
    }
    else
        JOptionPane.showMessageDialog(null,"Incorrect!");
    if(id<qn)
    {
        QuestionFrame2 qf2=new QuestionFrame2(id+1);
        qf2.setVisible(true);
        this.setVisible(false);
    }
    else
    {
        ScoreScreen ss1=new ScoreScreen();
        ss1.setVisible(true);
        setVisible(false);
    }
    }//GEN-LAST:event_jButton1MouseClicked

    public void clickSubmit(){
        if(id<qn)
        {
            QuestionFrame2 qf2=new QuestionFrame2(id+1);
            qf2.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            ScoreScreen ss1=new ScoreScreen();
            ss1.setVisible(true);
            setVisible(false);
        }
    }
    
    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
    }//GEN-LAST:event_op4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionFrame2(id).setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ch1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JLabel qno;
    private javax.swing.JTextArea quesdisp;
    private javax.swing.JLabel timer1;
    // End of variables declaration//GEN-END:variables
}
