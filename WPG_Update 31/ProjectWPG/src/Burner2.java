/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxwell
 */
public class Burner2 extends javax.swing.JFrame {

    /**
     * Creates new form Burner2
     */
    public Burner2() {
        initComponents();
                 setTitle("Burner Bodyweight");
           setResizable(false);
        setSize(726, 400);
        
        
        
        
        
           				String[]burner;
				burner = new String[25];
				burner[0] = "Sprint (back & forth";
				burner[1] = "Jumping jacks";
				burner[2] = "Sit ups";
				burner[3] = "Crunches";
				burner[4] = "Burpees";
				burner[5] = "Mountain Climbers";
				burner[6] = "Jumping squats";
				burner[7] = "Straddle V ups to Sit ups";
				burner[8] = "Stationary knee jumps aka 'High knees'";
				burner[9] = "Squat thrust";
                                burner[10] = "Cycling it Ups";
                                burner[11] = "Russian Twist";
                                burner[12] = "Standing on One Leg";
                                burner[13] = "Step Up Jump";
                                burner[14] = "Bear Crawl";
                                burner[15] = "Walking Lunge";
                                burner[16] = "Blast Off Push Ups";
                                burner[17] = "Bulgarian Split Squats";
                                burner[18] = "Shuttle Sprints";
                                burner[19] = "Straight leg Crunch";
                                burner[20] = "Knee Leg Crunch";
                                burner[21] = "Straddle Leg Crunch";
                                burner[22] = "Hollow Body Hold ";
                                burner[23] = "Bent HB Hold";
                                burner[24] = "Planks";
			
                                
                                
                                 for(int i =0; i<12; i++)
         {
          
             int q1 = (int) (Math.random()*25);
             int q2 = (int) (Math.random()*25);
             int q3 = (int) (Math.random()*25);
             int q4 = (int) (Math.random()*25);
             int q5 = (int) (Math.random()*25);
             int q6 = (int) (Math.random()*25);
             int q7 = (int) (Math.random()*25);
             int q8 = (int) (Math.random()*25);
             int q9 = (int) (Math.random()*25);
             int q10 = (int) (Math.random()*25);
             int q11 = (int) (Math.random()*25);
             int q12 = (int) (Math.random()*25);
             
             
          
         
       
    
         
        
        
         c1.setText(burner[q1]);
         c2.setText(burner[q2]);
         c3.setText(burner[q3]);
         c4.setText(burner[q4]);
         c5.setText(burner[q5]);
         c6.setText(burner[q6]);
         c7.setText(burner[q7]);
         c8.setText(burner[q8]);
         c9.setText(burner[q9]);
         c10.setText(burner[q10]);
         c11.setText(burner[q11]);
         c12.setText(burner[q12]);
         jLabel4.setText("1 minute");
         jLabel5.setText("30 seconds");
         jLabel7.setText("45 seconds");
         }  
                                
                                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        c9 = new javax.swing.JLabel();
        c10 = new javax.swing.JLabel();
        c11 = new javax.swing.JLabel();
        c12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Bodyweight Mode");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 20, 220, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Cycle 1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 110, 100, 17);

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 280, 140, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Cycle 2");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 110, 100, 17);

        c1.setForeground(new java.awt.Color(240, 240, 240));
        c1.setText("jLabel4");
        getContentPane().add(c1);
        c1.setBounds(30, 150, 160, 14);

        c2.setForeground(new java.awt.Color(240, 240, 240));
        c2.setText("jLabel5");
        getContentPane().add(c2);
        c2.setBounds(30, 180, 160, 14);

        c3.setForeground(new java.awt.Color(240, 240, 240));
        c3.setText("jLabel5");
        getContentPane().add(c3);
        c3.setBounds(30, 210, 160, 14);

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("jLabel4");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 280, 140, 14);

        c4.setForeground(new java.awt.Color(240, 240, 240));
        c4.setText("jLabel5");
        getContentPane().add(c4);
        c4.setBounds(30, 240, 160, 14);

        c5.setForeground(new java.awt.Color(240, 240, 240));
        c5.setText("jLabel4");
        getContentPane().add(c5);
        c5.setBounds(190, 150, 160, 14);

        c6.setForeground(new java.awt.Color(240, 240, 240));
        c6.setText("jLabel5");
        getContentPane().add(c6);
        c6.setBounds(190, 180, 160, 14);

        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("jLabel4");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(370, 280, 140, 14);

        c7.setForeground(new java.awt.Color(240, 240, 240));
        c7.setText("jLabel5");
        getContentPane().add(c7);
        c7.setBounds(190, 210, 170, 14);

        c8.setForeground(new java.awt.Color(240, 240, 240));
        c8.setText("jLabel5");
        getContentPane().add(c8);
        c8.setBounds(190, 240, 170, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Cycle 3");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(370, 110, 100, 17);

        c9.setForeground(new java.awt.Color(240, 240, 240));
        c9.setText("jLabel4");
        getContentPane().add(c9);
        c9.setBounds(370, 150, 170, 14);

        c10.setForeground(new java.awt.Color(240, 240, 240));
        c10.setText("jLabel5");
        getContentPane().add(c10);
        c10.setBounds(370, 180, 190, 14);

        c11.setForeground(new java.awt.Color(240, 240, 240));
        c11.setText("jLabel5");
        getContentPane().add(c11);
        c11.setBounds(370, 210, 160, 14);

        c12.setForeground(new java.awt.Color(240, 240, 240));
        c12.setText("jLabel5");
        getContentPane().add(c12);
        c12.setBounds(370, 240, 200, 14);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(600, 340, 55, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/Burnerbckgrnd_1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 400);

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("jLabel4");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(190, 280, 34, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Choice2 choice = new Choice2();
        choice.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Burner2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Burner2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Burner2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Burner2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Burner2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c10;
    private javax.swing.JLabel c11;
    private javax.swing.JLabel c12;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JLabel c7;
    private javax.swing.JLabel c8;
    private javax.swing.JLabel c9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
