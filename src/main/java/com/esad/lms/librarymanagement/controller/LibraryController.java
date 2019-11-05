package com.esad.lms.librarymanagement.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esad.lms.librarymanagement.model.Library;
import com.esad.lms.librarymanagement.service.LibraryService;

@RestController
@RequestMapping("/libraryManagement")
public class LibraryController {
	
	@Resource
	LibraryService libraryService;
	
	@GetMapping(value = "/libraryList")
	public List<Library> getBooks() {
		return libraryService.findAll();
	
	}
	
	@PostMapping(value = "/insertLibrary")
	public void createBook(@RequestBody Library library) {
		libraryService.insertLibrary(library);
	
	}
	@PutMapping(value = "/updateLibrary")
	public void updateBook(@RequestBody Library library) {
		libraryService.updateLibrary(library);
	
	}
	
	
	@DeleteMapping(value = "/deleteLibrary")
	public void deleteBook(@RequestBody Library library) {
		libraryService.deleteLibrary(library);
	
	}


}
