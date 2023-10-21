package com.example.specification;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import com.example.entity.Account;


public class AccountSpecification {

	@SuppressWarnings("deprecation")
	public static Specification<Account> buildWhere(String search) {

	if (StringUtils.isEmpty(search)) {
		return null;
	}
	
	search = search.trim();
	
	CustomAccountSpecification name = new CustomAccountSpecification("username", search);
	
	return Specification.where(name);
	}
}