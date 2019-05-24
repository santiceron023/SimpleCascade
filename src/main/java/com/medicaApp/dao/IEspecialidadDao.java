package com.medicaApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicaApp.model.Especialidad;


public interface IEspecialidadDao extends JpaRepository<Especialidad, Integer> {

}
