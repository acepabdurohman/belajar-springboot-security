package com.acepabdurohman.belajar.belajarspringbootsecurity.dao;

import com.acepabdurohman.belajar.belajarspringbootsecurity.model.Barang;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BarangDao extends PagingAndSortingRepository<Barang, Long>{
}
