package dto.emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
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

    public List<EmpDTO> SelectAll() {
        con = getConnection();
        String sql = "select * from emp_temp";
        List<EmpDTO> list = new ArrayList<>();
        try {
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // for (EmpDTO eDto : list) {
            // eDto = new EmpDTO();
            // eDto.setEmpNo(rs.getInt("empNo"));
            // eDto.setEName(rs.getString("ename"));
            // eDto.setJob(rs.getString("job"));
            // eDto.setMgr(rs.getInt("mgr"));
            // eDto.setHireDate(rs.getString("hiredate"));
            // eDto.setComm(rs.getInt("comm"));
            // eDto.setDeptNo(rs.getInt("deptno"));
            // eDto.setSal(rs.getInt("sal"));
            // }
            while (rs.next()) {
                EmpDTO eDto = new EmpDTO();
                eDto.setEmpNo(rs.getInt("empNo"));
                eDto.setEName(rs.getString("ename"));
                eDto.setJob(rs.getString("job"));
                eDto.setMgr(rs.getInt("mgr"));
                eDto.setHireDate(rs.getString("hiredate"));
                eDto.setComm(rs.getInt("comm"));
                eDto.setDeptNo(rs.getInt("deptno"));
                eDto.setSal(rs.getInt("sal"));
                list.add(eDto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    public EmpDTO Select(int empNo) {
        con = getConnection();
        String sql = "select * from emp_temp where empno = ?";
        EmpDTO eDto = null;
        EmpDTO eDto1 = null;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, empNo);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                // eDto = new EmpDTO();
                // eDto.setEmpNo(rs.getInt("empNo"));
                // eDto.setEName(rs.getString("ename"));
                // eDto.setJob(rs.getString("job"));
                // eDto.setMgr(rs.getInt("mgr"));
                // eDto.setHireDate(rs.getString("hiredate"));
                // eDto.setComm(rs.getInt("comm"));
                // eDto.setDeptNo(rs.getInt("deptno"));
                // eDto.setSal(rs.getInt("sal"));

                eDto1 = EmpDTO.builder()
                        .empNo(rs.getInt("empNo"))
                        .eName(rs.getString("ename"))
                        .job(rs.getString("job"))
                        .mgr(rs.getInt("mgr"))
                        .hireDate(rs.getString("hiredate"))
                        .sal(rs.getInt("sal"))
                        .comm(rs.getInt("comm"))
                        .deptNo(rs.getInt("deptno"))
                        .build();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return eDto1;
    }

    public int Delet(int empNo) {
        con = getConnection();

        String sql = "delete from emp_temp where empno=?";
        int result = 0;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, empNo);
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }

        return result;

    }

    public int Insert(EmpDTO eDto) {
        con = getConnection();

        String sql = "insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) ";
        sql += "values (?,?,?,?,?,?,?,?)";
        int result = 0;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, eDto.getEmpNo());
            pstmt.setString(2, eDto.getEName());
            pstmt.setString(3, eDto.getJob());
            pstmt.setInt(4, eDto.getMgr());
            pstmt.setString(5, eDto.getHireDate());
            pstmt.setInt(6, eDto.getSal());
            pstmt.setInt(7, eDto.getComm());
            pstmt.setInt(8, eDto.getDeptNo());
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }

        return result;
    }

    public int Update(EmpDTO eDto) {
        con = getConnection();

        String sql = "update emp_temp set sal = ? where empno = ? ";
        int result = 0;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, eDto.getSal());
            pstmt.setInt(2, eDto.getEmpNo());
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }

        return result;
    }
}
