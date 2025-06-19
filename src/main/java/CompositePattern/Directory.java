package CompositePattern;

import DesignPatterns.BuilderPattern.Director;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String dirname;
    List<FileSystem> fileSystems;

    public Directory(String dirname) {
        this.dirname = dirname;
        this.fileSystems = new ArrayList<>();
    }

    public void addFileSystem(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name: " + dirname);
        for ( FileSystem fileSystem : fileSystems) {
            fileSystem.ls();
        }
    }
}
