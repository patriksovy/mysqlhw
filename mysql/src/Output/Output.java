package sk.kosickaakademia.kincel.mysql.output;

import sk.kosickaakademia.mysql.entity.City;
import sk.kosickaakademia.mysql.entity.Country;

import java.util.List;

public class Output{

    public void printCities(List<City> list){
        System.out.println("List of cities: ");
        for(City c: list){
            System.out.println(" - " + c.getName()+ " (" + c.getPopulation() + ")");
        }
    }

    public void printCountryInfo(Country country){

        if(country==null){
            System.out.println("Country does not exist!");
        }
        else{
            System.out.println("Name: " + country.getName() + " (" + country.getCode3() + ")");
            System.out.println("Capital city: " + country.getCapitalCity());
            System.out.println("Continent: " + country.getContinent());
            System.out.println("Surface area: " + country.getArea());
        }
    }
}