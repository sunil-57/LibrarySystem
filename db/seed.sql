USE librarydb;

-- Insert sample users
INSERT INTO user (name, username, contact) VALUES
('John Doe', 'johndoe', 981234567),
('Jane Smith', 'janesmith', 981112223),
('Alice Johnson', 'alicej', 980998877),
('Bob Williams', 'bobw', 981223344),
('Charlie Brown', 'charlieb', 981334455),
('David Miller', 'davidm', 981445566),
('Eve Davis', 'eved', 981556677),
('Frank Wilson', 'frankw', 981667788),
('Grace Taylor', 'gracet', 981778899),
('Hannah Moore', 'hannahm', 981889900);

-- Insert sample books
INSERT INTO book (bookNumber, bookName, authorName, bookquantity) VALUES
(1001, 'The Great Gatsby', 'F. Scott Fitzgerald', 5),
(1002, 'To Kill a Mockingbird', 'Harper Lee', 3),
(1003, '1984', 'George Orwell', 4),
(1004, 'Pride and Prejudice', 'Jane Austen', 6),
(1005, 'Moby Dick', 'Herman Melville', 2),
(1006, 'The Catcher in the Rye', 'J.D. Salinger', 5),
(1007, 'The Hobbit', 'J.R.R. Tolkien', 7),
(1008, 'Brave New World', 'Aldous Huxley', 3),
(1009, 'War and Peace', 'Leo Tolstoy', 4),
(1010, 'The Odyssey', 'Homer', 5);

-- Insert sample borrow records (10+ diverse cases)
INSERT INTO borrowrecord (userid, bookid, borroweddate, isReturned) VALUES
(1, 1, '2025-07-20 10:30:00', 0), -- John still has The Great Gatsby
(2, 2, '2025-07-18 14:15:00', 1), -- Jane returned To Kill a Mockingbird
(3, 3, '2025-07-15 09:00:00', 0), -- Alice still has 1984
(4, 4, '2025-07-25 11:00:00', 1), -- Bob returned Pride and Prejudice
(5, 5, '2025-07-26 13:20:00', 0), -- Charlie still has Moby Dick
(6, 6, '2025-07-27 15:45:00', 0), -- David still has The Catcher in the Rye
(7, 7, '2025-07-28 17:30:00', 1), -- Eve returned The Hobbit
(8, 8, '2025-07-29 08:50:00', 0), -- Frank still has Brave New World
(9, 9, '2025-07-30 12:10:00', 1), -- Grace returned War and Peace
(10, 10, '2025-07-31 16:40:00', 0), -- Hannah still has The Odyssey
(1, 2, '2025-07-22 09:15:00', 0), -- John borrowed To Kill a Mockingbird too
(2, 3, '2025-07-23 14:50:00', 0), -- Jane borrowed 1984, still has it
(3, 1, '2025-07-24 10:00:00', 1), -- Alice borrowed & returned The Great Gatsby
(4, 7, '2025-07-25 12:00:00', 0), -- Bob borrowed The Hobbit, still has it
(5, 6, '2025-07-26 15:00:00', 1); -- Charlie borrowed & returned The Catcher in the Rye
