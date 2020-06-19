package cv.justa.desafio.api.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ItemsInputModel {
	
	private Long id;
	
	@NotNull
	private PointInput point;
	
	@NotBlank
	@Size(max = 255)
	private String title;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PointInput getPoints() {
		return point;
	}

	public void setPoints(PointInput point) {
		this.point = point;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
