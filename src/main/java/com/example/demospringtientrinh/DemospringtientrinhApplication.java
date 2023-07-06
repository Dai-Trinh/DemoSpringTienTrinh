package com.example.demospringtientrinh;


import com.example.demospringtientrinh.model.ThongSo;
import com.example.demospringtientrinh.responsitory.ThongSoResponesitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Date;


@SpringBootApplication
@EnableScheduling
public class DemospringtientrinhApplication {

	@Autowired
	ThongSoResponesitory thongSoResponesitory;

	public static void main(String[] args) {

		SpringApplication.run(DemospringtientrinhApplication.class, args);
	}
//
//	@Bean
//	public void TestCSDL(){
//		for (int i = 0; i < 100000; i++){
//			double u = Math.random() * (1000-220 + 1) + 220;
//			double ampe = Math.random() * (100-20 + 1) + 20;
//			thongSoResponesitory.save(new ThongSo(null, new Date(), u, ampe, i));
//		}
//	}




}
