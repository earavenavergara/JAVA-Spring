package com.codingdojo.shows.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.shows.models.Show;
import com.codingdojo.shows.models.User;
import com.codingdojo.shows.services.ShowService;
import com.codingdojo.shows.services.UserService;

@Controller
public class ShowController {
	private ShowService showService;
	private final UserService userService;

	public ShowController(ShowService showService, UserService userService) {
		this.showService = showService;
		this.userService = userService;
	}

	@RequestMapping("/shows/new")
	public String createForm(Model model, @ModelAttribute("show") Show show) {
		return "new.jsp";

	}

	@RequestMapping(value = "/shows/new", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("show") Show show, BindingResult result, HttpSession session) {
		if (result.hasErrors()) {
			return "new.jsp";
		}
		Long uID = (Long) session.getAttribute("userId");
		String userName = userService.findUserById(uID).getName();
		show.setCreatedBy(userName);
		showService.createShow(show);
		return "redirect:/shows";
	}

	@RequestMapping(value = "/shows/{id}")
	public String show(@PathVariable("id") Long id, Model model, HttpSession session) {
		Show show = showService.findShow(id);
		Long uID = (Long) session.getAttribute("userId");
		User user = userService.findUserById(uID);
		model.addAttribute("user", user);
		model.addAttribute("show", show);
		return "show.jsp";
	}

	@RequestMapping(value = "/shows/{id}/rating")
	public String rating(@PathVariable("id") Long id, @ModelAttribute("u") User u, Model model, HttpSession session) {
		Show show = showService.findShow(id);
		Long UID = (Long) session.getAttribute("userId");
		User user = userService.findUserById(UID);
		List<User> users = show.getUsers();
		user.setRating(u.getRating());
		users.add(user);
		show.setUsers(users);
		showService.updateShow(show);
		return "redirect:/shows/{id}";
	}

	@RequestMapping(value = "/shows/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Show show = showService.findShow(id);
		model.addAttribute("show", show);
		return "edit.jsp";
	}

	@RequestMapping(value = "/shows/{id}/edit", method = RequestMethod.POST)
	public String update(@Valid @ModelAttribute("show") Show show, BindingResult result, HttpSession session,
			@PathVariable("id") Long id) {
		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			Show show1 = showService.findShow(id);
			Long uID = (Long) session.getAttribute("userId");
			String userName = userService.findUserById(uID).getName();
			if (!show1.getCreatedBy().equals(userName))
				return "redirect:/shows";
			show1.setTitle(show.getTitle());
			showService.updateShow(show1);
			return "redirect:/shows/" + show1.getId();
		}
	}

	@RequestMapping(value = "/shows/{id}/delete", method = RequestMethod.POST)
	public String destroy(@PathVariable("id") Long id) {
		showService.deleteShow(id);
		return "redirect:/shows";
	}

}
