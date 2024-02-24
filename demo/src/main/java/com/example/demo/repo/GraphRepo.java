package com.example.demo.repo;

import com.example.demo.entity.GraphData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphRepo extends JpaRepository<GraphData,Long> {
}
