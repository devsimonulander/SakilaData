package se.yalar.grupp5.sakiladata.controller.create;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import se.yalar.grupp5.sakiladata.Handlers.ActorHandler;
import se.yalar.grupp5.sakiladata.entities.Actor;

public class CreateActor {

    @FXML
    private TextField tfActorId, tfFirstName, tfLastName;

    @FXML
    void create(){
        Actor actor = new Actor();
        actor.setId(Integer.parseInt(tfActorId.getText()));
        actor.setFirstName(tfFirstName.getText());
        actor.setLastName(tfLastName.getText());
        ActorHandler actorHandler = new ActorHandler();
        actorHandler.insert(actor);
    }


}
