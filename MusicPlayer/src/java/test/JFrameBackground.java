package test;

import javax.swing.*;


/**
 * @author xuxian.xgy
 * @date 2021年10月20日 15:18
 */
public class JFrameBackground  {
    private static JFrame frame;

    public static void main(String[] args) {



    //加载背景图片
    ImageIcon bg=new ImageIcon("src/image/logo.png");
    //把背景图片显示在一个标签
    JLabel label=new JLabel(bg);
    //把标签的大小位置设置为图片刚好填充整个面
    label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
    //添加图片到frame的第二层
            frame.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));

        //获取frame的最上层面板为了设置其背景颜色(JPanel有设置透明的方法)
        JPanel jp=(JPanel)frame.getContentPane();
        jp.setOpaque(false);//设置透明
//测试用的JPanel

        JPanel panel=new JPanel();
        panel.setOpaque(false);//也要让他透明
        panel.setLayout(null);//为了使用按钮的定位
        JButton button=new JButton("OK");
        button.setSize(100,20);
        button.setLocation(100,50);
        panel.add(button);
        frame.add(panel);}
}