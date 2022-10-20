package com.example.hostmanager.service.impl;

import com.example.hostmanager.entity.Host;
import com.example.hostmanager.model.HostModel;
import com.example.hostmanager.repository.HostRepository;
import com.example.hostmanager.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostServiceImpl implements HostService {

    @Autowired
    HostRepository hostRepository;

    @Override
    public Host create(HostModel hostModel) {
        Host host = new Host();
        host.setHostName(hostModel.getHostName());
        host.setProjectName(hostModel.getProjectName());
        host.setRole(hostModel.getRole());
        host.setIp(hostModel.getIp());
        host.setUsername(hostModel.getUsername());
        host.setPassword(hostModel.getPassword());
        host.setCpu(hostModel.getCpu());
        host.setRam(hostModel.getRam());
        host.setOs(hostModel.getOs());
        host.setHdd(hostModel.getHdd());
        host.setTags(hostModel.getTags());
        hostRepository.save(host);
        return null;
    }

    @Override
    public Host update(HostModel hostModel) {
        return null;
    }

    @Override
    public List<Host> findAll() {
        return hostRepository.findAll();
    }

    @Override
    public Host findById(Long pk) {
        return null;
    }

    @Override
    public void delete(Long pk) {

    }
}
