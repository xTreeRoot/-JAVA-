import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

/**
 * @author xuxian.xgy
 * @date 2021年11月04日 16:10
 */
public class RowDeleteDemo extends JFrame
{
    private JPanel contentPane;
    private JTable table;
    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        RowDeleteDemo frame = new RowDeleteDemo();
        frame.setVisible(true);
    }
    /**
     * Create the frame.
     */
    public RowDeleteDemo()
    {
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowActivated(WindowEvent e)
            {
                do_this_windowActivated(e);
            }
        });
        setTitle("图书信息表");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,200);
        contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);
        JPanel panel=new JPanel();
        contentPane.add(panel,BorderLayout.SOUTH);
        JButton button=new JButton("删除");
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                do_button_actionPerformed(e);
            }
        });
        panel.add(button);
        JScrollPane scrollPane=new JScrollPane();
        contentPane.add(scrollPane,BorderLayout.CENTER);
        table=new JTable();
        table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        scrollPane.setViewportView(table);
    }


    protected void do_this_windowActivated(WindowEvent e)
    {
        DefaultTableModel tableModel=(DefaultTableModel) table.getModel();    //获得表格模型
        tableModel.setRowCount(0);    //清空表格中的数据
        Vector<String> array =new Vector<>();
        array.add("ID");
        array.add("name");
        array.add("singer");
        tableModel.setColumnIdentifiers(new Object[]{"ID","歌曲名","歌手信息"});    //设置表头
        for (int i = 0; i < 10; i++) {
            tableModel.addRow(array);
        }


        table.setRowHeight(30);
        table.setModel(tableModel);    //应用表格模型
    }
    protected void do_button_actionPerformed(ActionEvent e)
    {
        DefaultTableModel model=(DefaultTableModel) table.getModel();    //获得表格模型
        int[] selectedRows=table.getSelectedRows();
        for(int i=selectedRows[0];i<selectedRows.length;i++)
        {
            model.removeRow(selectedRows[0]);
        }
        table.setModel(model);
    }
}

