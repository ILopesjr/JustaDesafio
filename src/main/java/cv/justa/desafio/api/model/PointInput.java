package cv.justa.desafio.api.model;

import javax.validation.constraints.NotNull;

public class PointInput {
	
	@NotNull
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
