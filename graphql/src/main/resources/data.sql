DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  city VARCHAR(250) DEFAULT NULL
);

INSERT INTO user (first_name, last_name, city) VALUES
  ('Aliko', 'Dangote', 'Sj'),
  ('Bill', 'Gates', 'NY'),
  ('Folrunsho', 'Alakija', 'LA');