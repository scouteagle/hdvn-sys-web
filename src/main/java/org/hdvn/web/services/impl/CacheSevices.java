/**
 * Copyright Huong Dao Viet Nam
 */
package org.hdvn.web.services.impl;

import java.util.List;

import org.hdvn.dao.CacheDao;
import org.hdvn.model.table.MProvince;
import org.hdvn.web.service.ICacheServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Admin
 *
 */
@Service(value = "cacheServices")
public class CacheSevices implements ICacheServices {

	private CacheDao cacheDao;
	
	/**
	 * @param cacheDao the cacheDao to set
	 */
	@Autowired
	public void setCacheDao(CacheDao cacheDao) {
		this.cacheDao = cacheDao;
	}
	/**
	* Method name :
	* @see org.hdvn.web.service.ICacheServices#getMProvince()
	*/
	
	@Override
	public List<MProvince> getMProvince() {
		// TODO Auto-generated method stub
		return cacheDao.getMProvince();
	}

}
