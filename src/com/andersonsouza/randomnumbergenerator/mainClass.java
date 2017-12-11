package com.andersonsouza.randomnumbergenerator;

public class mainClass {

    public static void main(String[] args) {
        RandomNumberGenerator randomNumber = new RandomNumberGenerator();
        randomNumber.Generate(1, 60, 6);
//        JFrame jFrame = new JFrame();
//        JPanel jPanel = new JPanel();
//        jFrame.add(jPanel);
//        jPanel.setLayout(new GridBagLayout());
//
//        JTextField jTextFieldFirstNumber = new JTextField(10);
//
//        jPanel.add(jTextFieldFirstNumber);
//
//        jFrame.setName("Ramdom Number Generator");
//        jFrame.setSize(300, 300);
//        jFrame.setVisible(true);
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

//    public void adicionaComponente(int linha, int coluna, int linhas, int colunas, JFrame tela,
//            JComponent componente) {
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.gridy = linha;
//        gbc.gridx = coluna;
//        gbc.gridheight = linhas;
//        gbc.gridwidth = colunas;
//        tela.add(componente, gbc);
//    }
}
