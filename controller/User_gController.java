package com.niit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.biz.IUserBiz;
import com.niit.biz.IUser_gBiz;
@Controller
@RequestMapping(value="/user_g")
public class User_gController {

		@Resource(name="user_gBiz")
		private IUser_gBiz user_gBiz;
		
	    @RequestMapping(value="login_g")
		public String login_g(@RequestParam(value="username") String name_g,
				            @RequestParam(value="password") String pass_g,
				            HttpSession session,HttpServletResponse response) throws IOException  {
	    	 response.setCharacterEncoding("UTF-8");
	    	  response.setContentType("text/html;setchar=UTF-8");
	    	  System.out.println("-����Ա��¼-");
			  //�����һ����ͼ,�������÷���ҳ��Ĳ������Լ�ҳ��·��
			System.out.println(name_g+"--"+pass_g);
			 PrintWriter out = response.getWriter();
				int id_g  =	user_gBiz.findByname(name_g);
			//����Session
			   if (id_g != 0 ) {
		            System.out.println("��¼�ɹ�");
		            session.setAttribute("id_g", id_g);
		            return "home1";
		           

		        } else {
		            System.out.println("��¼ʧ��");
		           
		            out.print("<script>alert('��������ȷ����Ϣ������\\n \\nû���˺���ע�ᣡ')</script>");
		            out.print("<script >window.history.back(-1)</script>");
		            out.flush();
		            out.close();
		            return null;
			  
		        }
			
	    	  
	    	  
}
	}
