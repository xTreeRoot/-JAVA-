import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class colorDialog extends MyPage {
public colorDialog(){
    super();

}

public void color(JLabel j0, JPanel j1, JPanel j2, JPanel j3, JPanel j4, JLabel j5, JPanel jtable, JLabel jback, JLabel jplay, JLabel jstep, JLabel labStep, JPanel myplay)  {
    j0.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            Color color = JColorChooser.showDialog(null,
                    "换肤板",
                    j1.getBackground());
            if (color != null) {
                j2.setBackground(color);
                j3.setBackground(color);
                j4.setBackground(color);
                j5.setBackground(color);
                jback.setBackground(color);
                jplay.setBackground(color);
                jstep.setBackground(color);
                myplay.setBackground(color);
                jtable.setBackground(color);


            }
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
    setBounds(100, 100, 400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
//    public void color(JLabel j0,JPanel j1,JPanel j2,JPanel j3,JPanel j4,JLabel j5) {
//        j0.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                Color color = JColorChooser.showDialog(null,
//                        "换肤板",
//                        j1.getBackground());
//                if (color != null) {
//                    j2.setBackground(color);
//                    j3.setBackground(color);
//                    j4.setBackground(color);
//                    j5.setBackground(color);
//
//
//                }
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//
//            }
//        });
//        setBounds(100, 100, 400, 400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    }

//Jtable的颜色
//    public void color(JLabel j0,JPanel jtable) {
//        j0.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                Color color = JColorChooser.showDialog(null,
//                        "换肤板",
//                        jtable.getBackground());
//                if (color != null) {
//                    jtable.setBackground(color);
//
//
//                }
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//
//            }
//        });
//        setBounds(100, 100, 400, 400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        this.setVisible(true);
//    }
//
//
//    //播放部分
//    public void color(JLabel j0,JLabel jback,JLabel jplay ,JLabel jstep , JPanel  myplay) {
//        j0.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                Color color = JColorChooser.showDialog(null,
//                        "换肤板",
//                        myplay.getBackground());
//                if (color != null) {
//                    jback.setBackground(color);
//                    jplay.setBackground(color);
//                    jstep.setBackground(color);
//                    myplay.setBackground(color);
//                }
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//
//            }
//        });
//        setBounds(100, 100, 400, 400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        this.setVisible(true);
//    }
}