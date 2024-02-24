package com.example.demo.controller;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.service.GraphqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.lang.annotation.Annotation;

@RestController
@RequestMapping("/api/v1")
public class GraphqlController {
    @Autowired
    private GraphqlService graphqlService;
    @PostMapping("/saveGraph")
    public ResponseDTO saveGraph(@RequestParam("name")String name,
                                @RequestParam(value = "image",required = false) MultipartFile MultipartFile){
        ResponseDTO responseDTO=graphqlService.saveGraph(name,null);
        return responseDTO;
    }@GetMapping("/getGraph")
    public ResponseDTO getGraph(){
        return ResponseDTO.builder().status("sucess").build();
    }


}
