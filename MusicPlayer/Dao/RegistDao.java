import java.sql.SQLException;

/**
 * @author xuxian.xgy
 * @date 2021年10月24日 20:54
 */
public interface RegistDao {
    //添加一个user对象到数据库
    public  int regist(String username,String passwd) throws SQLException;
}
