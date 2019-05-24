package com.medicaApp.service;

import java.util.List;

//Op comunes
public interface ICRUD<T> {
	T registrar(T t);
	T modificar(T t);
	void eliminar(Integer id);
	List<T> listar();
	T listarPorId(Integer id);
}
