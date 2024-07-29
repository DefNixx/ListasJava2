/*Atividade Avaliativa de Programação Orientada a Objetos 
criando lista sem duplicatas em java, não utilizando streams
@authors Nícolas André & Jefferson Eduardo */


import java.util.ArrayList;
import java.util.List;

public class Main 
{  
    //Declaração de método recebendo tipo genérico com loop pra identificar elementos duplicados
    public static <T> List<T> removerDuplicatas(List<T> lista) 
    {
        List<T> listaSemDuplicatas = new ArrayList<>();
        for (T elemento : lista) 
        {
            if (!listaSemDuplicatas.contains(elemento)) 
            {
                listaSemDuplicatas.add(elemento);
            }
        }
        return listaSemDuplicatas;
    }

    public static void main(String[] args) 
    {
        //Declaração de lista com duplicatas propositais para teste. 
        List<String> lista = new ArrayList<>();
        lista.add("As dores do mundo");
        lista.add("O mundo como vontade e representação");
        lista.add("Tractatus\n");
        lista.add("Fenomenologia do espírito");
        lista.add("Tractatus");
        lista.add("As dores do mundo");

        List<String> listaSemDuplicatas = removerDuplicatas(lista);
        System.out.println(listaSemDuplicatas);
    }
}