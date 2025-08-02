-- Create database
CREATE DATABASE IF NOT EXISTS librarydb;
USE librarydb;

-- Drop existing tables if they exist
DROP TABLE IF EXISTS borrowrecord;
DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS user;

-- Create user table
CREATE TABLE user (
    userid INT(11) AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    username VARCHAR(50) NOT NULL UNIQUE,
    contact INT(11) NOT NULL
) ENGINE=InnoDB;

-- Create book table
CREATE TABLE book (
    bookid INT(11) AUTO_INCREMENT PRIMARY KEY,
    bookNumber INT(11) UNIQUE NOT NULL,
    bookName VARCHAR(100) NOT NULL,
    authorName VARCHAR(100) NOT NULL,
    bookquantity INT(11) NOT NULL CHECK (bookquantity >= 0)
) ENGINE=InnoDB;

-- Create borrowrecord table
CREATE TABLE borrowrecord (
    borrowID INT(11) AUTO_INCREMENT PRIMARY KEY,
    userid INT(11) NOT NULL,
    bookid INT(11) NOT NULL,
    borroweddate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    isReturned TINYINT(1) DEFAULT 0,
    FOREIGN KEY (userid) REFERENCES user(userid) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (bookid) REFERENCES book(bookid) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB;
