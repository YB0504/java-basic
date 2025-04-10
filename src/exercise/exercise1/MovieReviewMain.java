package exercise.exercise1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "ㅎㅎㅎ";
        movieReview1.review = "재밌음";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "zzz";
        movieReview2.review = "노잼";

        MovieReview[] movieReviews = new MovieReview[2];
        movieReviews[0] = movieReview1;
        movieReviews[1] = movieReview2;

        for (int i = 0; i < movieReviews.length; i++) {
            System.out.println("제목: " + movieReviews[i].title + " 리뷰: " + movieReviews[i].review);
        }

        for (MovieReview movieReview : movieReviews) {
            System.out.println("제목: " + movieReview.title + " 리뷰: " + movieReview.review);
        }
    }
}
