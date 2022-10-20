package com.example.hostmanager.model;

import lombok.Data;

import java.net.Inet4Address;

@Data
public class HostModel {

    private Long id;
    private String hostName;
    private String projectName;
    private String role;
    private Inet4Address ip;
    private String username;
    private String password;
    private String os;
    private String cpu;
    private String ram;
    private String hdd;
    private String[] tags;


}
