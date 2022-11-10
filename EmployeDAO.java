package com.jsp.EmployeManagementSystemSpringBoot.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.EmployeManagementSystemSpringBoot.DTO.Employe;
import com.jsp.EmployeManagementSystemSpringBoot.Repository.EmployeeRepository;

@Repository
public class EmployeDAO 
{
	@Autowired
	EmployeeRepository repository;
	
	//Insertion
	public String saveEmploye(Employe employe)
	{
		repository.save(employe);
		return "Data Saved";
	}
	
	//Fetching data by id
	public Employe getEmployeById(int id)
	{
		Optional<Employe> opt=repository.findById(id);
		if(opt.isPresent())
			return opt.get();
		else
			return null;
	}
		
	//Fetching all data
	public List<Employe> getAllEmployes()
	{
		return repository.findAll();
	}
	
	//Delete by id
	public boolean deleteById(int id)
	{
		Employe e=getEmployeById(id);
		if(e!=null)
		{
			repository.deleteById(id);
			return true;
		}
		else
			return false;
	}
	
	public Employe updateEmploye(int id, Employe e)
	{
		Employe emp=getEmployeById(id);
		if(emp!=null)
		{
			repository.save(e);
			return e;
		}
		else
			return null;
	}
}
