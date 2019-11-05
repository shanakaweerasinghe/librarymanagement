package com.esad.lms.librarymanagement.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.esad.lms.librarymanagement.mapper.LibraryRowMapper;
import com.esad.lms.librarymanagement.model.Library;

@Repository
public class LibraryRepositoryImpl implements LibraryRepository {
	
	public LibraryRepositoryImpl(NamedParameterJdbcTemplate template) {  
        this.template = template;  
}
	NamedParameterJdbcTemplate template; 

	@Override
	public List<Library> findAll() {
		// TODO Auto-generated method stub
		return template.query("select * from library", new LibraryRowMapper());
	}

	@Override
	public void insertLibrary(Library library) {
		// TODO Auto-generated method stub
		final String sql = "insert into library(libraryId,libraryName,location,address,contactNo,status) values(:libraryId,:libraryName,:location,:address,:contactNo,:status)";

		KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
        		.addValue("libraryId", library.getLibraryId())
        		.addValue("libraryName", library.getLibraryName())
        		.addValue("location", library.getLocation())
        		.addValue("address", library.getAddress())
				.addValue("contactNo", library.getContactNo())
        		.addValue("status", library.getStatus());
        template.update(sql,param, holder);
	}


	@Override
	public void updateLibrary(Library library) {
		// TODO Auto-generated method stub
		final String sql = "update library set libraryId=:libraryId,libraryName=:libraryName,location=:location,address=:address,contactNo=:contactNo,status=:status where libraryId=:libraryId";

		KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
        		.addValue("libraryId", library.getLibraryId())
        		.addValue("libraryName", library.getLibraryName())
        		.addValue("location", library.getLocation())
        		.addValue("address", library.getAddress())
				.addValue("contactNo", library.getContactNo())
        		.addValue("status", library.getStatus());
        template.update(sql,param, holder);
	}

	@Override
	public void deleteLibrary(Library library) {
		// TODO Auto-generated method stub
		final String sql = "delete from library where libraryId=:libraryId";
		 

		 Map<String,Object> map=new HashMap<String,Object>();  
		 map.put("libraryId", library.getLibraryId());
	
		 template.execute(sql,map,new PreparedStatementCallback<Object>() {  
			    @Override  
			    public Object doInPreparedStatement(PreparedStatement ps)  
			            throws SQLException, DataAccessException {  
			        return ps.executeUpdate();  
			    }  
			});  

	}

}
