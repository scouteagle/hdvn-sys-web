/**
 * Copyright Huong Dao Viet Nam
 */
package org.hdvn.web.service;

import java.util.List;

import org.hdvn.model.table.MProvince;
import org.springframework.stereotype.Service;

/**
 * @author Admin
 *
 */
public interface ICacheServices {

	public List<MProvince> getMProvince();
}
