package com.jsp.EmployeManagementSystemSpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.EmployeManagementSystemSpringBoot.DTO.Employe;

public interface EmployeeRepository extends JpaRepository<Employe, Integer> 
{
	
}
