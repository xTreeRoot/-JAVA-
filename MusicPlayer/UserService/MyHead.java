import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @author xuxian.xgy
 * @date 2021年11月05日 15:57
 */
public class MyHead extends Connect implements OurHead {
    @Override
    public Vector getHead() throws SQLException {
        PreparedStatement stat = conn.prepareStatement("select * from songmessage");
        ResultSet result1 = stat.executeQuery();
        boolean moreRecords = result1.next();
        if (!moreRecords)
            JOptionPane.showMessageDialog(null, "结果集中无记录");
        Vector columnHeads = new Vector();
        ResultSetMetaData rsmd = result1.getMetaData();
        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            columnHeads.addElement(rsmd.getColumnName(i));
        return columnHeads;

    }
}




