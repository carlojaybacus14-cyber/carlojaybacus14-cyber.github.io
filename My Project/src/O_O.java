
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;

public class O_O extends javax.swing.JFrame {
    
    private final Random rand = new Random();
    private int count1 = 0;
    private int count2 = 0;
    private String txt = ":D";

    public O_O() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnYes = new javax.swing.JButton();
        txtQuestion = new javax.swing.JLabel();
        noZone = new javax.swing.JPanel();
        btnNo = new javax.swing.JButton();
        respond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));

        btnYes.setBackground(new java.awt.Color(51, 255, 102));
        btnYes.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        btnYes.setText("Yes");
        btnYes.setFocusable(false);
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });

        txtQuestion.setFont(new java.awt.Font("Segoe Script", 3, 24)); // NOI18N
        txtQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtQuestion.setText("Will you let me court you?");

        btnNo.setBackground(new java.awt.Color(255, 102, 102));
        btnNo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnNo.setText("No.");
        btnNo.setFocusable(false);
        btnNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNoMouseEntered(evt);
            }
        });
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout noZoneLayout = new javax.swing.GroupLayout(noZone);
        noZone.setLayout(noZoneLayout);
        noZoneLayout.setHorizontalGroup(
            noZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, noZoneLayout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        noZoneLayout.setVerticalGroup(
            noZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, noZoneLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        respond.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        respond.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(noZone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(respond, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtQuestion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtQuestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(respond, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noZone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoMouseEntered
        int x = rand.nextInt((noZone.getWidth() + 1) - btnNo.getWidth());
        int y = rand.nextInt((noZone.getHeight() + 1) - btnNo.getHeight());
        btnNo.setLocation(x, y);
        count1++;
        if (count1 % 10 == 0 && count2 == 0) {
            respond.setText("I'll treat you better I swear.");
            count2++;
        } else if (count1 % 10 == 0 && count2 == 1) {
            respond.setText("Do you not like me?");
            count2++;
        } else if (count1 % 10 == 0 && count2 == 2) {
            respond.setText("Stop chasing the no button!");
            count2 = 0;
        }
    }//GEN-LAST:event_btnNoMouseEntered

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
        txtQuestion.setFont(new Font("Segoe Script", Font.BOLD, 18));
        txtQuestion.setText("Let's go home together sometime.");
        btnYes.setVisible(false);
        btnNo.setVisible(false);
        Timer timer = new Timer(50, new ActionListener() {
            int timerCount = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                timerCount++;
                respond.setText(txt);
                txt += "D";
                if (timerCount == 75) {
                    System.exit(0);
                }
            }
        });
        timer.start();
    }//GEN-LAST:event_btnYesActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        btnNo.setVisible(false);
        btnYes.setVisible(false);
        txtQuestion.setVisible(false);
        respond.setText("You made your decision...");
        Timer timer = new Timer(1000, new ActionListener() {
            int timerCount = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                timerCount++;
                if (timerCount == 4) {
                    respond.setText("bye... :(");
                }
                if (timerCount == 5) {
                    System.exit(0);
                }
            }
        });
        
        timer.start();
    }//GEN-LAST:event_btnNoActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new O_O().setVisible(true));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnYes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel noZone;
    private javax.swing.JLabel respond;
    private javax.swing.JLabel txtQuestion;
    // End of variables declaration//GEN-END:variables
}
