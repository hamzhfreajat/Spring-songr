package com.example.songr.web;

import com.example.songr.domain.Album;
import com.example.songr.infrastructure.AlbumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

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

   @Autowired
    AlbumRepo albumRepo;

    @GetMapping("/get-albums")
    String getAlbums(Model model){
        model.addAttribute("albumList" , albumRepo.findAll());
        return "album";
    }

    @PostMapping("/addAlbum")
    public RedirectView createNewAlbum(@ModelAttribute Album album){
       albumRepo.save(album);
       return new RedirectView("get-albums");
    }


}
