package com.codingdojo.shows.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.shows.models.Show;
import com.codingdojo.shows.models.User;
import com.codingdojo.shows.services.ShowService;
import com.codingdojo.shows.services.UserService;
import com.codingdojo.shows.validator.UserValidator;

@Controller
public class UserController {
	private final UserService userService;
	private final ShowService showService;
	private final UserValidator userValidator;

	public UserController(UserService userService, ShowService showService, UserValidator userValidator) {
		this.userService = userService;
		this.showService = showService;
		this.userValidator = userValidator;
	}

	@RequestMapping("/")
	public String registerLogin(@ModelAttribute("user") User user, HttpSession session, Model model) {
		if (session.getAttribute("errorMessage") != null) {
			model.addAttribute("errorMessage", session.getAttribute("errorMessage"));
			return "loginRegistrer.jsp";
		} else
			return "loginRegistrer.jsp";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") User user, Model model, BindingResult result,
			HttpSession session) {
		userValidator.validate(user, result);
		if (result.hasErrors()) {
			return "loginRegistrer.jsp";
		}
		User u = userService.registerUser(user);
		session.setAttribute("userId", u.getId());
		return "redirect:/shows";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model,
			HttpSession session) {
		boolean isAuntentico = userService.authenticateUser(email, password);
		if (isAuntentico) {
			User u = userService.findByEmail(email);
			session.setAttribute("userId", u.getId());
			return "redirect:/shows";
		} else {
			session.setAttribute("errorMessage", "Clave o email invalida");
			return "redirect:/";
		}
	}

	@RequestMapping("/shows")
	public String home(HttpSession session, Model model) {
		Long uID = (Long) session.getAttribute("userId");
		User user = userService.findUserById(uID);
		Iterable<Show> shows = showService.allShows();
		model.addAttribute("shows", shows);
		model.addAttribute("user", user);
		return "index.jsp";

	}
	/*
	 * @RequestMapping("/ideas/lowest") public String homeL(HttpSession session,
	 * Model model) { Long uID = (Long) session.getAttribute("userId"); User user =
	 * userService.findUserById(uID); Iterable<Idea> ideas =
	 * ideaService.allIdeasL(); model.addAttribute("ideas", ideas);
	 * model.addAttribute("user", user); return "index.jsp";
	 * 
	 * }
	 * 
	 * @RequestMapping("/ideas/highest") public String homeH(HttpSession session,
	 * Model model) { Long uID = (Long) session.getAttribute("userId"); User user =
	 * userService.findUserById(uID); Iterable<Idea> ideas =
	 * ideaService.allIdeasH(); model.addAttribute("ideas", ideas);
	 * model.addAttribute("user", user); return "index.jsp";
	 * 
	 * }
	 */

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

}
