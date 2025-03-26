package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEx2 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);
        try {

            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            con = DriverManager.getConnection(url, user, password);

            System.out.print("삭제 부서 입력 >>");
            int input = Integer.parseInt(sc.nextLine());

            String sql = "delete from dept_temp where deptno = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, input);

            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("\n삭제성공");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
                sc.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
