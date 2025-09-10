package Entities;

public class PaisG20 implements Comparable<PaisG20> {
    private String nome;
    private double pibTotal;
    private long populacao;

    public PaisG20(String nome, double pibTotal, long populacao) {
        this.nome = nome;
        this.pibTotal = pibTotal;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPibTotal() {
        return pibTotal;
    }

    public void setPibTotal(double pibTotal) {
        this.pibTotal = pibTotal;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        PaisG20 pais = (PaisG20) obj;
        return nome.equalsIgnoreCase(pais.nome);
    }

    public int compareTo(PaisG20 outroPais) {
        if (this.pibTotal != outroPais.pibTotal) {
            return Double.compare(outroPais.pibTotal, this.pibTotal);
        }
        return Long.compare(this.populacao, outroPais.populacao);
    }

    public String toString() {
        return String.format("%s (PIB: %.1f bilhões, População: %d)", nome, pibTotal, populacao);
    }
}