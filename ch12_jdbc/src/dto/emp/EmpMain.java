package dto.emp;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        int empNo = 0, result = 0, sal = 0;
        EmpDAO eDao = new EmpDAO();
        EmpDTO eDto = new EmpDTO();
        while (run) {
            System.out.println("======================");
            System.out.println("1. 입력");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 전체 조회");
            System.out.println("5. 특정 사원 조회");
            System.out.println("6. 종료");
            System.out.println("======================");

            System.out.print("메뉴 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    eDto = insertInfo(sc);
                    result = eDao.Insert(eDto);
                    System.out.println(result > 0 ? "입력 성공" : "입력 실패");
                    break;
                case 2:
                    eDto = updateInfo(sc);
                    result = eDao.Update(eDto);
                    System.out.println(result > 0 ? "수정 성공" : "수정 실패");
                    break;
                case 3:
                    empNo = deleteInfo(sc);
                    result = eDao.Delet(empNo);
                    System.out.println(result > 0 ? "삭제 성공" : "삭제 실패");
                    break;
                case 4:
                    List<EmpDTO> list = eDao.SelectAll();
                    empPrint(list);
                    break;
                case 5:
                    empNo = getRow(sc);
                    eDto = eDao.Select(empNo);
                    System.out.println(eDto);
                    break;
                case 6:
                    run = false;
                    break;

                default:
                    break;
            }
        }
    }

    public static int deleteInfo(Scanner sc) {
        // 삭제할 empno 입력받은 후 리턴
        System.out.print("삭제 대상 empNo >> ");
        int empNo = Integer.parseInt(sc.nextLine());
        return empNo;
    }

    public static EmpDTO updateInfo(Scanner sc) {
        System.out.print("수정 대상 empNo >> ");
        int empNo = Integer.parseInt(sc.nextLine());
        System.out.print("변경 급여 >> ");
        int sal = Integer.parseInt(sc.nextLine());

        EmpDTO eDto = EmpDTO.builder().empNo(empNo).sal(sal).build();

        return eDto;
    }

    public static void empPrint(List<EmpDTO> eDto) {
        System.out.println("===========================================================================");
        System.out.println("사번  이름  직무  매니저번호  입사일  급여  수당  부서번호 ");
        System.out.println("===========================================================================");
        for (EmpDTO empDTO : eDto) {
            System.out.printf("%d %s %s %d %s %d %d %d\n", empDTO.getEmpNo(), empDTO.getEName(), empDTO.getJob(),
                    empDTO.getMgr(), empDTO.getHireDate(), empDTO.getSal(), empDTO.getComm(), empDTO.getDeptNo());
        }
    }

    public static int getRow(Scanner sc) {
        System.out.print("사번 >> ");
        int empNo = Integer.parseInt(sc.nextLine());
        return empNo;
    }

    public static EmpDTO insertInfo(Scanner sc) {
        System.out.print("사번 >> ");
        int empNo = Integer.parseInt(sc.nextLine());
        System.out.print("이름 >> ");
        String eName = sc.nextLine();
        System.out.print("직무 >> ");
        String job = sc.nextLine();
        System.out.print("매니저 사번 >> ");
        int mgr = Integer.parseInt(sc.nextLine());
        System.out.print("입사일 >> ");
        String hireDate = sc.nextLine();
        System.out.print("급여 >> ");
        int sal = Integer.parseInt(sc.nextLine());
        System.out.print("수당 >> ");
        int comm = Integer.parseInt(sc.nextLine());
        System.out.print("부서 번호 >> ");
        int deptNo = Integer.parseInt(sc.nextLine());

        // Date date = null;
        // try {
        // date = new SimpleDateFormat("yyyy-MM-dd").parse(hireDate);
        // } catch (ParseException e) {
        // e.printStackTrace();
        // }

        EmpDTO eDto = EmpDTO.builder()
                .empNo(empNo)
                .eName(eName)
                .job(job)
                .mgr(mgr)
                .hireDate(hireDate)
                .sal(sal)
                .comm(comm)
                .deptNo(deptNo)
                .build();

        return eDto;
    }

}
