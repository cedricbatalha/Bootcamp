package com.collection.set.map.ordenacao;

import com.collection.set.map.operacoesBasicas.AgendaContatos;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    //localdatetime, localzone, etc...
    private Map<LocalDate, Evento> eventosMap;

    //construtor
    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    //adicionar evento
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento (nome, atracao);
        eventosMap.put(data, evento);
        // ou eventosMap.put(data, new Evento (nome, atracao)) sem a primeira linha
    }

    //exibir agenda - ordenar com Treemap
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    //exibir proximo evento
    public void obterProximoEvento(){
        /* não pode usar abaixo, pois não se conhecem
        Set<LocalDate> dateSet = eventosMap.keySet()
        Collection<Evento> values = eventosMap.values();
         */
        //eventosMap.get(); tb não funciona pois não sabe qual a chave
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        //decalra o set com os seus valores, em vez de um objeto unico
        for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximaData +" acontecerá na data " + proximoEvento);
            }
            break;
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
}
