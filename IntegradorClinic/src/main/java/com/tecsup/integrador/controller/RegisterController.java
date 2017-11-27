package com.tecsup.integrador.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tecsup.integrador.api.ApiService;
import com.tecsup.integrador.api.ApiServiceGenerator;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import com.tecsup.integrador.api.ResponseMessage;
import com.tecsup.integrador.model.UserApi;
@Controller
public class RegisterController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);
	
	
	@GetMapping("/user_register")
	public String preRegister() {
		
		 logger.info("Devolviendo vista Register");
		
		return "user_register";
	}
	
	@PostMapping("/user_register")
	public String login(final Model model,
				  @RequestParam(value = "username") String username,
				  @RequestParam(value = "password") String password,@RequestParam(value="type")String type) throws IOException {
		
		 logger.info("Devolviendo informacion desde post-Register");
		 String vista="";
		 String typeApi="";
		 Date fecha = new Date();
		 
			if (username.equals("") || password.equals("")){
		           
		           logger.info("Campos Vacíos");
		           
		           //Mensaje en el navegador
		           model.addAttribute("message", "Campos requeridos");
		           vista="user_register";
		           return vista;
		         
			}else{
			logger.info("type:"+type);
			logger.info("uss:"+username);
			logger.info("password:"+password);
			
			if(type.equals("Paciente")){
				typeApi="P";
			}else{
				typeApi="M";
			}
			logger.info("typeApi:"+typeApi);
			
			String fechaUser=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(fecha);
			logger.info("fechaNueva:"+fechaUser);
			
			
			ApiService service = ApiServiceGenerator.createService(ApiService.class);
	        Call<ResponseMessage> call = null;

	            // Si no se incluye imagen hacemos un envío POST simple
	            call = service.createUsuario(username, password,typeApi,fechaUser);
	            
	            Response<ResponseMessage> response=call.execute();
	            try {

                    int statusCode = response.code();
                    logger.info("HTTP status code: " + statusCode);

                    if (response.isSuccessful()) {

                        ResponseMessage responseMessage = response.body();
                        logger.info("responseMessage: " + responseMessage);
                        logger.info("responseMessage 2: " + responseMessage.getMessage());
                        logger.info("Usuario creado Satisfactoriamente");
                        vista="redirect:/login";
                    } else {
                    	logger.info("onError: " + response.errorBody().string());
                       // throw new Exception("Error en el servicio");
                    	logger.info("Error en la creación");
                    	 model.addAttribute("message", "Usurname en uso, escoja otro");
                    	vista="user_register";
                    }

                } catch (Throwable t) {
                    try {
                    	logger.info("onThrowable: " + t.toString(), t);
                    	logger.info("msg 2:"+ t.getMessage());
                    	model.addAttribute("message", "error type "+t.getMessage());
                    	vista="user_register";
                    } catch (Throwable x) {
                    }
                }   
			}
	            
		
		return vista;
	}
	
	


}
