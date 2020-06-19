package cv.justa.desafio.api.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cv.justa.desafio.api.model.PointsInputModel;
import cv.justa.desafio.api.model.PointsModel;
import cv.justa.desafio.domain.model.Points;
import cv.justa.desafio.domain.repository.PointsRepository;
import cv.justa.desafio.domain.service.PointsService;

@RestController
@RequestMapping("/points")
public class pointsController {
	
	@Autowired
	private PointsService pointsService;
	
	@Autowired
	private PointsRepository pointsRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PointsModel save(@RequestBody PointsInputModel inputModel) {
		
		Points points = toEntity(inputModel);
		
		return toModel(pointsService.save(points));
	}
	
	private PointsModel toModel(Points points) {
		
		return modelMapper.map(points, PointsModel.class);
	}
	
	private Points toEntity(PointsInputModel inputModel) {
		
		return modelMapper.map(inputModel, Points.class);
	}
}
