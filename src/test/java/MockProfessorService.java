public class MockProfessorService implements ProfessorInterface {

    @Override
    public String Busca(String nomeProfessor) {

        if(nomeProfessor.equals("prof1")){
            return ProfessorMock.prof1;
        }

        if(nomeProfessor.equals("prof2")){
            return ProfessorMock.prof2;
        }

        if(nomeProfessor.equals("prof3")){
            return ProfessorMock.prof3;
        }

        if(nomeProfessor.equals("prof4")){
            return ProfessorMock.prof4;
        }

        if(nomeProfessor.equals("prof5")){
            return ProfessorMock.prof5;
        }

        if(nomeProfessor.equals("prof6")){
            return ProfessorMock.prof6;
        }

        return null;

    }

}
