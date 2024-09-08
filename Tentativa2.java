import java.util.ArrayList;
public class Tentativa2{
    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        ArrayList lista = new ArrayList<Variação>();
        //colocar em ordem: Variação(Double), Mês da Variação(int), Local(String), Sigla(String), Tipo(String)
        //POA:-1.11	-0.83	-0.38	0.75	0.58	1.06	0.7	0.13	0.84	2.63	-0.52	-1.62
        Variação varAlimentosPOA0= new Variação(-1.11, 1, "Porto Alegre", "(POA)", "Alimentação");
        Variação varAlimentosPOA1= new Variação(-0.83, 2, "Porto Alegre", "(POA)", "Alimentação");
        Variação varAlimentosPOA2= new Variação(-0.38, 3, "Porto Alegre", "(POA)", "Alimentação");
        Variação varAlimentosPOA3= new Variação(0.75, 4, "Porto Alegre", "(POA)", "Alimentação");
        Variação varAlimentosPOA4= new Variação(0.58, 5, "Porto Alegre", "(POA)", "Alimentação");
        Variação varAlimentosPOA5= new Variação(1.06, 6, "Porto Alegre", "(POA)", "Alimentação");
        Variação varAlimentosPOA6= new Variação(0.7, 7, "Porto Alegre", "(POA)", "Alimentação");
        Variação varAlimentosPOA7= new Variação(0.13, 8, "Porto Alegre", "(POA)", "Alimentação");
        Variação varAlimentosPOA8= new Variação(0.84, 9, "Porto Alegre", "(POA)", "Alimentação");
        Variação varAlimentosPOA9= new Variação(2.63, 10, "Porto Alegre", "(POA)", "Alimentação");
        Variação varAlimentosPOA10= new Variação(-0.52, 11, "Porto Alegre", "(POA)", "Alimentação");
        Variação varAlimentosPOA11= new Variação(-1.62, 12, "Porto Alegre", "(POA)", "Alimentação");
        //--------------------------------------------------------0.75	-0.7	0.71	0.59	0.98	0.74	1.17	0.61	0.87	0.46	0.78	-0.72
        Variação varAlimentosSP0= new Variação(0.75, 1, "São Paulo", "(SP)", "Alimentação");
        Variação varAlimentosSP1= new Variação(-0.7, 2, "São Paulo", "(SP)", "Alimentação ");
        Variação varAlimentosSP2= new Variação(0.71, 3, "São Paulo", "(SP)", "Alimentação ");
        Variação varAlimentosSP3= new Variação(0.59, 4, "São Paulo", "(SP)", "Alimentação ");
        Variação varAlimentosSP4= new Variação(0.98, 5, "São Paulo", "(SP)", "Alimentação ");
        Variação varAlimentosSP5= new Variação(0.74, 6, "São Paulo", "(SP)", "Alimentação ");
        Variação varAlimentosSP6= new Variação(1.17, 7, "São Paulo", "(SP)", "Alimentação ");
        Variação varAlimentosSP7= new Variação(0.61, 8, "São Paulo", "(SP)", "Alimentação");
        Variação varAlimentosSP8= new Variação(0.87, 9, "São Paulo", "(SP)", "Alimentação");
        Variação varAlimentosSP9= new Variação(0.46, 10, "São Paulo", "(SP)", "Alimentação");
        Variação varAlimentosSP10= new Variação(0.78, 11, "São Paulo", "(SP)", "Alimentação");
        Variação varAlimentosSP11= new Variação(-0.72, 12, "São Paulo", "(SP)", "Alimentação");
        //--------------------------------------------------------0.87	-0.75	0.29	1.1	1.38	1.18	1.56	0.54	0.03	0.59	0.9	-1.17

        Variação varAlimentosRJ0= new Variação(0.87, 1, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variação varAlimentosRJ1= new Variação(-0.75, 2, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variação varAlimentosRJ2= new Variação(0.29, 3, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variação varAlimentosRJ3= new Variação(1.1, 4, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variação varAlimentosRJ4= new Variação(1.38, 5, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variação varAlimentosRJ5= new Variação(1.18, 6, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variação varAlimentosRJ6= new Variação(1.56, 7, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variação varAlimentosRJ7= new Variação(0.54, 8, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variação varAlimentosRJ8= new Variação(0.03, 9, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variação varAlimentosRJ9= new Variação(0.59, 10, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variação varAlimentosRJ10= new Variação(0.9, 11, "Rio de Janeiro", "(RJ)", "Alimentação");
        Variação varAlimentosRJ11= new Variação(-1.17, 12, "Rio de Janeiro", "(RJ)", "Alimentação");
        //-------------------------------------------------------1.52	0.04	0.05	0	0.58	-0.07	0.26	-0.16	0.18	1.19	-0.48	0.71

        Variação varHabitaçãoPOA0= new Variação(1.52, 1, "Porto Alegre", "(POA)", "Habitação");
        Variação varHabitaçãoPOA1= new Variação(0.04, 2, "Porto Alegre", "(POA)", "Habitação");
        Variação varHabitaçãoPOA2= new Variação(0.05, 3, "Porto Alegre", "(POA)", "Habitação");
        Variação varHabitaçãoPOA3= new Variação(0, 4, "Porto Alegre", "(POA)", "Habitação");
        Variação varHabitaçãoPOA4= new Variação(0.58, 5, "Porto Alegre", "(POA)", "Habitação");
        Variação varHabitaçãoPOA5= new Variação(-0.07, 6, "Porto Alegre", "(POA)", "Habitação");
        Variação varHabitaçãoPOA6= new Variação(0.26, 7, "Porto Alegre", "(POA)", "Habitação");
        Variação varHabitaçãoPOA7= new Variação(-0.16, 8, "Porto Alegre", "(POA)", "Habitação");
        Variação varHabitaçãoPOA8= new Variação(0.18, 9, "Porto Alegre", "(POA)", "Habitação");
        Variação varHabitaçãoPOA9= new Variação(1.19, 10, "Porto Alegre", "(POA)", "Habitação");
        Variação varHabitaçãoPOA10= new Variação(-0.48, 11, "Porto Alegre", "(POA)", "Habitação");
        Variação varHabitaçãoPOA11= new Variação(0.71, 12, "Porto Alegre", "(POA)", "Habitação");
        //-------------------------------------------------------0.54	0.54	-0.47	0.67	0.18	0.6	0	0.02	0.02	0.86	0.22	0.57

        Variação varHabitaçãoSP0= new Variação(0.54, 1, "São Paulo", "(SP)", "Habitação");
        Variação varHabitaçãoSP1= new Variação(0.54, 2, "São Paulo", "(SP)", "Habitação");
        Variação varHabitaçãoSP2= new Variação(-0.47, 3, "São Paulo", "(SP)", "Habitação");
        Variação varHabitaçãoSP3= new Variação(0.67, 4, "São Paulo", "(SP)", "Habitação");
        Variação varHabitaçãoSP4= new Variação(0.18, 5, "São Paulo", "(SP)", "Habitação");
        Variação varHabitaçãoSP5= new Variação(0.6, 6, "São Paulo", "(SP)", "Habitação");
        Variação varHabitaçãoSP6= new Variação(0, 7, "São Paulo", "(SP)", "Habitação");
        Variação varHabitaçãoSP7= new Variação(0.02, 8, "São Paulo", "(SP)", "Habitação");
        Variação varHabitaçãoSP8= new Variação(0.02, 9, "São Paulo", "(SP)", "Habitação");
        Variação varHabitaçãoSP9= new Variação(0.86, 10, "São Paulo", "(SP)", "Habitação");
        Variação varHabitaçãoSP10= new Variação(0.22, 11, "São Paulo", "(SP)", "Habitação");
        Variação varHabitaçãoSP11= new Variação(0.57, 12, "São Paulo", "(SP)", "Habitação");
        //-------------------------------------------------------1.23	0.76	0.38	1.07	0.64	0.19	0.13	0.46	0.34	0.67	-0.34	1.15

        Variação varHabitaçãoRJ0= new Variação(1.23, 1, "Rio de Janeiro", "(RJ)", "Habitação");
        Variação varHabitaçãoRJ1= new Variação(0.76, 2, "Rio de Janeiro", "(RJ)", "Habitação");
        Variação varHabitaçãoRJ2= new Variação(0.38, 3, "Rio de Janeiro", "(RJ)", "Habitação");
        Variação varHabitaçãoRJ3= new Variação(1.07, 4, "Rio de Janeiro", "(RJ)", "Habitação");
        Variação varHabitaçãoRJ4= new Variação(0.64, 5, "Rio de Janeiro", "(RJ)", "Habitação");
        Variação varHabitaçãoRJ5= new Variação(0.19, 6, "Rio de Janeiro", "(RJ)", "Habitação");
        Variação varHabitaçãoRJ6= new Variação(0.13, 7, "Rio de Janeiro", "(RJ)", "Habitação");
        Variação varHabitaçãoRJ7= new Variação(0.46, 8, "Rio de Janeiro", "(RJ)", "Habitação");
        Variação varHabitaçãoRJ8= new Variação(0.34, 9, "Rio de Janeiro", "(RJ)", "Habitação");
        Variação varHabitaçãoRJ9= new Variação(0.67, 10, "Rio de Janeiro", "(RJ)", "Habitação");
        Variação varHabitaçãoRJ10= new Variação(-0.34, 11, "Rio de Janeiro", "(RJ)", "Habitação");
        Variação varHabitaçãoRJ11= new Variação(1.15, 12, "Rio de Janeiro", "(RJ)", "Habitação");
        //-------------------------------------------------------;0.31	1.65	-0.14	0.98	0.26	-1.32	0.27	-1.09	0.77	0.74	0.06	2

        Variação varTransportePOA0= new Variação(0.31, 1, "Porto Alegre", "(POA)", "Transporte");
        Variação varTransportePOA1= new Variação(1.65, 2, "Porto Alegre", "(POA)", "Transporte");
        Variação varTransportePOA2= new Variação(-0.14, 3, "Porto Alegre", "(POA)", "Transporte");
        Variação varTransportePOA3= new Variação(0.98, 4, "Porto Alegre", "(POA)", "Transporte");
        Variação varTransportePOA4= new Variação(0.26, 5, "Porto Alegre", "(POA)", "Transporte");
        Variação varTransportePOA5= new Variação(-1.32, 6, "Porto Alegre", "(POA)", "Transporte");
        Variação varTransportePOA6= new Variação(0.27, 7, "Porto Alegre", "(POA)", "Transporte");
        Variação varTransportePOA7= new Variação(-1.09, 8, "Porto Alegre", "(POA)", "Transporte");
        Variação varTransportePOA8= new Variação(0.77, 9, "Porto Alegre", "(POA)", "Transporte");
        Variação varTransportePOA9= new Variação(0.74, 10, "Porto Alegre", "(POA)", "Transporte");
        Variação varTransportePOA10= new Variação(0.06, 11, "Porto Alegre", "(POA)", "Transporte");
        Variação varTransportePOA11= new Variação(2, 12, "Porto Alegre", "(POA)", "Transporte");
        //-------------------------------------------------------0.27	1.7	0.47	0.73	0.57	-1.23	0.93	-0.36	0.03	0.38	-0.36	2.33

        Variação varTransporteSP0= new Variação(0.27, 1, "São Paulo", "(SP)", "Transporte");
        Variação varTransporteSP1= new Variação(1.7, 2, "São Paulo", "(SP)", "Transporte");
        Variação varTransporteSP2= new Variação(0.47, 3, "São Paulo", "(SP)", "Transporte");
        Variação varTransporteSP3= new Variação(0.73, 4, "São Paulo", "(SP)", "Transporte");
        Variação varTransporteSP4= new Variação(0.57, 5, "São Paulo", "(SP)", "Transporte");
        Variação varTransporteSP5= new Variação(-1.23, 6, "São Paulo", "(SP)", "Transporte");
        Variação varTransporteSP6= new Variação(0.93, 7, "São Paulo", "(SP)", "Transporte");
        Variação varTransporteSP7= new Variação(-0.36, 8, "São Paulo", "(SP)", "Transporte");
        Variação varTransporteSP8= new Variação(0.03, 9, "São Paulo", "(SP)", "Transporte");
        Variação varTransporteSP9= new Variação(0.38, 10, "São Paulo", "(SP)", "Transporte");
        Variação varTransporteSP10= new Variação(-0.36, 11, "São Paulo", "(SP)", "Transporte");
        Variação varTransporteSP11= new Variação(2.33, 12, "São Paulo", "(SP)", "Transporte");
        //--------------------------------------------------------0.68	0.81	0.22	0.86	0.56	0.05	0.51	-0.45	-0.5	0.24	-0.4	1.12

        Variação varTransporteRJ0= new Variação(0.68, 1, "Rio de Janeiro", "(RJ)", "Transporte");
        Variação varTransporteRJ1= new Variação(0.81, 2, "Rio de Janeiro", "(RJ)", "Transporte");
        Variação varTransporteRJ2= new Variação(0.22, 3, "Rio de Janeiro", "(RJ)", "Transporte");
        Variação varTransporteRJ3= new Variação(0.86, 4, "Rio de Janeiro", "(RJ)", "Transporte");
        Variação varTransporteRJ4= new Variação(0.56, 5, "Rio de Janeiro", "(RJ)", "Transporte");
        Variação varTransporteRJ5= new Variação(0.05, 6, "Rio de Janeiro", "(RJ)", "Transporte");
        Variação varTransporteRJ6= new Variação(0.51, 7, "Rio de Janeiro", "(RJ)", "Transporte");
        Variação varTransporteRJ7= new Variação(-0.45, 8, "Rio de Janeiro", "(RJ)", "Transporte");
        Variação varTransporteRJ8= new Variação(-0.5, 9, "Rio de Janeiro", "(RJ)", "Transporte");
        Variação varTransporteRJ9= new Variação(0.24, 10, "Rio de Janeiro", "(RJ)", "Transporte");
        Variação varTransporteRJ10= new Variação(-0.4, 11, "Rio de Janeiro", "(RJ)", "Transporte");
        Variação varTransporteRJ11= new Variação(1.12, 12, "Rio de Janeiro", "(RJ)", "Transporte");

        
        //toda nova variação será colocada aqui, mesmo que à mão.
lista.add(varAlimentosPOA0);
lista.add(varAlimentosPOA1);
lista.add(varAlimentosPOA2);
lista.add(varAlimentosPOA3);
lista.add(varAlimentosPOA4);
lista.add(varAlimentosPOA5);
lista.add(varAlimentosPOA6);
lista.add(varAlimentosPOA7);
lista.add(varAlimentosPOA8);
lista.add(varAlimentosPOA9);
lista.add(varAlimentosPOA10);
lista.add(varAlimentosPOA11);
lista.add(varAlimentosSP0);
lista.add(varAlimentosSP1);
lista.add(varAlimentosSP2);
lista.add(varAlimentosSP3);
lista.add(varAlimentosSP4);
lista.add(varAlimentosSP5);
lista.add(varAlimentosSP6);
lista.add(varAlimentosSP7);
lista.add(varAlimentosSP8);
lista.add(varAlimentosSP9);
lista.add(varAlimentosSP10);
lista.add(varAlimentosSP11);
lista.add(varAlimentosRJ0);
lista.add(varAlimentosRJ1);
lista.add(varAlimentosRJ2);
lista.add(varAlimentosRJ3);
lista.add(varAlimentosRJ4);
lista.add(varAlimentosRJ5);
lista.add(varAlimentosRJ6);
lista.add(varAlimentosRJ7);
lista.add(varAlimentosRJ8);
lista.add(varAlimentosRJ9);
lista.add(varAlimentosRJ10);
lista.add(varAlimentosRJ11);
lista.add(varHabitaçãoPOA0);
lista.add(varHabitaçãoPOA1);
lista.add(varHabitaçãoPOA2);
lista.add(varHabitaçãoPOA3);
lista.add(varHabitaçãoPOA4);
lista.add(varHabitaçãoPOA5);
lista.add(varHabitaçãoPOA6);
lista.add(varHabitaçãoPOA7);
lista.add(varHabitaçãoPOA8);
lista.add(varHabitaçãoPOA9);
lista.add(varHabitaçãoPOA10);
lista.add(varHabitaçãoPOA11);
lista.add(varHabitaçãoSP0);
lista.add(varHabitaçãoSP1);
lista.add(varHabitaçãoSP2);
lista.add(varHabitaçãoSP3);
lista.add(varHabitaçãoSP4);
lista.add(varHabitaçãoSP5);
lista.add(varHabitaçãoSP6);
lista.add(varHabitaçãoSP7);
lista.add(varHabitaçãoSP8);
lista.add(varHabitaçãoSP9);
lista.add(varHabitaçãoSP10);
lista.add(varHabitaçãoSP11);
lista.add(varHabitaçãoRJ0);
lista.add(varHabitaçãoRJ1);
lista.add(varHabitaçãoRJ2);
lista.add(varHabitaçãoRJ3);
lista.add(varHabitaçãoRJ4);
lista.add(varHabitaçãoRJ5);
lista.add(varHabitaçãoRJ6);
lista.add(varHabitaçãoRJ7);
lista.add(varHabitaçãoRJ8);
lista.add(varHabitaçãoRJ9);
lista.add(varHabitaçãoRJ10);
lista.add(varHabitaçãoRJ11);
lista.add(varTransportePOA0);
lista.add(varTransportePOA1);
lista.add(varTransportePOA2);
lista.add(varTransportePOA3);
lista.add(varTransportePOA4);
lista.add(varTransportePOA5);
lista.add(varTransportePOA6);
lista.add(varTransportePOA7);
lista.add(varTransportePOA8);
lista.add(varTransportePOA9);
lista.add(varTransportePOA10);
lista.add(varTransportePOA11);
lista.add(varTransporteSP0);
lista.add(varTransporteSP1);
lista.add(varTransporteSP2);
lista.add(varTransporteSP3);
lista.add(varTransporteSP4);
lista.add(varTransporteSP5);
lista.add(varTransporteSP6);
lista.add(varTransporteSP7);
lista.add(varTransporteSP8);
lista.add(varTransporteSP9);
lista.add(varTransporteSP10);
lista.add(varTransporteSP11);
lista.add(varTransporteRJ0);
lista.add(varTransporteRJ1);
lista.add(varTransporteRJ2);
lista.add(varTransporteRJ3);
lista.add(varTransporteRJ4);
lista.add(varTransporteRJ5);
lista.add(varTransporteRJ6);
lista.add(varTransporteRJ7);
lista.add(varTransporteRJ8);
lista.add(varTransporteRJ9);
lista.add(varTransporteRJ10);
lista.add(varTransporteRJ11);                                                                                           



        System.out.println(lista);
        for(Variação var1 : lista){
            int soma=0;
            soma += var1.getVar();
            int divisão;
        }
    }

    
    
}