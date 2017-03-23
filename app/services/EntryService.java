
package services;

import models.Entry;

import java.util.List;

/**
 * Created by rchang on 3/22/17.
 */
public interface EntryService {

    List<Entry> getAllEntries();

    Integer addEntry(Entry item);
    

}
