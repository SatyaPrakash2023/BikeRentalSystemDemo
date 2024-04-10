drop database if exists BikeRentalSystem;
Create database BikeRentalSystem;
use BikeRentalSystem;
-- User Table
CREATE TABLE User (
    UserID INT PRIMARY KEY,
    UserName varchar(100),
    Name VARCHAR(50),
    Email VARCHAR(100),
    Phone VARCHAR(20),
    PassWord varchar(100),
    Age INT,
    Gender varchar(30)
);
 
-- INSERT INTO User (UserID, Name, Email, Phone) VALUES
-- (1, 'John Doe', 'john@example.com', '123-456-7890'),
-- (2, 'Jane Smith', 'jane@example.com', '987-654-3210'),
-- (3, 'Alice Johnson', 'alice@example.com', '555-555-5555');
 
-- Bike Table
CREATE TABLE Bike (
    BikeID INT PRIMARY KEY,
    Type VARCHAR(50),
    Model VARCHAR(50),
    Status VARCHAR(20),
    Bike_Number varchar(200)
);
 
-- INSERT INTO Bike (BikeID, Type, Model, Status) VALUES
-- (101, 'Mountain Bike', 'Trek X-Caliber 7', 'Available'),
-- (102, 'Road Bike', 'Specialized Allez', 'Available'),
-- (103, 'Hybrid Bike', 'Giant Escape 3', 'Unavailable');
 
-- Rental Table
CREATE TABLE Rental (
    RentalID INT PRIMARY KEY,
    UserID INT,
    BikeID INT,
    StartTime DATETIME,
    EndTime DATETIME,
    Duration INT,
    Cost DECIMAL(10, 2),
    DrivingLicense varchar(200),
    FOREIGN KEY (UserID) REFERENCES User(UserID),
    FOREIGN KEY (BikeID) REFERENCES Bike(BikeID)
);
 
-- INSERT INTO Rental (RentalID, UserID, BikeID, StartTime, EndTime, Duration, Cost) VALUES
-- (201, 1, 101, '2024-04-01 09:00:00', '2024-04-01 12:00:00', 3, 25.00),
-- (202, 2, 102, '2024-04-02 10:30:00', '2024-04-02 13:30:00', 3, 20.00),
-- (203, 3, 103, '2024-04-03 08:45:00', '2024-04-03 11:15:00', 2, 15.00);
--  
-- Payment Table
CREATE TABLE Payment (
    PaymentID INT PRIMARY KEY,
    RentalID INT,
    User_Name varchar(100),
    Amount DECIMAL(10, 2),
    Method VARCHAR(50),
    Status VARCHAR(20),
    FOREIGN KEY (RentalID) REFERENCES Rental(RentalID)
);
 
-- INSERT INTO Payment (PaymentID, RentalID, Amount, Method, Status) VALUES
-- (301, 201, 25.00, 'Credit Card', 'Paid'),
-- (302, 202, 20.00, 'PayPal', 'Paid'),
-- (303, 203, 15.00, 'Cash', 'Pending');
 
-- Location Table
CREATE TABLE Location (
    LocationID INT PRIMARY KEY,
    Address VARCHAR(100),
    Contact VARCHAR(20),
    City varchar(50)
);
 
-- INSERT INTO Location (LocationID, Address, Contact) VALUES
-- (1, '123 Main St, Cityville', '555-123-4567'),
-- (2, '456 Elm St, Townsville', '555-987-6543'),
-- (3, '789 Oak St, Villagetown', '555-567-8901');
 
-- Maintenance Table
CREATE TABLE Maintenance (
    MaintenanceID INT PRIMARY KEY,
    BikeID INT,
    Type VARCHAR(50),
    Date DATE,
    Description VARCHAR(400),
    FOREIGN KEY (BikeID) REFERENCES Bike(BikeID)
);
 
-- INSERT INTO Maintenance (MaintenanceID, BikeID, Type, Date, Description) VALUES
-- (401, 101, 'Tire Replacement', '2024-03-25', 'Replaced worn out tires'),
-- (402, 102, 'Brake Adjustment', '2024-03-28', 'Adjusted brake pads'),
-- (403, 103, 'Chain Lubrication', '2024-04-02', 'Lubricated bike chain');


use BikeRentalSystem;
-- Inserting into User Table
INSERT INTO User (UserID, UserName, Name, Email, Phone, PassWord, Age,Gender) 
VALUES
(1, 'user1', 'John Doe', 'john@example.com', '123-456-7890', 'password1', 30,'MALE'),
(2, 'user2', 'Jane Smith', 'jane@example.com', '987-654-3210', 'password2', 25,'MALE'),
(3, 'user3', 'Alice Johnson', 'alice@example.com', '555-555-5555', 'password3', 35,'FEMALE'),
(4, 'user4', 'Bob Brown', 'bob@example.com', '222-222-2222', 'password4', 40,'MALE'),
(5, 'user5', 'Emma Davis', 'emma@example.com', '333-333-3333', 'password5', 28,'FEMALE');
 
-- Inserting into Bike Table
INSERT INTO Bike (BikeID, Type, Model, Status, Bike_Number)
VALUES
(101, 'Mountain Bike', 'Trek X-Caliber 7', 'Available', 'ABCD123'),
(102, 'Road Bike', 'Specialized Allez', 'Available', 'EFGH456'),
(103, 'Hybrid Bike', 'Giant Escape 3', 'Unavailable', 'IJKL789'),
(104, 'City Bike', 'Schwinn Discover', 'Available', 'MNOP456'),
(105, 'BMX Bike', 'Mongoose Legion', 'Available', 'QRST123');
 
-- Inserting into Rental Table
INSERT INTO Rental (RentalID, UserID, BikeID, StartTime, EndTime, Duration, Cost, DrivingLicense)
VALUES
(204, 1, 101, '2024-04-04 09:00:00', '2024-04-04 12:00:00', 3, 25.00, 'DL123456'),
(205, 2, 102, '2024-04-05 10:30:00', '2024-04-05 13:30:00', 3, 20.00, 'DL654321'),
(206, 3, 103, '2024-04-06 08:45:00', '2024-04-06 11:15:00', 2, 15.00, 'DL789012'),
(207, 4, 104, '2024-04-07 11:00:00', '2024-04-07 13:00:00', 2, 18.00, 'DL456789'),
(208, 5, 105, '2024-04-08 13:30:00', '2024-04-08 15:30:00', 2, 20.00, 'DL987654');
 
-- Inserting into Payment Table
INSERT INTO Payment (PaymentID, RentalID, User_Name, Amount, Method, Status)
VALUES
(304, 204, 'user1', 25.00, 'Credit Card', 'Paid'),
(305, 205, 'user2', 20.00, 'PayPal', 'Paid'),
(306, 206, 'user3', 15.00, 'Cash', 'Pending'),
(307, 207, 'user4', 18.00, 'Credit Card', 'Pending'),
(308, 208, 'user5', 20.00, 'Credit Card', 'Paid');
 
-- Inserting into Location Table
INSERT INTO Location (LocationID, Address, Contact, City)
VALUES
(4, '101 Pine St, Grovetown', '555-123-7890', 'Grovetown'),
(5, '789 Maple St, Lakewood', '555-456-1234', 'Lakewood'),
(6, '456 Cedar St, Springfield', '555-789-5678', 'Springfield'),
(7, '321 Birch St, Riverdale', '555-987-6543', 'Riverdale'),
(8, '987 Walnut St, Brookhaven', '555-321-8765', 'Brookhaven');
 
-- Inserting into Maintenance Table
INSERT INTO Maintenance (MaintenanceID, BikeID, Type, Date, Description)
VALUES
(404, 101, 'Tire Replacement', '2024-03-30', 'Replaced worn out tires'),
(405, 102, 'Brake Adjustment', '2024-03-31', 'Adjusted brake pads'),
(406, 103, 'Chain Lubrication', '2024-04-01', 'Lubricated bike chain'),
(407, 104, 'Wheel Alignment', '2024-04-02', 'Adjusted wheel alignment'),
(408, 105, 'Chain Replacement', '2024-04-03', 'Replaced bike chain');


 -- Use the specified database
USE BikeRentalSystem;
 
-- Drop tables if they exist (for testing purposes)
DROP TABLE IF EXISTS LocationInCity;
DROP TABLE IF EXISTS City;
 
-- Create City table
CREATE TABLE City (
    CityId INT PRIMARY KEY AUTO_INCREMENT,
    CityName VARCHAR(50),
    AvailableCenters INT DEFAULT 0
);
 
-- Create LocationInCity table
CREATE TABLE LocationInCity (
    Area_Name VARCHAR(100),
    Address VARCHAR(200),
    LandMark VARCHAR(200),
    PINCODE VARCHAR(20),
    Openingtime TIME,
    Closingtime TIME,
    CityId INT,
    FOREIGN KEY (CityId) REFERENCES City(CityId)
);
 
-- Insert cities into City table
INSERT INTO City (CityName, AvailableCenters) VALUES
    ('Bengaluru', 7),
    ('Delhi', 5),
    ('Bhubaneswar', 4),
    ('Mumbai', 6),
    ('Hyderabad', 3);
 
-- Insert locations into LocationInCity table for each city
-- Bengaluru locations
INSERT INTO LocationInCity (Area_Name, Address, LandMark, PINCODE, Openingtime, Closingtime, CityId) VALUES
    ('Koramangala', '123 Koramangala Main Road', 'Near Sony Signal', '560034', '9:00:00', '18:00:00', 1),
    ('Indiranagar', '456 6th Main Road', 'Opposite Metro Station', '560038', '10:00:00', '19:00:00', 1),
    ('Jayanagar', '789 4th Block', 'Near Jayanagar Park', '560011', '08:00:00', '17:00:00', 1),
    ('Whitefield', '101 Whitefield Road', 'Next to IT Park', '560066', '09:30:00', '18:30:00', 1),
    ('Marathahalli', '222 Outer Ring Road', 'Behind Tech Park', '560037', '08:30:00', '17:30:00', 1),
    ('Malleshwaram', '333 Sampige Road', 'Opposite Big Bazaar', '560003', '10:30:00', '19:30:00', 1),
    ('Electronic City', '444 Hosur Road', 'Near Infosys Campus', '560100', '07:00:00', '16:00:00', 1);
 
-- Delhi locations
INSERT INTO LocationInCity (Area_Name, Address, LandMark, PINCODE, Openingtime, Closingtime, CityId) VALUES
    ('Connaught Place', '1 CP Circle', 'Near Rajiv Chowk Metro', '110001', '10:00:00', '20:00:00', 2),
    ('Chanakyapuri', '2 Diplomatic Enclave', 'Next to Embassy Area', '110021', '09:30:00', '19:30:00', 2),
    ('Saket', '3 Select City Walk Road', 'Opposite PVR Cinema', '110017', '11:00:00', '21:00:00', 2),
    ('Karol Bagh', '4 Ajmal Khan Road', 'Near Gaffar Market', '110005', '08:30:00', '18:30:00', 2),
    ('Lajpat Nagar', '5 Central Market', 'Adjacent to Flyover', '110024', '09:00:00', '19:00:00', 2),
    ('Vasant Kunj', '6 Nelson Mandela Marg', 'Close to Fortis Hospital', '110070', '10:30:00', '20:30:00', 2),
    ('Rohini', '7 Rohini Sector 3', 'Near Japanese Park', '110085', '07:00:00', '17:00:00', 2);
 
-- Bhubaneswar locations
INSERT INTO LocationInCity (Area_Name, Address, LandMark, PINCODE, Openingtime, Closingtime, CityId) VALUES
    ('Bapuji Nagar', '123 Bapuji Nagar', 'Near Bapuji Nagar Park', '751009', '09:00:00', '18:00:00', 3),
    ('Satya Nagar', '456 Satya Nagar', 'Opposite Satya Nagar Market', '751007', '10:00:00', '19:00:00', 3),
    ('Nayapalli', '789 Nayapalli Road', 'Near Nayapalli Police Station', '751012', '08:00:00', '17:00:00', 3),
    ('Patia', '101 Patia Street', 'Next to Patia Hospital', '751024', '09:30:00', '18:30:00', 3);
 
-- Mumbai locations
INSERT INTO LocationInCity (Area_Name, Address, LandMark, PINCODE, Openingtime, Closingtime, CityId) VALUES
    ('Colaba', '1 Colaba Causeway', 'Near Gateway of India', '400001', '10:00:00', '20:00:00', 4),
    ('Bandra', '2 Bandra Hill Road', 'Opposite Bandra Station', '400050', '09:30:00', '19:30:00', 4),
    ('Andheri', '3 Andheri West Road', 'Near Andheri Metro Station', '400053', '11:00:00', '21:00:00', 4),
    ('Powai', '4 Powai Lake Road', 'Next to Powai IT Park', '400076', '08:30:00', '18:30:00', 4),
    ('Dadar', '5 Dadar West Market', 'Adjacent to Dadar Railway Station', '400028', '09:00:00', '19:00:00', 4),
    ('Worli', '6 Worli Sea Face', 'Close to Worli Sea Link', '400018', '10:30:00', '20:30:00', 4);
 
-- Hyderabad locations
INSERT INTO LocationInCity (Area_Name, Address, LandMark, PINCODE, Openingtime, Closingtime, CityId) VALUES
    ('Gachibowli', '1 Gachibowli Main Road', 'Near Microsoft Office', '500032', '10:00:00', '20:00:00', 5),
    ('Banjara Hills', '2 Banjara Hills Road', 'Opposite GVK Mall', '500034', '09:30:00', '19:30:00', 5),
    ('Hitech City', '3 Hitech City Road', 'Close To Hitech Metro Station','500081','11:00:00','21:00:00',5)