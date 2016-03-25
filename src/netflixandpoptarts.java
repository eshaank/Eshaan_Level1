
public class netflixandpoptarts {
	public static void main(String[] args) {
		// 3. Instantiate a NetflixQueue.
		// 4. Add your movies to the Netflix queue.
		// 5. Print all the movies in your queue.

		// 6. Use your NetflixQueue object to finish the sentence "the best movie is...."
		// 7. Use your NetflixQueue to finish the sentence "the second best movie is...."

		Movie movie1 = new Movie("Hi", 90);
		Movie movie2 = new Movie("Lol", 1);
		Movie movie3 = new Movie("Troll", 6);
		Movie movie4 = new Movie("Natural Born Pranksters", 3);
		Movie movie5 = new Movie("Natural Born Trollers", 21);

		NetflixQueue netflix = new NetflixQueue();

		movie1.getTicketPrice();
		movie2.getTicketPrice();
		movie3.getTicketPrice();
		movie4.getTicketPrice();
		movie5.getTicketPrice();

		movie1.getRating();
		movie2.getRating();
		movie3.getRating();
		movie4.getRating();
		movie5.getRating();

		netflix.addMovie(movie1);
		netflix.addMovie(movie2);
		netflix.addMovie(movie3);
		netflix.addMovie(movie4);
		netflix.addMovie(movie5);

		netflix.getMovie(0);
		netflix.sortMoviesByRating();
		netflix.printMovies();

		System.out.println("The best movie is... " + netflix.getBestMovie());
		System.out.println("The second best movie is... " + netflix.getMovie(1));
	}
}
