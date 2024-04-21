package com.example.manytomany.repository;

import com.example.manytomany.model.ApplicationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ApplicationRequestRepository extends JpaRepository<ApplicationRequest,Long> {
    List<ApplicationRequest> findByHandled(Boolean status);
}