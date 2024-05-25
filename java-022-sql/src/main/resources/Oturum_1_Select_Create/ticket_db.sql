-- VERİTABANI OLUŞTURULDU MYSQL
CREATE SCHEMA `ticket_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;




-- tablo oluşturuldu
CREATE TABLE `ticket_db`.`musteriler` (
                                          `id` INT NOT NULL AUTO_INCREMENT,
                                          `adi` VARCHAR(30) NULL,
                                          `soyadi` VARCHAR(50) NULL,
                                          `yasi` INT NULL DEFAULT 0,
                                          PRIMARY KEY (`id`));


-- TABLODAKİ VERİLERİ GÖSTER
SELECT * FROM ticket_db.musteriler;

-- EKLEME KODLARI
INSERT INTO `ticket_db`.`musteriler` (`adi`) VALUES ('Hasan');
INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`, `yasi`) VALUES ('', 'Bakır', '22');
INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`, `yasi`) VALUES ('Oğuz', 'Akkaya', '25');

-- GÜNCELLEME YAPILDI
UPDATE `ticket_db`.`musteriler` SET `adi` = 'İlyas' WHERE (`id` = '2');


-- TABLODAKİ SEÇİLEN KOLON ÜZERİNDE NULL OLAMAZ SINIRLANDIRMASINI YAPTIK
ALTER TABLE "ticket_db".'musteriler' CHANGE COLUMN 'adi' 'adi' VARCHAR(30) NOT NULL;


-- EKLENECEK 4 YENİ KAYIT
INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`, `yasi`) VALUES ('Murat Çağrı', 'Özkan', '29');
INSERT INTO `ticket_db`.`musteriler` (`adi`) VALUES ('Samet');
INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`) VALUES ('Selahattin', 'Dişli');
INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`, `yasi`) VALUES ('Seren', 'Aşkın', '18');

-- BU SQL KODUNA DİKKAT HATA VERİR CUNKU ADI KOLONU ASLA NULL OLAMAZ!!
-- INSERT INTO `ticket_db`.`musteriler` (`soyadi`, `yasi`) VALUES ('Aşkın', '18');

-- TABLODAKİ VERİLER
SELECT * FROM ticket_db.musteriler;

-- TABLOYA YENİ BİR KOLON EKLEDİM  AMA İKİ KOLON ARASINA
ALTER TABLE `ticket_db`.`musteriler`
    ADD COLUMN `KIMLIK_NO` VARCHAR(11) NULL AFTER `id`;