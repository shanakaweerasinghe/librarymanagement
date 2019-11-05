package com.esad.lms.librarymanagement.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.esad.lms.librarymanagement.model.Library;
import com.esad.lms.librarymanagement.repository.LibraryRepository;

@Component
public class LibraryServiceImpl implements LibraryService {
	
	@Resource
	LibraryRepository libraryRepository;

	@Override
	public List<Library> findAll() {
		// TODO Auto-generated method stub
		return libraryRepository.findAll();
	}

	@Override
	public void insertLibrary(Library library) {
		// TODO Auto-generated method stub
		libraryRepository.insertLibrary(library);

	}

	@Override
	public void updateLibrary(Library library) {
		// TODO Auto-generated method stub
		libraryRepository.updateLibrary(library);

	}

	@Override
	public void deleteLibrary(Library library) {
		// TODO Auto-generated method stub
		libraryRepository.deleteLibrary(library);

	}

}
