package com.kubragurbuz.demo.controller;

import com.kubragurbuz.demo.entity.BillionairesEntity;
import com.kubragurbuz.demo.service.IBillionairesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/demo" )
public class DemoController {

  @Autowired
  IBillionairesService service;

  @GetMapping
  public String getDemoFunction() {
    return "Hello";
  }

  @GetMapping(value = "/billionaries")
  public List<BillionairesEntity> getAllData() {
    return service.getAllData();
  }
}
