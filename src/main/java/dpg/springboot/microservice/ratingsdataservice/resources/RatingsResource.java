package dpg.springboot.microservice.ratingsdataservice.resources;

import dpg.springboot.microservice.ratingsdataservice.models.Rating;
import dpg.springboot.microservice.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId,4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        List<Rating> ratingList = Arrays.asList(
                new Rating("M1",3),
                new Rating("M2",4),
                new Rating("M3",2),
                new Rating("M4",1),
                new Rating("M5",5)
        );
//        return ratingList;
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratingList);
        return userRating;
    }
}
