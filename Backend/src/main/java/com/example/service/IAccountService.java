package com.example.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.entity.Account;
import com.example.form.AccountFormForCreating;

public interface IAccountService extends UserDetailsService {
	
	public Page<Account> getAllAccounts(Pageable pageable,String search);

	public void createAccount(AccountFormForCreating form);

	public boolean isAccountExistsByUserName(String username);

	public void deleteAccount(int id);

	public void deleteAccounts(List<Integer> ids);

	Account getAccountByUsername(String username);
	
	public void addNewAccount(Account account);
}
