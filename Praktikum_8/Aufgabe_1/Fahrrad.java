public class Fahrrad {
    private int ladung;

    private int maxspeed;
    private Fahrrad next;

    public Fahrrad (int newMaxspeed){
        this.next = null;
        this.maxspeed = newMaxspeed;
        this.ladung = 0;
    }

    public int speed(){
        if (ladung >= maxspeed) {
            return 0;
        } else {
            // Liefert die aktuelle Geschwindigkeit des Fahrrads
            return maxspeed - ladung;
        }
    }




    //___________SETTERS AND GETTERS_________________
    public int getLadung() {
        return ladung;
    }

    public void setLadung(int ladung) {
        this.ladung = ladung;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public Fahrrad getNext() {
        return next;
    }

    public void setNext(Fahrrad newNext) {
        this.next = newNext;
    }
    public boolean hasNext() {
        return next != null;
    }



}
