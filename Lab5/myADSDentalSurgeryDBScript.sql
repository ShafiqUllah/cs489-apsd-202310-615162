CREATE DATABASE IF NOT EXISTS ADS;
CREATE TABLE Addresses (
    AddressID INT PRIMARY KEY AUTO_INCREMENT,
    StreetAddress VARCHAR(255) NOT NULL,
    City VARCHAR(100) NOT NULL,
    State VARCHAR(50) NOT NULL,
    ZipCode VARCHAR(10) NOT NULL
);


CREATE TABLE Dentists (
    DentistID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    ContactPhone VARCHAR(15),
    Email VARCHAR(100) UNIQUE,
    Specialization VARCHAR(100),
    AddressID INT,
    FOREIGN KEY (AddressID) REFERENCES Addresses(AddressID)
);


CREATE TABLE Patients (
    PatientID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    ContactPhone VARCHAR(15),
    Email VARCHAR(100) UNIQUE,
    DateOfBirth DATE,
    AddressID INT,
    FOREIGN KEY (AddressID) REFERENCES Addresses(AddressID)
);


CREATE TABLE Surgeries (
    SurgeryID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100) NOT NULL,
    AddressID INT,
    TelephoneNumber VARCHAR(15),
    FOREIGN KEY (AddressID) REFERENCES Addresses(AddressID)
);

CREATE TABLE Appointments (
    AppointmentID INT PRIMARY KEY AUTO_INCREMENT,
    DentistID INT,
    PatientID INT,
    AppointmentDateTime DATETIME NOT NULL,
    SurgeryLocation INT,
    Status ENUM('Scheduled', 'Cancelled', 'Completed') DEFAULT 'Scheduled',
    FOREIGN KEY (DentistID) REFERENCES Dentists(DentistID),
    FOREIGN KEY (PatientID) REFERENCES Patients(PatientID),
    FOREIGN KEY (SurgeryLocation) REFERENCES Surgeries(SurgeryID)
);

INSERT INTO Addresses (StreetAddress, City, State, ZipCode)
VALUES
    ('615162 main st', 'Cityville', 'CA', '12345'),
    ('fairfiled St', 'Merdoch', 'NY', '12346'),
    ('MIU St', 'vally', 'TX', '12345');

INSERT INTO Dentists (FirstName, LastName, ContactPhone, Email, Specialization, AddressID)
VALUES
    ('Shafiq', 'Ullah', '555-000-1234', 'shafiq.ullah@example.com', 'General Dentistry', 1),
    ('smith', 'waker', '555-000-1235', 'waker.smith@example.com', 'Orthodontics', 2),
    ('Delwar', 'matt', '555-000-1236', 'em2@example.com', 'Endodontics', 3);

INSERT INTO Patients (FirstName, LastName, ContactPhone, Email, DateOfBirth, AddressID)
VALUES
    ('Kallu', 'mymen', '666-000-1234', 'ex1@example.com', '1990-05-15', 2),
    ('Bright', 'Denver', '666-000-1235', 'ex2@example.com', '1985-08-20', 3),
    ('keren', 'singh', '666-000-1236', 'ex3@example.com', '2000-12-10', 1);


INSERT INTO Surgeries (Name, AddressID, TelephoneNumber)
VALUES
    ('Dental Clinic', 1, '555-111-1111'),
    ('Fairfield Family Dentistry', 2, '555-222-2222'),
    ('St louis Dental Center', 3, '555-333-3333');

INSERT INTO Appointments (DentistID, PatientID, AppointmentDateTime, SurgeryLocation, Status)
VALUES
    (1, 1, '2023-10-15 09:00:00', 1, 'Scheduled'),
    (2, 2, '2023-10-16 14:30:00', 2, 'Scheduled'),
    (3, 3, '2023-10-17 10:15:00', 3, 'Scheduled');



SELECT * FROM Dentists ORDER BY LastName ASC;
 
SELECT A.AppointmentID, A.AppointmentDateTime, A.Status, P.FirstName AS PatientFirstName, P.LastName AS PatientLastName
FROM Appointments A
INNER JOIN Patients P ON A.PatientID = P.PatientID
WHERE A.DentistID = 1;

SELECT A.AppointmentID, A.AppointmentDateTime, A.Status, D.FirstName AS DentistFirstName, D.LastName AS DentistLastName, P.FirstName AS PatientFirstName, P.LastName AS PatientLastName
FROM Appointments A
INNER JOIN Dentists D ON A.DentistID = D.DentistID
INNER JOIN Patients P ON A.PatientID = P.PatientID
WHERE A.SurgeryLocation = 1;
 
SELECT A.AppointmentID, A.AppointmentDateTime, A.Status, D.FirstName AS DentistFirstName, D.LastName AS DentistLastName
FROM Appointments A
INNER JOIN Dentists D ON A.DentistID = D.DentistID
WHERE A.PatientID = 1 AND DATE(A.AppointmentDateTime) = '2023-10-15';