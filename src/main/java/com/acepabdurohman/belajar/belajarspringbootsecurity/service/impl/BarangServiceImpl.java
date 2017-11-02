package com.acepabdurohman.belajar.belajarspringbootsecurity.service.impl;

import com.acepabdurohman.belajar.belajarspringbootsecurity.dao.BarangDao;
import com.acepabdurohman.belajar.belajarspringbootsecurity.model.Barang;
import com.acepabdurohman.belajar.belajarspringbootsecurity.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarangServiceImpl implements BarangService {

    @Autowired
    private BarangDao barangDao;

    @Override
    public List<Barang> getAll() {
        return (List<Barang>) barangDao.findAll();
    }
}
