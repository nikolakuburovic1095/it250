package com.mycompany.methotels.pages;

import com.mycompany.methotels.entities.Soba;
import java.util.ArrayList;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONObject;

import org.hibernate.Session;

/**
 *
 * @author nikola kuburovic 1095
 */
public class SpisakSoba {

    @Property
    private Soba soba;
    @Inject
    private Session session;
    
    @Property
    private ArrayList<Soba> sobe;
    
    /*@Property
    private DateComp datum;*/

    /*public DodavanjeSoba() {

    }*/

    void onActivate() {
        if (sobe == null) {
            sobe = new ArrayList<Soba>();
        }
        sobe = (ArrayList<Soba>) session.createCriteria(Soba.class).list();
    }
    @CommitAfter    
    Object onSuccess() {
        session.persist(soba);
        return this;
    }
    
    public JSONObject getOptions() {
        JSONObject json = new JSONObject();
        json.put("bJQueryUI", "true");
        json.put("bStateSave", true);
        json.put("bAutoWidth", true);
        return json;
    }

        
}
