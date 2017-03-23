package controllers;

import models.Entry;
import forms.EntryForm;

import play.data.Form;
import play.libs.Json;

import services.EntryService;
import play.*;
import play.mvc.*;

import views.html.*;

import java.util.List;


import javax.inject.Inject;


@org.springframework.stereotype.Controller

public class Application extends play.mvc.Controller {

    @Inject private EntryService entryService;

    public static Result index() {
        return ok(index.render("Ryan's Play App", Form.form(forms.EntryForm.class) ));
    }

    public Result getAllEntries() {
        List<Entry> entries = entryService.getAllEntries();
        return ok(Json.toJson(entries));
    }

    public Result addEntry() {
        play.data.Form<forms.EntryForm> f = play.data.Form.form(forms.EntryForm.class).bindFromRequest();
        forms.EntryForm entryForm = f.get();

        Entry newEntry = new Entry();
        newEntry.setContents(entryForm.getContents());
        
        entryService.addEntry(newEntry);
        return ok(index.render("Ryan's Play App", Form.form(forms.EntryForm.class) ));
    }




}
