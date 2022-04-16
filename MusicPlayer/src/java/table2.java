import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.awt.Label.CENTER;

/**
 * @author xuxian.xgy
 * @date 2021年10月22日 13:53
 */
public class table2 extends JFrame {
    public table2() {

        List<String> song = new ArrayList<>();
        song.add("A");
        song.add("B");
        song.add("C");
        song.add("D");
        System.out.println(song);
        int c = song.indexOf("C");
        JLabel label = new JLabel(song.get(c), CENTER);

    }
}
