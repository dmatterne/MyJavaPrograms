-- Reeks 4. : DDL: CREATE, ALTER en DROP
--    4.1. Creëer een nieuwe tabel DEPTCOPY voor de departementen, met dezelfde definitie als DEPT. Vul de tabel nog niet.
CREATE TABLE DEPTCOPY AS SELECT * FROM DEPT WHERE DEPTNO = -1;


-- 4.2. Bekommentarieer de tabel DEPTCOPY, alsook enkele kolommen.
-- comment on table deptcopy is 'This is a copy of the department table';

-- 4.3. Definieer een view VEMPCOPY die alle kolommen en rijen van EMPCOPY herneemt.
CREATE VIEW VEMPCOPY AS SELECT * FROM EMPCOPY;

-- 4.4. Creëer de primaire sleutels in de tabel EMPCOPY en DEPTCOPY.
ALTER TABLE DEPTCOPY ADD CONSTRAINT deptcopy_PK PRIMARY KEY (DEPTNO);
ALTER TABLE EMPCOPY ADD CONSTRAINT empcopy_PK PRIMARY KEY (EMPNO);

-- 4.5. Zoek in de dictionary de definities op van de tabellen die u zojuist gecreëerd hebt.
DESC DEPTCOPY;
DESC EMPCOPY;

-- 4.6. Vul de zojuist gecreëerde tabellen met op basis van de inhoud van EMP en DEPT.

INSERT INTO DEPTCOPY SELECT * FROM DEPT;
INSERT INTO EMPCOPY SELECT * FROM EMP;

-- 4.7. Om het werk van de gebruikers te vereenvoudigen, definieert u een view die alle personeelsleden met de
-- naam van hun manager toont. Vergeet ook niet de mensen zonder manager op te nemen in het view. Druk
-- deze lijst af.

CREATE VIEW PERS_MGR_LIST AS
SELECT e.ENAME AS EMPLOYEENAME,
e2.ENAME AS MANAGERNAME
FROM EMPCOPY e
LEFT OUTER JOIN EMPCOPY e2 ON e.MGR = e2.EMPNO

;

-- 4.8. Een bijkomende analyse van de toepassingen betreffende het personeelsbeheer toont aan dat het evenwel
-- nodig is over de voornaam en het telefoonnummer van elke werknemer te beschikken. 
-- Pas de definitie van tabel EMPCOPY overeenkomstig aan. Voeg in de dictionary als kommentaar bij deze kolommen de datum van hun kreatie toe.

ALTER TABLE EMPCOPY ADD COLUMN TEL_NR VARCHAR(14);
ALTER TABLE EMPCOPY ADD COLUMN FIRST_NAME VARCHAR(15);


-- 4.9. Geef voor enkele rijen waarden op voor de zojuist gecreëerde kolommen.

SELECT * FROM EMPCOPY;

UPDATE EMPCOPY SET TEL_NR = '011/111111', FIRST_NAME = 'JOHN' WHERE EMPNO = 7369;
UPDATE EMPCOPY SET TEL_NR = '022/222222', FIRST_NAME = 'THE' WHERE EMPNO = 7839;
UPDATE EMPCOPY SET TEL_NR = '033/333333', FIRST_NAME = 'WENTHWORTH' WHERE EMPNO = 7934;

-- 4.10. Schrijf een script waarin u een overzicht bekomt met alle objecten van uw schema.


-- 4.11. Verwijderalleobjektendieuindezeoefeningenreeksgekreëerdhebt,meteenminimumaaninstructies.
-- Verifieer in de dictionary.

DROP TABLE EMPCOPY;
DROP TABLE DEPTCOPY;
DROP VIEW VEMPCOPY;
DROP VIEW PERS_MGR_LIST;