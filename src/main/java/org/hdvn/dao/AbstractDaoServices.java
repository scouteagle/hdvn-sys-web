/**
 * Copyright Huong Dao Viet Nam
 */
package org.hdvn.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Admin
 *
 */
@Repository
public abstract class AbstractDaoServices {

	@Autowired
	protected NamedParameterJdbcTemplate namedParameterJdbcTemplate;
		
}
