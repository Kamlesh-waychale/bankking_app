package com.bankking.bankking_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankking.bankking_app.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
