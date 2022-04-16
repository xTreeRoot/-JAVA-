import javax.swing.*;

/**
 * @author xuxian.xgy
 * @date 2021年10月20日 14:59
 */
public class Main {
    public static void main(String[] args) {
          WelJFrame Welcom= new WelJFrame();//打开引导
            Welcom.init();
        try {
            //使用Thread的sleep方法使程序沉睡5秒;  1000ms=1s
            Thread.sleep(3000);
            JOptionPane.showMessageDialog(null, "欢迎使用本软件,本软件仅供学习使用" );
            Welcom.setVisible(false);//隐藏掉首页
            LoginJFrame login = new LoginJFrame();//进入登录页
            login.login();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}
