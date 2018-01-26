package com.sjmillington.course;


import com.sjmillington.core.BaseEntity;
import com.sjmillington.review.Review;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course extends BaseEntity{


    @NotNull
    @Size(min = 2, max=140)
    private String title;

    @NotNull
    private String url;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Review> reviews;

    protected Course(){ //only classes in this package can access it
        super();
        reviews = new ArrayList<>();
    }

    public Course(String title, String url) {
        this();
        this.title = title;
        this.url = url;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review){
        review.setCourse(this);
        reviews.add(review);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
}
