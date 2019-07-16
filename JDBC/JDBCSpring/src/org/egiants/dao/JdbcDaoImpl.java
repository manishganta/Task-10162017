package org.egiants.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.egiants.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class JdbcDaoImpl {
	
	@Autowired
	private DataSource dataSource;

	    public Customer getCustomer(int customerId){
		Connection conn = null;
		
		try{			
		
		
		conn = dataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM customer where id = ?");
		ps.setInt(1, customerId);
		
		Customer customer = null;
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()){
			customer = new Customer(customerId, rs.getString("Firstname"), rs.getString("Lastname"));
		}
		rs.close();
		ps.close();
		return customer;
		}
		catch(Exception e){
			throw new RuntimeException(e);
		}
		finally{
			try {
				conn.close();
			
			} catch(SQLException e){}
		}
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}


 