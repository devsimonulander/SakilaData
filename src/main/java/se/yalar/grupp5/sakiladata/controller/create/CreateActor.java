package se.yalar.grupp5.sakiladata.controller.create;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import se.yalar.grupp5.sakiladata.Handlers.ActorHandler;
import se.yalar.grupp5.sakiladata.entities.Actor;

import java.sql.Timestamp;

public class CreateActor {

    @FXML
    private TextField tfActorId, tfFirstName, tfLastName;

    @FXML
    void create() {
        Actor actor = new Actor();
        actor.setFirstName(tfFirstName.getText());
        actor.setLastName(tfLastName.getText());
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        actor.setLastUpdate(String.valueOf(timestamp));
        ActorHandler actorHandler = new ActorHandler();
        actorHandler.insert(actor);
    }

}
