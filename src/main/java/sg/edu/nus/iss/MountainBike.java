package sg.edu.nus.iss;

public class MountainBike extends Bicycle {
    public int seatHeight;
    public int getSeatHeight(){
        return seatHeight;
    }
    
    public void setSeatHeight(int seatHeight){
        this.seatHeight = seatHeight;
    }

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        //return "MountainBike [seatHeight=" + seatHeight + "]";
        return super.toString() +"\nSeat Height" +seatHeight;
        //self added to include parent class//
    }

    
}
