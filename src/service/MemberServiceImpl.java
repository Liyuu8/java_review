package service;

import java.util.ArrayList;

import entity.Member;

public class MemberServiceImpl implements MemberService {

    private static MemberServiceImpl singleton = new MemberServiceImpl();

    private MemberServiceImpl() {};

    public static MemberServiceImpl getInstance() {
        return singleton;
    }

    @Override
    public String greet(int i) {
        String[] greetings = {"Good Morning", "Hello", "Good evening"};
        return greetings[i];
    }

    @Override
    public ArrayList<Member> getAll() {
        ArrayList<Member> list = new ArrayList<>();
        Member member1 = new Member(1, "Linda", "linda@example.com");
        Member member2 = new Member(2, "James", "james@example.com");
        list.add(member1);
        list.add(member2);

        return list;
    }

    @Override
    public int sumOf(int min, int max) {
        int sum = 0;
        for(int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }
}