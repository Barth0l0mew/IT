package Homework.Homework18.AbstractFabric.WebApp;

import Homework.Homework18.AbstractFabric.Developer;
import Homework.Homework18.AbstractFabric.ProjectMenager;
import Homework.Homework18.AbstractFabric.TeamCommand;
import Homework.Homework18.AbstractFabric.Tester;

public class WebCommandFabric implements TeamCommand {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createTester() {
        return new QATester();
    }

    @Override
    public ProjectMenager createProjectMenager() {
        return new PM();
    }
}
