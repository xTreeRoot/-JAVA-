import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author xuxian.xgy
 * @date 2021年10月24日 23:12
 */
public class UserName extends  Connect implements  UserNameDao{
    @Override
    public void getName(String username,String passwd) throws SQLException {
        String insertSql = null;

        PreparedStatement stat = super.conn.prepareStatement("select * from usermessage where username=? and passwd=?");
        stat.setString(1, username);
        stat.setString(2, passwd);
        ResultSet rs = stat.executeQuery();
        if (rs.next()) {
            String username1 = rs.getString("username");

        }

    }
}
