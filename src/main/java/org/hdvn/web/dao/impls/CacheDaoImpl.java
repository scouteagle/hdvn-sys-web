/**
 * Copyright Huong Dao Viet Nam
 */
package org.hdvn.web.dao.impls;

import java.util.List;

import org.hdvn.dao.AbstractDaoServices;
import org.hdvn.dao.CacheDao;
import org.hdvn.dao.mapper.MProvinceMapper;
import org.hdvn.model.table.MProvince;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Admin
 *
 */
@Repository
public class CacheDaoImpl extends AbstractDaoServices implements CacheDao {

	private final Logger logg = LoggerFactory.getLogger(CacheDaoImpl.class);
	
	/**
	 * Method name :
	 * 
	 * @see org.hdvn.dao.CacheDao#getMProvince()
	 */

	@Autowired
	public void setNamedParameterJdbcTemplate(
		NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
	@Override
	public List<MProvince> getMProvince() {
		
		String sql = "select province_id, province_name from m_province";
		logg.info(sql);
		return namedParameterJdbcTemplate.query(sql, new MProvinceMapper());
	}

}
