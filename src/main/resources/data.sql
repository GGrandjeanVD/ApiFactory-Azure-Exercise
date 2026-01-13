CREATE TABLE IF NOT EXISTS hello (
                                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                     message VARCHAR(255) NOT NULL
    );
INSERT INTO hello (message) VALUES ('Hello World!');
