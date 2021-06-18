package com.kubragurbuz.demo.repository;

import com.kubragurbuz.demo.entity.BillionairesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillionariesRepository extends JpaRepository<BillionairesEntity, Integer> {
}
