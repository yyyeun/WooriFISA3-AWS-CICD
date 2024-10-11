package com.ce.fisa.dao;
// jdbc -> jpa -> spring data jpa
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ce.fisa.model.entity.Dept;

// dept table과 1:1 매핑
// DAO 구조의 이런 interface
@Repository
public interface DeptRepository extends JpaRepository<Dept, Integer>{
	
}
