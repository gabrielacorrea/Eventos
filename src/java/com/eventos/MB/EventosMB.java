package com.eventos.MB;

import com.eventos.BD.EventosBD;
import com.eventos.ED.EventosED;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

@Named("EventosMB")
@SessionScoped
public class EventosMB implements Serializable{
    private EventosED eventosED;
    private DataModel model;

    public EventosED getEventoED() {
        return eventosED;
    }

    public void setEventoED(EventosED eventoED) {
        this.eventosED = eventoED;
    }
    
    public String novoEvento() {
        eventosED = new EventosED();
        return "novo-evento";
    }

    public String inclui() throws Exception {
        EventosBD bd = new EventosBD();
        bd.salva(eventosED);
        return "index";
    }
    
    public DataModel getListaEventos() {
        EventosBD bd = new EventosBD();
        model = new ListDataModel(bd.lista());
        return model;
    }
}