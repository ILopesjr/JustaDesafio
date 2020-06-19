ALTER TABLE items ADD CONSTRAINT fk_points
FOREIGN KEY (point_id) REFERENCES points (id);