/**
 * Clock data type. Write a data type Clock.java that
 * represents time on a 24-hour clock, such as 00:00, 13:30, or
 * 23:59. Time is measured in hours (00–23) and minutes (00–59). 
 * To do so, implement the following public API:
 * 
 * @author Siva Sankar
 */

public class Clock {
    // Creates a clock whose initial time is h hrs and m min.
    /**
     * The parameterised constructor will instatiates the object with the values of
     * the parameters h and m to the respective hrs nad min.
     * @param h
     * @param m
     */
     int h;
     int m;
    public Clock(int h, int m) {
        this.h = h;
        this.m = m;

    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.

    public Clock(String s) {
        this.h = Integer.parseInt(s.substring(0,2));
        this.m = Integer.parseInt(s.substring(3,5));

    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        String s = "";
        if (h < 10)
        {
            s = s + "0" + h;
        }
        else
        {
            s = s + h;
        }

        s = s + ":" ;

        if (m < 10)
        {
            s = s + "0" + m;
        }
        else
        {
            s = s + m;
        }
        return s;
    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if( this.h > that.h)
        {
            return false;
        }
        else if( this.h < that.h)
        {
            return true;
        }
        else{
            if(this.m < that.m)
            {
                return true;
            }
            return false;
        }
        

        
    }

    private void check() {
        
    }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        if( h != 23 )
           {
           if ( m != 59)
           {
              m = m + 1;
           }
           else
              {
              m = 0;
              h = h + 1;
              }
            }
        else
        {
         if ( m != 59)
           {
              m = m + 1;
           }
           else
              {
              m = 0;
              h = 0 ;
              }
        }


        
    }

    // Adds Δ min to the time on this clock.
    public void toc(int delta) {
      for(int i = 0; i < delta ; i++)
      {
          this.tic();
      }
    }

    // Test client (see below).
    public static void main(String[] args) {
        Clock clock = new Clock("13:01");
        clock.toc(660);
        System.out.println(clock);
    }
}