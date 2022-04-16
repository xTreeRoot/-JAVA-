package test;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 * @author xuxian.xgy
 * @date 2021年10月22日 11:13
 */
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JLabel;

public class table {
    List<String> list = new ArrayList<>(Arrays.asList("A",
            "B", "C", "D", "E"));

    int index = list.indexOf("C");
    JLabel label = new JLabel(list.get(index), JLabel.CENTER);

    private void display() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.add(new JButton(new AbstractAction("<Prev") {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (--index < 0) {
                    index = list.size() - 1;
                }
                update();
            }
        }), BorderLayout.LINE_START);
        f.add(label);
        f.add(new JButton(new AbstractAction("Next>") {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (++index == list.size()) {
                    index = 0;
                }
                update();
            }
        }), BorderLayout.LINE_END);
        f.pack();
        f.setVisible(true);
    }

    private void update() {
        label.setText(list.get(index));
    }

    public static void main(String[] args) {
        new table().display();
    }
}

