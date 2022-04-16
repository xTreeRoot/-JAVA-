import java.sql.*;

/**
 * @author xuxian.xgy
 * @date 2021年10月18日 17:20
 */
public class Connect {
    final String drver = ("com.mysql.cj.jdbc.Driver"); //固定驱动厂家名
    final String url = ("jdbc:mysql://localhost:3306/user?" +
            "characterEncoding=utf8" +
            "&useSSL=false" +
            "&serverTimezone=UTC" +
            "&rewriteBatchedStatements=true");
    //用户名
    final String user = ("root");
    //数据库密码
    final String passwd = ("XGY20hhsh");

    //打开 连接，功能
    Connection conn = null;
    Statement stmt = null;


    public Connect() {
        jdbc();
    }

    public void jdbc(){
                //第一步，注册，加载驱动
            try {
                Class.forName(drver); //mySQL数据库
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            System.out.println("加载驱动");
                //第二步，连接
            try {
                conn = DriverManager.getConnection(url, user, passwd);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("数据库连接成功");
                //获取数据库操作对象
            try {
                stmt= conn.createStatement();
            } catch (SQLException ex) {
                System.out.println("无法获取操作对象(打开本地数据库后重新运行)");
            }
            System.out.println(stmt); //打印出地址值 com.mysql.cj.jdbc.StatementImpl@6ea12c19
                System.out.println("获取数据库操作对象");
            }

            }


