package com.data.data;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class Controller1 {

@RequestMapping("/login")
String login() {
	return("login");
}
@RequestMapping(value = "/loginData",  method = RequestMethod.POST)
  String profile(HttpServletRequest request, 
        @RequestParam(value="mailLogin", required=false) String email, 
        @RequestParam(value="PSWlogin", required=false) String password,Model model){
	
if (email.equals("test@test.com") && password.equals("123456")) 
{
	model.addAttribute("Name1","test1");
	model.addAttribute("Name2","128");
	model.addAttribute("Name3","test@test.com");

	return "profile";}
else if(email.equals("amine@test.com") && password.equals("123456"))
	{
	model.addAttribute("Name1","amine");
	model.addAttribute("Name2","525");
	model.addAttribute("Name3","amine@test.com");	
	
	return "profile";}
else if(email.equals("sao@test.com") && password.equals("123456"))
{
model.addAttribute("Name1","sao Alfa Omar");
model.addAttribute("Name2","23");
model.addAttribute("Name3","sao@test.com");	

return "profile";}
else return "Error";
}
	@RequestMapping("/")
	String affiche() {
	return("index");	
	}
	

}
