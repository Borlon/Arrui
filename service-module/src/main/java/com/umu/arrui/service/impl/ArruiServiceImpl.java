package com.umu.arrui.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.umu.arrui.domain.Arrui;
import com.umu.arrui.repository.ArruiRepository;
import com.umu.arrui.service.IArruiService;
import com.umu.arrui.service.domain.ArruiSrvDTO;

import ma.glasnost.orika.MapperFacade;

@Service
@Transactional
public class ArruiServiceImpl implements IArruiService {

	@Inject
	private MapperFacade mapper;
	
	@Inject
	private ArruiRepository arruiRepository;
	
	@Override
	public List<ArruiSrvDTO> findAll(){
		List<Arrui> list = arruiRepository.findAll();
		List<ArruiSrvDTO> listDto = mapper.mapAsList(list, ArruiSrvDTO.class);
		return listDto;
	}
}
