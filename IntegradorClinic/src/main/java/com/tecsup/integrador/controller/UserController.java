package com.tecsup.integrador.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;


import com.tecsup.integrador.model.User;
import com.tecsup.integrador.model.UserApi;
import com.tecsup.integrador.services.UserService;



@Controller
public class UserController {
	
private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/admin/menu")
	public String menu(HttpSession httpSession) {
		UserApi usuario= (UserApi) httpSession.getAttribute("usuario");
		
		if(usuario !=null){
			logger.info("user Admin:"+usuario);
			return "/admin/menu";
			
		}else{
			return "redirect:/login";
		}

	}
	
	@GetMapping("/user/menu")
	public String menUsu(HttpSession httpSession) {
		UserApi usuario= (UserApi) httpSession.getAttribute("usuario");
		if(usuario !=null){
			logger.info("user Paciente:"+usuario);
			return "/user/menu";
		}else{
			return "redirect:/login";
		}
	}
	
	@GetMapping("/medic/menu")
	public String menMedic(HttpSession httpSession) {
		
		UserApi usuario= (UserApi) httpSession.getAttribute("usuario");
		if(usuario !=null){
			logger.info("user Doctor:"+usuario);
			
			return "/medic/menu";
		}else{
			return "redirect:/login";
		}
	}
	

	
	
	
	@GetMapping("/admin/emp/list")
	public String list(@ModelAttribute("SpringWeb") User user, ModelMap model) {

		try {
			model.addAttribute("users", userService.findAll());
		} catch (Exception e) {
			logger.info(e.getMessage());
			model.addAttribute("message", e.getMessage());
		}

		return "admin/emp/list";
	}
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@GetMapping("/{user_id}")
	public ModelAndView home(@PathVariable int user_id, ModelMap model) {

		ModelAndView modelAndView = null;
		User emp = new User();
		try {
			emp = userService.find(user_id);
			logger.info(emp.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		modelAndView = new ModelAndView("home", "command", emp);

		return modelAndView;
	}

}
