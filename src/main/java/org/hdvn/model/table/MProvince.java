/**
 * Copyright Huong Dao Viet Nam
 */
package org.hdvn.model.table;

import java.io.Serializable;

/**
 * @author Admin
 *
 */
public class MProvince implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = -6313581419322980238L;
	
	/** Ma tinht hanh */
	private String provinceId;
	
	/** Ten tinh thanh */
	private String provinceName;
	public String getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	
	
}
