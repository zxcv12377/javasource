package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import dto.DeptDTO;

public class InsertEx2 {

    /**
     * @param args
     */
    private static Scanner sc = new Scanner(System.in);

    public static DeptDTO data(Scanner sc) {
        System.out.println("----- dept 테이블 데이터 입력 ------");
        System.out.println("deptno >> ");
        int deptno = Integer.parseInt(sc.nextLine());
        System.out.println("dname >> ");
        String dname = sc.nextLine();
        System.out.println("loc >> ");
        String loc = sc.nextLine();

        DeptDTO dto = new DeptDTO(deptno, dname, loc);

        return dto;
    }

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            con = DriverManager.getConnection(url, user, password);

            DeptDTO dto = data(sc);

            String sql = "insert into dept_temp(deptno, dname, loc) values(?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, dto.getDeptnop());
            pstmt.setString(2, dto.getDname());
            pstmt.setString(3, dto.getLoc());

            int result = pstmt.executeUpdate();

            System.out.println(result > 0 ? "입력성공" : "입력실패");

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
