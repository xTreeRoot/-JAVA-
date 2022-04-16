import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author xuxian.xgy
 * @date 2021年11月08日 0:03
 */
public class MyFind extends JPanel {
    public  MyFind(JLabel Img ) {
        Img.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new InnerShow();
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


}

}
