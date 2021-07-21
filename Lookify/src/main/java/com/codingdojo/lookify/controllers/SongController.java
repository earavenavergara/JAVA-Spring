package com.codingdojo.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.services.SongService;

@Controller
public class SongController {
	private final SongService songService;

	public SongController(SongService songService) {
		this.songService = songService;
	}

	@RequestMapping("/")
	public String index() {
		return "/index.jsp";
	}

	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = songService.allSongs();
		model.addAttribute("songs", songs);
		return "/dashboard.jsp";
	}

	@RequestMapping("/songs/new")
	public String newBook(@ModelAttribute("song") Song song) {
		return "/new.jsp";
	}

	@RequestMapping(value = "/dashboard", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if (result.hasErrors()) {
			return "/new.jsp";
		} else {
			songService.createSong(song);
			return "redirect:/dashboard";
		}
	}

	@RequestMapping("/songs/{n}")
	public String show(@PathVariable("n") long n, Model model) {
		Song song = songService.findSong(n);
		model.addAttribute("song", song);
		return "/show.jsp";
	}

	@RequestMapping("/songs/{id}/delete")
	public String destroy(@PathVariable("id") Long id) {
		songService.deleteSong(id);
		return "redirect:/dashboard";
	}

	@PostMapping("/search")
	public String searchArtist(@RequestParam("artist") String artist) {
		return "redirect:/search/" + artist;
	}

	@RequestMapping("/search/{artist}")
	public String showSearch(Model model, @PathVariable("artist") String artist) {
		List<Song> songs = songService.findbyArtist(artist);
		model.addAttribute("songs", songs);
		model.addAttribute("artist", artist);
		return "search.jsp";
	}

	@RequestMapping("/search/topTen")
	public String topTenSong(Model model) {
		List<Song> top10Songs = songService.getTopTen();
		model.addAttribute("songs", top10Songs);
		System.out.println("---top 10 --- " + top10Songs);
		return "top10.jsp";
	}

}
