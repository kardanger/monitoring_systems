CREATE TABLE sensors_type (id INTEGER PRIMARY KEY AUTO_INCREMENT, name VARCHAR(40) NOT NULL);

CREATE TABLE cameras_type (id INTEGER PRIMARY KEY AUTO_INCREMENT, name VARCHAR(40) NOT NULL);

CREATE TABLE compartment (id INTEGER PRIMARY KEY AUTO_INCREMENT, name VARCHAR(40) NOT NULL);

CREATE TABLE decks (id INTEGER PRIMARY KEY AUTO_INCREMENT, name VARCHAR(40) NOT NULL, link_img VARCHAR(100) NOT NULL);

CREATE TABLE control_systems (id INTEGER PRIMARY KEY AUTO_INCREMENT, name VARCHAR(40) NOT NULL);

CREATE TABLE videoarchive (id INTEGER PRIMARY KEY AUTO_INCREMENT, id_camera INTEGER NOT NULL, duration VARCHAR(40) NOT NULL,
begin_time VARCHAR(40) NOT NULL,
uri VARCHAR(40) NOT NULL);

CREATE TABLE sensors (id INTEGER PRIMARY KEY AUTO_INCREMENT, serial VARCHAR(40) NOT NULL, status VARCHAR(40) NOT NULL,
id_compartment INTEGER NOT NULL,
id_control_system INTEGER NOT NULL,
id_decks INTEGER NOT NULL,
id_sensors_type INTEGER NOT NULL,
FOREIGN KEY (id_sensors_type) REFERENCES sensors_type(id),
FOREIGN KEY (id_compartment) REFERENCES compartment(id),
FOREIGN KEY (id_decks) REFERENCES decks(id),
FOREIGN KEY (id_control_system) REFERENCES control_systems(id));

CREATE TABLE cameras (id INTEGER PRIMARY KEY AUTO_INCREMENT, name VARCHAR(40) NOT NULL,
serial VARCHAR(40) NOT NULL, status VARCHAR(40) NOT NULL,
id_compartment INTEGER NOT NULL,
id_decks INTEGER NOT NULL,
id_camera_type INTEGER NOT NULL,
FOREIGN KEY (id_compartment) REFERENCES compartment(id),
FOREIGN KEY (id_decks) REFERENCES decks(id),
FOREIGN KEY (id_camera_type) REFERENCES cameras_type(id));

INSERT INTO sensors_type (name) VALUES ('Датчик задраивания 1');
INSERT INTO sensors_type (name) VALUES ('Датчик затопления 1');
INSERT INTO sensors_type (name) VALUES ('Датчик задымления 1');

INSERT INTO cameras_type (name) VALUES ('Камера палубная 1');
INSERT INTO cameras_type (name) VALUES ('Камера внутриотсечная 1');

INSERT INTO compartment (name) VALUES ('Отсек 1');
INSERT INTO compartment (name) VALUES ('Отсек 2');
INSERT INTO compartment (name) VALUES ('Отсек 3');
INSERT INTO compartment (name) VALUES ('Отсек 4');
INSERT INTO compartment (name) VALUES ('Отсек 5');
INSERT INTO compartment (name) VALUES ('Отсек 6');
INSERT INTO compartment (name) VALUES ('Отсек 7');
INSERT INTO compartment (name) VALUES ('Отсек 8');
INSERT INTO compartment (name) VALUES ('Отсек 9');
INSERT INTO compartment (name) VALUES ('Отсек 10');

INSERT INTO decks (name, link_img) VALUES ('Палуба 1', '2b40fd31887e6c4140ef935abe29e162.png');
INSERT INTO decks (name, link_img) VALUES ('Палуба 2', '2d097ac5c02d2a3670a7546537e23c66.png');
INSERT INTO decks (name, link_img) VALUES ('Палуба 3', '02aa0871ddba285eab67a995f319332c.png');

INSERT INTO control_systems (name) VALUES ('Система контроля поступления воды');
INSERT INTO control_systems (name) VALUES ('Система контроля задраивания');

INSERT INTO cameras (name, serial, status, id_compartment, id_decks, id_camera_type) VALUES ('ТК-1', '0001', 'исправна', 1,1,1);
INSERT INTO cameras (name, serial, status, id_compartment, id_decks, id_camera_type) VALUES ('ТК-2', '0002', 'исправна', 2,1,1);
INSERT INTO cameras (name, serial, status, id_compartment, id_decks, id_camera_type) VALUES ('ТК-3', '0003', 'исправна', 3,1,1);
INSERT INTO cameras (name, serial, status, id_compartment, id_decks, id_camera_type) VALUES ('ТК-4', '0004', 'исправна', 4,1,1);
INSERT INTO cameras (name, serial, status, id_compartment, id_decks, id_camera_type) VALUES ('ТК-5', '0005', 'исправна', 5,1,1);
INSERT INTO cameras (name, serial, status, id_compartment, id_decks, id_camera_type) VALUES ('ТК-6', '0006', 'исправна', 6,2,2);
INSERT INTO cameras (name, serial, status, id_compartment, id_decks, id_camera_type) VALUES ('ТК-7', '0007', 'исправна', 7,2,2);
INSERT INTO cameras (name, serial, status, id_compartment, id_decks, id_camera_type) VALUES ('ТК-8', '0008', 'исправна', 8,2,2);
INSERT INTO cameras (name, serial, status, id_compartment, id_decks, id_camera_type) VALUES ('ТК-9', '0009', 'исправна', 9,2,2);
INSERT INTO cameras (name, serial, status, id_compartment, id_decks, id_camera_type) VALUES ('ТК-10', '0010', 'исправна', 10, 2,2);

INSERT INTO videoarchive (id_camera, duration, begin_time, uri) VALUES(1, '12:00:00', '13:00', '09 01 Tasks.mp4');
INSERT INTO videoarchive (id_camera, duration, begin_time, uri) VALUES(2, '13:00:00', '14:00', '09 02 Creating a Babel Transpiling Task.mp4');
INSERT INTO videoarchive (id_camera, duration, begin_time, uri) VALUES(3, '14:00:00', '15:00', '09 03 Watching with Babel.mp4');
INSERT INTO videoarchive (id_camera, duration, begin_time, uri) VALUES(4, '15:00:00', '16:00', '09 04 Transpiling TypeScript.mp4');
INSERT INTO videoarchive (id_camera, duration, begin_time, uri) VALUES(5, '16:00:00', '17:00', '09 05 OS Specific Commands.mp4');
INSERT INTO videoarchive (id_camera, duration, begin_time, uri) VALUES(6, '17:00:00', '13:00', '09 06 Problem Matchers.mp4');
INSERT INTO videoarchive (id_camera, duration, begin_time, uri) VALUES(7, '18:00:00', '14:00', '09 07 Automatic Gulp Detection.mp4');
INSERT INTO videoarchive (id_camera, duration, begin_time, uri) VALUES(8, '19:00:00', '15:00', '09 08 Custom Tasks with Gulp.mp4');
INSERT INTO videoarchive (id_camera, duration, begin_time, uri) VALUES(9, '20:00:00', '16:00', '09 09 Automatic Grunt Detection.mp4');
INSERT INTO videoarchive (id_camera, duration, begin_time, uri) VALUES(10, '21:00:00', '17:00', '09 10 Debugging Gulp and a Gulp Task.mp4');
INSERT INTO videoarchive (id_camera, duration, begin_time, uri) VALUES(10, '22:00:00', '18:00', '09 11 Debugging Tasks via Arguments.mp4');
INSERT INTO videoarchive (id_camera, duration, begin_time, uri) VALUES(10, '23:00:00', '19:00', '09 12 Recap.mp4');


INSERT INTO sensors (serial, status, id_compartment, id_control_system, id_decks, id_sensors_type) VALUES ('0001', 'исправен', 1,1,1,2);
INSERT INTO sensors (serial, status, id_compartment, id_control_system, id_decks, id_sensors_type) VALUES ('0002', 'исправен', 2,1,1,2);
INSERT INTO sensors (serial, status, id_compartment, id_control_system, id_decks, id_sensors_type) VALUES ('0003', 'исправен', 3,2,1,1);
INSERT INTO sensors (serial, status, id_compartment, id_control_system, id_decks, id_sensors_type) VALUES ('0004', 'исправен', 4,2,1,1);
INSERT INTO sensors (serial, status, id_compartment, id_control_system, id_decks, id_sensors_type) VALUES ('0005', 'исправен', 5,2,1,1);
INSERT INTO sensors (serial, status, id_compartment, id_control_system, id_decks, id_sensors_type) VALUES ('0006', 'исправен', 6,2,1,1);


select cameras.serial, cameras.status, cameras_type.name, decks.name, compartment.name from cameras
join cameras_type on cameras.id_camera_type = cameras_type.id
join decks on cameras.id_decks = decks.id
join compartment on cameras.id_compartment = compartment.id;

DROP TABLE videoarchive;
DROP TABLE cameras;
DROP TABLE sensors;
DROP TABLE cameras_type;
DROP TABLE sensors_type;
DROP TABLE compartment;
DROP TABLE decks;
DROP TABLE control_systems;