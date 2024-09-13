public class Professor {

    private String nomeDoProfessor;
    private String horarioDeAtendimento;
    private String periodo;
    private String sala;
    private String predio;

    public Professor(String nomeDoProfessor, String horarioDeAtendimento, String periodo, String sala) {
        this.nomeDoProfessor = nomeDoProfessor;
        this.horarioDeAtendimento = horarioDeAtendimento;
        this.periodo = periodo;
        this.sala = sala;
    }

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    public String getHorarioDeAtendimento() {
        return horarioDeAtendimento;
    }

    public void setHorarioDeAtendimento(String horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setPredio(int sala){
        if (sala >= 1 && sala <= 5)
            predio = "1";
        else if (sala >= 6 && sala <= 10)
            predio = "2";
        else
            predio = "3";
    }
}
