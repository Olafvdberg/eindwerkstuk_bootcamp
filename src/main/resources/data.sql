INSERT INTO customers (first_name, last_name, emailadres, adres, phonenumber)
VALUES ('olaf', 'van den berg', 'olafvdberg@hotmail.com', 'Bovendijk 61', '0658982145'), ('Peter', 'van boom', 'petervanboom@hotmail.com', 'Sluisstraat 45', '0658988268');

INSERT INTO car (brand, type, license_plate)
VALUES ('Fiat', 'punto', 'zl-42-br'), ('Mercedes', 'A45', 'zl-dr-54');

INSERT INTO actions (action_name, action_price, action_used_name, action_used_price)
VALUES ('moterolie vervangen', 20, 'moterolie vervangen', 20), ('ruitenwisser vervangen', 25, 'ruitenwisser vervangen', 25);

INSERT INTO APK (apk_date, apk_status, found_errors, apk_price)
VALUES ('05-12-2021', 'goedgekeurd', 'strepen ruitenwisser', 45), ('08-12-2021', 'controle', 'voorlamp brandt niet', 45);

INSERT INTO mechanics (first_name, last_name)
VALUES ('kees', 'bergkamp'), ('klaas', 'malen');

INSERT INTO parts (part_name, part_price, part_used_name, part_used_price)
VALUES ('moterolie', 20, 'moterolie', 20), ('ruitenwisser', 15, 'ruitenwisser', 15);

INSERT INTO reperations (reperation_date, status)
VALUES ('05-12-2021', 'gedaan'), ('08-12-2021', 'bezig');

INSERT INTO stock (part_name_stock, part_price_stock, amount_in_stock)
VALUES ('moterolie', 20, 12), ('ruitenwisser', 15, 16);

