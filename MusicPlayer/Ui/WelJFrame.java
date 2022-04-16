import javax.swing.*;
import java.awt.*;

/**
 * @author xuxian.xgy
 * @date 2021年10月20日 13:35
 */
public class WelJFrame extends  MyPage {

    public WelJFrame() {
      super();

    }

    void init() {
           /*
            框架JFrame中的层次结构。
            JFrame中的层次分布及相对关系是:最底层是：JRootPane；
            第二层是：JlayerPane；
            最上层就是ContentPane,也正是我们常说的内容面板。
            所以一般我们拖放的控件就是在ContentPane层上
     */
        ImageIcon img = new ImageIcon("src/image/b212.jpg");
        //要设置的背景图片
        JLabel imgLabel = new JLabel(img);
        //将背景图放在标签里。
        this.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
        //将背景标签添加到jframe的LayeredPane面板里。核心代码
        imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        // 设置背景标签的位置
        Container contain = this.getContentPane();
        ((JPanel) contain).setOpaque(false);
        // 将内容面板设为透明。将LayeredPane面板中的背景显示出来。
        // contain.setLayout(new FlowLayout());
        this.setVisible(true);

    }



}

