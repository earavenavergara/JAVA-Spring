package com.codingdojo.shows.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.shows.models.Show;
import com.codingdojo.shows.repositories.ShowRepository;

@Service
public class ShowService {
	private final ShowRepository showRepository;

	public ShowService(ShowRepository showRepository) {
		this.showRepository = showRepository;
	}

	public Iterable<Show> allShows() {
		return showRepository.findAll();
	}

	public Show createShow(Show show) {
		return showRepository.save(show);
	}

//	public Iterable<Idea> allIdeasH() {
//		return ideaRepository.findAllByOrderByLikesDesc();
//	}
//
	public Show findShow(Long id) {
		Optional<Show> optionalShow = showRepository.findById(id);
		if (optionalShow.isPresent()) {
			return optionalShow.get();
		} else {
			return null;
		}
	}

	public Show updateShow(Show show) {
		Optional<Show> optionalShow = showRepository.findById(show.getId());
		if (optionalShow.isPresent()) {
			Show s = optionalShow.get();
			s.setTitle(show.getTitle());
			s.setNetwork(show.getNetwork());
			s.setUsers(show.getUsers());
			return showRepository.save(s);
		} else {
			return null;
		}
	}

	public void deleteShow(Long id) {
		showRepository.deleteById(id);
	}
}
