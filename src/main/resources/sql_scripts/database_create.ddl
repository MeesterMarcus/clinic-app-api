
-- Drop table

-- DROP TABLE public.patients;

CREATE TABLE public.patients (
	id int8 NOT NULL,
	first_name varchar(255) NULL,
	last_name varchar(255) NULL,
	address varchar(255) NULL,
	city varchar(255) NULL,
	state varchar(255) NULL,
	zip varchar(50) NULL,
	email varchar(255) NULL,
	phone varchar(255) NULL,
	notes varchar NULL,
	CONSTRAINT patients_pkey PRIMARY KEY (id)
);

-- Drop table

-- DROP TABLE public.appointments;

CREATE TABLE public.appointments (
	id int8 NOT NULL,
	patient_id int8 NOT NULL,
	appt_datetime timestamptz NULL,
	notes varchar(255) NULL,
	appt_type varchar(255) NULL,
	complete varchar(15) NULL,
	CONSTRAINT appointments_pk PRIMARY KEY (id),
	CONSTRAINT appointments_fk FOREIGN KEY (patient_id) REFERENCES patients(id)
);

-- Drop table

-- DROP TABLE public.diagnosis;

CREATE TABLE public.diagnosis (
	id int8 NOT NULL,
	"name" varchar(255) NULL,
	description varchar(255) NULL,
	severity varchar(255) NULL,
	date_diagnosed timestamptz NULL,
	patient_id int8 NOT NULL,
	CONSTRAINT diagnosis_pk PRIMARY KEY (id),
	CONSTRAINT diagnosis_un UNIQUE (patient_id),
	CONSTRAINT diagnosis_fk FOREIGN KEY (patient_id) REFERENCES patients(id)
);
