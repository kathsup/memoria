/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package juegomemori;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class juego extends javax.swing.JFrame {

    private JuegoMemori log = new JuegoMemori();
    private boolean caraUp = false; 
    private ImageIcon Im1, Im2;
    private JButton[] pbtn = new JButton[2];
    private boolean primerc = false; 
    private int puntaje=0;
    
    
    
    public juego() {
        initComponents();
        setCards();
    }

    private void setCards(){
        int[]numbers= log.getCardNumbers(); 
        
    btn1.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/c"+numbers[0]+".png")));
    btn2.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/c"+numbers[1]+".png")));
    btn3.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/c"+numbers[2]+".png")));
    btn4.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/c"+numbers[3]+".png")));
    btn5.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/c"+numbers[4]+".png")));
    btn6.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/c"+numbers[5]+".png")));
    btn7.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/c"+numbers[6]+".png")));
    btn8.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/c"+numbers[7]+".png")));
    btn9.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/c"+numbers[8]+".png")));
    btn10.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/c"+numbers[9]+".png")));
    btn11.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/c"+numbers[10]+".png")));
    btn12.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/c"+numbers[11]+".png")));
    btn13.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/c"+numbers[12]+".png")));
    btn14.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/c"+numbers[13]+".png")));
    btn15.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/c"+numbers[14]+".png")));
    btn16.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/c"+numbers[15]+".png")));
                  
    }

    private void btnEnabled(JButton btn){
    
        if(!caraUp){
        btn.setEnabled(false);
        Im1 = (ImageIcon) btn.getDisabledIcon();
        pbtn[0]= btn;
        caraUp=true; 
        primerc = false; 
        
        }
        else{
        btn.setEnabled(false);
        pbtn[1]=btn;
        Im2 = (ImageIcon) btn.getDisabledIcon();
        primerc=true;
        puntaje += 20;
        pregwin();
        }
    }
    
    private void compare() {
        if (caraUp && primerc) {

            if (Im1.getDescription().compareTo(Im2.getDescription()) != 0) {

                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                if(puntaje>10)puntaje-=10;
            }
            caraUp = false;
        }
    }
    
    private void reiniciar(){
    
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn13.setEnabled(true);
        btn14.setEnabled(true);
        btn15.setEnabled(true);
        btn16.setEnabled(true);
        
        primerc = false; 
        caraUp= false;
        puntaje= 0; 
    
    }
    
    private void pregwin() {
    if (!btn1.isEnabled() && !btn2.isEnabled() && !btn3.isEnabled() &&
        !btn4.isEnabled() && !btn5.isEnabled() && !btn6.isEnabled() &&
        !btn7.isEnabled() && !btn8.isEnabled() && !btn9.isEnabled() &&
        !btn10.isEnabled() && !btn11.isEnabled() && !btn12.isEnabled() &&
        !btn13.isEnabled() && !btn14.isEnabled() && !btn15.isEnabled() &&
        !btn16.isEnabled()) {
        
        JOptionPane.showMessageDialog(this, "Felicidades, usted ha ganado. Su puntaje es: " + puntaje, "¡Ganaste!", JOptionPane.INFORMATION_MESSAGE);
    }
}

    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("JUEGO DE MEMORIA");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        btn1.setText(" ");
        btn1.setBorder(null);
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setFocusable(false);
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1MouseExited(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        btn2.setText(" ");
        btn2.setBorder(null);
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setFocusable(false);
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2MouseExited(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        btn3.setText(" ");
        btn3.setBorder(null);
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setFocusable(false);
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3MouseExited(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        btn4.setText(" ");
        btn4.setBorder(null);
        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setFocusable(false);
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4MouseExited(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        btn5.setText(" ");
        btn5.setBorder(null);
        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setFocusable(false);
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5MouseExited(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        btn6.setText(" ");
        btn6.setBorder(null);
        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setFocusable(false);
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6MouseExited(evt);
            }
        });
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        btn7.setText(" ");
        btn7.setBorder(null);
        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setFocusable(false);
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7MouseExited(evt);
            }
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        btn8.setText(" ");
        btn8.setBorder(null);
        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.setFocusable(false);
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8MouseExited(evt);
            }
        });
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        btn9.setText(" ");
        btn9.setBorder(null);
        btn9.setBorderPainted(false);
        btn9.setContentAreaFilled(false);
        btn9.setFocusable(false);
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9MouseExited(evt);
            }
        });
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        btn10.setText(" ");
        btn10.setBorder(null);
        btn10.setBorderPainted(false);
        btn10.setContentAreaFilled(false);
        btn10.setFocusable(false);
        btn10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        btn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn10MouseExited(evt);
            }
        });
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        btn11.setText(" ");
        btn11.setBorder(null);
        btn11.setBorderPainted(false);
        btn11.setContentAreaFilled(false);
        btn11.setFocusable(false);
        btn11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        btn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn11MouseExited(evt);
            }
        });
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        btn12.setText(" ");
        btn12.setBorder(null);
        btn12.setBorderPainted(false);
        btn12.setContentAreaFilled(false);
        btn12.setFocusable(false);
        btn12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        btn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn12MouseExited(evt);
            }
        });
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        btn15.setText(" ");
        btn15.setBorder(null);
        btn15.setBorderPainted(false);
        btn15.setContentAreaFilled(false);
        btn15.setFocusable(false);
        btn15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        btn15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn15MouseExited(evt);
            }
        });
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        btn13.setText(" ");
        btn13.setBorder(null);
        btn13.setBorderPainted(false);
        btn13.setContentAreaFilled(false);
        btn13.setFocusable(false);
        btn13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        btn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn13MouseExited(evt);
            }
        });
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        btn14.setText(" ");
        btn14.setBorder(null);
        btn14.setBorderPainted(false);
        btn14.setContentAreaFilled(false);
        btn14.setFocusable(false);
        btn14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        btn14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn14MouseExited(evt);
            }
        });
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        btn16.setText(" ");
        btn16.setBorder(null);
        btn16.setBorderPainted(false);
        btn16.setContentAreaFilled(false);
        btn16.setFocusable(false);
        btn16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        btn16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn16MouseExited(evt);
            }
        });
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn5)
                    .addComponent(btn1)
                    .addComponent(btn9)
                    .addComponent(btn13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn6)
                    .addComponent(btn2)
                    .addComponent(btn10)
                    .addComponent(btn14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7)
                    .addComponent(btn3)
                    .addComponent(btn11)
                    .addComponent(btn15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn8)
                    .addComponent(btn4)
                    .addComponent(btn12)
                    .addComponent(btn16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btn4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(btn7)
                    .addComponent(btn8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn9)
                    .addComponent(btn10)
                    .addComponent(btn11)
                    .addComponent(btn12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn13)
                    .addComponent(btn14)
                    .addComponent(btn15)
                    .addComponent(btn16))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnReiniciar.setBackground(new java.awt.Color(255, 51, 255));
        btnReiniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(204, 204, 255));
        btnReiniciar.setText("Reiniciar Juego");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReiniciar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnReiniciar))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       btnEnabled(btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btnEnabled(btn4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        btnEnabled(btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btnEnabled(btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btnEnabled(btn5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btnEnabled(btn6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btnEnabled(btn7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btnEnabled(btn8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
       btnEnabled(btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        btnEnabled(btn10);
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        btnEnabled(btn11);
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
       btnEnabled(btn12);
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
       btnEnabled(btn13);
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        btnEnabled(btn14);
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        btnEnabled(btn15);
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        btnEnabled(btn16);
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited
        compare();
    }//GEN-LAST:event_btn1MouseExited

    private void btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseExited
        compare();
    }//GEN-LAST:event_btn2MouseExited

    private void btn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseExited
        compare();
    }//GEN-LAST:event_btn3MouseExited

    private void btn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseExited
        compare();
    }//GEN-LAST:event_btn4MouseExited

    private void btn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseExited
        compare();
    }//GEN-LAST:event_btn5MouseExited

    private void btn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseExited
        compare();
    }//GEN-LAST:event_btn6MouseExited

    private void btn7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseExited
       compare();
    }//GEN-LAST:event_btn7MouseExited

    private void btn8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseExited
        compare();
    }//GEN-LAST:event_btn8MouseExited

    private void btn9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseExited
        compare();
    }//GEN-LAST:event_btn9MouseExited

    private void btn10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn10MouseExited
        compare();
    }//GEN-LAST:event_btn10MouseExited

    private void btn11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn11MouseExited
       compare();
    }//GEN-LAST:event_btn11MouseExited

    private void btn12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn12MouseExited
        compare();
    }//GEN-LAST:event_btn12MouseExited

    private void btn13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn13MouseExited
       compare();
    }//GEN-LAST:event_btn13MouseExited

    private void btn14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn14MouseExited
        compare();
    }//GEN-LAST:event_btn14MouseExited

    private void btn15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn15MouseExited
        compare();
    }//GEN-LAST:event_btn15MouseExited

    private void btn16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn16MouseExited
        compare();
    }//GEN-LAST:event_btn16MouseExited

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
