package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectEx4 {
    public static void main(String[] args) {
        // 드라이버 로드
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            // connection 객체 생성
            // jdbc:oracle:thin: => 오라클 연결문자열
            // @
            // loocalhost => 내컴퓨터(127.0.0.1)
            // 1521 => 오라클 서버 포트번호
            // xe => 오라클 DB명
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            con = DriverManager.getConnection(url, user, password);

            if (con != null) {
                // System.out.println("연결!");
                // System.out.print("조회항 사원 번호 입력 : ");
                // int empno = Integer.parseInt(sc.nextLine());
                // 사원별 부서정보 조회 + 급여가 2500 이하 + 사원번호 9999 이하 조회
                String sql = "SELECT E.EMPNO ,E.DEPTNO, E.SAL ,D.DNAME, D.LOC ";
                sql += "FROM EMP E, DEPT D  ";
                sql += "WHERE E.DEPTNO = D.DEPTNO AND E.SAL <= 2500 AND E.EMPNO <= 9999";
                pstmt = con.prepareStatement(sql);
                // pstmt.setInt(1, empno);
                // Query 수행
                rs = pstmt.executeQuery();

                // ResultSet 객체로부터 데이터 추출
                while (rs.next()) {// 7369
                    int empno = rs.getInt(1);
                    int deptno = rs.getInt("deptno");
                    int sal = rs.getInt("sal");
                    String dname = rs.getString("dname");
                    String loc = rs.getString("loc");
                    // int mgr = rs.getInt("mgr");
                    // String hireDate = rs.getString("hiredate");
                    // int comm = rs.getInt("comm");

                    System.out.printf("%d  %d  %d  %s  %s\n", empno, deptno, sal, dname, loc);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
