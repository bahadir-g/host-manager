package com.example.hostmanager.controller;

import com.example.hostmanager.entity.Host;
import com.example.hostmanager.model.HostModel;
import com.example.hostmanager.response.ResponsePayload;
import com.example.hostmanager.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.ZonedDateTime;
import java.util.List;

@RestController
@RequestMapping("/host")
public class HostController {

    @Autowired
    HostService hostService;

    @PostMapping("/add")
    public ResponseEntity<Object> create(@RequestBody HostModel hostModel) {
        Host host = hostService.create(hostModel);
        ResponsePayload responsePayload = new ResponsePayload(ZonedDateTime.now(), "Kayıt oluşturuldu.", host);
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<Object> findAll() {
        List<Host> host = hostService.findAll();
        ResponsePayload responsePayload = new ResponsePayload(ZonedDateTime.now(), "Tüm kayıtlar bulundu.", host);
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }

    @GetMapping("/find-by-id")
    public ResponseEntity<Object> findById(@RequestBody Long pk) {
        Host host = hostService.findById(pk);
        ResponsePayload responsePayload = new ResponsePayload(ZonedDateTime.now(), "Kayıt bulundu.", host);
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }


    @PutMapping("/update")
    public ResponseEntity<Object> update(@RequestBody HostModel hostModel) {
        Host host = hostService.update(hostModel);
        ResponsePayload responsePayload = new ResponsePayload(ZonedDateTime.now(), "Kayıt güncellendi.", host);
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> delete(@RequestBody Long pk) {
        hostService.delete(pk);
        ResponsePayload responsePayload = new ResponsePayload(ZonedDateTime.now(), "Kayıt silindi!");
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }

}
