package com.example.demo.service.serviceImpl;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.entity.GraphData;
import com.example.demo.repo.GraphRepo;
import com.example.demo.service.GraphqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class GraphqlServiceImpl implements GraphqlService {
    @Autowired
    private GraphRepo graphQlRepository;
    @Override
    public ResponseDTO saveGraph(String name, MultipartFile file) {
        ResponseDTO responseDTO=new ResponseDTO();
        graphQlRepository.save(GraphData.builder().name(name).build());
        responseDTO.setStatus("success");
        return responseDTO;
    }
}
