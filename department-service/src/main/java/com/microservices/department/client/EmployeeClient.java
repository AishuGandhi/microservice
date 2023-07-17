package com.microservices.department.client;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.microservices.department.model.Employee;

/**
 * Declartive Client
 * Cannot create instance of it as it is inetrface making is web client by
 * adding web client dependency and few configurations so that it can point to
 * employee service
 **/
@HttpExchange
public interface EmployeeClient {
	@GetExchange("/employee/department/{departmentId}")
	public List<Employee> getEmployeeByDepartmentId(@PathVariable Long departmentId);
}
