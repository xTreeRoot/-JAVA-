import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

/**
 * @author xuxian.xgy
 * @date 2021年10月20日 14:56
 */
public class Home extends MyPage {
    private JPanel jPanel;
    private JPanel jPanel2;
    String username = "默认用户";

    public Home() {
        super();
    }

    public void init() throws SQLException {

        JPanel jpTop = new JPanel();
        jpTop.setLayout(new GridLayout(1, 5));
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
        final String a = "用户:";
        JLabel laA = new JLabel(a);

        laA.setBackground(Color.RED);
        JLabel laUsername = new JLabel(username);
        jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));


        //折出空间
        JLabel find = new JLabel();
        JLabel findImg = new JLabel();


        JPanel skinP = new JPanel();
        skinP.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        ImageIcon ImgSkin = new ImageIcon("src/image/skin.png");
        JLabel skin = new JLabel();

        skin.setIcon(ImgSkin);
        JLabel skinText = new JLabel("<-点击更换皮肤");

        jPanel.add(laA);
        jPanel.add(laUsername);
        jpTop.add(jPanel);
        jPanel2.add(find);
        jPanel2.add(findImg);
        jpTop.add(jPanel2);
        skinP.add(skin);
        skinP.add(skinText);
        jpTop.add(skinP);

        JPanel jPanel2Left = new MyFrame();

        new PupMenu().onclick(jPanel2Left); //弹出式菜单安置在Jlable上

        JPanel jpBot = new JPanel();
        jpBot.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 0));

        ImageIcon back = new ImageIcon("src/image/back.png");
        JLabel labBack = new JLabel();
        labBack.setIcon(back);


        ImageIcon play = new ImageIcon("src/image/play.png");
        JLabel labPlay = new JLabel();
        labPlay.setIcon(play);

        new Player().played(labPlay);//调用解码 ..仅解码 不作播放

        ImageIcon step = new ImageIcon("src/image/step.png");
        JLabel labStep = new JLabel();
        labStep.setIcon(step);

        jpBot.add(labBack);
        jpBot.add(labPlay);
        jpBot.add(labStep);

        //调用换色的方法
        colorDialog colordialog = new colorDialog();
        colordialog.color(skinText, jpTop, jPanel2, jPanel, skinP, laA, jPanel2Left, skinText, labBack, labPlay, labStep, jpBot);

        //frame边框borderlayout布局
        this.add(jpTop, BorderLayout.NORTH);
//        this.add(jpLeft,BorderLayout.WEST);
        this.add(jPanel2Left, BorderLayout.CENTER);
        this.add(jpBot, BorderLayout.SOUTH);
        this.setVisible(true);
    }

}