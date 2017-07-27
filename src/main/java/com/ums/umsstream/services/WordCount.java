package com.ums.umsstream.services;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Monjur-E-Morshed on 27-Jul-17.
 */
@Component
public class WordCount {

  @Autowired
  private JavaSparkContext mJavaSparkContext;

  public void count() {
    List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
    JavaRDD<Integer> distData = mJavaSparkContext.parallelize(data);
    System.out.println("Hey there...");
    System.out.println(distData);
  }

}
