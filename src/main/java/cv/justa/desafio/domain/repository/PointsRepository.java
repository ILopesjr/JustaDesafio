package cv.justa.desafio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cv.justa.desafio.domain.model.Points;

@Repository
public interface PointsRepository extends JpaRepository<Points, Long>{

	Points findByEmail(String email);
	
}
