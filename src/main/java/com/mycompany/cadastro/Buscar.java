/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cadastro;

import java.awt.Image;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.text.BadLocationException;

/**
 *
 * @author cg3000486
 */
public class Buscar extends javax.swing.JFrame {
    private static final long serialVersionUID = 7526471155622776147L;
    public static  ArrayList<Cadastro> bd = new ArrayList<Cadastro>();
    /**
     * Creates new form Inicial
     */
    public Buscar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Pessoas");
        setBackground(new java.awt.Color(88, 137, 172));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(130, 157, 179));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));

        jLabel1.setFont(new java.awt.Font("Artifakt Element Book", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextArea1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jTextArea1.setSelectedTextColor(new java.awt.Color(38, 117, 191));
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton2.setText("Editar Cadastro");
        jButton2.setToolTipText("");
        jButton2.setEnabled(false);
        jButton2.setName(""); // NOI18N
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setMaximumSize(new java.awt.Dimension(350, 350));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));

        jButton3.setText("Deletar");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(569, 569, 569)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(317, 317, 317))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addComponent(jTextField1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel7)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel8)
                                .addGap(57, 57, 57)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel10)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(64, 64, 64));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 64, 64), 4));

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Inicio");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), null, null, new java.awt.Color(102, 102, 102)));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Buscar");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Inserir");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMenu3.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu3MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Remover");
        jMenu4.setVisible(false);
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMenu4.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu4MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        tini.setVisible(false);
        tins.setVisible(false);
        trem.setVisible(false);
        tbus.setLocation(this.getLocation());
        tbus.setSize(this.getSize());
        tbus.setVisible(true);
    }//GEN-LAST:event_jMenu2MenuSelected

    private void jMenu3MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu3MenuSelected
        tini.setVisible(false);
        tbus.setVisible(false);
        trem.setVisible(false);
        tins.setLocation(this.getLocation()); 
        tins.setSize(this.getSize());
        tins.setVisible(true);
    }//GEN-LAST:event_jMenu3MenuSelected

    private void jMenu4MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuSelected
        tini.setVisible(false);
        tbus.setVisible(false);
        tins.setVisible(false);
        trem.setLocation(this.getLocation());       
        trem.setSize(this.getSize());
        trem.setVisible(true);
    }//GEN-LAST:event_jMenu4MenuSelected

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        tins.setVisible(false);
        tbus.setVisible(false);
        trem.setVisible(false);
        tini.setLocation(this.getLocation());      
        tini.setSize(this.getSize());
        tini.setVisible(true);
    }//GEN-LAST:event_jMenu1MenuSelected

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        atualizabusca();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        try {
            // descubro qual linha foi clicada
            int linha = this.jTextArea1.getLineOfOffset(jTextArea1.getCaretPosition());
            // defino o inicio do texto dessa linha
            int inicio = jTextArea1.getLineStartOffset(linha);
            // defino o final da linha
            int fim = jTextArea1.getLineEndOffset(linha);
            
            //gero um string a partir a linha que foi clicada
            String s = jTextArea1.getDocument().getText(inicio, fim-inicio-1);
            //this.jTextFieldBuscar.setText(s);
            
            this.jTextArea1.select(inicio, fim-1);
            
            for (int i = 0; i < bd.size(); i++) {
                
                if(bd.get(i).getNome().toLowerCase().contains(s.toLowerCase())){
                    this.jLabel2.setIcon(bd.get(i).getFoto());
                    this.jLabel3.setText("Nome: " + bd.get(i).getNome());
                    this.jLabel4.setText("Idade: " + bd.get(i).getIdade().toString());
                    this.jLabel5.setText("Altura: " + Float.toString(bd.get(i).getAltura()) + "m");
                    this.jLabel6.setText("Endereço: " + bd.get(i).getEndereco());
                    this.jLabel7.setText("Número: " + bd.get(i).getCidade());
                    this.jLabel8.setText("Cidade: " + Integer.toString(bd.get(i).getNumero()));
                    this.jLabel9.setText("Estado: " + bd.get(i).getEstado().getNome());
                    this.jButton2.setEnabled(true);
                    this.selecionado = bd.get(i);
                }
                
            }
            this.jButton3.setEnabled(true);
            

        } catch (BadLocationException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jTextArea1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Alterar talt = new Alterar();
        talt.setVisible(true);
        talt.setLocation(this.getLocation());       
        talt.setSize(this.getSize());
        talt.setCadastro(selecionado,bd);
        
    }//GEN-LAST:event_jButton2ActionPerformed
    public void getBuscaInicial(String buscaInicial){
        this.buscaInicial = buscaInicial;
        this.jTextArea1.setText("");
        this.jTextField1.setText(buscaInicial);
        for (int i = 0; i < bd.size(); i++) {
                if(bd.get(i).getNome().toLowerCase().contains(this.buscaInicial.toLowerCase()))
                    this.jTextArea1.append(bd.get(i).getNome()+"\n");
            }
            this.jLabel10.setText(String.valueOf(this.jTextArea1.getLineCount()-1)+" registros encontrados");
    }
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

            this.jTextArea1.setText("");


            for (int i = 0; i < bd.size(); i++) {
                if(bd.get(i).getNome().toLowerCase().contains(this.jTextField1.getText().toLowerCase()))
                    this.jTextArea1.append(bd.get(i).getNome()+"\n");
            }
            this.jLabel10.setText(String.valueOf(this.jTextArea1.getLineCount()-1)+" registros encontrados");
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        RemoverConfirm rc = new RemoverConfirm();
        
        rc.setLocation(this.getLocation());
        rc.setVisible(true);
        rc.MensagemNome(selecionado, bd);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    class MyObjectOutputStream extends ObjectOutputStream {

        // Constructor of this class
        // 1. Default
        MyObjectOutputStream() throws IOException
        {

            // Super keyword refers to parent class instance
            super();
        }

        // Constructor of this class
        // 1. Parameterized constructor
        MyObjectOutputStream(OutputStream o) throws IOException
        {
            super(o);
        }

        // Method of this class
        public void writeStreamHeader() throws IOException
        {
            return;
        }
    }
    
    public void atualizabusca(){
        bd.clear();
        this.jTextArea1.setText(null);
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream("bd.txt");
            in = new ObjectInputStream(fis);
            while (fis.available() != 0) {
                bd.addAll((ArrayList<Cadastro>) in.readObject());
            }
        } catch (EOFException eof) {
            // Ignore. means you reached EOF
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fis != null)
                    fis.close(); // close the stream
                if(in != null)
                    in.close();
            } catch (IOException ex) {
                Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for(int i = 0; i < bd.size(); i++){
            this.jTextArea1.append(bd.get(i).getNome()+"\n");
        }

    }
    
    public void setMenu2(Inicial tini, Buscar tbus, Inserir tins, Remover trem) {
        this.tini = tini;
        this.tbus = tbus;
        this.tins = tins;
        this.trem = trem;
        
        atualizabusca();
        
        
    }
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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
      
    }
    private Inicial tini;
    private Buscar tbus;
    private Inserir tins;
    private Remover trem;
    private Cadastro selecionado;
    private String buscaInicial;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
