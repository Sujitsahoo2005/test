package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "graph_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GraphData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "image")
    String image;
    String  age;
    String  name;


}
