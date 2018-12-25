/**
 * author : AbdAlla - AboElMagd
 * 
 */
package com.cse.tansik.DAL;

import com.cse.tansik.DTO.Admin;

import java.util.List;
import java.util.Map;

public interface AdminAerDAO {
	public Integer save(Admin admin) ;
	public Boolean update(Admin admin) ;
	public Boolean delete(Integer id) ;
	
	public List<Admin> listAll();
	/*
	public List<Admin> searchBy(String key , Integer searchType);
	public List<Admin> searchBy(Map <String , Integer> searchMap);
	*/

}
