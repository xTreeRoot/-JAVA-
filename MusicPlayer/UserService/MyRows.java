import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
/**
 * @author xuxian.xgy
 * @date 2021年11月05日 15:51
 */
public class MyRows extends Connect implements OurRows {
    @Override
    public Vector getRows() throws SQLException {
        Vector rows = null;
        try {
            PreparedStatement stat = super.conn.prepareStatement("select * from songmessage");//从表中查询歌曲
            ResultSet result1 = stat.executeQuery();
            rows = new Vector();
            ResultSetMetaData rsmd = result1.getMetaData();
            while(result1.next()){

                Vector currentRow = new Vector();
                for(int i = 1; i <= rsmd.getColumnCount(); i++){
                    currentRow.addElement(result1.getString(i));
                }

                rows.addElement(currentRow);
            }

        }
        catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("未成功打开数据库。");
            e.printStackTrace();
        }
        return rows;
    }
    }

