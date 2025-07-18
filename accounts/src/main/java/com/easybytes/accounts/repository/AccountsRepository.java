package com.easybytes.accounts.repository;

import com.easybytes.accounts.entity.Accounts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
	
	Optional<Accounts> findByCustomerId(Long cstomerId);
	
	 @Transactional
	    @Modifying
	    void deleteByCustomerId(Long customerId);
}
