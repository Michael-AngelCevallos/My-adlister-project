CREATE DATABASE IF NOT EXISTS my_ad_lister_db;
USE my_ad_lister_db;

DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
                       id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                       username VARCHAR(240) NOT NULL,
                       gender VARCHAR(10) NOT NULL,
                       email VARCHAR(240) NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       PRIMARY KEY (id)
);

CREATE TABLE ads (
                     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                     user_id INT UNSIGNED NOT NULL,
                     title VARCHAR(240) NOT NULL,
                     description TEXT NOT NULL,
                     img_url VARCHAR(300) NOT NULL, #MAYBE ADD DEFAULT STATE IF NO IMG ADDED
                     gender VARCHAR(20) NOT NULL,
                     price DECIMAL(10, 2) NOT NULL, # 12,345,678.90
                     age VARCHAR(128) NOT NULL,
                     PRIMARY KEY (id),
                     FOREIGN KEY (user_id) REFERENCES users(id)
                         ON DELETE CASCADE
);
