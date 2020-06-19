package cv.justa.desafio.api.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public class PointsController {
	
	@Autowired
	private PointsService pointsService;
	
	@Autowired
	private PointsRepository pointsRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PointsModel save(@Valid @RequestBody PointsInputModel inputModel) {
		
		Points points = toEntity(inputModel);
		
		return toModel(pointsService.save(points));
	}
	
	@GetMapping
	public List<PointsModel> list(){
		
		return toCollectionModel(pointsRepository.findAll());
	}
	
	@GetMapping("/{pointId}")
	public ResponseEntity<PointsModel> findPoint(@PathVariable Long pointId){
		
		Optional<Points> pointsService = pointsRepository.findById(pointId);
		
		if (pointsService.isPresent()) {
			
			PointsModel pointsmodel = toModel(pointsService.get());
			return ResponseEntity.ok(pointsmodel);
		}
		
		return ResponseEntity.notFound().build();
	}
	
	private PointsModel toModel(Points points) {
		
		return modelMapper.map(points, PointsModel.class);
	}
	
	private Points toEntity(PointsInputModel inputModel) {
		
		return modelMapper.map(inputModel, Points.class);
	}
	
	private List<PointsModel> toCollectionModel(List<Points> points){
		
		return points.stream().map(point -> toModel(point)).collect(Collectors.toList());		
	}
}
