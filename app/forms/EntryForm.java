package forms;


import play.data.validation.Constraints.Required;


/**
 * Created by rchang on 3/23/17.
 */
public class EntryForm {

    @Required(message = "Please enter contents")
    private String contents;

    public void setContents(String contents) {
        this.contents = contents;
    }


    public String getContents() {
        return contents;
    }
}
