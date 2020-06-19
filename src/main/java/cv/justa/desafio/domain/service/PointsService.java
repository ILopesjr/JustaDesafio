package cv.justa.desafio.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cv.justa.desafio.domain.model.Points;
import cv.justa.desafio.domain.repository.PointsRepository;

@Service
public class PointsService {

	@Autowired
	private PointsRepository pointsRepository;
	
	public Points save(Points points) {
		
		return pointsRepository.save(points);
	}
	
	public void delete(Long idPoints) {
		pointsRepository.deleteById(idPoints);
	}
	
}
