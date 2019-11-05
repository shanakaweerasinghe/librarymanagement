package com.esad.lms.librarymanagement.repository;

import java.util.List;

import com.esad.lms.librarymanagement.model.Library;

public interface LibraryRepository {

	List<Library> findAll();

	void insertLibrary(Library library);

	void updateLibrary(Library library);

	void deleteLibrary(Library library);
}
