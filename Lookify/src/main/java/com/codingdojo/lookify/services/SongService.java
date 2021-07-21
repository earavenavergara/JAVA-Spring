package com.codingdojo.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.repositories.SongRepository;

@Service
public class SongService {
	private final SongRepository songRepository;

	public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}

	public List<Song> allSongs() {
		return songRepository.findAll();
	}

	public Song createSong(Song song) {
		return songRepository.save(song);
	}

	public Song findSong(long id) {
		Optional<Song> optionalSong = songRepository.findById(id);
		if (optionalSong.isPresent()) {
			return optionalSong.get();
		} else {
			return null;
		}
	}

	public void deleteSong(Long id) {
		songRepository.deleteById(id);
	}

	public List<Song> getTopTen() {
		return songRepository.findTop10ByOrderByClasificacionDesc();
	}

	public List<Song> findbyArtist(String name) {
		return songRepository.findByArtista(name);
	}
}
