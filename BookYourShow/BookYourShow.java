class BookYourShow
{
    show[] shows;
    int size;
    BookYourShow()
    {
        shows = new show[10];
        size = 0;
    }
    void addAShow(Show show)
    {
        shows[size] = show;
        size++;
    }

    Show getAShow(String movieName , String dateTime)
    {
        for(int i = 0 ; i <size ; i++)
        {
            if(shows[i].getMovieName().equals(movieName) && shows[i].getDateTime().equals(dateTime))
            {
                return shows[i];
            }
        }
        return null;
    }
}