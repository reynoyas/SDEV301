package tickets;

public class VIPTicket extends Ticket{
    //fields
    private String freebies;

    // default constructor
    public VIPTicket(){
        // optional to put super()
        // java wil make this call for us
        super();
        setCost(100.0);
        this.freebies = "Free Beer";
    }

    public VIPTicket(String owner, double cost, String freebie){
        super(owner, cost);
        this.freebies = freebie;
    }

    @Override
    public String getType(){
        return "VIP";
    }

    // methods
    public String getFreebies() {
        return freebies;
    }

    public void setFreebies(String freebies) {
        this.freebies = freebies;
    }

    //toString
    @Override
    public String toString(){
        String ticket = super.toString();
        // going to find the index to add freebie
        int index = ticket.indexOf("E| ");
        // Won't get the e
        String vip = ticket.substring(0, index) +
                    "E|  " + getFreebies() +
                    System.lineSeparator();
        return vip + addEquals("T|");
    }
}
