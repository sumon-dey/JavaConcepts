package com.javaconcepts.polymorphism;

public class Movie {
	private String movieName;

	public Movie(String movieName) {
		this.movieName = movieName;
	}

	public String moviePlot() {
		return "No movie plot in here.";
	}

	public String getMovieName() {
		return movieName;
	}
}

class IronMan extends Movie {
	public IronMan() {
		super("IronMan");
	}

	@Override
	public String moviePlot() {
		return "A man becomes a superhero utilizing his technical abilities.";
	}
}

class Avengers extends Movie {
	public Avengers() {
		super("Avengers");
	}

	@Override
	public String moviePlot() {
		return "All the superheros of planet earth fight together to save the planet.";
	}
}

class CityLights extends Movie {
	public CityLights() {
		super("CityLights");
	}

	@Override
	public String moviePlot() {
		return "A Charlie Chaplin classic.";
	}
}
