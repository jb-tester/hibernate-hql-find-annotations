package com.example;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * *
 * <p>Created by irina on 9/6/2023.</p>
 * <p>Project: demo2</p>
 * *
 */
@Entity
@Table(name = "datesnumbers", schema = "jbtests")
public class Datesnumbers {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "first_num")
    private Integer firstNum;
    @Basic
    @Column(name = "second_num")
    private Integer secondNum;
    @Basic
    @Column(name = "float_one")
    private Double floatOne;
    @Basic
    @Column(name = "float_two")
    private Double floatTwo;
    @Basic
    @Column(name = "first_date")
    private Date firstDate;
    @Basic
    @Column(name = "second_date")
    private Date secondDate;
    @Basic
    @Column(name = "time_one")
    private Time timeOne;
    @Basic
    @Column(name = "time_two")
    private Timestamp timeTwo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(Integer firstNum) {
        this.firstNum = firstNum;
    }

    public Integer getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(Integer secondNum) {
        this.secondNum = secondNum;
    }

    public Double getFloatOne() {
        return floatOne;
    }

    public void setFloatOne(Double floatOne) {
        this.floatOne = floatOne;
    }

    public Double getFloatTwo() {
        return floatTwo;
    }

    public void setFloatTwo(Double floatTwo) {
        this.floatTwo = floatTwo;
    }

    public Date getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }

    public Date getSecondDate() {
        return secondDate;
    }

    public void setSecondDate(Date secondDate) {
        this.secondDate = secondDate;
    }

    public Time getTimeOne() {
        return timeOne;
    }

    public void setTimeOne(Time timeOne) {
        this.timeOne = timeOne;
    }

    public Timestamp getTimeTwo() {
        return timeTwo;
    }

    public void setTimeTwo(Timestamp timeTwo) {
        this.timeTwo = timeTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Datesnumbers that = (Datesnumbers) o;

        if (id != that.id) return false;
        if (firstNum != null ? !firstNum.equals(that.firstNum) : that.firstNum != null) return false;
        if (secondNum != null ? !secondNum.equals(that.secondNum) : that.secondNum != null) return false;
        if (floatOne != null ? !floatOne.equals(that.floatOne) : that.floatOne != null) return false;
        if (floatTwo != null ? !floatTwo.equals(that.floatTwo) : that.floatTwo != null) return false;
        if (firstDate != null ? !firstDate.equals(that.firstDate) : that.firstDate != null) return false;
        if (secondDate != null ? !secondDate.equals(that.secondDate) : that.secondDate != null) return false;
        if (timeOne != null ? !timeOne.equals(that.timeOne) : that.timeOne != null) return false;
        if (timeTwo != null ? !timeTwo.equals(that.timeTwo) : that.timeTwo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstNum != null ? firstNum.hashCode() : 0);
        result = 31 * result + (secondNum != null ? secondNum.hashCode() : 0);
        result = 31 * result + (floatOne != null ? floatOne.hashCode() : 0);
        result = 31 * result + (floatTwo != null ? floatTwo.hashCode() : 0);
        result = 31 * result + (firstDate != null ? firstDate.hashCode() : 0);
        result = 31 * result + (secondDate != null ? secondDate.hashCode() : 0);
        result = 31 * result + (timeOne != null ? timeOne.hashCode() : 0);
        result = 31 * result + (timeTwo != null ? timeTwo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Datesnumbers{" +
                "id=" + id +
                ", firstNum=" + firstNum +
                ", secondNum=" + secondNum +
                ", floatOne=" + floatOne +
                ", floatTwo=" + floatTwo +
                ", firstDate=" + firstDate +
                ", secondDate=" + secondDate +
                ", timeOne=" + timeOne +
                ", timeTwo=" + timeTwo +
                '}';
    }
}
