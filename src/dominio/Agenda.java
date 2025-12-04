package dominio;

import java.util.List;
import java.util.ArrayList;

public class Agenda {
    private List<Ticket> lista;

    public Agenda() {
        lista = new ArrayList<>();
    }

    public void add(Ticket t) {
        lista.add(t);
    }

    public Agenda filtrarVencidos(int zona) {
        Agenda resultado = new Agenda();
        for (Ticket t : lista) {
            if (t.getZona() == zona && t.vencido()) {
                resultado.add(t);
            }
        }
        return resultado;
    }

    public Agenda filtrarActivos(int zona) {
        Agenda resultado = new Agenda();
        for (Ticket t : lista) {
            if (t.getZona() == zona && !t.vencido()) {
                resultado.add(t);
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        if (lista.isEmpty()) return "No hay tickets en la agenda.\n";
        StringBuilder sb = new StringBuilder();
        for (Ticket t : lista) {
            sb.append(t.toString()).append("\n");
        }
        return sb.toString();
    }
}