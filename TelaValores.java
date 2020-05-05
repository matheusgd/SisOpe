package operadores;

/**
 * Estrutura de Dados - ED
 * @version 1.0
 * @author Matheus Gonçalves Dias - BSI
 * Sistema Operacional Desenvolvido: Windows 10 Home 64bits
 * IDE: NetBeans 8.1
 * Linguagem: Java 8.1
 * 
 * SisOpe é um programa que tem como entrada dois valoes onde os mesmo terá 
 * uma série de resultados, tais resultados são: Soma, Subtração, Divisão, Resto,
 * Raiz quadrada de ambos valores e raiz cúbica, o programa tem uma interface grafica.
 */
public class TelaValores extends javax.swing.JFrame {

    public TelaValores() { //Construtor
        initComponents();
        lblPainel.setVisible(false); // Esconde o Painel
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        txtNum = new javax.swing.JTextField();
        txtDen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDividir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblPainel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblSoma = new javax.swing.JLabel();
        lblSub = new javax.swing.JLabel();
        lblDiv = new javax.swing.JLabel();
        lblMult = new javax.swing.JLabel();
        lblResto = new javax.swing.JLabel();
        lblRa = new javax.swing.JLabel();
        lblRa2 = new javax.swing.JLabel();
        lblRa3 = new javax.swing.JLabel();
        lblRa4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Valor 1");

        jLabel2.setText("Valor 2");

        btnDividir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calc1.png"))); // NOI18N
        btnDividir.setText("Calcular");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("SisOpe 1.0");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Resultados:");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/math2.png"))); // NOI18N

        jLabel14.setText("Matheus Gonçalves Dias");

        jLabel5.setText("Soma:");

        jLabel6.setText("Subtração:");

        jLabel9.setText("Multiplicação:");

        jLabel3.setText("Divisão:");

        jLabel13.setText("Resto da Divisão:");

        jLabel4.setText("Raiz Quadrada do 1º valor:");

        jLabel7.setText("Raiz Quadrada do 2º valor:");

        jLabel8.setText("Raiz Cúbica do 1º valor:");

        jLabel11.setText("Raizz Cúbica do 2º valor:");

        lblSoma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSoma.setForeground(new java.awt.Color(51, 51, 255));
        lblSoma.setText("0");

        lblSub.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSub.setForeground(new java.awt.Color(51, 51, 255));
        lblSub.setText("0");

        lblDiv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDiv.setForeground(new java.awt.Color(51, 51, 255));
        lblDiv.setText("0");

        lblMult.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMult.setForeground(new java.awt.Color(51, 51, 255));
        lblMult.setText("0");

        lblResto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblResto.setForeground(new java.awt.Color(51, 51, 255));
        lblResto.setText("0");

        lblRa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRa.setForeground(new java.awt.Color(51, 51, 255));
        lblRa.setText("0");

        lblRa2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRa2.setForeground(new java.awt.Color(51, 51, 255));
        lblRa2.setText("0");

        lblRa3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRa3.setForeground(new java.awt.Color(51, 51, 255));
        lblRa3.setText("0");

        lblRa4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRa4.setForeground(new java.awt.Color(51, 51, 255));
        lblRa4.setText("0");

        javax.swing.GroupLayout lblPainelLayout = new javax.swing.GroupLayout(lblPainel);
        lblPainel.setLayout(lblPainelLayout);
        lblPainelLayout.setHorizontalGroup(
            lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblPainelLayout.createSequentialGroup()
                        .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblRa4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRa2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)))
                    .addGroup(lblPainelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblResto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lblPainelLayout.createSequentialGroup()
                            .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(30, 30, 30)
                            .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblSub, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(lblSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lblPainelLayout.createSequentialGroup()
                            .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(lblPainelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblPainelLayout.setVerticalGroup(
            lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblSoma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblSub))
                .addGap(6, 6, 6)
                .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblMult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblDiv))
                .addGap(7, 7, 7)
                .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResto)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblRa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRa2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRa3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRa4)
                    .addComponent(jLabel11))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btnDividir))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {                                           
        /** Método do Botão Calcular, abaixo todos os comandos que serão dados
        logo após o evento ser disparado
        */
        lblPainel.setVisible(true); // Mostra o Painel após clicar no botão
        
        // Adiciona valores da interface em duas variaveis
        int n = Integer.parseInt(txtNum.getText());
        int d = Integer.parseInt(txtDen.getText());
        
        int soma = n + d;
        int sub = n - d;
        int mult = n * d;
        float div = n / d;
        float res = n % d;
        float raiz =(float) Math.sqrt(n);
        float raiz2 = (float) Math.sqrt(d);
        float raiz31 = (float) Math.cbrt(n);
        float raiz32 = (float) Math.cbrt(d);
        
        //Adiciona as variaveis em seus labels
        lblDiv.setText(Float.toString(div));
        lblResto.setText(Float.toString(res));
        lblSub.setText(Float.toString(sub));
        lblSoma.setText(Float.toString(soma));
        lblMult.setText(Float.toString(mult));
        lblRa.setText(String.format("%.2f", raiz)); //Mostra somente duas casas decimais
        lblRa2.setText(String.format("%.2f",raiz2));
        lblRa3.setText(String.format("%.2f",raiz31));
        lblRa4.setText(String.format("%.2f",raiz32));
        
        
    }                                          

    public static void main(String args[]) {
        /* Método principal */
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
            java.util.logging.Logger.getLogger(TelaValores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaValores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaValores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaValores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaValores().setVisible(true);
            }
        });
    }
    
    /** Abaixo, todas as variaveis que foram criadas dentro da inerface*/
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnDividir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDiv;
    private javax.swing.JLabel lblMult;
    private javax.swing.JPanel lblPainel;
    private javax.swing.JLabel lblRa;
    private javax.swing.JLabel lblRa2;
    private javax.swing.JLabel lblRa3;
    private javax.swing.JLabel lblRa4;
    private javax.swing.JLabel lblResto;
    private javax.swing.JLabel lblSoma;
    private javax.swing.JLabel lblSub;
    private javax.swing.JTextField txtDen;
    private javax.swing.JTextField txtNum;
    // End of variables declaration                   
}
