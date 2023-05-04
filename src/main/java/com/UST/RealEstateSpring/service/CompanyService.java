package com.UST.RealEstateSpring.service;

import com.UST.RealEstateSpring.model.Company;
import com.UST.RealEstateSpring.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepo repo;

    public List<Company> getByZipcode(Double zipcode) {
        return repo.findByZipcode(zipcode);
    }

    public List<Company> getByState(String state) {
        return repo.findByState(state);
    }

    public List<Company> getByCity(String city) {
        return repo.findByCity(city);
    }

    public List<Company> getByPrice(Double price) {
        return repo.findByPrice(price);
    }


    public List<Company> getByBath(Double bathroom) {
        return repo.findByBath(bathroom);
    }

    public List<Company> getByBed(Double bedroom) {
        return repo.findByBed(bedroom);
    }


    public int getBySales(String city){
            List<Company> propertiesInCity = CompanyRepo.getByCity(city);
            int count =(int) propertiesInCity.stream()
                    .filter(p -> p.getStatus().equals("for_sale")).count();
            return count;
    }
}
