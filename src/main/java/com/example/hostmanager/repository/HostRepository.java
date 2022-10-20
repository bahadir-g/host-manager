package com.example.hostmanager.repository;

import com.example.hostmanager.entity.Host;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostRepository extends JpaRepository<Host,Long>,
        JpaSpecificationExecutor<Host>,
        CrudRepository<Host,Long> {
}
