package com.example.randomNumGen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Random;
@SpringBootApplication
public class RandomNumGenApplication {
	public static void main(String []args){
		Random random = new Random();
		int rand = random.nextInt(10000) + 1000;
		System.out.println(rand);
	}
}
public static void main1(String []args) {
	SpringApplication.run(RandomNumGenApplication.class, args);
}