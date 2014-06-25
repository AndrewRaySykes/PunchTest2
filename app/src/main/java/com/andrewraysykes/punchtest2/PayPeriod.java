package com.andrewraysykes.punchtest2;

import hirondelle.date4j.DateTime;

public class PayPeriod {
    private int id;
    private DateTime startDateTime;
    private DateTime endDateTime;
    private String timeZone;

    public PayPeriod() {
    }

    public PayPeriod(DateTime startDateTime, DateTime endDateTime, String timeZone) {
        super();
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.timeZone = timeZone;
    }

    /* GETTERS */

    public int getId() {
        return id;
    }


    public DateTime getStartDateTime() {
        return startDateTime;
    }

    public String getStartDateTimeForSql() {
        return startDateTime.format(PunchConstants.FORMAT_FOR_SQL);
    }

    public DateTime getEndDateTime() {
        return endDateTime;
    }

    public String getEndDateTimeForSql() {
        return endDateTime.format(PunchConstants.FORMAT_FOR_SQL);
    }

    public String getTimeZone() {
        return timeZone;
    }

    /* SETTERS */

    public void setId(int id) {
        this.id = id;
    }

    public void setStartDateTime(DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    public void setEndDateTime(DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public String toString() {
        return "PayPeriod [id=" + id +
                ", startDateTime=" + startDateTime.format(PunchConstants.FORMAT_FOR_SQL) +
                ", endDateTime=" + endDateTime.format(PunchConstants.FORMAT_FOR_SQL) +
                ", timeZone=" + timeZone +
                "]";
    }
}
