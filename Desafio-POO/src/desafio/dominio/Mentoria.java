package desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
   private LocalDate data; //Classe para trabalhar com datas

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

}
