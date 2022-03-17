package com.example.songr.web;

import com.example.songr.domain.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;


@Controller
public class HelloController {

    @GetMapping("/hello")
    String hello(){
        return "hello" ;
    }

    @GetMapping("/capitalize/{name}")
    String capitalize(@PathVariable(name = "name" , required = false) String name , Model model){


        name = name.toUpperCase();

        model.addAttribute("name" , name);
        return "capitalize" ;
    }

    @ResponseBody
   @GetMapping("/albums")
    ArrayList<Album> albums(){
       ArrayList<Album> albumArrayList = new ArrayList<>();
       albumArrayList.add(new Album("Hamzh albom" , "Hamzh" , 5 , 50 , "/hamzh.png"));
       albumArrayList.add(new Album("Ahmad albom" , "Ahmad" , 3 , 120 , "/Ahmad.png"));
       albumArrayList.add(new Album("Mohammed albom" , "Mohammed" , 5 , 130 , "/Mohammed.png"));
        return albumArrayList;
   }

}
