
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*;


public class BlackJack extends javax.swing.JFrame {
    
    static final ImageIcon[] CARDICONS = new ImageIcon[52];
    static int turn = 0;
    static int uTotal = 0;
    static int dTotal = 0;
    static int bet = 0;
    final Timer timer = new Timer(1300, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int u3 = new Random().nextInt(52);
                    dc3.setIcon(CARDICONS[u3]);
                    dTotal += cardValue(u3);
                    updateCount();
                    
                    if (dTotal > uTotal && dTotal <= 21) {
                        JOptionPane.showMessageDialog(null, "Dealer Beat You! You lost your bet!", "Casino", JOptionPane.INFORMATION_MESSAGE);
                        reset();
                        timer.stop();
                        
                    }
                    else if (dTotal > 21) {
                        JOptionPane.showMessageDialog(null, "Dealer Busted! You Won!", "Casino", JOptionPane.INFORMATION_MESSAGE);
                        MenuPage.money += bet*2.0;
                        reset();
                        timer.stop();
                        
                    }
                }
            });

    public BlackJack() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hit = new javax.swing.JButton();
        deal = new javax.swing.JButton();
        stand = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dc1 = new javax.swing.JLabel();
        uc1 = new javax.swing.JLabel();
        uc2 = new javax.swing.JLabel();
        dc2 = new javax.swing.JLabel();
        uc3 = new javax.swing.JLabel();
        dc3 = new javax.swing.JLabel();
        betInput = new javax.swing.JTextField();
        uCount = new javax.swing.JLabel();
        dCount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BlackJack");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BlackJack");

        hit.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        hit.setText("Hit");
        hit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitActionPerformed(evt);
            }
        });

        deal.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        deal.setText("Deal");
        deal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealActionPerformed(evt);
            }
        });

        stand.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        stand.setText("Stand");
        stand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("You");

        dc1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        dc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dc1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        uc1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        uc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uc1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        uc2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        uc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uc2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        dc2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        dc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dc2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dc2.setIconTextGap(1);

        uc3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        uc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uc3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        dc3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        dc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dc3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dc3.setIconTextGap(1);

        betInput.setBackground(new java.awt.Color(255, 255, 255));
        betInput.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        betInput.setForeground(new java.awt.Color(0, 0, 0));
        betInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        uCount.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        uCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uCount.setText("0");

        dCount.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        dCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dCount.setText("0");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("- Stand if you are very close. Dealer will then try to win");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rules:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("- Place bet and click Deal for cards");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("- Hit to get one more card to get closer to 21");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Place Bet");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Dealer");

        balance.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        balance.setForeground(new java.awt.Color(51, 204, 0));
        balance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balance.setText("Balance");

        jButton1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jButton1.setText("Back to Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(deal, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(betInput)
                                .addComponent(stand, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(hit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dc1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dc2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(uc1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)
                                .addComponent(uc2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGap(268, 268, 268)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(472, 472, 472)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(uc3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146)
                                .addComponent(uCount, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dc3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dCount, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(150, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(774, 774, 774))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1351, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(jLabel7)
                    .addContainerGap(1427, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(balance)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButton1)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(betInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(uCount, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(uc1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uc3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uc2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(143, 143, 143)
                        .addComponent(jLabel8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dc1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dc2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dc3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(dCount, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(351, 351, 351))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(stand)
                                        .addGap(67, 67, 67)
                                        .addComponent(hit)
                                        .addGap(345, 345, 345))))))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1329, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(367, 367, 367)
                    .addComponent(jLabel7)
                    .addContainerGap(988, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void standActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standActionPerformed
        if (turn == 0) {

        }
        else {
            int d2 = new Random().nextInt(52);
            dc2.setIcon(CARDICONS[d2]);
            dTotal += DcardValue(d2);
            updateCount();
            
            if (dTotal > uTotal) {
                
                JOptionPane.showMessageDialog(null, "Dealer Beat You! You lost!", "Casino", JOptionPane.INFORMATION_MESSAGE);
                reset();
                return;
                
            }
            timer.start();
        }
             
    }//GEN-LAST:event_standActionPerformed

    private void dealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealActionPerformed

        String b1 = betInput.getText();
        
        if (b1.isEmpty() || turn == 1 || !noLetters(b1)) {
            
        }
        else {
            bet = Integer.parseInt(b1);
            MenuPage.money -= bet;
            balance.setText("$" + MenuPage.money);
            
            int u1 = new Random().nextInt(52), u2 = new Random().nextInt(52);
            int d1 = new Random().nextInt(52);
            
            uTotal += cardValue(u1);
            updateCount();
            uTotal +=  cardValue(u2);
            dTotal += DcardValue(d1);
            updateCount();
            
            uc1.setIcon(CARDICONS[u1]);
            uc2.setIcon(CARDICONS[u2]);
            dc1.setIcon(CARDICONS[d1]);
            
            updateCount();

            turn = 1;

        }
        betInput.setText("");

    }//GEN-LAST:event_dealActionPerformed

    private void hitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitActionPerformed
        if (turn == 0) {

        }
        else {
            int u3 = new Random().nextInt(52);
            uc3.setIcon(CARDICONS[u3]);
            uTotal += cardValue(u3);
            updateCount();
            
            if (uTotal > 21) {
                JOptionPane.showMessageDialog(this, "Bust! You lost!", "Casino", JOptionPane.INFORMATION_MESSAGE);
                reset();
                
            }
            else if (uTotal == 21) {
                JOptionPane.showMessageDialog(this, "21! You won!", "Casino", JOptionPane.INFORMATION_MESSAGE);
                MenuPage.money += bet*2.0;
                reset();
                
            }

        }

    }//GEN-LAST:event_hitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new MenuPage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void start() {
        
        for (int i = 0; i < 52; i++){
	      BlackJack.CARDICONS[i] = scale("image/card/" + (i + 1) + ".png");
	    }
        
        uc1.setIcon(scale("image/card/bbv.png"));
        uc2.setIcon(scale("image/card/bbv.png"));
        dc1.setIcon(scale("image/card/rbv.png"));
        dc2.setIcon(scale("image/card/rbv.png"));
        
        balance.setText("$" + MenuPage.money);
        
        
    }
    
    private ImageIcon scale(String src) {
        
        Image img1 = new ImageIcon(src).getImage();
        
        Image scaled = img1.getScaledInstance(dc1.getWidth(), dc1.getHeight(), Image.SCALE_SMOOTH);
        
        return new ImageIcon(scaled);
        
    }
    
    public int cardValue(int in) {
        
        int index = in + 1;
        switch (index % 13) {
            case 11:
            case 12:
            case 0:
                return 10;
            case 1:
                if (Math.abs(21 - uTotal) < 11) {
                    return 1;
                }
                else {
                    return 11;
                }
            default:
                return index % 13;
        }
        
    }
    
    public int DcardValue(int in) {
        
        int index = in + 1;
        switch (index % 13) {
            case 11:
            case 12:
            case 0:
                return 10;
            case 1:
                if (Math.abs(21 - dTotal) < 11) {
                    return 1;
                }
                else {
                    return 11;
                }
            default:
                return index % 13;
        }
        
    }
    
    public void updateCount() {
        uCount.setText(uTotal + "");
        dCount.setText(dTotal + "");
    }
    
    private void reset() {
        uCount.setText("0");
        dCount.setText("0");
        
        uTotal = 0;
        dTotal = 0;
        
        uc1.setIcon(scale("image/card/bbv.png"));
        uc2.setIcon(scale("image/card/bbv.png"));
        dc1.setIcon(scale("image/card/rbv.png"));
        dc2.setIcon(scale("image/card/rbv.png"));
        
        uc3.setIcon(null);
        dc3.setIcon(null);
        
        turn = 0;
        
        balance.setText("$" + MenuPage.money);
        betInput.setText("");
        
    }
    
    public boolean noLetters(String in) {
        
        for (int i = 0; i < in.length(); i++) {
            if (!Character.isDigit(in.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balance;
    private javax.swing.JTextField betInput;
    private javax.swing.JLabel dCount;
    private javax.swing.JLabel dc1;
    private javax.swing.JLabel dc2;
    private javax.swing.JLabel dc3;
    private javax.swing.JButton deal;
    private javax.swing.JButton hit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton stand;
    private javax.swing.JLabel uCount;
    private javax.swing.JLabel uc1;
    private javax.swing.JLabel uc2;
    private javax.swing.JLabel uc3;
    // End of variables declaration//GEN-END:variables
}
