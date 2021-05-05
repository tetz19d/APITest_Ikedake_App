package com.example.demo.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class koichanController {

    @GetMapping("/koichan")
    public koichanService koichan(@RequestParam(value="currentDT") String currentDT_end){

// //パラメータがNullだった場合は生成
//         if(Objects.isNull(currentDT_end)){
//             Date currentDT = new Date();

//             SimpleDateFormat sdf = new SimpleDateFormat("s");
//             String currentDT_end_str = sdf.format(currentDT);
//             currentDT_end = Integer.parseInt(currentDT_end_str.substring(currentDT_end_str.length()-1));

//             System.out.println(currentDT);
//             System.out.println(currentDT_end_str);
//         }

        System.out.println(currentDT_end);
 
        //パラメータで受け取った時刻で戻す値を分岐する
        String koichan_message = "";

        switch(currentDT_end){
            case "1":
                koichan_message = "そうぶうか";
                break;
            case "2":
            koichan_message = "そうぶうね";
            break;
            case "3":
            koichan_message = "ふーんぶう";
            break;
            case "4":
            koichan_message = "てつぅ～";
            break;
            case "5":
            koichan_message = "そうぶうか！";
            break;
            case "6":
            koichan_message = "いっ！！";
            break;
            case "7":
            koichan_message = "おっはぶう～♪";
            break;
            case "8":
            koichan_message = "あそぼうぶう";
            break;
            case "9":
            koichan_message = "ばいぶう";
            break;
        
            default:
                koichan_message = "かいぬし！";

        }

        return new koichanService(koichan_message);
    }

}
