package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Entries")

public class Entry {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @Column(name = "contents", nullable = false)
    private  String contents;


    public void setContents(String contents) {
        this.contents = contents;
    }

}
