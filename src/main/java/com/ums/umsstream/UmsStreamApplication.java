package com.ums.umsstream;

import com.ums.umsstream.services.WordCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UmsStreamApplication implements CommandLineRunner {

  @Autowired
  private WordCount wordCount;


  @Override
  public void run(String... args) throws Exception {
    wordCount.count();
  }


  public static void main(String[] args) {

    SpringApplication.run(UmsStreamApplication.class, args);


  }
}
