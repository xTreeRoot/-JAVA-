import java.sql.SQLException;
import java.util.Vector;

/**
 * @author xuxian.xgy
 * @date 2021年11月05日 15:49
 */
public interface OurRows {
    //用户获得表数据
    public Vector getRows() throws SQLException;
}
