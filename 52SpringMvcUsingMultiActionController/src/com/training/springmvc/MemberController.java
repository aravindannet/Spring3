package com.training.springmvc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping;
import org.springframework.web.servlet.view.JstlView;

public class MemberController extends MultiActionController {
	
	private MemberService memberService;

	public void setMemberService(MemberService memberService) {
		//BeanNameUrlHandlerMapping
		//ControllerClassNameHandlerMapping
		this.memberService = memberService;
	}
	
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response,Member member) throws Exception{
		
		return new ModelAndView("memberList","members",memberService.list());
		
	}
	
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response,Member member) throws Exception{
		System.out.println("======In add()================");
		memberService.add(member);
		
		return new ModelAndView("memberList","members",memberService.list());
		
	}
	

	public ModelAndView remove(HttpServletRequest request, HttpServletResponse response,Member member) throws Exception{
		String memberName = ServletRequestUtils.getRequiredStringParameter(request, "memberName");
		System.out.println("=============In remove()============");	
		memberService.remove(memberName);
		return new ModelAndView("memberList","members",memberService.list());
		
	}
	
	public ModelAndView list(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("=============In list()============");
			List<Member> members = memberService.list();
			System.out.println("In list...."+members);
			return new ModelAndView("memberList", "members", members);
			}

}
