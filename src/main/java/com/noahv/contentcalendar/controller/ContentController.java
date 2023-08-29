package com.noahv.contentcalendar.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.noahv.contentcalendar.model.Content;
import com.noahv.contentcalendar.repository.ContentCollectionRepository;

/*
 * Contains the CRUD operations for content
 */

@RestController
@RequestMapping("/api/content")
public class ContentController {
	
	
	private final ContentCollectionRepository repository;
	
	public ContentController(ContentCollectionRepository repository) {
		this.repository = repository;	
	}
	
	//make a request and find all pieces of content in the system
	@GetMapping("")
	public List<Content> findAll(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Content findByID(@PathVariable Integer id){
		return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content Not Found!"));
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("")
	public void create(@RequestBody Content content) {
		repository.save(content);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PutMapping("/{id}")
	public void update(@RequestBody Content content, @PathVariable Integer id) {
		if (!repository.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content Not Found!");
		}
		
		repository.save(content);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		repository.delete(id);
	}
	
	

}
