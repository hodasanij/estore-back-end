package com.hoda.estore.admin.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.hoda.estore.admin.dao.AdminsDAO;
import com.hoda.estore.admin.model.Admins;

@WebServlet("/admins")
public class AdminCrudController extends HttpServlet {
	
	AdminsDAO adminDao = new AdminsDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			List<Admins> adminList = adminDao.getAll();
			String jsonResponse = new Gson().toJson(adminList);
			PrintWriter out = response.getWriter();
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			out.print(jsonResponse);
			out.flush();
			
		} catch (Exception e) {
			System.out.println("-- Something Went Wrong: -- " + e);
		}
		
	}
	

}
