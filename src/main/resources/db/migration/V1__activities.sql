CREATE TABLE activities (id BIGINT AUTO_INCREMENT,
            start_time TIMESTAMP,
            activity_desc VARCHAR(255),
            activity_type VARCHAR(255),
            PRIMARY KEY (id));

CREATE TABLE track_points (id BIGINT AUTO_INCREMENT,
                            act_time DATE,
                            lat DOUBLE,
                            lon DOUBLE,
                            activityid BIGINT,
                            PRIMARY KEY(ID),
                            FOREIGN KEY (activityid) REFERENCES activities(id));

insert into activities(start_time,activity_desc,activity_type) values ('2021-01-01 12:30:00','Basketball in park','BASKETBALL');
insert into activities(start_time,activity_desc,activity_type) values ('2021-01-01 12:30:00','Biking at Buda','BIKING');
insert into activities(start_time,activity_desc,activity_type) values ('2020-01-10 12:30:00','Hiking in zoo','HIKING');