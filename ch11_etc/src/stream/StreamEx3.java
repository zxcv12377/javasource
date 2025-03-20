package stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        // Member => 남자 멤버의 나이 평균
        List<Member> members = Arrays.asList(
                new Member("홍길동", Member.MALE, 30),
                new Member("김나리", Member.FMALE, 20),
                new Member("김정환", Member.MALE, 45),
                new Member("성춘향", Member.FMALE, 27));

        int sum = 0;
        int count = 0;
        for (Member member : members) {
            if (member.getGender() == Member.MALE) {
                sum += member.getAge();
                count++;
            }
        }
        System.out.println(sum / count);

        double ageAvg = members.stream()
                .filter(m -> m.getGender() == Member.MALE)
                .mapToInt(Member::getAge).average().getAsDouble();
        System.out.println(ageAvg);
    }
}
