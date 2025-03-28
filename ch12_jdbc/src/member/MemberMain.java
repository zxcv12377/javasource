package member;

import java.util.ArrayList;
import java.util.List;
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
                    result = mDao.delete(util.memberDeleteInfo(sc));
                    util.printSuccessMessage(result);
                    break;
                case 4:
                    String input = util.memberSelect(sc);
                    // regex(정규식)
                    // input.matches(regex);
                    if (input.matches("^[A-Za-z].*") == true) {
                        MemberDTO row = mDao.Select(input);
                        if (row != null) {
                            util.memberPrint(row);
                        }
                    } else {
                        List<MemberDTO> list = mDao.nameSelect(input);
                        if (!list.isEmpty()) {
                            util.memberAllSelect(list);
                        }
                    }
                    break;
                case 5:
                    util.memberAllSelect((mDao.allSelect()));
                    break;
                case 6:
                    run = false;
                    break;
                case 7:
                    util.memberAllSelect(mDao.nameSelect(util.memberSelect(sc)));
                    break;
                default:
                    break;
            }
        }
    }
}
