package testClasses;

import org.zmeu.blog.jaxb.RetrieveMulderDetailsResponseData;

/**
 * Created by Heralt on 11.07.2017.
 */
public class TimePeriodDAO {

    private long start;

    private long end;

    private int number;

    private int timePeriodEndHour;



    public TimePeriodDAO(RetrieveMulderDetailsResponseData.MulderAgent.TimePeriods.TimePeriod timePeriod){
        this.start = timePeriod.getTimePeriodStart().toGregorianCalendar().getTimeInMillis();
        this.end = timePeriod.getTimePeriodEnd().toGregorianCalendar().getTimeInMillis();
        this.timePeriodEndHour = timePeriod.getTimePeriodEnd().getHour();
        this.number = timePeriod.getNumberOfProcessedCases();
    }

    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }

    public int getNumber() {
        return number;
    }

    public int getTimePeriodEndHour(){
        return timePeriodEndHour;
    }
}
