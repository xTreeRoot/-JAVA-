package test;

/**
 * @author xuxian.xgy
 * @date 2021年10月22日 16:31
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;

public class JTreeDemo
{
    public static void main(String[] agrs)
    {
        JFrame frame=new JFrame("我的歌单");
        frame.setSize(330,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new JTreeDemo().createComponent());
        frame.pack();
        frame.setVisible(true);
    }
    private JPanel createComponent()
    {
        JPanel panel=new JPanel();
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("教师学历信息");
        ArrayList<String> t1=new ArrayList<>();
        t1.add("爱情买卖");
        t1.add("爱如潮水");
        String Teachers[][]=new String[3][];
        Teachers[0]=new String[]{"王鹏","李曼","韩小国","穆保龄","尚凌云","范超峰"};
        Teachers[1]=new String[]{"胡会强","张春辉","宋芳","阳芳","朱山根","张茜","宋媛媛"};
        Teachers[2]=new String[]{"刘丹","张小芳","刘华亮","聂来","吴琼"};
        String gradeNames[]={"硕士学历","博士学历","博士后学历"};
        DefaultMutableTreeNode node=null;
        DefaultMutableTreeNode childNode=null;
        int length=0;
        for(int i=0;i<3;i++)
        {
            length=Teachers[i].length;
            node=new DefaultMutableTreeNode(gradeNames[i]);
            for (int j=0;j<length;j++)
            {
                childNode=new DefaultMutableTreeNode(Teachers[i][j]);
                node.add(childNode);
            }
            root.add(node);
        }
        JTree tree=new JTree(root);
        panel.add(tree);
        panel.setVisible(true);
        return panel;
    }
}
