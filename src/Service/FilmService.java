package Service;

import Domain.Film;
import Repository.FilmRepository;
import java.util.List;


public class FilmService {
    private FilmRepository repository;

    public FilmService(FilmRepository repository) {
        this.repository = repository;
    }
    /*private int idFilm, anAparitie;
    private Double pretBilet;
    private String titlu;
    private boolean inProgram;*/

    public void adauga (String idFilm, int anAparitie, double pretBilet, String titlu, boolean inProgram ) {
       Film film = new Film(idFilm, anAparitie, pretBilet, titlu, inProgram);
        repository.adauga(film);
    }
    public void actualizeaza (String idFilm, int anAparitie, double pretBilet, String titlu, boolean inProgram ) {
        Film film = new Film(idFilm, anAparitie, pretBilet, titlu, inProgram);
        repository.actualizeaza(film);
    }

    public void sterge (String idFilm) {
        repository.sterge(idFilm);
    }
    public List<Film> arataTot (){
        return repository.arataTot();
    }
}
