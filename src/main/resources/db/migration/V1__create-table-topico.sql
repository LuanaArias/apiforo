CREATE TABLE topico (
    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(150) NOT NULL UNIQUE,
    mensaje VARCHAR(400) NOT NULL,
    autor VARCHAR(150) NOT NULL,
    curso VARCHAR(150) NOT NULL,
    fecha_de_creacion DATE NOT NULL,
    PRIMARY KEY (id)
);
