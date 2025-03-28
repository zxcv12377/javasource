package member;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.emp.EmpDTO;

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
            String sql = "insert into member(no,id, name, addr, email, age) ";
            sql += "values (member_seq.nextval,?,?,?,?,?)";

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

    public int delete(String str) {
        int result = 0;
        try {
            con = getConnection();
            String sql = "delete from member where id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, str);

            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public MemberDTO Select(String str) {
        MemberDTO eDto1 = null;
        try {
            con = getConnection();
            String sql = "Select * from member where id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, str);

            rs = pstmt.executeQuery();
            if (rs.next()) {
                eDto1 = MemberDTO.builder()
                        .no(rs.getInt("no"))
                        .id(rs.getString("id"))
                        .name(rs.getString("name"))
                        .addr(rs.getString("addr"))
                        .email(rs.getString("email"))
                        .age(rs.getInt("age"))
                        .build();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return eDto1;
    }

    public List<MemberDTO> allSelect() {
        List<MemberDTO> list = new ArrayList<>();
        MemberDTO dto = null;
        try {
            con = getConnection();
            String sql = "Select * from member";
            pstmt = con.prepareStatement(sql);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                dto = new MemberDTO();
                dto.setNo(rs.getInt("no"));
                dto.setId(rs.getString("id"));
                dto.setName(rs.getString("name"));
                dto.setAddr(rs.getString("addr"));
                dto.setEmail(rs.getString("email"));
                dto.setAge(rs.getInt("age"));
                list.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    // select * from member where name like '%홍%'
    public List<MemberDTO> nameSelect(String name) {
        List<MemberDTO> list = new ArrayList<>();

        try {
            con = getConnection();
            String sql = "select * from member where name like ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + name + "%");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                MemberDTO dto = new MemberDTO();
                dto.setNo(rs.getInt("no"));
                dto.setId(rs.getString("id"));
                dto.setName(rs.getString("name"));
                dto.setAddr(rs.getString("addr"));
                dto.setEmail(rs.getString("email"));
                dto.setAge(rs.getInt("age"));
                list.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }
}
