package com.kubragurbuz.demo.impl;

import com.kubragurbuz.demo.entity.BillionairesEntity;
import com.kubragurbuz.demo.repository.BillionariesRepository;
import com.kubragurbuz.demo.service.IBillionairesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillionariesImpl implements IBillionairesService {

  @Autowired
  public BillionariesRepository repository;

  public List<BillionairesEntity> getAllData() {
    return repository.findAll();
  }



}
