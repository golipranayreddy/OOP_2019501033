class Patron
{
    private String name;
    private String phoneNumber;
    private String[] = tickets;
    private int numberOfTickets;

    Patron(String name , String phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        tickets = new String[10];
        this.numberOfTickets = 0;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    

}