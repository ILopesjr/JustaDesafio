package cv.justa.desafio.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cv.justa.desafio.domain.exception.BusinessException;
import cv.justa.desafio.domain.model.Points;
import cv.justa.desafio.domain.repository.PointsRepository;

@Service
public class PointsService {

	@Autowired
	private PointsRepository pointsRepository;
	
	public Points save(Points points) {
		
		Points existsPoint = pointsRepository.findByEmail(points.getEmail());
		
		if (existsPoint != null && !existsPoint.equals(points)) {
			 throw new BusinessException("Já existe um ponto cadastrado com esse e-mail.");
		}
		
		return pointsRepository.save(points);
	}
	
	public void delete(Long idPoints) {
		pointsRepository.deleteById(idPoints);
	}
	
}
