package view;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
     public static void main(String[] args) {
        Main main = new Main();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("WhatsApp Web");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BorderLayout());
        
        JPanel panel1 = main.criaContatos(main);        
        JPanel panel2 = main.criaConversa(main);
        
        panelMain.add(panel1, BorderLayout.WEST);
        panelMain.add(panel2, BorderLayout.CENTER);

        frame.add(panelMain);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel criaContatos(Main main){       
        JPanel panelContatos = new JPanel();
        panelContatos.setLayout(new BorderLayout());
        panelContatos.add(main.criaContatoCabecalho(), BorderLayout.NORTH);
        panelContatos.add(main.criaContatoCentro(), BorderLayout.CENTER);
        
        return panelContatos;
    }
    
    private JPanel criaConversa(Main main){        
        JButton jb3 = new JButton("CENTER");
        
        JPanel panelConversa = new JPanel();
        panelConversa.setLayout(new BorderLayout());
        panelConversa.add(main.criaConversaCabecalho(), BorderLayout.NORTH);
        panelConversa.add(main.criaConversaRodape(), BorderLayout.SOUTH);
        panelConversa.add(jb3, BorderLayout.CENTER);

        return panelConversa;
    }
    
    private JPanel criaContatoCentro(){
        JPanel panelConversa = new JPanel();
        panelConversa.setLayout(new BorderLayout());
        
        JPanel panelPesquisa = new JPanel();
        panelPesquisa.setLayout(new BorderLayout());
        
        JPanel panelLupa = new JPanel();
        panelLupa.setLayout(new BorderLayout());
        JButton jbLupa = new JButton("Lupa");
        panelLupa.add(jbLupa);
        
        JPanel panelTexto = new JPanel();
        JTextField jtPesquisa = new JTextField("Pesquisa aqui");
        panelTexto.add(jtPesquisa);
        
        panelPesquisa.add(panelLupa, BorderLayout.LINE_START);
        panelPesquisa.add(panelTexto, BorderLayout.LINE_END);
        
        JPanel panelLista = new JPanel();
        panelLista.setLayout(new BorderLayout());
        JButton jbX1 = new JButton("NORTH");
        panelLista.add(jbX1);
        
        panelConversa.add(panelPesquisa, BorderLayout.NORTH);
        panelConversa.add(panelLista, BorderLayout.CENTER);
        
        return panelConversa;
    }
    
    private JPanel criaContatoCabecalho(){
        JPanel panelCabecalho = new JPanel();
        panelCabecalho.setLayout(new BorderLayout());
        
        JPanel panelCabecalho1 = new JPanel();
        JButton jbX1 = new JButton("NORTH");
        panelCabecalho1.add(jbX1);
        
        JPanel panelCabecalho3 = new JPanel();
        JButton jbX3 = new JButton("NORTH3");
        panelCabecalho3.add(jbX3);
        
        panelCabecalho.add(panelCabecalho1, BorderLayout.LINE_START);
        panelCabecalho.add(panelCabecalho3, BorderLayout.LINE_END);
        
        return panelCabecalho;
    }
    
    private JPanel criaConversaCabecalho(){
        JPanel panelCabecalho = new JPanel();
        panelCabecalho.setLayout(new BorderLayout());
        
        JPanel panelCabecalho1 = new JPanel();
        JButton jbX1 = new JButton("NORTH");
        panelCabecalho1.add(jbX1);
        
        JPanel panelCabecalho2 = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panelCabecalho2, BoxLayout.Y_AXIS);
        panelCabecalho2.setLayout(boxLayout);
        JLabel jbNomeConversa = new JLabel("João Gabriel");
        JLabel jbDescricaoConversa = new JLabel("Visto por último em 25/03/2019 ás 19:41hs");
        panelCabecalho2.add(jbNomeConversa);
        panelCabecalho2.add(jbDescricaoConversa);
        
        JPanel panelCabecalho3 = new JPanel();
        JButton jbX3 = new JButton("NORTH3");
        panelCabecalho3.add(jbX3);
        
        panelCabecalho.add(panelCabecalho1, BorderLayout.LINE_START);
        panelCabecalho.add(panelCabecalho2, BorderLayout.CENTER);
        panelCabecalho.add(panelCabecalho3, BorderLayout.LINE_END);
        
        return panelCabecalho;
    }
    
    private JPanel criaConversaRodape(){
        JPanel panelCabecalho = new JPanel();
        panelCabecalho.setLayout(new BorderLayout());
        
        JPanel panelCabecalho1 = new JPanel();
        JButton jbX1 = new JButton("NORTH");
        panelCabecalho1.add(jbX1);
        
        JPanel panelCabecalho2 = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panelCabecalho2, BoxLayout.Y_AXIS);
        panelCabecalho2.setLayout(boxLayout);
        JTextField jbNomeConversa = new JTextField("Olá professor!");
        panelCabecalho2.add(jbNomeConversa);
        
        JPanel panelCabecalho3 = new JPanel();
        JButton jbX3 = new JButton("NORTH3");
        panelCabecalho3.add(jbX3);
        
        panelCabecalho.add(panelCabecalho1, BorderLayout.LINE_START);
        panelCabecalho.add(panelCabecalho2, BorderLayout.CENTER);
        panelCabecalho.add(panelCabecalho3, BorderLayout.LINE_END);
        
        return panelCabecalho;
    }
}
