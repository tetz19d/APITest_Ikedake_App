package com.example.demo.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Objects;
import java.text.SimpleDateFormat;

@RestController
public class koichanController {

    @GetMapping("/koichan")
    public koichanService koichan(@RequestParam(value="currentDT") Date currentDT){

        if(Objects.isNull(currentDT)){
            currentDT = new Date();
        }

        System.out.println(currentDT);

        //パラメータで受け取った時刻で戻す値を分岐する
        SimpleDateFormat sdf = new SimpleDateFormat("s");
        String currentDT_end_str = sdf.format(currentDT);
        Integer currentDT_end_int = Integer.parseInt(currentDT_end_str.substring(currentDT_end_str.length()-1));

        System.out.println(currentDT_end_str);
        System.out.println(currentDT_end_int);

        String koichan_message = "";

        switch(currentDT_end_int){
            case 1:
                koichan_message = "そうぶうか";
                break;
            case 2:
            koichan_message = "そうぶうね";
            break;
            case 3:
            koichan_message = "ふーんぶう";
            break;
            case 4:
            koichan_message = "てつぅ～";
            break;
            case 5:
            koichan_message = "そうぶうか！";
            break;
            case 6:
            koichan_message = "いっ！！";
            break;
            case 7:
            koichan_message = "おっはぶう～♪";
            break;
            case 8:
            koichan_message = "あそぼうぶう";
            break;
            case 9:
            koichan_message = "ばいぶう";
            break;
        
            default:
                koichan_message = "かいぬし！";

        }
        

        return new koichanService(koichan_message);
    }

}
