
import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;


public class HangMan extends javax.swing.JFrame {
    
    static List<String> wordbank = new ArrayList<>();
    static String guess;
    static String key;
    static char[] progress;
    static int strikes = 6;
    
    public HangMan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        display = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        guessInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        guessedLetters = new javax.swing.JTextArea();
        strikeDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hang Man");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 80)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hang Man");

        display.setFont(new java.awt.Font("Arial", 1, 80)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        display.setText("Click New Word to Start");
        display.setToolTipText("");
        display.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        refresh.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        refresh.setText("New Word");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Guess:");

        guessInput.setBackground(new java.awt.Color(255, 255, 255));
        guessInput.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        guessInput.setForeground(new java.awt.Color(0, 0, 0));
        guessInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessInputActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        guessedLetters.setEditable(false);
        guessedLetters.setBackground(new java.awt.Color(255, 255, 255));
        guessedLetters.setColumns(20);
        guessedLetters.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        guessedLetters.setForeground(new java.awt.Color(0, 0, 0));
        guessedLetters.setLineWrap(true);
        guessedLetters.setRows(5);
        guessedLetters.setText("GUESSED LETTERS: ");
        jScrollPane1.setViewportView(guessedLetters);

        strikeDisplay.setFont(new java.awt.Font("Arial", 1, 200)); // NOI18N
        strikeDisplay.setForeground(new java.awt.Color(255, 255, 255));
        strikeDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        strikeDisplay.setText("| | | | | |");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(guessInput, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(114, 114, 114))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(681, 681, 681)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 1256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(strikeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107)
                .addComponent(strikeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(display)
                        .addGap(84, 84, 84)
                        .addComponent(refresh)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guessInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addComponent(back)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        new MenuPage().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void guessInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessInputActionPerformed
        
        String input = guessInput.getText();
        
        if (input.isEmpty() || input.length() > 1 || !Character.isLetter(input.charAt(0)) || progress == null) {
            guessInput.setText("");
        } 
        else {
            if (key.contains(input)) {
                for (int i = 0; i < key.length(); i++) {
                    if (key.charAt(i) == input.charAt(0)) {
                        progress[i] = key.charAt(i);
                    }
                }
            }
            else {
                strikes--;
                if (strikes == 0) {
                    JOptionPane.showMessageDialog(this, "Out of guesses! The word was " + key + "! You Lost", "HangMan", JOptionPane.INFORMATION_MESSAGE);
                    refresh();
                    
                }
            }
            
            guessedLetters.append(input + ", ");
            display.setText(trim(progress));
            guessInput.setText("");
            strikeDisplay.setText(strikeString(strikes));
        }
        
        
    }//GEN-LAST:event_guessInputActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        
        refresh();
        
    }//GEN-LAST:event_refreshActionPerformed

   public void start() throws IOException {
       Scanner sc = new Scanner(new File("image/hWords.txt"));
       
       while (sc.hasNext()) {
           String line = sc.nextLine();
           wordbank.add(line);
           
       }
       
   }
   
   private String trim(char [] ch) {
       String str = Arrays.toString(ch).replaceAll(",", " ").replace("[", "").replace("]", "");
       return str;
   }
   
   private String strikeString(int strikes) {
       String str = "";
       
       for (int i = 0; i < strikes; i++) {
           str += " | ";
           
       }
       
       return str;
       
   }
   
   private void refresh() {
        strikes = 6;
        key = wordbank.get(new Random().nextInt(wordbank.size()));
        guessInput.setText("");
        progress = new char[key.length()];
        Arrays.fill(progress, '_');
        display.setText(trim(progress));
        strikeDisplay.setText(strikeString(strikes));
        guessedLetters.setText("GUESSED LETTERS: ");
   }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel display;
    private javax.swing.JTextField guessInput;
    private javax.swing.JTextArea guessedLetters;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh;
    private javax.swing.JLabel strikeDisplay;
    // End of variables declaration//GEN-END:variables
}
