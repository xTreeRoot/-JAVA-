import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author xuxian.xgy
 * @date 2021年10月24日 20:59
 */
public class UserLogin extends Connect implements LoginDao {

    @Override
    public int login(String username, String passwd) throws SQLException {
        //账号对比
        PreparedStatement stat = super.conn.prepareStatement("select * from usermessage where username=? and passwd=?");
        stat.setString(1, username);
        stat.setString(2, passwd);
        ResultSet rs = stat.executeQuery();
        if (rs.next()) {
            String username1 = rs.getString("username");
            String password2 = rs.getString("passwd");
            Home home = new Home();
            home.init();
            new Home().username=username1;
        } else {
            JOptionPane.showMessageDialog(null, "该账户已存在或账号错误" );

        }
        return 0;
    }

}
