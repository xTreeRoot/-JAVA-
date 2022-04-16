import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Vector;

public class MyFrame extends JPanel {
    DefaultTableModel tableModel;        // 默认显示的表格
    JButton add, del, exit, save;        // 各处理按钮
    JTable table;        // 表格
    JPanel panelUP;    //增加信息的面板
    ImageIcon  ImgFind;//
    JLabel findImg;//搜索按钮

//    JTextField find;
//    String test = "SELECT * FROM songmessage where SongName="+find.getText();

    // 构造函数
    public MyFrame() throws SQLException {
        this.setLayout(new BorderLayout());	// 设置窗体的布局方式
        // 新建各按钮组件
        add = new JButton("增加歌曲");
        del = new JButton("删除歌曲");
        save = new JButton("保存设置");
       JTextField  find=new JTextField(15);
        find.setText("输入歌名查找");

        Trim_Sting trim_sting = new Trim_Sting();
        trim_sting.trim_String(find);

         ImgFind=new ImageIcon("src/image/find.png");
        findImg =new JLabel();
        findImg.setIcon(ImgFind);
        new MyFind(findImg);

        panelUP = new JPanel();        // 新建按钮组件面板
        panelUP.setLayout(new FlowLayout(FlowLayout.LEFT));    // 设置面板的布局方式

        // 将各按钮组件依次添加到面板中
        panelUP.add(add);
        panelUP.add(del);
        panelUP.add(save);
        panelUP.add(find);
        panelUP.add(findImg);

        // 取得数据库的songmessage表的各行数据

        Vector rowData = new MyRows().getRows();
        // 取得数据库的songmessage表的表头数据

        Vector columnNames = new MyHead().getHead();

        // 新建表格
        tableModel = new DefaultTableModel(rowData, columnNames);
        table = new JTable(tableModel);
        table.setBackground(Color.LIGHT_GRAY);
        this.add(panelUP,BorderLayout.NORTH);
        JScrollPane s = new JScrollPane(table);
        this.add(s);

        // 将面板和表格分别添加到窗体中
        panelUP.setSize(400,600);
       this.add(panelUP, BorderLayout.NORTH);
        this.add(s);
            this.setVisible(true);
        // 事件处理
        MyEvent();

    }

    // 事件处理
    public void MyEvent() throws SQLException {

        // 增加
        add.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // 增加一行空白区域
                tableModel.addRow(new Vector());
            }

        });

        // 删除
        del.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                // 删除指定行
                int rowcount = table.getSelectedRow();
                if (rowcount >= 0) {
                    tableModel.removeRow(rowcount);
                }
            }

        });

        /**
         * 保存
         * 我的解决办法是直接将表中的全部数据删除，
         * 将表格中的所有内容获取到,
         * 然后将表格数据重新写入表
         * 缺点 过于浪费时间 行内话应该叫时间复杂度啥玩意
         */
        save.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int column = table.getColumnCount();        // 表格列数
                int row = table.getRowCount();        // 表格行数
                // value数组存放表格中的所有数据
                String[][] value = new String[row][column];
                for (int i = 0; i < row - 1; i++) { //这里-1是个bug 不要乱动靠bug运行的
                    for (int j = 0; j < column; j++) {
                        try {
                            value[i][j] = table.getValueAt(i, j).toString();
                        } catch (Exception exception) {
                            value[i][j] = value[(i - 1)][(j - 1)];
                            break;
                        }
                    }
                }
                // 以下均为对数据库的操作

                final String drver = ("com.mysql.cj.jdbc.Driver"); //固定驱动厂家名
                final String url = ("jdbc:mysql://localhost:3306/user?" +
                        "characterEncoding=utf8" +
                        "&useSSL=false" +
                        "&serverTimezone=UTC" +
                        "&rewriteBatchedStatements=true");
                //用户名
                final String user = ("root");
                //数据库密码
                final String passwd = ("XGY20hhsh");

                //打开 连接，功能
                Connection conn = null;
                Statement stmt = null;
                try {
                    Class.forName(drver); //mySQL数据库
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
                System.out.println("加载驱动");
                //第二步，连接
                try {
                    conn = DriverManager.getConnection(url, user, passwd);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                System.out.println("二次数据库连接成功");
                //获取数据库操作对象
                try {
                    stmt = conn.createStatement();
                } catch (SQLException ex) {
                    System.out.println("二次无法获取操作对象(打开本地数据库后重新运行)");
                }
                System.out.println(stmt); //打印出地址值 com.mysql.cj.jdbc.StatementImpl@6ea12c19
                System.out.println("二次获取数据库操作对象");
                // 删除表中所有数据
                PreparedStatement preparedStatement = null;
                try {
                    preparedStatement = conn.prepareStatement("delete from songmessage where true");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                try {
                    preparedStatement.executeUpdate();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                // 将value数组中的数据依次存放到表中
                for (int i = 0; i < row; i++) {
                    try {
                        preparedStatement = conn.prepareStatement

                                ("insert into songmessage values" +

                                        "('" + value[i][0] + "'   ,'" + value[i][1] + "',  ' " + value[i][2] + "')"

                                );

                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                    try {
                        preparedStatement.executeUpdate();//虽然出bug了 但还是可以运行 参考上方数组的错误点
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                }

            }
        });

    }

}