package com.realdolmen.theory;

/**
 * Created by stannisbaratheon on 02/06/16.
 */
public class Runner {
    public static void main(String[] args) {

        Worker work = new Worker ("I will not bee your bee worker you bee!",110);
        work.setCapacity(100);
        work.setLoad(20);
        work.setName("I bee your bee worker!");
        work.fly();
        //work.gatherNectar();
        //work.gatherNectar();
        //work.gatherNectar();
        //work.gatherNectar();

        Worker workers = new Worker ("Bob de bouwer", 50);
        workers.setName("Maya");
        //workers.fly();
        //workers.gatherNectar();

        Worker worker2 = new Worker("Michel" , 200, 70);
        //worker2.fly();
        //worker2.gatherNectar();

        Soldier soldier1 = new Soldier("Soldier",10,10,10);
        //soldier1.fly();
        //soldier1.fight();

        Worker w1 = new Worker("Worker 1",0,0);
        Worker w2 = new Worker("Worker 2",100,0);
        Worker w3 = new Worker("Worker 3",100,90);
        Worker w4 = new Worker("Worker 4",100,100);

        Flower f1 = new Flower();
        Flower f2 = new Flower("Name 1","Purple",50);
        Flower f3 = new Flower("Name 2","Purple",50);
        Flower f4 = new Flower("Name 3","Purple",50);

        System.out.println(f1.acceptWorker(w1));
        System.out.println(f1.acceptWorker(w2));
        System.out.println(f2.acceptWorker(w1));

    }
}
