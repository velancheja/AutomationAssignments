package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArraysAndCollectionsAssignment {

	public static void main(String[] args) {
		
		//Create a list of the top 5 most populated countries in the world and print 2nd Country
		System.out.println("****Assignment1****");
		List<String> countries = new ArrayList<String>();
		countries.add("China");
		countries.add("India");
		countries.add("United States");
		countries.add("Indonesia");
		countries.add("Pakistan");
		System.out.println("World second populated country is: " +countries.get(1));
		
		//Create a set of the top 10 most visited tourist attractions in the world and print out its size.
		System.out.println("****Assignment2****");
		Set<String> touristAttractions = new LinkedHashSet<String>();
		touristAttractions.add("Empire State Building");
		touristAttractions.add("Eiffel Tower");
		touristAttractions.add("Anne Frank House");
		touristAttractions.add("Basílica de la Sagrada Familia");
		touristAttractions.add("Colosseum");
		touristAttractions.add("Louvre Museum");
		touristAttractions.add("Gardens by the Bay");
		touristAttractions.add("Duomo di Milano");
		touristAttractions.add("Sheikh Zayed Grand Mosque Centre");
		touristAttractions.add("Cayman Crystal Caves");
		System.out.println("World top 10 most visited country is: " +touristAttractions.size());
		
		//Create a map of the 5 largest cities in the United States and their populations.
		System.out.println("****Assignment3****");
		Map<String,Integer> populatedCities = new LinkedHashMap<String,Integer>();
		populatedCities.put("New york city",1351522);
		populatedCities.put("Los Angeles",1675393);
		populatedCities.put("Chicago",2487089);
		populatedCities.put("Phoenix",1225202);
		populatedCities.put("Philadelphia",2185122);
		System.out.println("Top 5 Largest cities in the united states is: " +populatedCities);
		
		//Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		System.out.println("****Assignment4****");
		List<Integer> randomNumbers = new ArrayList<Integer>();
		randomNumbers.add(2);
		randomNumbers.add(4);
		randomNumbers.add(6);
		randomNumbers.add(3);
		randomNumbers.add(8);
		randomNumbers.add(9);
		randomNumbers.add(1133);
		randomNumbers.add(12);
		randomNumbers.add(17);
		randomNumbers.add(19);
		Integer value = randomNumbers.get(2) + randomNumbers.get(4);
		System.out.println("value: " +value);
		
		System.out.println("****Assignment5****");
		List<String> moviesList = new ArrayList<String>();
		moviesList.add("Avatar");
		moviesList.add("Avenger");
		moviesList.add("Titanic");
		moviesList.add("Starwar");
		moviesList.add("Spider Man");
		System.out.println("Third highest-grossing movies is: " +moviesList.get(2));
		
		
	}

}
