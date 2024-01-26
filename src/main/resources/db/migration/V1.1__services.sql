CREATE TABLE services (id UUID UNIQUE NOT NULL DEFAULT uuid_generate_v4(), name VARCHAR(20) NOT NULL UNIQUE, status int, PRIMARY KEY (id));
