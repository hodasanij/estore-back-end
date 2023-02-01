package com.hoda.estore.admin.dao;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.hoda.estore.admin.model.Admins;
import com.hoda.estore.utility.DB;

public class AdminsDAO implements DAO<Admins> {
	
	DB db  = new DB();

	// get all admins table records
	@Override
	public List<Admins> getAll() {
		List<Admins> adminList = new ArrayList<Admins>();
		db.init();
		try {
			String sql = "select * from admins";
			ResultSet res =  db.executeQuery(sql);
			while(res.next()) {
				Admins admin = new Admins();
				admin.setAdminId(res.getInt("adminId"));
				admin.setFullName(res.getString("fullName"));
				admin.setEmail(res.getString("email"));
				admin.setPassword(res.getString("password"));
				admin.setLogginType(res.getInt("loginType"));
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				admin.setAddedOn(format.parse(res.getString("addedOn")));
				adminList.add(admin);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong :: " + e.getMessage());
		} finally {
			db.destroy();
		}
		return adminList;
	}

	@Override
	public Admins getOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Admins obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Admins obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
