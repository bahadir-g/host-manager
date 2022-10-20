package com.example.hostmanager.entity;

import lombok.Data;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.net.Inet4Address;
import java.util.UUID;

@Entity
@Data
@Table(name = "host")
public class Host {

    @Id
    @Transient
    private UUID Id = UUID.randomUUID();

    @Column(name = "host_name")
    private String hostName;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "role")
    private String role;

    @Column(name = "ip")
    private Inet4Address ip;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "os")
    private String os;

    @Column(name = "cpu")
    private String cpu;

    @Column(name = "ram")
    private String ram;

    @Column(name = "hdd")
    private String hdd;

    @Column(name = "tags",columnDefinition = "text[]")
    @Type(type = "com.example.hostmanager.customType.CustomStringArrayType")
    private String[] tags;

}
