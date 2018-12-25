/**
 * author : AbdAlla - AboElMagd
 * 
 */
package com.cse.tansik.BAL;

import java.util.List;
import java.util.Map;

import com.cse.tansik.DAL.*;
import com.cse.tansik.DTO.Admin;

public class AdminAerBAOImp implements AdminAerBAO {

	/**
	 * factory AddAdminPage
	 */
		private AdminAerFactory factory = new AdminAerFactory();
		private AdminAerDAO dao = factory.createAdminAerDAOImp();
		/**
		 * it call save & update from dao package
		 * & that method check if there is an id or not if there is it will update this user (admin)
		 * if not it will add a new user(admin) in the database
		 */
		@Override
		public Integer save(Admin admin) {
			
			if ( admin.getId() == null ){
				return dao.save(admin);
			} else {
				if (dao.update(admin))
					return 1 ;
				else
					return 0 ;
		}
				
		}
	/**
	 * it call the delete from dao package
	 * & delete in dao --> takes the id of user and remove him from the database 
	 * and return boolean if deleted or not 
	 * 
	 */
		@Override
		public Boolean delete(Integer id) {
			return dao.delete(id);
		}
	/**
	 * it show the list of users (admin) in the database
	 */
		@Override
		public List<Admin> listAll() {
			return dao.listAll();
		}
	/**
	 * it search Admins by taking id or username or firstname or fullname or collegue or year 
	 * and returns an admin or a list of admin 
	 */
		/*
		@Override
		public List<Admin> searchBy(String key, Integer searchType) {
			return dao.searchBy(key, searchType);
		}

		@Override
		public List<Admin> searchBy(Map<String, Integer> searchMap) {
			return dao.searchBy(searchMap);
		}
	*/
}
