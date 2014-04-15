package com.training.springmvc;

import java.util.List;

public interface MemberService {
	
	public void add(Member member);
	public void remove(String memberName);
	public List<Member> list();

}
