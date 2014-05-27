package com.senac.MB;

import com.eventos.BD.EventosBD;
import com.eventos.ED.EventosED;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("EventosMB")
@SessionScoped
public class EventosMB implements Serializable{
    private EventosED eventosED;

    public EventosED getIdiomaED() {
        return eventosED;
    }

    public void setIdiomaED(EventosED idiomaED) {
        this.eventosED = idiomaED;
    }
    
    // Método que cria um novo objeto IdiomaED
    public String novoIdioma() {
        EventosED eventoED = new EventosED();
        return "cadastraIdioma";
    }

    // Método que manipula a inserção do objeto IdiomaED
    public String inclui() throws Exception {
        EventosBD bd = new EventosBD();
        bd.salva(eventosED);
        return "index";
    }  
    
    
    
    
    
}
