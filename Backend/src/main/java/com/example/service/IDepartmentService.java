package com.example.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.entity.Department;
import com.example.form.DepartmentFilterForm;
import com.example.form.DepartmentFormForCreating;
import com.example.form.DepartmentFormForUpdating;

public interface IDepartmentService {

	public Page<Department> getAllDepartments(Pageable pageable,String search, DepartmentFilterForm filter);

	public Department getDepartmentByID(short id);

	public Department getDepartmentByName(String name);

	public void createDepartment(DepartmentFormForCreating form);

	public void updateDepartment(short id, DepartmentFormForUpdating form);

	public void deleteDepartment(short id);

	public boolean isDepartmentExistsByID(short id);

	public boolean isDepartmentExistsByName(String name);

	public void deleteDepartments(List<Short> ids);
}
