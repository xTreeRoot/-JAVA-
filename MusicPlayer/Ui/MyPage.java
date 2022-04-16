import javax.swing.*;
import java.awt.*;

/**
 * @author xuxian.xgy
 * @date 2021年10月24日 10:14
 */
public class MyPage  extends  JFrame{
    public MyPage() {
        this.setTitle("倾听");
    /*
    Toolkit
    这是一个AWT工具箱。
    它提供对本地GUI最低层次的JAVA访问。
    在大多情况下，这个类不直接用在小应用程序或应用程序中。
    具有把行图形数据转换为可显示的图像、返回字体信息、得出显示尺寸和分辨率以及获得系统属性信息的方法。
    */
        //获取工具包
        Toolkit took = Toolkit.getDefaultToolkit();
        //设置图片
        Image image = took.getImage("src/image/logo.png");
        //设置窗口图标
        setIconImage(image);
        // 设置窗体居中显示
        setResizable(false); // 设置最大化按钮不能用
        this.setLocation(300, 100);
        this.setSize(800, 600); //设置成图片大小 xx*xx
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
