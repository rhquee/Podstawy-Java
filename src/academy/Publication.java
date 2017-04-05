package academy;

/**
 * Created by E550 on 2017-04-04.
 */

public class Publication {
    private String title;
    private Date publicationDate;

    public Publication() {
    }

    public Publication(String title, Date publicationDate) {
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
}