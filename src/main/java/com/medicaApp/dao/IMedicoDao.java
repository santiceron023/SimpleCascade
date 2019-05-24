package com.medicaApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicaApp.model.Medico;

public interface IMedicoDao extends JpaRepository<Medico, Integer> {

}
