package com.example;

import org.hibernate.Session;
import org.hibernate.annotations.processing.Find;
import org.hibernate.annotations.processing.HQL;

import java.util.List;

interface SampleQueries {

    String QUERY = "where color = :color or sample = :sample";

    @HQL(QUERY)
    List<Sample> findSamplesByColorOrSample(String color, String sample, Session session);

    @HQL("where color = :color")
    List<Sample> findSamplesByColor(String color, Session session);



    @HQL("select count(*) from Sample s where s.sample = ?1")
    Long countSamplesBySample(String sample, Session session);
}