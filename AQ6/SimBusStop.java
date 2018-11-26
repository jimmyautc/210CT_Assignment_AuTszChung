/*
	course:210ct
	Name:AuTszChung
	Program:SimBusStop.java
	Description: SimBusStop for calculate the bus stop
*/
import miscLib.SimpleInput;
import miscLib.GenLib;


public class SimBusStop {

    public static void main(String[] args) {
//    ListQueue t = new ListQueue();
	ArrayQueue t = new ArrayQueue(50);
	//declear variable
    int code, time, count;//count = people
    Integer item;
    int people = 0;
	int wait = 0;
	int bus = 0;
	int totalBusSeat = 0;
	int totalVacantSeat= 0;
	int peopleInQueue = 0;
	int remainWait=0;
		do {
			code = SimpleInput.getInteger("Code (0 for people, 1 for bus, -1 to exit): ");
		} while (code < -1 || code > 1);
		int lastTime = 0;
		while (code!=-1) {
			do {
				time = SimpleInput.getInteger("Arrival time (>="+Integer.toString(lastTime)+"): ");
			} while (lastTime > time);
			lastTime = time;
			do {
				count = SimpleInput.getInteger("Arrival count (> 0): ");
			} while (count <= 0);
			if (code==0) {
				people += count;
				peopleInQueue += count;
				while (count-- > 0)
					t.enqueue (new Integer(time));
			}
			else if (code==1) {
				totalBusSeat += count;
				bus ++ ;
				while ( (count-- > 0) && !t.empty ()){
					peopleInQueue--;
					item = (Integer) t.dequeue ();
					wait += time - item.intValue();
					//System.out.println(item.intValue());
				}
				totalVacantSeat += count;
			}
			do {
				code = SimpleInput.getInteger("Code (0 for people, 1 for bus, -1 to exit): ");
			} while (code < -1 || code > 1);
		}
		for(int i=peopleInQueue;i>0;i--){

			item = (Integer) t.dequeue ();
			remainWait +=lastTime - item.intValue();
		}
		
		if (people!=0)
			System.out.println (people + " people waited for " +
								wait + " minutes, average waiting time = " +
								(float) wait/people + " minutes "+
								"\nTotal "+ bus +" bus, "+
								"\nAvrage"+(float)people/bus+"people got on the bus"+
								"\nAvrage "+(float)totalVacantSeat/bus+" vacant seat bus"+
								"\nRemaining"+peopleInQueue+"people "+
								"\nAvarge remain time: "+(float)remainWait/peopleInQueue+" minutes"
			 );
	} // main

} // class SimBusStop