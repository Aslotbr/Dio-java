package DesafioParadigma;


public class Curso extends Conteudo {
    private int cargaHoraria;

    // Construtor
    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    // Getters e Setters
    public int getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }

    // Implementação do método abstrato
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
}