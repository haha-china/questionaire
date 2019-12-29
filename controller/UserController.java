package com.niit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.buf.Utf8Decoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.JavaScriptUtils;

import com.niit.biz.IUserBiz;
import com.niit.entity.User;

@Controller
@RequestMapping(value="/user")
public class  UserController{
	
	@Resource(name="userBiz")
	private IUserBiz userBiz;
	
    @RequestMapping(value="/login")
	public String login(@RequestParam(value="username") String name,
			            @RequestParam(value="password") String pass,
			            HttpSession session,HttpServletResponse response) throws IOException  {
    	 response.setCharacterEncoding("UTF-8");
    	  response.setContentType("text/html;setchar=UTF-8");
		  System.out.println("-�û���¼-");
		  //�����һ����ͼ,�������÷���ҳ��Ĳ������Լ�ҳ��·��
		System.out.println(name+"--"+pass);
		 PrintWriter out = response.getWriter();
			int id  =	userBiz.findByname(name);
		//����Session
		   if (id != 0 ) {
	            System.out.println("��¼�ɹ�");
	            session.setAttribute("id", id);
	            session.setAttribute("name", name);
	            return "home";
	           

	        } else {
	            System.out.println("��¼ʧ��");
	           
	            out.print("<script>alert('��������ȷ����Ϣ������\\n \\nû���˺���ע�ᣡ')</script>");
	            out.print("<script >window.history.back(-1)</script>");
	            out.flush();
	            out.close();
	            return null;
		  
	        }
    }
    
    @RequestMapping(value="/register")
 	public String register(@RequestParam(value="username") String name,
            			@RequestParam(value="password") String pass,
            HttpSession session,HttpServletResponse response) throws IOException  {
    				User user = new User(name,pass);
    				userBiz.save(user);
			  return "redirect:/login1.jsp";
		
	}
    
    @RequestMapping(value="/getu")
   	public String getuser(HttpSession session) {
   		List<User> list = new ArrayList<User>();
   		list=userBiz.findAll();

   		System.out.println("-------"+list.size());
   		session.setAttribute("user", list);
   		return "view_user";
   	} 
       
    @RequestMapping(value="/register_g")
    public String register_g(@RequestParam(value="username") String name,
               			@RequestParam(value="password") String pass,
               HttpSession session,HttpServletResponse response) throws IOException  {
       				User user = new User(name,pass);
       				userBiz.save(user);
       				return "adduser_g";
   			  
   		
   	}
//    @RequestMapping(value="/delete")
//    public String delete(@RequestParam(value="u_id") Integer userId,
//   HttpSession session,HttpServletResponse response) throws IOException  {
//    	
//    	userBiz.delete(uid);
//    	return "delete";
//    	
//    	
//    }
   
    
}