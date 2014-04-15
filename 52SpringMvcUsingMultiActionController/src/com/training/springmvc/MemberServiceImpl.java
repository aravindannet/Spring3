package com.training.springmvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MemberServiceImpl implements MemberService {
	private Map<String, Member> members= new TreeMap<String, Member>();

	public void add(Member member) {
		members.put(member.getName(),member);
		System.out.println(members);

	}

	public List<Member> list() {
		
		return new ArrayList<Member>(members.values());
	}

	public void remove(String memberName) {
			members.remove(memberName);
		
	}

}
