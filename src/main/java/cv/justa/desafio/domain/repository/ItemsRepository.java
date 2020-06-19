package cv.justa.desafio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cv.justa.desafio.domain.model.Items;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Long>{

}
