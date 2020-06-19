CREATE TABLE items (
    id BIGINT NOT NULL AUTO_INCREMENT,
    point_id BIGINT NOT NULL,
    title VARCHAR(255) NOT NULL,
    
    PRIMARY KEY (id)
);

ALTER TABLE items ADD CONSTRAINT fk_points
FOREIGN KEY (point_id) REFERENCES points (id);