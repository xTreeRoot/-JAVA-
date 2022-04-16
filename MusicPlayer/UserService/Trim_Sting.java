import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author xuxian.xgy
 * @date 2021年10月28日 15:13
 */
public class Trim_Sting {

    void trim_String(JTextField tx){
        tx.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String white ="";
                tx.setText(white.trim());

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
