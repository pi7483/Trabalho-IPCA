import java.util.ArrayList;

/**
 * @author Pietro Rigon Oliveira
 * Programação Orientada a objetos
 * Exercicio 1
 * 
 */
public class Tentativa3{
    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        ArrayList<Variacao> list = new ArrayList<>();//ArrayList de objetos do tipo Variacao.

        //colocar em ordem: Variacao(Double), Mês da Variacao(int), Local(String), Sigla(String), Tipo(String)
        //POA:-1.11	-0.83	-0.38	0.75	0.58	1.06	0.7	0.13	0.84	2.63	-0.52	-1.62

        Variacao varAlimentosPOA0= new Variacao(-1.11, 1, "Porto Alegre", "(POA)", "Alimentação");//Variações em POA sobre alimentos.
        Variacao varAlimentosPOA1= new Variacao(-0.83, 2, "Porto Alegre", "(POA)", "Alimentação");
        Variacao varAlimentosPOA2= new Variacao(-0.38, 3, "Porto Alegre", "(POA)", "Alimentação");
        Variacao varAlimentosPOA3= new Variacao(0.75, 4, "Porto Alegre", "(POA)", "Alimentação");
        Variacao varAlimentosPOA4= new Variacao(0.58, 5, "Porto Alegre", "(POA)", "Alimentação");
        Variacao varAlimentosPOA5= new Variacao(1.06, 6, "Porto Alegre", "(POA)", "Alimentação");
        Variacao varAlimentosPOA6= new Variacao(0.7, 7, "Porto Alegre", "(POA)", "Alimentação");
        Variacao varAlimentosPOA7= new Variacao(0.13, 8, "Porto Alegre", "(POA)", "Alimentação");
        Variacao varAlimentosPOA8= new Variacao(0.84, 9, "Porto Alegre", "(POA)", "Alimentação");
        Variacao varAlimentosPOA9= new Variacao(2.63, 10, "Porto Alegre", "(POA)", "Alimentação");
        Variacao varAlimentosPOA10= new Variacao(-0.52, 11, "Porto Alegre", "(POA)", "Alimentação");
        Variacao varAlimentosPOA11= new Variacao(-1.62, 12, "Porto Alegre", "(POA)", "Alimentação");
        //--------------------------------------------------------0.75	-0.7	0.71	0.59	0.98	0.74	1.17	0.61	0.87	0.46	0.78	-0.72
        Variacao varAlimentosSP0= new Variacao(0.75, 1, "São Paulo", "(SP)", "Alimentação");//Variações em SP sobre alimentos.
        Variacao varAlimentosSP1= new Variacao(-0.7, 2, "São Paulo", "(SP)", "Alimentação ");
        Variacao varAlimentosSP2= new Variacao(0.71, 3, "São Paulo", "(SP)", "Alimentação ");
        Variacao varAlimentosSP3= new Variacao(0.59, 4, "São Paulo", "(SP)", "Alimentação ");
        Variacao varAlimentosSP4= new Variacao(0.98, 5, "São Paulo", "(SP)", "Alimentação ");
        Variacao varAlimentosSP5= new Variacao(0.74, 6, "São Paulo", "(SP)", "Alimentação ");
        Variacao varAlimentosSP6= new Variacao(1.17, 7, "São Paulo", "(SP)", "Alimentação ");
        Variacao varAlimentosSP7= new Variacao(0.61, 8, "São Paulo", "(SP)", "Alimentação");
        Variacao varAlimentosSP8= new Variacao(0.87, 9, "São Paulo", "(SP)", "Alimentação");
        Variacao varAlimentosSP9= new Variacao(0.46, 10, "São Paulo", "(SP)", "Alimentação");
        Variacao varAlimentosSP10= new Variacao(0.78, 11, "São Paulo", "(SP)", "Alimentação");
        Variacao varAlimentosSP11= new Variacao(-0.72, 12, "São Paulo", "(SP)", "Alimentação");
        //--------------------------------------------------------0.87	-0.75	0.29	1.1	1.38	1.18	1.56	0.54	0.03	0.59	0.9	-1.17

        Variacao varAlimentosRJ0= new Variacao(0.87, 1, "Rio de Janeiro", "(RJ)", "Alimentação");//Variações no RJ sobre alimentos.
        Variacao varAlimentosRJ1= new Variacao(-0.75, 2, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variacao varAlimentosRJ2= new Variacao(0.29, 3, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variacao varAlimentosRJ3= new Variacao(1.1, 4, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variacao varAlimentosRJ4= new Variacao(1.38, 5, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variacao varAlimentosRJ5= new Variacao(1.18, 6, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variacao varAlimentosRJ6= new Variacao(1.56, 7, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variacao varAlimentosRJ7= new Variacao(0.54, 8, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variacao varAlimentosRJ8= new Variacao(0.03, 9, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variacao varAlimentosRJ9= new Variacao(0.59, 10, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variacao varAlimentosRJ10= new Variacao(0.9, 11, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variacao varAlimentosRJ11= new Variacao(-1.17, 12, "Rio de Janeiro", "(RJ)", "Alimentação");
        //-------------------------------------------------------1.52	0.04	0.05	0	0.58	-0.07	0.26	-0.16	0.18	1.19	-0.48	0.71

        Variacao varHabitaçãoPOA0= new Variacao(1.52, 1, "Porto Alegre", "(POA)", "Habitação");//Variações em POA sobre habitação.
        Variacao varHabitaçãoPOA1= new Variacao(0.04, 2, "Porto Alegre", "(POA)", "Habitação");
        Variacao varHabitaçãoPOA2= new Variacao(0.05, 3, "Porto Alegre", "(POA)", "Habitação");
        Variacao varHabitaçãoPOA3= new Variacao(0, 4, "Porto Alegre", "(POA)", "Habitação");
        Variacao varHabitaçãoPOA4= new Variacao(0.58, 5, "Porto Alegre", "(POA)", "Habitação");
        Variacao varHabitaçãoPOA5= new Variacao(-0.07, 6, "Porto Alegre", "(POA)", "Habitação");
        Variacao varHabitaçãoPOA6= new Variacao(0.26, 7, "Porto Alegre", "(POA)", "Habitação");
        Variacao varHabitaçãoPOA7= new Variacao(-0.16, 8, "Porto Alegre", "(POA)", "Habitação");
        Variacao varHabitaçãoPOA8= new Variacao(0.18, 9, "Porto Alegre", "(POA)", "Habitação");
        Variacao varHabitaçãoPOA9= new Variacao(1.19, 10, "Porto Alegre", "(POA)", "Habitação");
        Variacao varHabitaçãoPOA10= new Variacao(-0.48, 11, "Porto Alegre", "(POA)", "Habitação");
        Variacao varHabitaçãoPOA11= new Variacao(0.71, 12, "Porto Alegre", "(POA)", "Habitação");
        //-------------------------------------------------------0.54	0.54	-0.47	0.67	0.18	0.6	0	0.02	0.02	0.86	0.22	0.57

        Variacao varHabitaçãoSP0= new Variacao(0.54, 1, "São Paulo", "(SP)", "Habitação");//Variações em SP sobre habitação.
        Variacao varHabitaçãoSP1= new Variacao(0.54, 2, "São Paulo", "(SP)", "Habitação");
        Variacao varHabitaçãoSP2= new Variacao(-0.47, 3, "São Paulo", "(SP)", "Habitação");
        Variacao varHabitaçãoSP3= new Variacao(0.67, 4, "São Paulo", "(SP)", "Habitação");
        Variacao varHabitaçãoSP4= new Variacao(0.18, 5, "São Paulo", "(SP)", "Habitação");
        Variacao varHabitaçãoSP5= new Variacao(0.6, 6, "São Paulo", "(SP)", "Habitação");
        Variacao varHabitaçãoSP6= new Variacao(0, 7, "São Paulo", "(SP)", "Habitação");
        Variacao varHabitaçãoSP7= new Variacao(0.02, 8, "São Paulo", "(SP)", "Habitação");
        Variacao varHabitaçãoSP8= new Variacao(0.02, 9, "São Paulo", "(SP)", "Habitação");
        Variacao varHabitaçãoSP9= new Variacao(0.86, 10, "São Paulo", "(SP)", "Habitação");
        Variacao varHabitaçãoSP10= new Variacao(0.22, 11, "São Paulo", "(SP)", "Habitação");
        Variacao varHabitaçãoSP11= new Variacao(0.57, 12, "São Paulo", "(SP)", "Habitação");
        //-------------------------------------------------------1.23	0.76	0.38	1.07	0.64	0.19	0.13	0.46	0.34	0.67	-0.34	1.15

        Variacao varHabitaçãoRJ0= new Variacao(1.23, 1, "Rio de Janeiro", "(RJ)", "Habitação");//Variações no RJ sobre habitação.
        Variacao varHabitaçãoRJ1= new Variacao(0.76, 2, "Rio de Janeiro", "(RJ)", "Habitação");
        Variacao varHabitaçãoRJ2= new Variacao(0.38, 3, "Rio de Janeiro", "(RJ)", "Habitação");
        Variacao varHabitaçãoRJ3= new Variacao(1.07, 4, "Rio de Janeiro", "(RJ)", "Habitação");
        Variacao varHabitaçãoRJ4= new Variacao(0.64, 5, "Rio de Janeiro", "(RJ)", "Habitação");
        Variacao varHabitaçãoRJ5= new Variacao(0.19, 6, "Rio de Janeiro", "(RJ)", "Habitação");
        Variacao varHabitaçãoRJ6= new Variacao(0.13, 7, "Rio de Janeiro", "(RJ)", "Habitação");
        Variacao varHabitaçãoRJ7= new Variacao(0.46, 8, "Rio de Janeiro", "(RJ)", "Habitação");
        Variacao varHabitaçãoRJ8= new Variacao(0.34, 9, "Rio de Janeiro", "(RJ)", "Habitação");
        Variacao varHabitaçãoRJ9= new Variacao(0.67, 10, "Rio de Janeiro", "(RJ)", "Habitação");
        Variacao varHabitaçãoRJ10= new Variacao(-0.34, 11, "Rio de Janeiro", "(RJ)", "Habitação");
        Variacao varHabitaçãoRJ11= new Variacao(1.15, 12, "Rio de Janeiro", "(RJ)", "Habitação");
        //-------------------------------------------------------;0.31	1.65	-0.14	0.98	0.26	-1.32	0.27	-1.09	0.77	0.74	0.06	2

        Variacao varTransportePOA0= new Variacao(0.31, 1, "Porto Alegre", "(POA)", "Transporte");//Variações em POA sobre Transporte.
        Variacao varTransportePOA1= new Variacao(1.65, 2, "Porto Alegre", "(POA)", "Transporte");
        Variacao varTransportePOA2= new Variacao(-0.14, 3, "Porto Alegre", "(POA)", "Transporte");
        Variacao varTransportePOA3= new Variacao(0.98, 4, "Porto Alegre", "(POA)", "Transporte");
        Variacao varTransportePOA4= new Variacao(0.26, 5, "Porto Alegre", "(POA)", "Transporte");
        Variacao varTransportePOA5= new Variacao(-1.32, 6, "Porto Alegre", "(POA)", "Transporte");
        Variacao varTransportePOA6= new Variacao(0.27, 7, "Porto Alegre", "(POA)", "Transporte");
        Variacao varTransportePOA7= new Variacao(-1.09, 8, "Porto Alegre", "(POA)", "Transporte");
        Variacao varTransportePOA8= new Variacao(0.77, 9, "Porto Alegre", "(POA)", "Transporte");
        Variacao varTransportePOA9= new Variacao(0.74, 10, "Porto Alegre", "(POA)", "Transporte");
        Variacao varTransportePOA10= new Variacao(0.06, 11, "Porto Alegre", "(POA)", "Transporte");
        Variacao varTransportePOA11= new Variacao(2, 12, "Porto Alegre", "(POA)", "Transporte");
        //-------------------------------------------------------0.27	1.7	0.47	0.73	0.57	-1.23	0.93	-0.36	0.03	0.38	-0.36	2.33

        Variacao varTransporteSP0= new Variacao(0.27, 1, "São Paulo", "(SP)", "Transporte");//Variações em SP sobre transporte.
        Variacao varTransporteSP1= new Variacao(1.7, 2, "São Paulo", "(SP)", "Transporte");
        Variacao varTransporteSP2= new Variacao(0.47, 3, "São Paulo", "(SP)", "Transporte");
        Variacao varTransporteSP3= new Variacao(0.73, 4, "São Paulo", "(SP)", "Transporte");
        Variacao varTransporteSP4= new Variacao(0.57, 5, "São Paulo", "(SP)", "Transporte");
        Variacao varTransporteSP5= new Variacao(-1.23, 6, "São Paulo", "(SP)", "Transporte");
        Variacao varTransporteSP6= new Variacao(0.93, 7, "São Paulo", "(SP)", "Transporte");
        Variacao varTransporteSP7= new Variacao(-0.36, 8, "São Paulo", "(SP)", "Transporte");
        Variacao varTransporteSP8= new Variacao(0.03, 9, "São Paulo", "(SP)", "Transporte");
        Variacao varTransporteSP9= new Variacao(0.38, 10, "São Paulo", "(SP)", "Transporte");
        Variacao varTransporteSP10= new Variacao(-0.36, 11, "São Paulo", "(SP)", "Transporte");
        Variacao varTransporteSP11= new Variacao(2.33, 12, "São Paulo", "(SP)", "Transporte");
        //--------------------------------------------------------0.68	0.81	0.22	0.86	0.56	0.05	0.51	-0.45	-0.5	0.24	-0.4	1.12

        Variacao varTransporteRJ0= new Variacao(0.68, 1, "Rio de Janeiro", "(RJ)", "Transporte");// Variações no RJ sobre transporte.
        Variacao varTransporteRJ1= new Variacao(0.81, 2, "Rio de Janeiro", "(RJ)", "Transporte");
        Variacao varTransporteRJ2= new Variacao(0.22, 3, "Rio de Janeiro", "(RJ)", "Transporte");
        Variacao varTransporteRJ3= new Variacao(0.86, 4, "Rio de Janeiro", "(RJ)", "Transporte");
        Variacao varTransporteRJ4= new Variacao(0.56, 5, "Rio de Janeiro", "(RJ)", "Transporte");
        Variacao varTransporteRJ5= new Variacao(0.05, 6, "Rio de Janeiro", "(RJ)", "Transporte");
        Variacao varTransporteRJ6= new Variacao(0.51, 7, "Rio de Janeiro", "(RJ)", "Transporte");
        Variacao varTransporteRJ7= new Variacao(-0.45, 8, "Rio de Janeiro", "(RJ)", "Transporte");
        Variacao varTransporteRJ8= new Variacao(-0.5, 9, "Rio de Janeiro", "(RJ)", "Transporte");
        Variacao varTransporteRJ9= new Variacao(0.24, 10, "Rio de Janeiro", "(RJ)", "Transporte");
        Variacao varTransporteRJ10= new Variacao(-0.4, 11, "Rio de Janeiro", "(RJ)", "Transporte");
        Variacao varTransporteRJ11= new Variacao(1.12, 12, "Rio de Janeiro", "(RJ)", "Transporte");

        
        //toda nova Variacao será colocada aqui.
list.add(varAlimentosPOA0);
list.add(varAlimentosPOA1);
list.add(varAlimentosPOA2);
list.add(varAlimentosPOA3);
list.add(varAlimentosPOA4);
list.add(varAlimentosPOA5);
list.add(varAlimentosPOA6);
list.add(varAlimentosPOA7);
list.add(varAlimentosPOA8);
list.add(varAlimentosPOA9);
list.add(varAlimentosPOA10);
list.add(varAlimentosPOA11);
list.add(varAlimentosSP0);
list.add(varAlimentosSP1);
list.add(varAlimentosSP2);
list.add(varAlimentosSP3);
list.add(varAlimentosSP4);
list.add(varAlimentosSP5);
list.add(varAlimentosSP6);
list.add(varAlimentosSP7);
list.add(varAlimentosSP8);
list.add(varAlimentosSP9);
list.add(varAlimentosSP10);
list.add(varAlimentosSP11);
list.add(varAlimentosRJ0);
list.add(varAlimentosRJ1);
list.add(varAlimentosRJ2);
list.add(varAlimentosRJ3);
list.add(varAlimentosRJ4);
list.add(varAlimentosRJ5);
list.add(varAlimentosRJ6);
list.add(varAlimentosRJ7);
list.add(varAlimentosRJ8);
list.add(varAlimentosRJ9);
list.add(varAlimentosRJ10);
list.add(varAlimentosRJ11);
list.add(varHabitaçãoPOA0);
list.add(varHabitaçãoPOA1);
list.add(varHabitaçãoPOA2);
list.add(varHabitaçãoPOA3);
list.add(varHabitaçãoPOA4);
list.add(varHabitaçãoPOA5);
list.add(varHabitaçãoPOA6);
list.add(varHabitaçãoPOA7);
list.add(varHabitaçãoPOA8);
list.add(varHabitaçãoPOA9);
list.add(varHabitaçãoPOA10);
list.add(varHabitaçãoPOA11);
list.add(varHabitaçãoSP0);
list.add(varHabitaçãoSP1);
list.add(varHabitaçãoSP2);
list.add(varHabitaçãoSP3);
list.add(varHabitaçãoSP4);
list.add(varHabitaçãoSP5);
list.add(varHabitaçãoSP6);
list.add(varHabitaçãoSP7);
list.add(varHabitaçãoSP8);
list.add(varHabitaçãoSP9);
list.add(varHabitaçãoSP10);
list.add(varHabitaçãoSP11);
list.add(varHabitaçãoRJ0);
list.add(varHabitaçãoRJ1);
list.add(varHabitaçãoRJ2);
list.add(varHabitaçãoRJ3);
list.add(varHabitaçãoRJ4);
list.add(varHabitaçãoRJ5);
list.add(varHabitaçãoRJ6);
list.add(varHabitaçãoRJ7);
list.add(varHabitaçãoRJ8);
list.add(varHabitaçãoRJ9);
list.add(varHabitaçãoRJ10);
list.add(varHabitaçãoRJ11);
list.add(varTransportePOA0);
list.add(varTransportePOA1);
list.add(varTransportePOA2);
list.add(varTransportePOA3);
list.add(varTransportePOA4);
list.add(varTransportePOA5);
list.add(varTransportePOA6);
list.add(varTransportePOA7);
list.add(varTransportePOA8);
list.add(varTransportePOA9);
list.add(varTransportePOA10);
list.add(varTransportePOA11);
list.add(varTransporteSP0);
list.add(varTransporteSP1);
list.add(varTransporteSP2);
list.add(varTransporteSP3);
list.add(varTransporteSP4);
list.add(varTransporteSP5);
list.add(varTransporteSP6);
list.add(varTransporteSP7);
list.add(varTransporteSP8);
list.add(varTransporteSP9);
list.add(varTransporteSP10);
list.add(varTransporteSP11);
list.add(varTransporteRJ0);
list.add(varTransporteRJ1);
list.add(varTransporteRJ2);
list.add(varTransporteRJ3);
list.add(varTransporteRJ4);
list.add(varTransporteRJ5);
list.add(varTransporteRJ6);
list.add(varTransporteRJ7);
list.add(varTransporteRJ8);
list.add(varTransporteRJ9);
list.add(varTransporteRJ10);
list.add(varTransporteRJ11);                                                                                           



        System.out.println(list);// imprime os ToString de cada objeto da lista.
        double soma = 0;//será usado para médias.
        double cont =0;
        double compareMin= list.get(0).getVar();//base para comparação do mínimo.
        double compareMax=list.get(0).getVar();//base para comparação do máximo.
        for(int i=0; i<list.size(); i++){
            Variacao n = list.get(i);
            soma += n.getVar();
            cont++;
        }

        //----------------------- método de comparação do mínimo.
        for(int i=0;i<list.size();i++){
            if (compareMin<list.get(i).getVar()){
                compareMin=list.get(i).getVar();
            }
        }

        //---------------------------método de comparação do máximo (poderia ter usado a mesma variável mas quis manter as coisas simples.)
        for(int i=0;i<list.size();i++){
            if (compareMax>list.get(i).getVar()){
                compareMax=list.get(i).getVar();
            }
        }
        System.out.println(compareMin+ " é o menor valor da lista.");
        System.out.println(compareMax+ " é o menor valor da lista.");
        double divisão = soma/cont;//média usando as variáveis de contador e soma.
        System.out.println("A média de variação para todas as cidades observadas é " +divisão);
        soma =0;
        for(int i=0;i<list.size();i++){//método para encontrar o decréscimo de preços.
            if(list.get(i).getVar()<0)
            soma+= list.get(i).getVar();
        }
        System.out.println("Os preços diminuíram, durante o período de 36 meses, em " +soma+ "%.");
        soma =0;
        for(int i=0;i<list.size();i++){//método para contar o acréscimo de preços.
            if(list.get(i).getVar()>0)
            soma+= list.get(i).getVar();
        }
        System.out.println("Os preços aumentaram, durante o mesmo período, em " +soma+ "%.");

        /*
         * Contagem de médias de cada uma das cidades.
         */
        soma=0; //reutilizando soma.
        for(int i=0;i<list.size();i++){
            if(list.get(i).getSigla().equals("(POA)")){
                soma += list.get(i).getVar();
            }
        }
        /*
         * Aproveitando variáveis já criadas - soma e cont - para mostrar mais médias.
         */
        divisão = soma*3/cont;
        soma = 0;//reutilizando soma.
        System.out.println(divisão+ " é a média de variação de preços em Porto Alegre.");
        for(int i=0;i<list.size();i++){
            if(list.get(i).getSigla().equals("(SP)")){
                soma += list.get(i).getVar();
            }
        }
        divisão = soma*3/cont;
        soma=0;//reutilizando soma.
        System.out.println(divisão+ " é a média de variação de preços em São Paulo.");
        for(int i=0;i<list.size();i++){
            if(list.get(i).getSigla().equals("(RJ)")){
                soma += list.get(i).getVar();
            }
        }
        divisão = soma*3/cont;
        System.out.println(divisão+ " é a média de variação de preços no Rio de Janeiro.");
    }

    
    
}