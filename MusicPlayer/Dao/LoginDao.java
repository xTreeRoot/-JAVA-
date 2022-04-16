import java.sql.SQLException;

/**
 * @author xuxian.xgy
 * @date 2021年10月20日 12:02
 */
public interface LoginDao {
    //用户通过username和password登录
    public int login(String username,String password) throws SQLException;

}
