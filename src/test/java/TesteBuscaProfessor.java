import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TesteBuscaProfessor {

    @Test
    public void testeBuscaHorarioProfessor(){
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof2");

        assertEquals("15:00", professor.getHorarioDeAtendimento());

    }

    @Test
    public void testeBuscaHorarioErrado(){
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof1");

        assertEquals("10h30", professor.getHorarioDeAtendimento());

    }

    @Test
    public void testeBuscaNomeProfessor(){
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof3");

        assertEquals("Renzo",  professor.getNomeDoProfessor());

    }

    @Test
    public void testeBuscaNomeErrado(){
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof4");

        assertEquals("Soned",  professor.getNomeDoProfessor());

    }

    @Test
    public void testeBuscaPeriodoProfessor(){
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof1");

        assertEquals("Noturno",  professor.getPeriodo());

    }

    @Test
    public void testeBuscaPeriodoErrado(){
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof2");

        assertEquals("Noturno",  professor.getPeriodo());

    }

    @Test
    public void testeBuscaSalaProfessor() {
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof6");

        assertEquals("27", professor.getSala());
    }

    @Test
    public void testeBuscaSalaErrado() {
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof2");

        assertEquals("15", professor.getSala());
    }

    @Test
    public void testeBuscaPredioProfessor() {
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof4");

        assertEquals("4", professor.getPredio());
    }

    @Test
    public void testeBuscaPredioErrado() {
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof1");

        assertEquals("3", professor.getPredio());
    }

    @Test
    public void testeBuscaProfessorNaoNulo() {
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof1");

        assertNotNull(professor);
    }

    @Test
    public void testeBuscaProfessorNulo() {
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof7");

        assertNotNull(professor);
    }

    @Test
    public void testeBuscaNomeEHorario() {
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof2");

        assertEquals("Chris", professor.getNomeDoProfessor());
        assertEquals("15:00", professor.getHorarioDeAtendimento());
    }

    @Test
    public void testeBuscaNomeErradoEHorarioErrado() {
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof3");

        assertEquals("Marcelo", professor.getNomeDoProfessor());
        assertEquals("17:00", professor.getHorarioDeAtendimento());
    }

    @Test
    public void testeBuscaPeriodoESala() {
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof3");

        assertEquals("Integral", professor.getPeriodo());
        assertEquals("15", professor.getSala());
    }

    @Test
    public void testeBuscaPeriodoErradoESalaErrado() {
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof3");

        assertEquals("Noturno", professor.getPeriodo());
        assertEquals("18", professor.getSala());
    }


    @Test
    public void testeBuscaNomeEPredio() {
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof4");

        assertEquals("Yvo", professor.getNomeDoProfessor());
        assertEquals("4", professor.getPredio());
    }

    @Test
    public void testeBuscaNomeErradoEPredioErrado() {
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof5");

        assertEquals("Marcelo", professor.getNomeDoProfessor());
        assertEquals("2", professor.getPredio());
    }

    @Test
    public void testeBuscaPredioESala() {
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof5");

        assertEquals("5", professor.getPredio());
        assertEquals("23", professor.getSala());
    }

    @Test
    public void testeBuscaPredioErradoESalaErrado() {
        ProfessorInterface service = new MockProfessorService();
        BuscaProfessor busca = new BuscaProfessor(service);

        Professor professor = busca.buscaProfessor("prof6");

        assertEquals("1", professor.getPredio());
        assertEquals("4", professor.getSala());
    }
}

