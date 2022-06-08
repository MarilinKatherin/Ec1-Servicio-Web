package com.idat.EC1.Service;

import java.util.List;

import com.idat.EC1.model.MallaCurricular;

public interface MallaCurricularService {
	void guardarMallaCurricular(MallaCurricular mallaCurricular);
	void actualizarMallaCurricular(MallaCurricular mallaCurricular);
	void eliminarMallaCurricular(Integer id);	
	List<MallaCurricular>listarMallaCurricular();
	MallaCurricular obtenerMallaCurricularId(Integer id);

}
