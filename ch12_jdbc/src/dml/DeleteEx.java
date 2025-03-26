package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEx {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            con = DriverManager.getConnection(url, user, password);

            String sql = "delete from dept_temp where deptno = 40";
            pstmt = con.prepareStatement(sql);

            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("삭제성공");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
