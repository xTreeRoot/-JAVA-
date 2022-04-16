import java.sql.SQLException;

/**
 * @author xuxian.xgy
 * @date 2021年10月24日 23:10
 */
public interface UserNameDao {
    //添加一个user对象到数据库
    public void getName(String username,String passwd) throws SQLException;
}
