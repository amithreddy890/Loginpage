package org.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.app.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;

	public UserDaoImpl(DataSource dataSoruce) {
		jdbcTemplate = new JdbcTemplate(dataSoruce);
	}

	@Override
	public int registerUser(User user) {
		
		String sql = "INSERT INTO user VALUES(?,?,?,?,?,?)";

		try {
			
			int counter = jdbcTemplate.update(sql, new Object[] { user.getUserId(), user.getPassword(), user.getFirstname(), user.getLastname(), user.getPhone(), user.getAddress() });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public String loginUser(User user) {
		
		String sql = "SELECT userid FROM user WHERE userid=? AND password=?";
		
		try {

			String userId = jdbcTemplate.queryForObject(sql, new Object[] {
					user.getUserId(), user.getPassword() }, String.class);

			return userId;
			
		} catch (Exception e) {
			return null;
		}
	}
	public List<User> getAll()
	{
		return jdbcTemplate.query("select * from user",new RowMapper<User>(){  
		    @Override  
		    public User mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        User e=new User();  
		        e.setFirstname(rs.getString(1));
		        e.setLastname(rs.getString(2));
		        e.setAddress(rs.getString(3));
		        e.setPhone(rs.getString(4));
		        
		        return e;  
		    }  
		    });
		
	}
}
