package com.example.hostmanager.service;

import com.example.hostmanager.entity.Host;
import com.example.hostmanager.model.HostModel;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface HostService {

    Host create (HostModel hostModel);

    Host update (HostModel hostModel);

    List<Host> findAll();

    Host findById(Long pk);

    void delete(Long pk);


}
