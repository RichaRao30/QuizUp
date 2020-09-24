
package quizup;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Timer;
public class QuestionFrame3 extends javax.swing.JFrame {

    static int id=1;
    int qn;
    static String cor,opt1,opt2,opt3,opt4;
    
    public QuestionFrame3(int qid) {
        initComponents();
        MyTimer mt=new MyTimer(timer1, this);
        Timer timer=new Timer(true);
        timer.scheduleAtFixedRate(mt,0,1000);
        id=qid;
        try {
            Statement st= Quizup.getConn().createStatement();
            String sql= "SELECT * FROM bmath WHERE qid="+qid+";";
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
            sql= "SELECT count(*) FROM bmath;";
            rs= st.executeQuery(sql);
            rs.next();
            qn=rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(QuestionFrame3.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ch1.add(op1);

        ch1.add(op3);

        ch1.add(op2);

        ch1.add(op4);

        jButton1.setText("Submit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        quesdisp.setEditable(false);
        quesdisp.setColumns(20);
        quesdisp.setRows(5);
        jScrollPane1.setViewportView(quesdisp);

        qno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        timer1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        timer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Time:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(op1)
                                            .addComponent(op3))
                                        .addGap(111, 111, 111)))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(op2)
                                    .addComponent(op4)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(timer1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(qno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(op1)
                            .addComponent(op2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(op3)
                            .addComponent(op4))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(timer1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
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
            QuestionFrame3 qf3=new QuestionFrame3(id+1);
            qf3.setVisible(true);
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
            QuestionFrame3 qf3=new QuestionFrame3(id+1);
            qf3.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            ScoreScreen ss1=new ScoreScreen();
            ss1.setVisible(true);
            setVisible(false);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionFrame3(id).setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ch1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
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
