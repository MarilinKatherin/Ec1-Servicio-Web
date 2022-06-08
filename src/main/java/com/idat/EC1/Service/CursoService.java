package com.idat.EC1.Service;

import java.util.List;

import com.idat.EC1.model.Curso;

public interface CursoService {
	void guardarCurso(Curso curso);
	void actualizarCurso(Curso curso);
	void eliminarCurso(Integer id);	
	List<Curso>listarCursos();
	Curso obtenerCursoId(Integer id);
}

