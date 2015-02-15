package com.bootcamp.webapp.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bootcamp.webapp.model.Operation;
import com.bootcamp.webapp.model.Phone;
import com.bootcamp.webapp.model.WebUser;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	Operation operation = null;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView loginOk() {
		ModelAndView mvc = new ModelAndView("loginOk");

		return mvc;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mvc = new ModelAndView("home");

		return mvc;
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register() {

		ModelAndView mvc = new ModelAndView("register");
		return mvc;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(@RequestParam("id_user") String id_user,

	@RequestParam("password") String pass,

	@RequestParam("email") String email,

	@RequestParam("phone") String phone) {

		boolean res = false;

		ArrayList<String> a;
		ModelAndView mvc = null;
		a = new ArrayList<String>();
		a.add(id_user);
		a.add(pass);
		a.add(email);
		a.add(phone);
		res = ifNotEmpty(a);
		if (res) {
			mvc = new ModelAndView("register");
			mvc.addObject("message", "Please insert the fields correctly");
		} else {
			WebUser webuser = new WebUser();
			webuser.setId_user(id_user);
			webuser.setPassword(pass);
			webuser.setEmail(email);

			Phone numberPhone = new Phone();
			numberPhone.setNumber(Integer.parseInt(phone));
			operation = new Operation();
			operation.openConnection();
			operation.saveObject(numberPhone);
			webuser.setId_phone(numberPhone.getId_phone());
			operation.saveObject(webuser);
			operation.closeConnection();

			mvc = new ModelAndView("home");
			mvc.addObject("message", "The registration is Ok - Welcome "
					+ id_user);
		}

		return mvc;
	}

	private boolean ifNotEmpty(ArrayList<String> array) {
		boolean res = false;
		ArrayList<String> a = array;
		for (int i = 0; i < a.size(); i++) {

			if (a.get(i).compareTo("") == 0) {
				res = true;
			}

		}

		return res;
	}
}