package cv.justa.desafio.api.model;

import cv.justa.desafio.domain.model.Points;

public class ItemsModel {
	
	private Long id;
	
	private Points points;
	
	private String title;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Points getPoints() {
		return points;
	}

	public void setPoints(Points points) {
		this.points = points;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
