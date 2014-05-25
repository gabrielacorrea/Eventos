package com.senac.RN;

import com.eventos.ED.EventosED;

public class EventosRN {
    
    public boolean validaIncluir(EventosED eventoED) {
        if ((eventoED.getDescricaoEvento().isEmpty() || eventoED.getDescricaoEvento().trim().length() == 0))
            return false;
        else
            return true;
    } 
}
