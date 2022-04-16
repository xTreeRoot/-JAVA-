import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author xuxian.xgy
 * @date 2021年10月30日 13:10
 */
public class RegistMyClick {
    public void Onclick(JLabel regist){
        regist.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Regist regist = new Regist();
                regist.init();
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
