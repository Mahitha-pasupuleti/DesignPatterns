package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class FileSystemMain {
    public void fileSystemMain() {
        Directory movies = new Directory("MOVIES");
        File lifeOfPi = new File("LIFE_OF_PI");
        File cerci = new File("CERCI");

        movies.addFileSystem(lifeOfPi);
        movies.addFileSystem(cerci);

        Directory comedyMovies = new Directory("COMEDY_MOVIES");
        File andhadun = new File("ANDHADUN");
        File dragon = new File("DRAGON");

        comedyMovies.addFileSystem(andhadun);
        comedyMovies.addFileSystem(dragon);

        movies.addFileSystem(comedyMovies);

        movies.ls();
    }
}
