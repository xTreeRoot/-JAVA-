import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class LoginJFrame extends MyPage  {

    public LoginJFrame(){
        super();
        this.setSize(350,500);
    }

    public String login() {
         JTextField tid = new JTextField(15);
        this.setLayout(new GridLayout(7,1));
        JPanel jp1 =new JPanel();
        GridLayout style =new  GridLayout(1,3,0,0);
        jp1.setLayout(style);
        JLabel span1 =new JLabel("");
        JLabel id =new JLabel("账号登录");
        JLabel iphone =new JLabel("手机号登录");
        JLabel span3 =new JLabel("");
        jp1.add(span1);
        jp1.add(id);
        jp1.add(iphone);
        jp1.add(span3);


        JPanel jp2 =new JPanel();
        GridBagLayout  Bid =new   GridBagLayout ();
        jp2.setLayout(Bid);
        ImageIcon backgroundID =new ImageIcon("src/image/login.png");//图片位置
        JLabel Jimg1=new JLabel();
        Jimg1.setIcon(backgroundID);
        Jimg1.setSize(50,50);

        tid.setText("请输入账号");
        tid.setSize(200,50);
        jp2.add(Jimg1);
        jp2.add(tid);
        //调用清除空白字段方法
        Trim_Sting trim_sting = new Trim_Sting();
         trim_sting.trim_String(tid);

        JPanel jp3=new JPanel();
        GridBagLayout Bwd =new  GridBagLayout();
        jp3.setLayout(Bwd);
        ImageIcon backgroundPasswd =new ImageIcon("src/image/passwd.png");//图片位置
        JLabel Jimg2=new JLabel();
        Jimg2.setIcon(backgroundPasswd);
        Jimg2.setSize(50,50);
        JTextField tPasswd = new JTextField(15);
        tPasswd.setText("请输入密码");


//调用清除空白字段方法
       trim_sting.trim_String(tPasswd);
        tPasswd.setSize(200,50);
        jp3.add(Jimg2);
        jp3.add(tPasswd);



        JPanel jp4=new JPanel();
        BorderLayout fxk =new BorderLayout(1,3);
        jp3.setLayout(Bwd);
         JCheckBox jcb1= new JCheckBox("记住密码",true);
        JCheckBox jcb2= new JCheckBox("自动登录",true);
        JLabel label1 = new JLabel("忘记密码");
        jp4.add(jcb1);
        jp4.add(jcb2);
        jp4.add(label1);



        JPanel jp5=new JPanel();
        FlowLayout login =new  FlowLayout(); //流布局 默认居中 每个组件有5像素的间隔
        jp5.setLayout(login);
        ImageIcon loginImg=new ImageIcon("src/image/loging.png");
        JButton btn1 = new JButton();

        btn1.setIcon(loginImg);
        btn1.setText("登录");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("账号:"+tid.getText()+"\n"+
                        "密码:"+tPasswd.getText() );
                try {
                    //账户查询
                    UserLogin Login = new UserLogin();
                    Login.login(tid.getText(),tPasswd.getText());

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        btn1.setPreferredSize(new Dimension(180,30));
            //设置按钮大小

        jp5.add(new JLabel(""),BorderLayout.WEST);
        jp5.add(btn1,BorderLayout.CENTER);
        jp5.add(new JLabel(""),BorderLayout.EAST);

        JPanel jp8=new JPanel();
        GridLayout span =new  GridLayout(1,1);
        jp8.setLayout(span);
        jp8.add(new JLabel(""));

        JPanel jp6=new JPanel();
        GridLayout forget =new  GridLayout(1,1,0,0);
        jp6.setLayout(forget);
        JLabel label2 = new JLabel("没有账号,立即注册");
        //调用注册方法
       new RegistMyClick().Onclick(label2);
        jp6.add(label2);
        JPanel jp7=new JPanel();
        GridLayout yes =new  GridLayout(1,3);
        jp7.setLayout(yes);
        JCheckBox ty =new JCheckBox("同意",true);
        JLabel xieyi = new JLabel("《倾听用户同意协议》");
        xieyi.setSize(100,100);
        JLabel zhengce = new JLabel("《隐私政策》");
        jp7.add(ty);
        jp7.add(xieyi);
        jp7.add(zhengce);



        jcb1.setBackground(Color.WHITE);
        jcb2.setBackground(Color.white);
        ty.setBackground(Color.WHITE);
        jp1.setBackground(Color.WHITE);
        jp2.setBackground(Color.WHITE);
        jp3.setBackground(Color.WHITE);
        jp4.setBackground(Color.WHITE);
        jp5.setBackground(Color.WHITE);
        jp6.setBackground(Color.WHITE);
        jp7.setBackground(Color.WHITE);

        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.add(jp4);
        this.add(jp5);
        this.add(jp6);
        this.add(jp7);

         this.setVisible(true);
        return  tid.getText();


    }

}
