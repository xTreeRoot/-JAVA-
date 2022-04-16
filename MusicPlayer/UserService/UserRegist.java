import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author xuxian.xgy
 * @date 2021年10月24日 21:02
 */
public class UserRegist extends  Connect implements RegistDao {
    @Override
    public int regist(String username, String passwd) throws SQLException {
        //增
        String insertSql = null;

        PreparedStatement stat = super.conn.prepareStatement("select * from usermessage where username=? and passwd=?");
        stat.setString(1, username);
        stat.setString(2, passwd);
        ResultSet rs = stat.executeQuery();
        if (rs.next()) {
            String username1 = rs.getString("username");
            JOptionPane.showMessageDialog(null, "账号已经被注册啦" );

        } else {
            //账号相同 则不写入数据库
            JOptionPane.showMessageDialog(null, "正在注册账号" );
            insertSql = "INSERT INTO usermessage(username, passwd) VALUES('" + username + "', '" + passwd + "')";
            int count = stmt.executeUpdate(insertSql); //返回值是影响了多少条数据
            JOptionPane.showMessageDialog(null, "注册了"+count+"个新账号" );

        }

    return  0;
    }
}