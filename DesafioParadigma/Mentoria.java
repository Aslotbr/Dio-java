package DesafioParadigma;
import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    // Construtor
    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.data = data;
    }

    // Getters e Setters
    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    // Implementação do método abstrato
    @Override
    public double calcularXP() {
        return XP_PADRAO + 10d;
    }
}
