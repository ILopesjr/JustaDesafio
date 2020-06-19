package cv.justa.desafio.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cv.justa.desafio.domain.model.Items;
import cv.justa.desafio.domain.repository.ItemsRepository;

@Service
public class ItemsService {
	
	@Autowired
	private ItemsRepository itemsRepository;
	
	public Items save(Items items) {
		
		return itemsRepository.save(items);
	}
	
	public void delete(Long idItems) {
		
		itemsRepository.deleteById(idItems);
	}
}
