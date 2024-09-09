public class Variacao{
    private double monthV;
    private int mês;
    private String estado;
    private String produto;
    private String sigla;
    public Variacao(double monthV1, int mês1, String estado1, String sigla1, String produto1){//Construtor da Variacao do mês, representada em um objeto. 
        this.monthV=monthV1;
        this.mês=mês1;
        this.estado=estado1;
        this.produto=produto1;
        this.sigla = sigla1;
    }
    public String toString(){
        return "\n A Variacao no mês " +mês+ " foi de " +monthV+ " no estado de " +estado+ " (" +sigla+ ") na área de " +produto;
    }
    public double getVar(){//retorna a Variacao do mês
        return this.monthV;
    }
    public void setVar(double monthV1){// muda a Variacao mensal.
        this.monthV=monthV1;
    }
    public int getMes(){// retorna o mês
        return this.mês;
    }
    public void setMes(int mês1){// muda o mês
        this.mês = mês1;
    }
    public String getEstado(){// retorna o estado.
        return this.estado;
    }
    public void setEstado(String estado1){// muda o estado.
        this.estado = estado1;
    }
    public String getSigla(){// retorna a sigla do local
        return this.sigla;
    }
    public void setSigla(String sigla1){// muda a sigla do local.
        this.sigla = sigla1;
    }
    public String getProduto(){// retorna o tipo de produto.
        return this.produto;
    }
    public void setProduto(String produto1){// muda o tipo de produto.
        this.produto = produto1;
    }
}