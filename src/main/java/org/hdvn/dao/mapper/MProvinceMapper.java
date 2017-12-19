/**
 * Copyright Huong Dao Viet Nam
 */
package org.hdvn.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.hdvn.model.table.MProvince;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author Admin
 *
 */
public class MProvinceMapper implements RowMapper<MProvince> {

	/**
	* Method name :
	* @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	*/
	
	@Override
	public MProvince mapRow(ResultSet rs, int rowNum) throws SQLException {

		MProvince mProvince = new MProvince();
		
		mProvince.setProvinceId(rs.getString(1));
		mProvince.setProvinceName(rs.getString(2));
		
		return mProvince;
	}

}
