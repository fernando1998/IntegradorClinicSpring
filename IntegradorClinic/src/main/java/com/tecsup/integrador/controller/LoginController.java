package com.tecsup.integrador.controller;


import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tecsup.integrador.api.ApiService;
import com.tecsup.integrador.api.ApiServiceGenerator;
import com.tecsup.integrador.api.ResponseMessage;


import com.tecsup.integrador.model.User;
import com.tecsup.integrador.model.UserApi;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	
	@GetMapping("/")
	public String principalPage() {
		
		 logger.info("Devolviendo vista Principal");
			
		return "redirect:/login";
	}
	@GetMapping("/login")
	public String preLogin(HttpSession httpSession) {
		UserApi usuario= (UserApi) httpSession.getAttribute("usuario");
		String vista="";
		
		if(usuario !=null){
			if(usuario.getType().equals("M")){
				vista= "redirect:/medic/menu";
			}
			if(usuario.getType().equals("P")){
				vista="redirect:/user/menu";
			}
			if(usuario.getType().equals("A")){
				vista= "redirect:/admin/menu";
			}
			logger.info("Devolviendo vista usuario en session");
			logger.info("Vista:"+vista);
			return vista;
		}else{
			logger.info("Devolviendo vista Pre-Login");
			
			return "login";
		}
	}

//-----------------------------------------------------------------------------------------------------------
	@PostMapping("/login")
	public String login(final Model model,HttpSession httpSession,
				  @RequestParam(value = "username") String username,
				  @RequestParam(value = "password") String password) throws IOException {
	
		String vista="";
		 logger.info("Devolviendo informacion desde post-Login");
					
	if (username.equals("") || password.equals("")) {
           
           logger.info("username:"+username);
           logger.info("password:"+password);
           logger.info("Campos Vacíos");
           
           //Mensaje en el navegador
           model.addAttribute("message", "Usuario y clave requeridos");
           logger.info("mensajes tipo model:"+model);
           logger.info("Return de tipo Campos vacios");
           vista="login";
           return vista;
	
	}else{
   	logger.info("Api-Login");
   	
   	ApiService service = ApiServiceGenerator.createService(ApiService.class);
    Call<UserApi> call = null;
   	
     call = service.loginUser(username, password);
  	logger.info("valor call:"+call);
	//Mensajes de error o bienvenida
  	
  	
  	Response<UserApi> response=call.execute();
  	
  	 try {
         int statusCode = response.code();
         logger.info("HTTP status code: " + statusCode);
         
         if (response.isSuccessful()) {
        	 
             UserApi usuario = response.body();
             logger.info("responseMessage: " + usuario);
             logger.info("Login correcto");
         
            httpSession.setAttribute("usuario",usuario);
          
           
           if(usuario.getType().equals("P")){
        	   vista="redirect:/user/menu";
               logger.info("View Login:"+vista);
           }
           
           if(usuario.getType().equals("M")){
        	   vista="redirect:/medic/menu";
               logger.info("View Login:"+vista);
           }
           
           	if(usuario.getType().equals("A")){
           		vista="redirect:/admin/menu";
                logger.info("View Login:"+vista);
           }
          
         } else {
             
        	 logger.info("Login incorrecto");
        	 logger.info("onError: " + response.errorBody().string());
        	 
        	model.addAttribute("message", "Username o password incorrectos");
             
        	 //Devolvemos vista
        	 vista="login";
	            logger.info("recibiendo el mensaje:"+ vista);
	         
         }

     }catch (Throwable t) {
         		try {
         			logger.info("Error tipo T");
         			logger.info("onThrowable: " + t.toString());
         			logger.info("onThrowable: " + t.toString(), t);
        	
         			model.addAttribute("message", t.getMessage());
         			vista="login";
        	         
             
         		} catch (Throwable x) {
         					}
     } 
  	
     logger.info("Finalizando Api-Login");
   	 
     return vista;
	
	}
	}
	
	
//------------------------------------------------------------------------------------------------------------	

	  @GetMapping("/logout")
			public String pLogout(HttpSession httpSession) {
		  httpSession.removeAttribute("usuario");
		  logger.info("logout and destroy session");
				return  "redirect:login";
			}
	
	
}