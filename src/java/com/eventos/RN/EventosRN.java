package com.eventos.RN;

import com.eventos.ED.EventosED;

public class EventosRN {
    
    public boolean validaIncluir(EventosED eventoED) {
        return !eventoED.getDescricaoEvento().isEmpty() && eventoED.getDescricaoEvento().trim().length() != 0;
    } 
}
