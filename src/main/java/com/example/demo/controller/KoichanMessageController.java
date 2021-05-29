package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.source.IterableConfigurationPropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.util.ObjectUtils;

import java.util.Optional;
import com.example.demo.data.*;

@RestController
public class KoichanMessageController {
    @Autowired
    private KoichanMessageRepository kmRepository;    

    //koichan_messageの全データを取得
    @GetMapping("/koichan/all")
    public @ResponseBody Iterable<KoichanMessage> getAllKoichanMessage(){
        return kmRepository.findAll();
    }

    //パラメータを受け取って1件だけ返す
    @GetMapping("/koichan")
    public @ResponseBody KoichanMessage getKoichanMessage(@RequestParam(value="currentDT") String currentDT_end){

        System.out.println("うけとったぶう");
        System.out.println(currentDT_end);
        long id = 1;

        if(!ObjectUtils.isEmpty(currentDT_end)){
            id = Long.parseLong(currentDT_end);
        }

        System.out.println("IDはこれぶう");
        System.out.println(id);

        Optional<KoichanMessage> opt = kmRepository.findById(id);

        return opt.orElseThrow();
    }
    
}
