-- V1__initialise_database.sql

CREATE SEQUENCE s_provider_id START WITH 1;
CREATE TABLE provider (
    id INT NOT NULL,
    name VARCHAR(50) NOT NULL,
    fullname VARCHAR(80) NOT NULL,
    type INT NOT NULL DEFAULT 0,
    CONSTRAINT provider_pk PRIMARY KEY (ID),
    constraint provider_uk unique (name)
    );
INSERT INTO provider (id, name, fullname, type) VALUES (1, 'nb', 'Netz Burgenland', 0);
INSERT INTO provider (id, name, fullname, type) VALUES (2, 'huf', 'Huawei Fusion', 1);

CREATE SEQUENCE s_users_id START WITH 1;
CREATE TABLE users (
      id INT NOT NULL,
      name VARCHAR(50) NOT NULL,
      firstname VARCHAR(80) NOT NULL,
      surename VARCHAR(80) NOT NULL,
      email VARCHAR(80) NOT NULL,
      CONSTRAINT users_pk PRIMARY KEY (ID),
      CONSTRAINT users_uk UNIQUE (name)
);
INSERT INTO users (id, name, firstname, surename, email) VALUES (1, 'mschmit', 'Michael', 'Schmit', 'michael.schmit@schmit-it.com');

CREATE SEQUENCE s_provider_accouts_id START WITH 1;
CREATE TABLE provider_accounts (
      id INT NOT NULL,
      user_id INT NOT NULL,
      provider_id INT NOT NULL,
      username VARCHAR(50) NOT NULL,
      password VARCHAR(120) NOT NULL,
      CONSTRAINT provider_accounts_pk PRIMARY KEY (ID)
);
INSERT INTO provider_accounts (id, user_id, provider_id, username, password) VALUES (1, 1, 1, '497052', 'uKAgpQXva0BzDHVNCqmLQfA+ePRAuWKo5tusnYeL92ZCOf+n+rMsVwZKBzsCPo3g');
INSERT INTO provider_accounts (id, user_id, provider_id, username, password) VALUES (2, 1, 2, 'MSchmit', 'Gg96pLoE6JmLrqkVg1W5E9XzXATZhNSqGwWRJ6FDqKAFsdUyLC+8GwZy4ZNL9JYE');


CREATE TABLE values_day (
       stime TIMESTAMP NOT NULL DEFAULT current_timestamp,
       meter_id VARCHAR(60) NOT NULL,
       datapoint_name VARCHAR(40) NOT NULL,
       provider_account_id INT NOT NULL,
       value FLOAT,
       counter_value FLOAT,
       type INT NOT NULL ,
       CONSTRAINT values_day_pk PRIMARY KEY (stime, meter_id, datapoint_name, provider_account_id)
);

CREATE TABLE values_hour (
        stime TIMESTAMP NOT NULL DEFAULT current_timestamp,
        meter_id VARCHAR(60) NOT NULL,
        datapoint_name VARCHAR(40) NOT NULL,
        provider_account_id INT NOT NULL,
        value FLOAT,
        counter_value FLOAT,
        type INT NOT NULL ,
        CONSTRAINT values_hour_pk PRIMARY KEY (stime, meter_id, datapoint_name, provider_account_id)
);

CREATE TABLE values_month (
         stime TIMESTAMP NOT NULL DEFAULT current_timestamp,
         meter_id VARCHAR(60) NOT NULL,
         datapoint_name VARCHAR(40) NOT NULL,
         provider_account_id INT NOT NULL,
         value FLOAT,
         counter_value FLOAT,
         type INT NOT NULL ,
         CONSTRAINT values_month_pk PRIMARY KEY (stime, meter_id, datapoint_name, provider_account_id)
);

CREATE TABLE values_spontan (
        stime TIMESTAMP NOT NULL DEFAULT current_timestamp,
        meter_id VARCHAR(60) NOT NULL,
        datapoint_name VARCHAR(40) NOT NULL,
        provider_account_id INT NOT NULL,
        value FLOAT,
        counter_value FLOAT,
        type INT NOT NULL ,
        CONSTRAINT values_spontan_pk PRIMARY KEY (stime, meter_id, datapoint_name, provider_account_id)
);

CREATE TABLE values_year (
        stime TIMESTAMP NOT NULL DEFAULT current_timestamp,
        meter_id VARCHAR(60) NOT NULL,
        datapoint_name VARCHAR(40) NOT NULL,
        provider_account_id INT NOT NULL,
        value FLOAT,
        counter_value FLOAT,
        type INT NOT NULL ,
        CONSTRAINT values_year_pk PRIMARY KEY (stime, meter_id, datapoint_name, provider_account_id)
);