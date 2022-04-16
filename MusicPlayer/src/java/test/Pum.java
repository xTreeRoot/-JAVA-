package test;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author xuxian.xgy
 * @date 2021年10月22日 10:20
 */
public class Pum {
    public Pum() {
        onclick();
    }
    private void onclick(){
        JFrame jframe = new JFrame("弹出式菜单");//窗口
        jframe.setBounds(250, 300, 300, 250);

        JPopupMenu jpopupmenu1 = new JPopupMenu();   //弹出式菜单

        JMenuItem add = new JMenuItem("新建歌单");
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        JMenuItem remove = new JMenuItem("删除菜单");
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        jpopupmenu1.add(add);   //弹出式菜单添加一个菜单项
        jpopupmenu1.add(remove);   //弹出式菜单添加一个菜单项

        class mouselistener implements MouseListener
        {
            JPopupMenu jpopupmenu2;  //一个弹出式菜单对象
            mouselistener(JPopupMenu jpopupmenu)   //构造函数
            {
                jpopupmenu2 = jpopupmenu;
            }
            //自己写的一个显示的方法
            public void display(MouseEvent e)
            {
                if(e.isPopupTrigger())
                {
                    jpopupmenu2.show(e.getComponent(), e.getX(),e.getY());
                }
            }
            public void mouseReleased(MouseEvent e)
            {
                this.display(e);
            }
            public void mousePressed(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseClicked(MouseEvent e){}
        }

        jframe.addMouseListener(new mouselistener(jpopupmenu1));  //是主窗口响应鼠标事件


        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭时操作
        jframe.setVisible(true);   //设置可见
    }


}
