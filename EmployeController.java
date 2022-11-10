package com.jsp.EmployeManagementSystemSpringBoot.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.EmployeManagementSystemSpringBoot.DAO.EmployeDAO;
import com.jsp.EmployeManagementSystemSpringBoot.DTO.Employe;
@RestController
public class EmployeController
{
	@Autowired
	EmployeDAO dao;
	
	@PostMapping("/employe")
	public String saveEmploye(@RequestBody Employe employe)
	{
		return dao.saveEmploye(employe);
	}
	
	@GetMapping("/employe")
	public Employe getEmployeById(@RequestParam int id)
	{
		return dao.getEmployeById(id);
	}
	
	@GetMapping("/emp")
	public List<Employe> getEmployes()
	{
		return dao.getAllEmployes();
	}
	
	@DeleteMapping("/employe")
	public boolean deleteById(@RequestParam int id)
	{
		return dao.deleteById(id);
	}
	
	@PutMapping("/employe")
	public Employe updateEmploye(@RequestParam int id,@RequestBody Employe e)
	{
		return dao.updateEmploye(id, e);
	}
	
}
