package com.example.demospringtientrinh.controller;


import com.example.demospringtientrinh.model.LuTru;
import com.example.demospringtientrinh.model.ThongSo;
import com.example.demospringtientrinh.responsitory.LuuTruResponesitory;
import com.example.demospringtientrinh.responsitory.ThongSoResponesitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@Component
public class TestController {

    @Autowired
    ThongSoResponesitory thongSoResponesitory;

    @Autowired
    LuuTruResponesitory luuTruResponesitory;

    private static final SimpleDateFormat dateformat = new SimpleDateFormat("HH:mm:ss");
    private boolean isRunning = true;



    private static  int vitri = 0;
    @Scheduled(fixedRate = 500)
    public void tinhGiaTri(){
       if(isRunning){
           double tongU =  0;
           double tongI = 0;
           double tongP = 0;

           List<ThongSo> thongSoList = thongSoResponesitory.getListThongSo(vitri);
           vitri += 1000;
           if(thongSoList.size() <= 0){
               isRunning = false;
               return;
           }
           for (ThongSo t : thongSoList){
               tongU += t.getVon();
               tongI += t.getAmpe();
               tongP += (t.getVon() * t.getAmpe());
           }
           System.out.println(thongSoList.size());
           luuTruResponesitory.save(new LuTru(null, dateformat.format(new Date()), tongU / thongSoList.size(), tongI/thongSoList.size(), tongP/thongSoList.size()));
       }
    }

    @GetMapping("/allapi")
    public List<LuTru> getLuTruList(){
        return luuTruResponesitory.findAll();
    }

}
