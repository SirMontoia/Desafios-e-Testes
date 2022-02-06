package com.example.SigaBemTeste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SigaBemTeste.model.DadosProcessadosModel;

public interface DadosProcessadosRepository extends JpaRepository <DadosProcessadosModel, Long> {

}
