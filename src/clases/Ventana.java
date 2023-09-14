package clases;

import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * @author Matias Abregú
 */
public class Ventana extends javax.swing.JFrame {

    static String texto = "", texto2 = "", texto3 = "", aux = "";
    static long valor1 = 0, valor2 = 0, valor3 = 0;
    static double valorU = 0, valorD = 0, valorT = 0;
    int bandera1 = 0;

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Calculadora Mejorada :)");

        txt_numeros.setEditable(false);
        txt_progreso.setEditable(false);

        ImageIcon wallpaper = new ImageIcon("src/images/fondito.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), Image.SCALE_DEFAULT));
        Fondo.setIcon(icono);
        this.repaint();

        ImageIcon borrar = new ImageIcon("src/images/Borrar.png");
        Icon IconBorrar = new ImageIcon(borrar.getImage().getScaledInstance(30, 28, Image.SCALE_DEFAULT));
        BotonBorrar.setIcon(IconBorrar);
        this.repaint();

        if (bandera1 == 2) {

        }

        if (bandera1 == 3) {
            BotonSumar.setEnabled(false);
            BotonRestar.setEnabled(false);
            BotonMultiplicar.setEnabled(false);
            BotonDivision.setEnabled(false);
            Boton0.setEnabled(false);
            Boton1.setEnabled(false);
            Boton2.setEnabled(false);
            Boton3.setEnabled(false);
            Boton4.setEnabled(false);
            Boton5.setEnabled(false);
            Boton6.setEnabled(false);
            Boton7.setEnabled(false);
            Boton8.setEnabled(false);
            Boton9.setEnabled(false);
        }
    }

    //Metodo para poner Icono en parte superior como en la barra de tareas
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/Calculadora.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_numeros = new javax.swing.JTextField();
        BotonDivision = new javax.swing.JButton();
        BotonMultiplicar = new javax.swing.JButton();
        BotonRestar = new javax.swing.JButton();
        BotonSumar = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton0 = new javax.swing.JButton();
        BotonComa = new javax.swing.JButton();
        BotonIgual = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        txt_progreso = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_numeros.setBackground(new java.awt.Color(153, 153, 153));
        txt_numeros.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txt_numeros.setForeground(new java.awt.Color(255, 255, 255));
        txt_numeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numerosActionPerformed(evt);
            }
        });
        getContentPane().add(txt_numeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 44, 320, 72));

        BotonDivision.setBackground(new java.awt.Color(180, 180, 180));
        BotonDivision.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        BotonDivision.setForeground(new java.awt.Color(0, 0, 0));
        BotonDivision.setText("÷");
        BotonDivision.setToolTipText("");
        BotonDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonDivision.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BotonDivision.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        BotonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDivisionActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 60, 60));

        BotonMultiplicar.setBackground(new java.awt.Color(180, 180, 180));
        BotonMultiplicar.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        BotonMultiplicar.setForeground(new java.awt.Color(0, 0, 0));
        BotonMultiplicar.setText("×");
        BotonMultiplicar.setToolTipText("");
        BotonMultiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonMultiplicar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BotonMultiplicar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        BotonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMultiplicarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 60, 60));

        BotonRestar.setBackground(new java.awt.Color(180, 180, 180));
        BotonRestar.setFont(new java.awt.Font("Segoe UI", 0, 46)); // NOI18N
        BotonRestar.setForeground(new java.awt.Color(0, 0, 0));
        BotonRestar.setText("-");
        BotonRestar.setToolTipText("");
        BotonRestar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRestar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BotonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRestarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 60, 60));

        BotonSumar.setBackground(new java.awt.Color(180, 180, 180));
        BotonSumar.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        BotonSumar.setForeground(new java.awt.Color(0, 0, 0));
        BotonSumar.setText("+");
        BotonSumar.setToolTipText("");
        BotonSumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonSumar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BotonSumar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        BotonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 60, 60));

        Boton9.setBackground(new java.awt.Color(180, 180, 180));
        Boton9.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        Boton9.setForeground(new java.awt.Color(0, 0, 0));
        Boton9.setText("9");
        Boton9.setToolTipText("");
        Boton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 60, 60));

        Boton8.setBackground(new java.awt.Color(180, 180, 180));
        Boton8.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        Boton8.setForeground(new java.awt.Color(0, 0, 0));
        Boton8.setText("8");
        Boton8.setToolTipText("");
        Boton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 60, 60));

        Boton7.setBackground(new java.awt.Color(180, 180, 180));
        Boton7.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        Boton7.setForeground(new java.awt.Color(0, 0, 0));
        Boton7.setText("7");
        Boton7.setToolTipText("");
        Boton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 60, 60));

        Boton6.setBackground(new java.awt.Color(180, 180, 180));
        Boton6.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        Boton6.setForeground(new java.awt.Color(0, 0, 0));
        Boton6.setText("6");
        Boton6.setToolTipText("");
        Boton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 60, 60));

        Boton5.setBackground(new java.awt.Color(180, 180, 180));
        Boton5.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        Boton5.setForeground(new java.awt.Color(0, 0, 0));
        Boton5.setText("5");
        Boton5.setToolTipText("");
        Boton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 60, 60));

        Boton4.setBackground(new java.awt.Color(180, 180, 180));
        Boton4.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        Boton4.setForeground(new java.awt.Color(0, 0, 0));
        Boton4.setText("4");
        Boton4.setToolTipText("");
        Boton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 60, 60));

        Boton3.setBackground(new java.awt.Color(180, 180, 180));
        Boton3.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        Boton3.setForeground(new java.awt.Color(0, 0, 0));
        Boton3.setText("3");
        Boton3.setToolTipText("");
        Boton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 60, 60));

        Boton2.setBackground(new java.awt.Color(180, 180, 180));
        Boton2.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        Boton2.setForeground(new java.awt.Color(0, 0, 0));
        Boton2.setText("2");
        Boton2.setToolTipText("");
        Boton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 60, 60));

        Boton1.setBackground(new java.awt.Color(180, 180, 180));
        Boton1.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        Boton1.setForeground(new java.awt.Color(0, 0, 0));
        Boton1.setText("1");
        Boton1.setToolTipText("");
        Boton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 60, 60));

        Boton0.setBackground(new java.awt.Color(180, 180, 180));
        Boton0.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        Boton0.setForeground(new java.awt.Color(0, 0, 0));
        Boton0.setText("0");
        Boton0.setToolTipText("");
        Boton0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton0ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 60, 60));

        BotonComa.setBackground(new java.awt.Color(180, 180, 180));
        BotonComa.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        BotonComa.setForeground(new java.awt.Color(0, 0, 0));
        BotonComa.setText(",");
        BotonComa.setToolTipText("");
        BotonComa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonComa.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BotonComa.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        BotonComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonComa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 60, 60));

        BotonIgual.setBackground(new java.awt.Color(248, 248, 248));
        BotonIgual.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        BotonIgual.setForeground(new java.awt.Color(0, 0, 0));
        BotonIgual.setText("=");
        BotonIgual.setToolTipText("");
        BotonIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonIgual.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BotonIgual.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        BotonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIgualActionPerformed(evt);
            }
        });
        getContentPane().add(BotonIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 60, 60));

        BotonBorrar.setBackground(new java.awt.Color(180, 180, 180));
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 60, 60));

        BotonLimpiar.setBackground(new java.awt.Color(180, 180, 180));
        BotonLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        BotonLimpiar.setText("C");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 60, 60));

        txt_progreso.setBackground(new java.awt.Color(153, 153, 153));
        txt_progreso.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txt_progreso.setForeground(new java.awt.Color(255, 255, 255));
        txt_progreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_progreso.setText("Aca se va a ir mostrando el calculo.");
        getContentPane().add(txt_progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 250, -1));

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setToolTipText("");
        Fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Fondo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_numerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numerosActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        if (evt.getSource() == BotonBorrar) {
            if (bandera1 == 0) {
                if (texto == "") {
                    JOptionPane.showMessageDialog(null, "No hay nada que borrar.");
                } else {
                    texto = texto.substring(0, texto.length() - 1);
                    txt_numeros.setText(texto);
                }
            } else if (bandera1 == 1) {
                if (texto2 == "") {
                    JOptionPane.showMessageDialog(null, "No hay nada que borrar.");
                } else {
                    texto2 = texto2.substring(0, texto2.length() - 1);
                    txt_numeros.setText(texto2);
                }
            } else if (bandera1 == 2) {
                if (texto3 == "") {
                    JOptionPane.showMessageDialog(null, "No hay nada que borrar.");
                } else {
                    texto3 = texto3.substring(0, texto3.length() - 1);
                    txt_numeros.setText(texto3);
                }
            }
        }
    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        if (evt.getSource() == BotonLimpiar) {
            texto = "";
            texto2 = "";
            texto3 = "";
            valor1 = 0;
            valor2 = 0;
            valor3 = 0;
            valorU = 0;
            valorD = 0;
            valorT = 0;
            txt_numeros.setText("");
            txt_progreso.setText("Aca se va a ir mostrando el calculo.");
            bandera1 = 0;
        }
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void Boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton0ActionPerformed
        if (evt.getSource() == Boton0) {
            if (bandera1 == 0) {
                texto += "0";
                txt_numeros.setText(texto);
            } else if (bandera1 == 1) {
                texto2 += "0";
                txt_numeros.setText(texto2);
            } else if (bandera1 == 2) {
                texto3 += "0";
                txt_numeros.setText(texto3);
            }
        }
    }//GEN-LAST:event_Boton0ActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        if (evt.getSource() == Boton1) {
            if (bandera1 == 0) {
                texto += "1";
                txt_numeros.setText(texto);
            } else if (bandera1 == 1) {
                texto2 += "1";
                txt_numeros.setText(texto2);
            } else if (bandera1 == 2) {
                texto3 += "1";
                txt_numeros.setText(texto3);
            }
        }
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        if (evt.getSource() == Boton2) {
            if (bandera1 == 0) {
                texto += "2";
                txt_numeros.setText(texto);
            } else if (bandera1 == 1) {
                texto2 += "2";
                txt_numeros.setText(texto2);
            } else if (bandera1 == 2) {
                texto3 += "2";
                txt_numeros.setText(texto3);
            }
        }
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        if (evt.getSource() == Boton3) {
            if (bandera1 == 0) {
                texto += "3";
                txt_numeros.setText(texto);
            } else if (bandera1 == 1) {
                texto2 += "3";
                txt_numeros.setText(texto2);
            } else if (bandera1 == 2) {
                texto3 += "3";
                txt_numeros.setText(texto3);
            }
        }
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        if (evt.getSource() == Boton4) {
            if (bandera1 == 0) {
                texto += "4";
                txt_numeros.setText(texto);
            } else if (bandera1 == 1) {
                texto2 += "4";
                txt_numeros.setText(texto2);
            } else if (bandera1 == 2) {
                texto3 += "4";
                txt_numeros.setText(texto3);
            }
        }
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        if (evt.getSource() == Boton5) {
            if (bandera1 == 0) {
                texto += "5";
                txt_numeros.setText(texto);
            } else if (bandera1 == 1) {
                texto2 += "5";
                txt_numeros.setText(texto2);
            } else if (bandera1 == 2) {
                texto3 += "5";
                txt_numeros.setText(texto3);
            }
        }
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        if (evt.getSource() == Boton6) {
            if (bandera1 == 0) {
                texto += "6";
                txt_numeros.setText(texto);
            } else if (bandera1 == 1) {
                texto2 += "6";
                txt_numeros.setText(texto2);
            } else if (bandera1 == 2) {
                texto3 += "6";
                txt_numeros.setText(texto3);
            }
        }
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        if (evt.getSource() == Boton7) {
            if (bandera1 == 0) {
                texto += "7";
                txt_numeros.setText(texto);
            } else if (bandera1 == 1) {
                texto2 += "7";
                txt_numeros.setText(texto2);
            } else if (bandera1 == 2) {
                texto3 += "7";
                txt_numeros.setText(texto3);
            }
        }
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        if (evt.getSource() == Boton8) {
            if (bandera1 == 0) {
                texto += "8";
                txt_numeros.setText(texto);
            } else if (bandera1 == 1) {
                texto2 += "8";
                txt_numeros.setText(texto2);
            } else if (bandera1 == 2) {
                texto3 += "8";
                txt_numeros.setText(texto3);
            }
        }
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        if (evt.getSource() == Boton9) {
            if (bandera1 == 0) {
                texto += "9";
                txt_numeros.setText(texto);
            } else if (bandera1 == 1) {
                texto2 += "9";
                txt_numeros.setText(texto2);
            } else if (bandera1 == 2) {
                texto3 += "9";
                txt_numeros.setText(texto3);
            }
        }
    }//GEN-LAST:event_Boton9ActionPerformed

    private void BotonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumarActionPerformed
        if (evt.getSource() == BotonSumar) {

            if (bandera1 == 0) {
                if (texto.contains(",")) {
                    valorU = Double.parseDouble(texto.replace(",", ".").trim());
                    texto += " + ";
                    bandera1 = 1;
                    txt_progreso.setText(texto);
                    txt_numeros.setText(texto2);

                } else {
                    if (texto == "") {
                        valor1 = 0;
                        texto += "0 + ";
                    } else {
                        valor1 = Integer.parseInt(texto.trim());
                        texto += " + ";
                    }
                    bandera1 = 1;
                    txt_progreso.setText(texto);
                    txt_numeros.setText(texto2);
                }
            } else if (bandera1 == 1) {

                if (texto2.contains(",")) {
                    valorD = Double.parseDouble(texto2.replace(",", ".").trim());
                    texto2 += " + ";
                    bandera1 = 2;
                    txt_progreso.setText(texto + texto2);
                    txt_numeros.setText(texto3);

                } else {
                    if (texto2 == "") {
                        valor2 = 0;
                        texto2 += "0 + ";
                    } else {
                        valor2 = Integer.parseInt(texto2.trim());
                        texto2 += " + ";
                    }
                    bandera1 = 2;
                    txt_progreso.setText(texto + texto2);
                    txt_numeros.setText(texto3);
                }
            } else if (bandera1 == 2) {

                if (texto3.contains(",")) {
                    valorT = Double.parseDouble(texto3.replace(",", ".").trim());
                    texto3 += "";
                    bandera1 = 3;
                    txt_progreso.setText(texto + texto2 + texto3);
                    txt_numeros.setText("");

                } else {
                    if (texto3 == "") {
                        valor3 = 0;
                        texto3 = "0";
                    } else {
                        valor3 = Integer.parseInt(texto3.trim());
                    }
                    bandera1 = 3;
                    txt_progreso.setText(texto + texto2 + texto3);
                    txt_numeros.setText("");
                }
            }
        }
    }//GEN-LAST:event_BotonSumarActionPerformed

    private void BotonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRestarActionPerformed
        if (evt.getSource() == BotonRestar) {

            if (bandera1 == 0) {
                if (texto.contains(",")) {
                    valorU = Double.parseDouble(texto.replace(",", ".").trim());
                    texto += " - ";
                    bandera1 = 1;
                    txt_progreso.setText(texto);
                    txt_numeros.setText(texto2);

                } else {
                    if (texto == "") {
                        valor1 = 0;
                        texto += "0 - ";
                    } else {
                        valor1 = Integer.parseInt(texto.trim());
                        texto += " - ";
                    }
                    bandera1 = 1;
                    txt_progreso.setText(texto);
                    txt_numeros.setText(texto2);
                }
            } else if (bandera1 == 1) {

                if (texto2.contains(",")) {
                    valorD = Double.parseDouble(texto2.replace(",", ".").trim());
                    texto2 += " - ";
                    bandera1 = 2;
                    txt_progreso.setText(texto + texto2);
                    txt_numeros.setText(texto3);

                } else {
                    if (texto2 == "") {
                        valor2 = 0;
                        texto2 += "0 - ";
                    } else {
                        valor2 = Integer.parseInt(texto2.trim());
                        texto2 += " - ";
                    }
                    bandera1 = 2;
                    txt_progreso.setText(texto + texto2);
                    txt_numeros.setText(texto3);
                }
            } else if (bandera1 == 2) {

                if (texto3.contains(",")) {
                    valorT = Double.parseDouble(texto3.replace(",", ".").trim());
                    texto3 += "";
                    bandera1 = 3;
                    txt_progreso.setText(texto + texto2 + texto3);
                    txt_numeros.setText("");

                } else {
                    if (texto3 == "") {
                        valor3 = 0;
                        texto3 = "0";
                    } else {
                        valor3 = Integer.parseInt(texto3.trim());
                    }
                    bandera1 = 3;
                    txt_progreso.setText(texto + texto2 + texto3);
                    txt_numeros.setText("");
                }
            }
        }
    }//GEN-LAST:event_BotonRestarActionPerformed

    private void BotonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMultiplicarActionPerformed
        if (evt.getSource() == BotonMultiplicar) {

            if (bandera1 == 0) {
                if (texto.contains(",")) {
                    valorU = Double.parseDouble(texto.replace(",", ".").trim());
                    texto += " × ";
                    bandera1 = 1;
                    txt_progreso.setText(texto);
                    txt_numeros.setText(texto2);

                } else {
                    if (texto == "") {
                        valor1 = 0;
                        texto += "0 × ";
                    } else {
                        valor1 = Integer.parseInt(texto.trim());
                        texto += " × ";
                    }
                    bandera1 = 1;
                    txt_progreso.setText(texto);
                    txt_numeros.setText(texto2);
                }
            } else if (bandera1 == 1) {

                if (texto2.contains(",")) {
                    valorD = Double.parseDouble(texto2.replace(",", ".").trim());
                    texto2 += " × ";
                    bandera1 = 2;
                    txt_progreso.setText(texto + texto2);
                    txt_numeros.setText(texto3);

                } else {
                    if (texto2 == "") {
                        valor2 = 0;
                        texto2 += "0 × ";
                    } else {
                        valor2 = Integer.parseInt(texto2.trim());
                        texto2 += " × ";
                    }
                    bandera1 = 2;
                    txt_progreso.setText(texto + texto2);
                    txt_numeros.setText(texto3);
                }
            } else if (bandera1 == 2) {

                if (texto3.contains(",")) {
                    valorT = Double.parseDouble(texto3.replace(",", ".").trim());
                    texto3 += "";
                    bandera1 = 3;
                    txt_progreso.setText(texto + texto2 + texto3);
                    txt_numeros.setText("");

                } else {
                    if (texto3 == "") {
                        valor3 = 0;
                        texto3 = "0";
                    } else {
                        valor3 = Integer.parseInt(texto3.trim());
                    }
                    bandera1 = 3;
                    txt_progreso.setText(texto + texto2 + texto3);
                    txt_numeros.setText("");
                }
            }
        }
    }//GEN-LAST:event_BotonMultiplicarActionPerformed

    private void BotonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDivisionActionPerformed
        if (evt.getSource() == BotonDivision) {

            if (bandera1 == 0) {
                if (texto.contains(",")) {
                    valorU = Double.parseDouble(texto.replace(",", ".").trim());
                    texto += " ÷ ";
                    bandera1 = 1;
                    txt_progreso.setText(texto);
                    txt_numeros.setText(texto2);

                } else {
                    if (texto == "") {
                        JOptionPane.showMessageDialog(null, "Recuerda que ningún número puede ser dividido por 0.");
                    } else {
                        valor1 = Integer.parseInt(texto.trim());
                        texto += " ÷ ";
                        bandera1 = 1;
                        txt_progreso.setText(texto);
                        txt_numeros.setText(texto2);
                    }
                }
            } else if (bandera1 == 1) {
                if (texto2.contains(",")) {
                    valorD = Double.parseDouble(texto2.replace(",", ".").trim());
                    texto2 += " ÷ ";
                    bandera1 = 2;
                    txt_progreso.setText(texto + texto2);
                    txt_numeros.setText(texto3);

                } else {
                    if (texto2 == "") {
                        JOptionPane.showMessageDialog(null, "Recuerda que ningún número puede ser dividido por 0.");
                    } else {
                        valor2 = Integer.parseInt(texto2.trim());
                        texto2 += " ÷ ";
                        bandera1 = 2;
                        txt_progreso.setText(texto + texto2);
                        txt_numeros.setText(texto3);
                    }
                }
            } else if (bandera1 == 2) {

                if (texto3.contains(",")) {
                    valorT = Double.parseDouble(texto3.replace(",", ".").trim());
                    texto3 += "";
                    bandera1 = 3;
                    txt_progreso.setText(texto + texto2 + texto3);
                    txt_numeros.setText("");

                } else {
                    if (texto3 == "") {
                        JOptionPane.showMessageDialog(null, "Recuerda que ningún número puede ser dividido por 0.");
                    } else {
                        valor3 = Integer.parseInt(texto3.trim());
                        bandera1 = 3;
                        txt_progreso.setText(texto + texto2 + texto3);
                        txt_numeros.setText("");
                    }
                }
            }
        }
    }//GEN-LAST:event_BotonDivisionActionPerformed

    private void BotonComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComaActionPerformed
        if (evt.getSource() == BotonComa) {

            if (bandera1 == 0) {
                if (texto.contains(",")) {
                    JOptionPane.showMessageDialog(null, "El valor ya tiene una coma.");
                } else {
                    texto += ",";
                    txt_numeros.setText(texto);
                }
            } else if (bandera1 == 1) {
                if (texto2.contains(",")) {
                    JOptionPane.showMessageDialog(null, "El valor ya tiene una coma.");
                } else {
                    texto2 += ",";
                    txt_numeros.setText(texto2);
                }
            } else if (bandera1 == 2) {
                if (texto3.contains(",")) {
                    JOptionPane.showMessageDialog(null, "El valor ya tiene una coma.");
                } else {
                    texto3 += ",";
                    txt_numeros.setText(texto3);
                }
            }
        }
    }//GEN-LAST:event_BotonComaActionPerformed

    private void BotonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIgualActionPerformed

        String resultado = "";

        if (texto.contains(",") || texto2.contains(",") || texto3.contains(",")) {

            double resultadoF = 0, auxiliar = 0; // 1.582789388 + 582  // Double = 1.582789388 + 582.0

            if (valor1 != 0) {
                valorU = valor1;
            }
            if (valor2 != 0) {
                valorD = valor2;
            }
            if (valor3 != 0) {
                valorT = valor3;
            }

            if (valorT == 0) {
                if (texto.contains("×")) {
                    auxiliar = valorU * valorD;
                } else if (texto.contains("÷")) {
                    auxiliar = valorU / valorD;
                } else if (texto.contains("+")) {
                    auxiliar = valorU + valorD;
                } else if (texto.contains("-")) {
                    auxiliar = valorU - valorD;
                }
                resultado = Double.toString(auxiliar);
                txt_numeros.setText(resultado);
            }
            //auxiliar si funciona y lo de atras tambien

            if (valorT > 0) {

                if (texto.contains("×")) {
                    auxiliar = valorU * valorD;
                } else if (texto.contains("÷")) {
                    auxiliar = valorU / valorD;
                } else if (texto.contains("+")) {
                    auxiliar = valorU + valorD;
                } else if (texto.contains("-")) {
                    auxiliar = valorU - valorD;
                }

                if (texto2.contains("×")) {
                    resultadoF = auxiliar * valorT;
                } else if (texto2.contains("÷")) {
                    resultadoF = auxiliar / valorT;
                } else if (texto2.contains("+")) {
                    resultadoF = auxiliar + valorT;
                } else if (texto2.contains("-")) {
                    resultadoF = auxiliar - valorT;
                }
                resultado = Double.toString(resultadoF);
                txt_numeros.setText(resultado);
            }

        } else {

            long resultadoE = 0, auxiliar = 0;

            if (valor3 == 0) {
                if (texto.contains("×")) {
                    auxiliar = valor1 * valor2;
                } else if (texto.contains("÷")) {
                    auxiliar = valor1 / valor2;
                } else if (texto.contains("+")) {
                    auxiliar = valor1 + valor2;
                } else if (texto.contains("-")) {
                    auxiliar = valor1 - valor2;
                }
                resultado = Long.toString(auxiliar);
                txt_numeros.setText(resultado);
            }
            //auxiliar si funciona y lo de atras tambien

            if (valor3 > 0) {

                if (texto.contains("×")) {
                    auxiliar = valor1 * valor2;
                } else if (texto.contains("÷")) {
                    auxiliar = valor1 / valor2;
                } else if (texto.contains("+")) {
                    auxiliar = valor1 + valor2;
                } else if (texto.contains("-")) {
                    auxiliar = valor1 - valor2;
                }

                if (texto2.contains("×")) {
                    resultadoE = auxiliar * valor3; 
                } else if (texto2.contains("÷")) {
                    resultadoE = auxiliar / valor3;
                } else if (texto2.contains("+")) {
                    resultadoE = auxiliar + valor3;
                } else if (texto2.contains("-")) {
                    resultadoE = auxiliar - valor3;
                }
                resultado = Long.toString(resultadoE);
                txt_numeros.setText(resultado);
            }
        }
    }//GEN-LAST:event_BotonIgualActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton0;
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonComa;
    private javax.swing.JButton BotonDivision;
    private javax.swing.JButton BotonIgual;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonMultiplicar;
    private javax.swing.JButton BotonRestar;
    private javax.swing.JButton BotonSumar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField txt_numeros;
    private javax.swing.JTextField txt_progreso;
    // End of variables declaration//GEN-END:variables

    private void setIconImage(String srcimagesVegettapng) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
