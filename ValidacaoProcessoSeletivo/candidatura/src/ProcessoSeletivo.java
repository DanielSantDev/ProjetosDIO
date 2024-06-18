import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
        imprimirSelecionados();

        String [] candidatos = {"DANIEL","SAMMUEL", "PAULO", "MARCELO", "JULIANA"};
        for(String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO.");
        }while(continuarTentando && (tentativasRealizadas < 3));

        if(atendeu){
            System.out.println("Conseguimos contato com " +candidato+ " na " +tentativasRealizadas+ " tentativa.");
        } else {
            System.out.println("Nao conseguimos contato com " +candidato+ " numero maximo de tentativas " + tentativasRealizadas + " realizadas.");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"DANIEL","SAMMUEL", "PAULO", "MARCELO", "JULIANA"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento.");
        for(int indice=0; indice < candidatos.length ; indice++){
            System.out.println("O candidato de numero " + (indice+1) + " eh " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interacao for each");

        for (String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }

    static void selecaoCandidatos() {
        String [] candidatos = {"DANIEL","SAMMUEL", "PAULO", "MARCELO", "JULIANA", "FELIPE", "EMU", "LIS", "JOCA", "MANU"};

        int candidatosSelecionados = 0;
        int candidatosAtual=0;
        double salarioBase=2000.0;
        while((candidatosSelecionados < 5) && (candidatosAtual < candidatos.length)) {
            String candidato = candidatos[candidatosAtual];
            double salarioPrentido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPrentido);
            if(salarioBase >= salarioPrentido) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga.");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }

}
