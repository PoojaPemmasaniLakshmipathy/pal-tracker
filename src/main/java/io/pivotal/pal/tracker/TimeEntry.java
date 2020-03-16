package io.pivotal.pal.tracker;

import java.time.LocalDate;

public class TimeEntry{
    private long id;
    private long projectId;
    private long userId;
    private LocalDate date;

    public TimeEntry(long projectId, long userId, LocalDate date, int hours) {
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    public TimeEntry(long id, long projectId, long userId, LocalDate date, int hours) {
        this.id = id;
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null || getClass()!=o.getClass()) return false;
        TimeEntry timeEntry = (TimeEntry) o;
       if(id != timeEntry.id) return false;
       if(projectId != timeEntry.projectId) return false;
       if(userId != timeEntry.userId) return  false;
       if(hours != timeEntry.hours) return  false;
       return date != null? date.equals(timeEntry.date) : timeEntry.date == null;
    }

    @Override
    public int hashCode() {
        int result = (int)(id ^ (id >>> 32));
        result = 31 * result + (int)(projectId ^ (projectId >>> 32));
        result = 31 * result + (int)(userId ^ (userId >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + hours;
        return result;
    }

    public TimeEntry() {
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "TimeEntry{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", userId=" + userId +
                ", date=" + date +
                ", hours=" + hours +
                '}';
    }

    private int hours;

    public LocalDate getDate() {
        return date;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

