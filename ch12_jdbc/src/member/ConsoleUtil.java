package member;

import java.util.Scanner;

public class ConsoleUtil {

    public MemberDTO memberInsertInfo(Scanner sc) {
        MemberDTO memberDTO = new MemberDTO();
        System.out.println();
        System.out.println("====== 회원정보 입력화면");
        System.out.print("아이디 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("이름 >> ");
        memberDTO.setName(sc.nextLine());
        System.out.print("주소 >> ");
        memberDTO.setAddr(sc.nextLine());
        System.out.print("이메일 >> ");
        memberDTO.setEmail(sc.nextLine());
        System.out.print("나이 >> ");
        memberDTO.setAge(Integer.parseInt(sc.nextLine()));

        return memberDTO;
    }

    public MemberDTO memberUpdateMenu(Scanner sc) {
        System.out.println("========= 회원 정보 수정 =========");
        System.out.println("1. 주소 수정");
        System.out.println("2. 이메일 수정");
        System.out.println("==================================");
        System.out.println("번호 입력 >> ");
        int no = Integer.parseInt(sc.nextLine());

        if (no == 1)
            return memberUpdateAddr(sc);
        else if (no == 2)
            return memberUpdateEmail(sc);
        return null;
    }

    public MemberDTO memberUpdateAddr(Scanner sc) {
        MemberDTO memberDTO = new MemberDTO();
        System.out.println();
        System.out.println("========= 수정 정보 입력화면 =========");
        System.out.print("아이디 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("변경 주소 >> ");
        memberDTO.setAddr(sc.nextLine());
        return memberDTO;

    }

    public MemberDTO memberUpdateEmail(Scanner sc) {
        MemberDTO memberDTO = new MemberDTO();
        System.out.println();
        System.out.println("========= 수정 정보 입력화면 =========");
        System.out.print("아이디 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("변경 이메일 >> ");
        memberDTO.setEmail(sc.nextLine());
        return memberDTO;
    }

    public MemberDTO memberDeleteInfo(Scanner sc) {
        // 행을 삭제
        MemberDTO memberDTO = new MemberDTO();
        System.out.println();
        System.out.println("====== 회원정보 입력화면");
        System.out.print("아이디 >> ");
        memberDTO.setId(sc.nextLine());

        return memberDTO;
    }

    // 성공시 출력
    public void printSuccessMessage(int result) {
        System.out.println(result > 0 ? "입력 성공" : "입력 실패");
    }

    public void printUpdateSuccessMessage(int result, String id) {
        System.out.println(result > 0 ? id + "님의 정보를 수정하였습니다." : id + "님의 정보 수정에 실패하였습니다.");
    }

}
