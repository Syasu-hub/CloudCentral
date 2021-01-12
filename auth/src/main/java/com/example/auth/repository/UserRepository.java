package com.example.auth.repository;

import com.example.auth.entity.CostomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<CostomUser,String>, JpaSpecificationExecutor<CostomUser> {
    CostomUser findByName(String name);
}
