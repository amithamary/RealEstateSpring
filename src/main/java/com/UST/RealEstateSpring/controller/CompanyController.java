package com.UST.RealEstateSpring.controller;

import com.UST.RealEstateSpring.model.Company;
import com.UST.RealEstateSpring.repository.CompanyRepo;
import com.UST.RealEstateSpring.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comp")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @GetMapping("/get/{zipcode}")

    public List<Company> getByZipcode(@PathVariable Double zipcode){
        return companyService.getByZipcode(zipcode);
    }
    @GetMapping("/getstate/{state}")
    public List<Company> getByState(@PathVariable String state){
        return companyService.getByState(state);
    }
    @GetMapping("/getcity/{city}")
    public List<Company> getByCity(@PathVariable String city){
        return companyService.getByCity(city);
    }
    @GetMapping("/getprice/{price}")
    public List<Company> getByPrice(@PathVariable Double price){
        return companyService.getByPrice(price);
    }
    @GetMapping("/getbath/{bathroom}")
    public List<Company> getByBath(@PathVariable Double bathroom){
        return companyService.getByBath(bathroom);
    }
    @GetMapping("/getbed/{bedroom}")
    public List<Company> getByBed(@PathVariable Double bedroom){
        return companyService.getByBed(bedroom);
    }
    @GetMapping("/getsales/{city}")
    public int getSales(@PathVariable String city){
        return companyService.getBySales(city);
    }

}
