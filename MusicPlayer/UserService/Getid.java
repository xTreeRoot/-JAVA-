import javax.swing.*;

/**
 * @author xuxian.xgy
 * @date 2021年10月28日 16:11
 */
public class Getid {
    JTextField jt =new JTextField();

    public JTextField getJt() {
        return jt;
    }

    public void setJt(JTextField jt) {
        this.jt = jt;
    }

    public static void main(String[] args) {
        System.out.println(
               new LoginJFrame().login());
    }
}
