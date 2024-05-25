-- VERİTABANI OLUŞTURULUDU POSTGRES
CREATE DATABASE ticket_db
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LOCALE_PROVIDER = 'libc'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;




--TABLO OLUŞTURULDU
CREATE TABLE public.musteriler
(
    id bigserial NOT NULL,
    adi character varying(30) NOT NULL,
    soyadi character varying(50),
    yas integer DEFAULT 0,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.musteriler
    OWNER to postgres;

-- EKLEME KODU
INSERT INTO public.musteriler(adi,soyadi,yas) VALUES ('Oğuz','Akkaya','25');

SELECT *
FROM public.musteriler;