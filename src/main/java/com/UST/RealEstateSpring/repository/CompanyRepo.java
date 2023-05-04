package com.UST.RealEstateSpring.repository;

import com.UST.RealEstateSpring.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Integer> {


     List<Company> getByCity(String city) ;


    List<Company> findByZipcode(Double zipcode);

    List<Company> findByState(String state);

//    List<Company> findByCity(String city);

    List<Company> findByPrice(Double price);

    List<Company> findByBath(Double bathroom);

    List<Company> findByBed(Double bedroom);

    List<Company> findByCity(String city);
}
