package com.example.demo.service;

import com.example.demo.dto.ResponseDTO;
import org.springframework.web.multipart.MultipartFile;

public interface GraphqlService {
    ResponseDTO saveGraph(String name, MultipartFile file);
}
