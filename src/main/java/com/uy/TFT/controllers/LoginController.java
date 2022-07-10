package com.uy.TFT.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.uy.TFT.models.LoginUser;
import com.uy.TFT.models.User;
import com.uy.TFT.services.UserService;


@Controller
public class LoginController {

	@Autowired
	private UserService userServ;
	
	@GetMapping("/register")
	public String Signup(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "register.jsp";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "login.jsp";
	}

	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {
		userServ.register(newUser, result);
		if (result.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser());
			return "register.jsp";
		}
		session.setAttribute("user_id", newUser.getId());
		return "redirect:/home";
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model,
			HttpSession session) {
		User user = userServ.login(newLogin, result);
		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "login.jsp";
		}
		session.setAttribute("user_id", user.getId());
		return "redirect:/home";
	}

	// SUCCESS ROUTE
	@GetMapping("/home")
	public String home(HttpSession s, Model model) {
		// retrieve what is in session
		Long userID = (Long) s.getAttribute("user_id");
		// route guard
		// check if userId is or is not null
		if (userID == null) {
			return "redirect:/";

		} else {
			User thisUser = userServ.findOne(userID);
			System.out.println(thisUser);
			model.addAttribute("name", thisUser.getUserName());
			return "home.jsp";
		}
	}

	// logout
	@GetMapping("/logout")
	public String logout(HttpSession s) {
		s.invalidate();
		return "redirect:/";
	}
	

}
