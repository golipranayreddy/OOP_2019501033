class Show
{
    private String movieName;
    private String datetime;
    private String[] seats;
    Show(String movieName , String datetime , String[] seats)
    {
        this.movieName = movieName;
        this.datetime = datetime;
        this.seats = seats ;
    }

    public String getMovieName()
    {
        return movieName;
    }

    public void setMovieName(String movieName)
    {
        this.movieName = movieName;
    }

    public String getDateTime()
    {
        return datetime;
    }

    public void setDateTime(String datetime)
    {
        this.datetime = datetime;
    }

    public String[] getSeats()
    {
        return seats;
    }

    public void setSeats(String[] seats)
    {
        this.seats = seats;
    }

    public void bookAShow(patron p, String[] bookseats)
    {
        int count = 0;
        for(int i = 0 ;i < bookseats.length ; i++)
        {
            boolean flag = false;
            for(int j = 0; j < seats.length ; j++)
            {
                if(bookseats[i].equals(seats[j]))
                {
                    p.bookTickets(seats[j]);
                    seats[j] = null;
                    flag = true;

                }
            }
            if(flag == false)
            {
                count = count + 1;
                System.out.println(bookseats[i] + " not available ,  ");
            }
        }
        System.out.println();
        if(count > 0)
        {
            System.out.println("Tickets not booked due to unavailability");
        }
    }
    public void printTickets(patron p)
    {
        System.out.println(p + "\n" + movieName + "\n" + datetime);
    }

    public String toString()
    {
        return Arrays.toString(seats);
    }

}