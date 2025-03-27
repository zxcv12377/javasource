package member;

import java.sql.*;

public class MemberDAO {
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;

    static {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "tiger";

        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public void close(Connection con, PreparedStatement pstmt) {
        try {
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            rs.close();
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int insert(MemberDTO mDto) {
        int result = 0;
        try {
            con = getConnection();
            String sql = "insert into member(id, name, addr, email, age) ";
            sql += "values (?,?,?,?,?)";

            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, mDto.getId());
            pstmt.setString(2, mDto.getName());
            pstmt.setString(3, mDto.getAddr());
            pstmt.setString(4, mDto.getEmail());
            pstmt.setInt(5, mDto.getAge());

            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int update(MemberDTO mDto) {
        int result = 0;

        try {
            con = getConnection();
            String sql = "update member ";
            if (mDto.getAddr() != null) {
                sql += "set addr = ? where id = ?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, mDto.getAddr());
                pstmt.setString(2, mDto.getId());
            } else {
                sql += "set email = ? where id = ?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, mDto.getEmail());
                pstmt.setString(2, mDto.getId());
            }

            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int delete(MemberDTO mDto) {
        int result = 0;
        try {
            con = getConnection();
            String sql = "delete member where id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, mDto.getId());

            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int emailUpdate(MemberDTO mDto) {
        int result = 0;
        try {
            con = getConnection();
            String sql = "update member set email = ? where id = ?";

            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, mDto.getEmail());
            pstmt.setString(2, mDto.getId());

            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }
}
