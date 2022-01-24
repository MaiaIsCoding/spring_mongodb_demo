package springhibernate.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springhibernate.app.entity.User;
import springhibernate.app.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home( ) {
		return "index.jsp";
	}
	
	@GetMapping("/list")
	public List<User> listUser() {
		return userService.getAllUsers();
	}
	
    @RequestMapping("/form")
    public String formUser(Model theModel) {
    	User users = new User();
		theModel.addAttribute("user", users);
        return "form-user.jsp";
    }
    
    @PostMapping("/saveUser")
	public String saveUser(@ModelAttribute User users) {
		userService.saveUser(users);
		return "redirect:/";
	}
}
