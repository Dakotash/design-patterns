package Adapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
The MediaAdapter class implements the Media interface and providies an interface for accessing 
implements the Media interface.
by Cody Hawkins
*/
public class MediaAdapter implements Media{

    //Inst var
    private LittleMedia littleMedia;

    /**
     * Creates a new MediaAdapter instance with the specified LittleMedia object.
     * @param littleMedia the LittleMedia object to adapt
     */
    public MediaAdapter(LittleMedia littleMedia){

        this.littleMedia = littleMedia;
    }

    /**
     * Returns the title of the media.
     * @return the title of the media
     */
    @Override
    public String getTitle() {
       return littleMedia.getTitle();
    }

    /**
     * Returns the author of the media.
     * @return the author of the media
     */   
    @Override
    public Author getAuthor() {
        String[] name = littleMedia.getAuthor().split(" ");
        return new Author(name[0],name[1]);
    }

    /**
     * Returns the description of the media.
     * @return the description of the media
     */
    @Override
    public String getDescription() {
        return littleMedia.getDescription();
    }

    /**
     * Adds a review to the media.
     * @param firstName the first name of the reviewer
     * @param lastName the last name of the reviewer
     * @param date the date the review was added
     * @param rating the rating given by the reviewer
     * @param comment the comment given by the reviewer
     */
    @Override
    public void addReview(String firstName, String lastName, Date date, double rating, String comment) {
         littleMedia.addReview(firstName+" "+lastName, date, (int) rating, comment);
    }

    /**
     * Returns a list of all reviews for the media.
     * @return a list of all reviews for the media
     */
    @Override
    public ArrayList<Review> getReviews() {
        ArrayList<Review> reviews = new ArrayList<Review>();
        try {
            SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
            for(int i = 0; i < littleMedia.getReviews().size(); i ++ ) {
                String[] splitComment = littleMedia.getReviews().get(i).split(" stars - ");
                double rating = Double.parseDouble(splitComment[0]);
                String[] splitCommentTwo = splitComment[1].split(" by ");
                String comment = splitCommentTwo[0];
                String username = splitCommentTwo[1];
                String[] dateString = splitCommentTwo[1].split(" - ");
                String[] firstAndLast = username.split(" ");
                Date date =  dateFormatter.parse(dateString[1]);
                reviews.add(new Review(firstAndLast[0], firstAndLast[1], date, rating, comment));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return reviews;
    }
    
}
