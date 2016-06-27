/** Om de inhoud van de originele tabellen niet te wijzigen, kreëert u eerst een kopie van de tabellen 'EMP' en 'DEPT', en bevolkt u deze tabellen met dezelfde gegevens als de originele tabellen. De syntax hiervoor is:
CREATE TABLE empcopy AS SELECT * FROM emp;**/

CREATE TABLE EMPCOPY AS SELECT * FROM EMP;
CREATE TABLE DEPTCOPY AS SELECT * FROM DEPT;

/**3.1. Bij de aanwerving van twee nieuwe verkopers moeten gegevens in de EMPCOPY tabel ingevoerd worden. 
Het betreft Petersen en Johnson, die resp. personeelsnummer 9734 en 9736 krijgen toegekend. 
Zij zullen tewerkgesteld worden in departement 30 en hun salaris bedraagt $1200 per maand.**/
INSERT INTO EMPCOPY (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,DEPTNO,GENDER) VALUES(9734,'PETERSEN','SALESMAN',(SELECT EMPNO FROM EMP WHERE JOB = 'MANAGER' 
AND DEPTNO = (SELECT DEPTNO FROM DEPTCOPY WHERE DNAME = 'SALES')), now(),1200,(SELECT DEPTNO FROM DEPTCOPY WHERE DNAME = 'SALES'),'M');
INSERT INTO EMPCOPY (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,DEPTNO,GENDER) VALUES(9736,'JOHNSON','SALESMAN',(SELECT EMPNO FROM EMP WHERE JOB = 'MANAGER' 
AND DEPTNO = (SELECT DEPTNO FROM DEPTCOPY WHERE DNAME = 'SALES')),now(),1200,(SELECT DEPTNO FROM DEPTCOPY WHERE DNAME = 'SALES'),'M');

/**3.2. Als resultaat van een vormingscyclus blijken de clerks produktiever, en krijgen daarom een loonsverhoging van 10%.**/
UPDATE EMPCOPY e SET SAL = SAL * 1.10 WHERE UPPER(JOB) = 'CLERK';

/**3.3. Adams (empno 7876) verandert van job en wordt verkoper (Vergeet ook niet het departementnummer aan te passen). Zijn loon wordt met 10% verhoogd.**/
UPDATE EMPCOPY e SET e.JOB = 'SALESMAN', e.SAL = e.SAL * 1.10, e.DEPTNO = (SELECT DEPTNO FROM DEPTCOPY WHERE DNAME = 'SALES') WHERE e.EMPNO = 7876;

/**3.4. Clark (empno 7782) verlaat het bedrijf om elders zijn carrière uit te bouwen**/
DELETE FROM EMPCOPY WHERE EMPNO = 7782;

/**3.5. Lijst de verschillen uit tussen de tabellen EMP en EMPCOPY.**/
SELECT e.* FROM EMPCOPY e INNER JOIN EMP p ON e.EMPNO = p.EMPNO WHERE p.EMPNO IS NULL;
-- ( select empno, ename, 'deleted' status from emp
-- minus
-- select empno, ename, 'deleted'
-- from empcopy )
-- union
-- ( select empno, ename, 'inserted'
-- from empcopy
-- minus
-- select empno, ename, 'inserted' from emp)
-- union
-- ( select a.empno, a.ename, 'updated'
-- from empcopy a inner join emp b
-- on a.empno = b.empno
-- where ( a.job <> b.job or a.mgr <> b.mgr or a.hiredate <> b.hiredate or a.sal <> b.sal or a.comm <> b.comm or a.deptno <> b.deptno));

/**3.6. Verwijder alle rijen van EMPCOPY.**/


DELETE FROM EMPCOPY;

SELECT * FROM EMPCOPY;
SELECT * FROM DEPTCOPY;

DROP TABLE EMPCOPY;
DROP TABLE DEPTCOPY;