/** Reeks 2. : DML: SELECT - vervolg

/**2.1. Vraag alle werknemers met de naam van hun manager.**/

SELECT e.ENAME AS EMPLOYEE, e2.ENAME AS MANAGER FROM EMP e
INNER JOIN EMP e2 ON e.MGR = e2.EMPNO
;

/**2.2. Vraag alle werknemers met de naam van hun manager. Druk ook de werknemers af die geen manager
hebben.**/


SELECT e.ENAME AS EMPLOYEE, e2.ENAME AS MANAGER FROM EMP e
LEFT OUTER JOIN EMP e2 ON e.MGR = e2.EMPNO
;


/**2.3. Vraag alle departementen met hun respectievelijke werknemers. Ook de departementen zonder werknemers
moeten afgedrukt worden. Definieer een break per departement.**/

SELECT d.DNAME,e.ENAME FROM DEPT d
LEFT OUTER JOIN EMP e ON e.DEPTNO = d.DEPTNO
;


/**2.4. Vergelijk de koppels werknemers met dezelfde job. Druk enkel de gegevens (naam, loon en datum van
indiensttreding) af voor de werknemers die na hun collega's in dienst traden, maar die een hoger loon
verdienen.**/
select e1.ename, e1.sal, e1.hiredate, e2.ename, e2.sal, e2.hiredate
from emp e1 inner join emp e2 on e1.job = e2.job
where e1.hiredate > e2.hiredate and e1.sal > e2.sal;



/**2.5. Vraag alle werknemers die in hetzelfde departement werken als BLAKE.**/
SELECT * FROM EMP e2 WHERE e2.DEPTNO IN (SELECT e.DEPTNO FROM EMP e WHERE UPPER(e.ENAME) = 'BLAKE')
AND e2.ENAME <> 'BLAKE';


/**2.6. Vraag de departementen waar het gemiddelde loon hoger ligt dan het gemiddelde loon van de onderneming.**/

select d.deptno, d.dname
from emp e inner join dept d
on d.deptno = e.deptno
group by d.deptno, d.dname
having avg( sal ) > ( select avg( sal ) from emp );

/**2.7. Vraag naam, salaris en departement van alle werknemers die in hun departement het hoogste salaris
hebben.**/

SELECT e.ENAME, e.SAL,e.DEPTNO FROM EMP e
WHERE e.SAL = (SELECT MAX(e2.SAL) FROM EMP e2 WHERE e2.DEPTNO = e.DEPTNO);


/**2.8. Vraag alle werknemers die meer verdienen dan het gemiddelde loon van de collega's van hun departement,
en dit enkel voor de departementen met minstens 3 werknemers.**/


SELECT * FROM EMP e
WHERE e.SAL > (
	SELECT AVG(e2.SAL) 
	FROM EMP e2 WHERE e2.DEPTNO = e.DEPTNO
)
AND (SELECT COUNT(*) FROM EMP e3 WHERE e3.DEPTNO = e.DEPTNO) > 2;

/**2.9. Run het script gender.sql. Dit script voegt een kolom gender toe aan de tabel emp. Shrijf nadien een query
die voor elk departement het aantal mannen, aantal vrouwen en totaal aantal leden toont.**/

SELECT (SELECT COUNT(*) FROM EMP e1 WHERE e1.GENDER = 'M') AS NR_MEN,
(SELECT COUNT(*) FROM EMP e2 WHERE e2.GENDER = 'F') AS NR_WOMEN, (SELECT COUNT(*) FROM EMP) AS TOTAL FROM DUAL;


SELECT tf.DEPTNO, tf.DNAME, tf.NR_FEM, tm.NR_MEN, TF.NR_FEM + TM.NR_MEN AS TOTAL FROM (
SELECT d.DEPTNO , d.DNAME, count(e.EMPNO) AS NR_FEM, 0 AS NR_MEN FROM DEPT d 
LEFT OUTER JOIN emp e ON e.DEPTNO = d.DEPTNO
WHERE GENDER = 'F' OR GENDER IS NULL
GROUP BY d.DEPTNO) TF
INNER JOIN (SELECT d.DEPTNO, d.DNAME, 0 AS NR_FEM, count(e.EMPNO) AS NR_MEN  FROM DEPT d 
LEFT OUTER JOIN emp e ON e.DEPTNO = d.DEPTNO
WHERE GENDER = 'M' OR GENDER IS NULL
GROUP BY d.DEPTNO) TM ON TF.DEPTNO = TM.DEPTNO
;

SELECT * FROM EMP;
