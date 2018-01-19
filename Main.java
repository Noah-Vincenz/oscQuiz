public class Main {

	public static void main (String[] args){
		Crossing c = new Crossing();  		//Bridge b = new Bridge();
		//boolean dir = false;
/*
		 for(int i = 0; i < 5; ++i){
			System.out.println(i+":");
			if(i%2 == 0) {
				System.out.println("making Road");
				Thread t = new CrossingUser(c, "Road");
				t.start();
			}
			else {
				System.out.println("making Foot");   		 		Thread s = new CrossingUser(c, "Foot");    				s.start();
			}    			//dir = !dir;
		}
		*/
		Thread a = new CrossingUser(c, "FOOT");
		a.start();

		Thread b = new CrossingUser(c, "ROAD");
		b.start();

		Thread c2 = new CrossingUser(c, "FOOT");
		c2.start();

		Thread d = new CrossingUser(c, "ROAD");
		d.start();

		Thread e = new CrossingUser(c, "FOOT");
		e.start();

		Thread f = new CrossingUser(c, "ROAD");
		f.start();

		Thread g = new CrossingUser(c, "FOOT");
		g.start();

		Thread h = new CrossingUser(c, "ROAD");
		h.start();

		Thread i = new CrossingUser(c, "FOOT");
		i.start();

		Thread j = new CrossingUser(c, "ROAD");
		j.start();

		Thread k = new CrossingUser(c, "FOOT");
		k.start();

		Thread l = new CrossingUser(c, "ROAD");
		l.start();
	}
}
