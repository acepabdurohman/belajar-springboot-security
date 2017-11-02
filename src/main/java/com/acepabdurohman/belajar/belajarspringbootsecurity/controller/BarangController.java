package com.acepabdurohman.belajar.belajarspringbootsecurity.controller;

import com.acepabdurohman.belajar.belajarspringbootsecurity.exception.DataIsNotExists;
import com.acepabdurohman.belajar.belajarspringbootsecurity.model.Barang;
import com.acepabdurohman.belajar.belajarspringbootsecurity.service.BarangService;
import com.acepabdurohman.belajar.belajarspringbootsecurity.util.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class BarangController {

    @Autowired
    private BarangService barangService;

    @GetMapping("/barang")
    @ResponseBody
    public ResponseTemplate<Barang> getAll() throws DataIsNotExists{
        List<Barang> barangs = barangService.getAll();
        if(barangs.isEmpty()){
            throw new DataIsNotExists();
        }
        return new ResponseTemplate<Barang>(200, "Success", barangs);
    }

    @GetMapping("/barang/view")
    public String viewBarang(@RequestParam("nama") String nama, Model model){

        model.addAttribute("nama",nama);
        return "barang-view";
    }
}
