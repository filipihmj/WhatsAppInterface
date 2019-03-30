package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
     public static void main(String[] args) {
        Main main = new Main();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("WhatsApp Web");
        frame.setMinimumSize(new Dimension(1000, 700));
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
        panelContatos.add(main.criaContatoCentro(main), BorderLayout.CENTER);
        
        return panelContatos;
    }
    
    private JPanel criaConversa(Main main){              
        JPanel panelConversa = new JPanel();
        panelConversa.setLayout(new BorderLayout());
        panelConversa.add(main.criaConversaCabecalho(), BorderLayout.NORTH);
        panelConversa.add(main.criaConversaRodape(), BorderLayout.SOUTH);
        panelConversa.add(main.criaConversaCentro(), BorderLayout.CENTER);

        return panelConversa;
    }
    
    private JPanel criaContatoCentro(Main main){
        JPanel panelConversa = new JPanel();
        panelConversa.setLayout(new BorderLayout());
        
        panelConversa.add(main.criaContatoCentroPesquisa(), BorderLayout.NORTH);
        panelConversa.add(main.criaContatoCentroConversas(main), BorderLayout.CENTER);
        
        return panelConversa;
    }
    
    private JPanel criaContatoCentroPesquisa(){
        JPanel panelPesquisa = new JPanel();
        panelPesquisa.setBorder(BorderFactory.createMatteBorder (0, 0, 1, 0, Color.LIGHT_GRAY));
        panelPesquisa.setLayout(new BorderLayout());
        
        JPanel panelLupa = new JPanel();
        panelLupa.setLayout(new BorderLayout());
        JLabel jlLupa = new JLabel(new ImageIcon(getClass().getResource("icones//lupa.png")));
        jlLupa.setBorder(null);
        panelLupa.add(jlLupa);
        
        JPanel panelTexto = new JPanel();
        JTextField jtPesquisa = new RoundJTextField(30);
        jtPesquisa.setPreferredSize(new Dimension(300, 25));
        panelTexto.add(jtPesquisa);
        
        panelPesquisa.add(panelLupa, BorderLayout.LINE_START);
        panelPesquisa.add(panelTexto, BorderLayout.CENTER);
        return panelPesquisa;
    }
    
    private JPanel criaContatoCentroConversas(Main main){
        JPanel panelListaConversas = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panelListaConversas, BoxLayout.Y_AXIS);
        panelListaConversas.setLayout(boxLayout);
        
        //Conversa 1
        JPanel panelConversa1 = main.criaContatoConversa("João Gabriel", "Fez trabalho?", "22:26");
        panelConversa1.setBackground(Color.LIGHT_GRAY);
        panelListaConversas.add(panelConversa1);
        
        //Conversa 2
        JPanel panelConversa2 = main.criaContatoConversa("Maria", "Oi", "19:26");
        panelListaConversas.add(panelConversa2);
        
        //Conversa 3
        JPanel panelConversa3 = main.criaContatoConversa("Futebol das Quintas", "Confirmado!", "13:00");
        panelListaConversas.add(panelConversa3);
        
        //Conversa 4
        JPanel panelConversa4 = main.criaContatoConversa("Mauricio", "Hahahah", "10:26");
        panelListaConversas.add(panelConversa4);
        
        //Conversa 5
        JPanel panelConversa5 = main.criaContatoConversa("Carlos", "Dai", "Ontem");
        panelListaConversas.add(panelConversa5);
        
        //Conversa 6
        JPanel panelConversa6 = main.criaContatoConversa("Trabalho", "+55 48 9999-9999 saiu", "Ontem");
        panelListaConversas.add(panelConversa6);
        
        //Conversa 7
        JPanel panelConversa7 = main.criaContatoConversa("Pedro", "Falou", "Sábado");
        panelListaConversas.add(panelConversa7);
        
        //Conversa 8
        JPanel panelConversa8 = main.criaContatoConversa("Márcia", "Tudo certo!", "Sexta-Feira");
        panelListaConversas.add(panelConversa8);
        
        return panelListaConversas;
    }
    
    private JPanel criaContatoConversa(String nome, String descricao, String horario){
        JPanel panelConversa = new JPanel();
        panelConversa.setPreferredSize(new Dimension(350, 50));
        panelConversa.setLayout(new BorderLayout());
        
        JPanel panelConversa1 = new JPanel();
        panelConversa1.setBackground(Color.WHITE);
        JLabel jlLogo = new JLabel(new ImageIcon(getClass().getResource("icones//fotoPadrao.png")));
        jlLogo.setSize(50, 50);
        jlLogo.setBorder(null);
        panelConversa1.add(jlLogo);
        
        JPanel panelConversa2 = new JPanel();
        panelConversa2.setBackground(Color.WHITE);
        panelConversa2.setBorder(BorderFactory.createMatteBorder (0, 0, 1, 0, Color.LIGHT_GRAY));
        BoxLayout boxLayout = new BoxLayout(panelConversa2, BoxLayout.Y_AXIS);
        panelConversa2.setLayout(boxLayout);
        JLabel jlNomeConversa = new JLabel("<html><p style='padding-top: 10px; font-family: \"Helvetica Neue\";font-size: 11px;'>"+nome+"<p></html>");
        JLabel jlDescricaoConversa = new JLabel("<html><p style='color:gray;font-family: \"Helvetica Neue\";'>"+descricao+"<p></html>");
        
        panelConversa2.add(jlNomeConversa);
        panelConversa2.add(jlDescricaoConversa);
        
        JPanel panelConversa3 = new JPanel();
        panelConversa3.setBackground(Color.WHITE);
        panelConversa3.setBorder(BorderFactory.createMatteBorder (0, 0, 1, 0, Color.LIGHT_GRAY));
        JLabel jlHorario = new JLabel("<html><p style='color:gray;font-family: \"Helvetica Neue\";'>"+horario+"<p></html>");
        panelConversa3.add(jlHorario);
        
        panelConversa.add(panelConversa1, BorderLayout.LINE_START);
        panelConversa.add(panelConversa2, BorderLayout.CENTER);
        panelConversa.add(panelConversa3, BorderLayout.LINE_END);
        return panelConversa;
    }
    
    private JPanel criaContatoCabecalho(){
        JPanel panelCabecalho = new JPanel();
        panelCabecalho.setLayout(new BorderLayout());
        
        JPanel panelCabecalho1 = new JPanel();
        JLabel jlFoto = new JLabel(new ImageIcon(getClass().getResource("icones//fotoPadraoMini.png")));
        jlFoto.setBorder(null);
        panelCabecalho1.add(jlFoto);
        
        JPanel panelCabecalho3 = new JPanel();
        JLabel jlMenu = new JLabel(new ImageIcon(getClass().getResource("icones//menu.png")));
        jlMenu.setBorder(null);
        JLabel jlStatus = new JLabel(new ImageIcon(getClass().getResource("icones//status.png")));
        jlStatus.setBorder(null);
        JLabel jlNovaConversa = new JLabel(new ImageIcon(getClass().getResource("icones//novaConversa.png")));
        jlNovaConversa.setBorder(null);
        panelCabecalho3.add(jlStatus);
        panelCabecalho3.add(jlNovaConversa);
        panelCabecalho3.add(jlMenu);
        
        panelCabecalho.add(panelCabecalho1, BorderLayout.LINE_START);
        panelCabecalho.add(panelCabecalho3, BorderLayout.LINE_END);
        
        return panelCabecalho;
    }
    
    private JPanel criaConversaCabecalho(){
        JPanel panelCabecalho = new JPanel();
        panelCabecalho.setLayout(new BorderLayout());
        
        JPanel panelCabecalho1 = new JPanel();
        JLabel jlFoto = new JLabel(new ImageIcon(getClass().getResource("icones//fotoPadraoMini.png")));
        jlFoto.setBorder(null);
        panelCabecalho1.add(jlFoto);
        
        JPanel panelCabecalho2 = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panelCabecalho2, BoxLayout.Y_AXIS);
        panelCabecalho2.setLayout(boxLayout);
        JLabel jbNomeConversa = new JLabel("<html><p style='padding-top: 7px; font-family: \"Helvetica Neue\";font-size: 11px;'>João Gabriel<p></html>");
        JLabel jbDescricaoConversa = new JLabel("<html><p style='font-family: \"Helvetica Neue\";font-size: 8px;color: gray;'>Online<p></html>");
        panelCabecalho2.add(jbNomeConversa);
        panelCabecalho2.add(jbDescricaoConversa);
        
        JPanel panelCabecalho3 = new JPanel();
        JLabel jlMenu = new JLabel(new ImageIcon(getClass().getResource("icones//menu.png")));
        jlMenu.setBorder(null);
        JLabel jlAnexo = new JLabel(new ImageIcon(getClass().getResource("icones//anexo.png")));
        jlAnexo.setBorder(null);
        JLabel jlLupa = new JLabel(new ImageIcon(getClass().getResource("icones//lupa.png")));
        jlLupa.setBorder(null);
        panelCabecalho3.add(jlLupa);
        panelCabecalho3.add(jlAnexo);
        panelCabecalho3.add(jlMenu);

        panelCabecalho.add(panelCabecalho1, BorderLayout.LINE_START);
        panelCabecalho.add(panelCabecalho2, BorderLayout.CENTER);
        panelCabecalho.add(panelCabecalho3, BorderLayout.LINE_END);
        
        return panelCabecalho;
    }
    
    private JPanel criaConversaCentro(){
        JPanel panelCentro = new JPanel();
        panelCentro.setLayout(new BorderLayout());
        JLabel jlFundo = new JLabel();
        jlFundo.setOpaque(true);
        jlFundo.setBackground(Color.LIGHT_GRAY);
        panelCentro.add(jlFundo);
        
        
        
        
        return panelCentro;
    }
    
    private JPanel criaConversaRodape(){
        JPanel panelCabecalho = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panelCabecalho, BoxLayout.X_AXIS);
        panelCabecalho.setLayout(boxLayout);
        
        JPanel panelCabecalho1 = new JPanel();
        JLabel jlEmoticon = new JLabel(new ImageIcon(getClass().getResource("icones//emoticons.png")));
        jlEmoticon.setBorder(null);
        panelCabecalho1.add(jlEmoticon);
        
        JPanel panelCabecalho2 = new JPanel();
        JTextField jbNomeConversa = new RoundJTextField(50);
        jbNomeConversa.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        panelCabecalho2.add(jbNomeConversa);
        
        JPanel panelCabecalho3 = new JPanel();
        JLabel jlMicrofone = new JLabel(new ImageIcon(getClass().getResource("icones//microfone.png")));
        jlMicrofone.setBorder(null);
        panelCabecalho3.add(jlMicrofone);
        
        panelCabecalho.add(panelCabecalho1, BorderLayout.LINE_START);
        panelCabecalho.add(panelCabecalho2, BorderLayout.CENTER);
        panelCabecalho.add(panelCabecalho3, BorderLayout.LINE_END);
        
        return panelCabecalho;
    }
}
