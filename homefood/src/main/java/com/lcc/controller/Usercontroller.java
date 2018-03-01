package com.lcc.controller;
import com.alibaba.fastjson.*;

import com.lcc.pojo.User;
import com.lcc.service.IUserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hehe")
public class Usercontroller {

	@Resource
	private IUserService userService;

	@RequestMapping("/wqnmlgb")
	public  ResponseEntity<String> toIndex(HttpServletRequest request,Model model){
		//11
		
		System.out.println("<---------进入控制器--------->");
		//int userId = Integer.parseInt(request.getParameter("id"));
		System.out.println("<---------error--------->");
		User user = this.userService.getUserById(1);
		String strJson=JSON.toJSONString(user);
		ResponseEntity<String> userEntity = new ResponseEntity<String>(strJson,HttpStatus.OK);
		//model.addAttribute("user", user);
		return userEntity;
	}
	
	@RequestMapping(value = "/wqnmlgb2", method = RequestMethod.POST, consumes = "application/json")
	public  ResponseEntity<String> toIndex2(@RequestBody String data){
		System.out.println("<---------进入控制器--------->");
		//int userId = Integer.parseInt(request.getParameter("id"));
		System.out.println("<---------error--------->");
		//User user = this.userService.getUserById(1);
		//String strJson=JSON.toJSONString("1");
		ResponseEntity<String> userEntity = new ResponseEntity<String>("Testdata",HttpStatus.OK);
		//model.addAttribute("user", user);
		return userEntity;
	}
}


/*
*//**
 * Servlet implementation class Usercontroller
 *//*
@WebServlet("/Usercontroller")
public class Usercontroller extends HttpServlet implements IUserService {
	private static final long serialVersionUID = 1L;
       
    *//**
     * @see HttpServlet#HttpServlet()
     *//*
    public Usercontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	*//**
     * @see IUserService#getUserById(int)
     *//*
    public User getUserById(int userId)  { 
         // TODO Auto-generated method stub
			return null;
    }

	*//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	*//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}*/
