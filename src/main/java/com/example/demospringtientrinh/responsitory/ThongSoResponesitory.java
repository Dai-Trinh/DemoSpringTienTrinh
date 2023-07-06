package com.example.demospringtientrinh.responsitory;

import com.example.demospringtientrinh.model.ThongSo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ThongSoResponesitory extends JpaRepository<ThongSo, Integer> {

    @Query(value = "SELECT * FROM tbl_giatri limit ?1 , 1000", nativeQuery = true)
    List<ThongSo> getListThongSo(int vitri);

}
