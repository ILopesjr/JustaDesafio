CREATE TABLE points (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(60) NOT NULL,
    email VARCHAR(255) NOT NULL,
    whatsapp VARCHAR(20) NOT NULL,
    latitude DOUBLE NOT NULL,
    longitude DOUBLE NOT NULL,
    city VARCHAR(255) NOT NULL,
    uf VARCHAR(2) NOT NULL,
    items_id BIGINT NOT NULL,
    
    PRIMARY KEY (id)
);