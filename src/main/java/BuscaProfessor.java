import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaProfessor {

    private ProfessorInterface professorInterface;

    public BuscaProfessor(ProfessorInterface professorInterface) {
        this.professorInterface = professorInterface;
    }

    public Professor buscaProfessor(String nomeProfessor) {

        String professorJson = professorInterface.Busca(nomeProfessor);

        JsonObject jsonObject = JsonParser.parseString(professorJson).getAsJsonObject();

        Professor professor = new Professor(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsString(),
                jsonObject.get("sala").getAsString());

        professor.setPredio(Integer.parseInt(professor.getSala()));

        return professor;
    }

}