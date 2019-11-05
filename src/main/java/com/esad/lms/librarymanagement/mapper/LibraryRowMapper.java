package com.esad.lms.librarymanagement.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.esad.lms.librarymanagement.model.Library;

public class LibraryRowMapper implements RowMapper<Library>{
	@Override
	public Library mapRow(ResultSet rs, int arg1) throws SQLException {
		Library library = new Library();
		library.setLibraryId(rs.getString("libraryId"));
		library.setLibraryName(rs.getString("libraryName"));
		library.setLocation(rs.getString("location"));
		library.setAddress(rs.getString("address"));
		library.setContactNo(rs.getString("contactNo"));
		library.setStatus(rs.getString("status"));
		
        return library;

}
}
