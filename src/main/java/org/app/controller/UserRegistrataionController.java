package org.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.app.dao.UserDao;
import org.app.model.User;

@Controller
public class UserRegistrataionController {

	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView userRegistration(@RequestParam("userId") String userId,
			@RequestParam("password") String password, @RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname, @RequestParam("phone") String phone, @RequestParam("address") String address) {

		ModelAndView mv = new ModelAndView();

		User user = new User();
		user.setUserId(userId);
		user.setPassword(password);
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setPhone(phone);
		user.setAddress(address);
		

		int counter = userDao.registerUser(user);

		if (counter > 0) {
			mv.addObject("msg", "User registration successful.");
		} else {
			mv.addObject("msg", "Error- check the console log.");
		}

		mv.setViewName("registration");

		return mv;

	}
	
}
