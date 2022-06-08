package com.idat.EC1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC1.model.MallaCurricular;
import com.idat.EC1.repository.MallaCurricularRepository;

@Service
public class MallaCurisularServiceImpl implements MallaCurricularService{

	@Autowired
	private MallaCurricularRepository repository;
	
	@Override
	public void guardarMallaCurricular(MallaCurricular mallaCurricular) {
		repository.save(mallaCurricular);
		
	}

	@Override
	public void actualizarMallaCurricular(MallaCurricular mallaCurricular) {
		repository.saveAndFlush(mallaCurricular);
		
	}

	@Override
	public void eliminarMallaCurricular(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<MallaCurricular> listarMallaCurricular() {
		return repository.findAll();

	}

	@Override
	public MallaCurricular obtenerMallaCurricularId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}
	
}
