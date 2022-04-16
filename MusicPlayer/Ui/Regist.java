import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

/**
 * @author xuxian.xgy
 * @date 2021年10月24日 10:12
 */
public class Regist extends LoginJFrame {
    public Regist() {
      super();
        this.setSize(350,250);
    }
    void init(){
        this.setLayout(new GridLayout(3,1));
        JPanel jp2 =new JPanel();
        GridBagLayout  Bid =new   GridBagLayout ();

        jp2.setLayout(Bid);
        ImageIcon backgroundID =new ImageIcon("src/image/login.png");//图片位置
        JLabel Jimg1=new JLabel();
        Jimg1.setIcon(backgroundID);
        Jimg1.setSize(50,50);
        JTextField tid = new JTextField(15);

        tid.setText("请输入要注册的账号");
        tid.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String white ="";
                tid.setText(white.trim());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        tid.setSize(200,50);
        jp2.add(Jimg1);
        jp2.add(tid);
        tid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tid.setText("");
            }
        });

        JPanel jp3=new JPanel();
        GridBagLayout Bwd =new  GridBagLayout();
        jp3.setLayout(Bwd);
        ImageIcon backgroundPasswd =new ImageIcon("src/image/passwd.png");//图片位置
        JLabel Jimg2=new JLabel();
        Jimg2.setIcon(backgroundPasswd);
        Jimg2.setSize(50,50);
        JTextField tPasswd = new JTextField(15);
        tPasswd.setText("请输入密码");
        tPasswd.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String white ="";
                tPasswd.setText(white.trim());

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        tPasswd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tPasswd.setText("");
            }
        });
        tPasswd.setSize(200,50);
        jp3.add(Jimg2);
        jp3.add(tPasswd);

        JPanel jp5=new JPanel();
        FlowLayout login =new  FlowLayout(); //流布局 默认居中 每个组件有5像素的间隔
        jp5.setLayout(login);
        ImageIcon loginImg=new ImageIcon("src/image/loging.png");
        JButton btn1 = new JButton();

        btn1.setIcon(loginImg);
        btn1.setText("注册");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("账号:"+tid.getText()+"\n"+
                        "密码:"+tPasswd.getText() );
                try {
                    //账户查询
                    UserRegist Regsit = new UserRegist();
                    Regsit.regist(tid.getText(),tPasswd.getText());

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        btn1.setPreferredSize(new Dimension(180,30));

        jp2.setBackground(Color.WHITE);
        jp3.setBackground(Color.WHITE);
        jp5.setBackground(Color.WHITE);

        jp5.add(new JLabel(""),BorderLayout.WEST);
        jp5.add(btn1,BorderLayout.CENTER);
        jp5.add(new JLabel(""),BorderLayout.EAST);

        this.add(jp2);
        this.add(jp3);
        this.add(jp5);
        this.setVisible(true);
    }
}
