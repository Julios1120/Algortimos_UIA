DELIMITER |
CREATE TRIGGER DELETE_DATA BEFORE DELETE ON TRABAJADOR
	FOR EACH ROW
    BEGIN
		DELETE FROM PERSONA WHERE OLD.IDPERSONA = OLD.IDPERSONA;
	END ;|
DELIMITER ;
