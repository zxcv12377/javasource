package member;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberDAO mDao = new MemberDAO();
        MemberDTO mDto = null;
        ConsoleUtil util = new ConsoleUtil();

        boolean run = true;
        while (run) {
            System.out.println("================ Member ================");
            System.out.println("1. member 추가");
            System.out.println("2. member 수정");
            System.out.println("3. member 삭제");
            System.out.println("4. member 조회");
            System.out.println("5. member 전체 조회");
            System.out.println("6. 종료");
            System.out.println("========================================");

            System.out.print("메뉴 선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());
            int result = 0;
            switch (menu) {
                case 1:
                    mDto = util.memberInsertInfo(sc);
                    result = mDao.insert(mDto);
                    util.printSuccessMessage(result);
                    break;
                case 2:
                    mDto = util.memberUpdateMenu(sc);
                    if (mDto != null) {
                        result = mDao.update(mDto);
                    }
                    util.printUpdateSuccessMessage(result, mDto.getId());
                    break;
                case 3:
                    mDto = util.memberDeleteInfo(sc);
                    result = mDao.delete(mDto);
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    run = false;
                    break;

                default:
                    break;
            }
        }
    }
}
