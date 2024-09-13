public class MockProfessorService implements ProfessorInterface {

    @Override
    public String Busca(String nomeProfessor) {

        if(id == 10){
            return ProfessorConst.SALDANHA;
        }

        if(id == 20){
            return ProfessorConst.EGIDIO;
        }

        return null;

    }

}
