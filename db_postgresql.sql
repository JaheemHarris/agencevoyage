CREATE TABLE avion(
    id SERIAL PRIMARY KEY,
    modele VARCHAR(60),
    nombre_siege_affaire INT DEFAULT 0,
    nombre_siege_eco INT DEFAULT 0
);

INSERT INTO avion(modele, nombre_siege_affaire, nombre_siege_eco) VALUES ('2F345', 40, 100);
INSERT INTO avion(modele, nombre_siege_affaire, nombre_siege_eco) VALUES ('ZB456', 30, 80);
INSERT INTO avion(modele, nombre_siege_affaire, nombre_siege_eco) VALUES ('2TR34', 50, 125);

CREATE TABLE vol(
    id SERIAL PRIMARY KEY,
    id_avion INT NOT NULL,
    lieu_depart VARCHAR(120),
    lieu_arrivee VARCHAR(120),
    duree INT DEFAULT 0,
    date_depart DATE,
    heure_depart TIME,
    FOREIGN KEY (id_avion) REFERENCES avion(id)
);

CREATE TABLE reservation(
    id SERIAL PRIMARY KEY,
    id_vol INT NOT NULL,
    token VARCHAR(255),
    nombre_place INT,
    date_reservation TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_vol) REFERENCES vol(id)
);

CREATE OR REPLACE VIEW view_details_vol AS
SELECT
    v.id,
    a.id as id_avion,
    a.modele,
    a.nombre_siege_affaire,
    a.nombre_siege_eco,
    v.lieu_depart,
    v.lieu_arrivee,
    v.duree,
    v.date_depart,
    v.heure_depart
FROM vol v
JOIN avion a
ON v.id_avion = a.id;

SELECT *
FROM vol
WHERE date_depart = (
  SELECT date_depart
  FROM vol
  WHERE date_depart >= '2023-07-15'
  ORDER BY date_depart
  LIMIT 1
)
ORDER BY ABS(EXTRACT(EPOCH FROM (date_depart - '2023-07-15'))) ASC
LIMIT 1;

SELECT * FROM view_details_vol WHERE date_depart >= '2023-07-15' ORDER BY date_depart, heure_depart LIMIT 1;

ALTER TABLE reservation ADD COLUMN nombre_place INT DEFAULT 1;

CREATE OR REPLACE VIEW view_place_prix AS
SELECT 
    id_vol,
    SUM(nombre_place) AS total_place_prix
FROM reservation WHERE token IS NOT NULL GROUP BY id_vol;


CREATE OR REPLACE VIEW view_etat_vol AS
SELECT
    vdv.*,
    COALESCE(total_place_prix, 0) AS total_place_reserver,
    ((vdv.nombre_siege_affaire + vdv.nombre_siege_eco) - COALESCE(total_place_prix, 0))  AS nombre_place_disponible
FROM view_details_vol vdv
LEFT JOIN view_place_prix vpp
ON vdv.id = vpp.id_vol;


1081