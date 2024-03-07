package Homework.Homework18.AbstractFabric.CppApp;

import Homework.Homework18.AbstractFabric.Developer;
import Homework.Homework18.AbstractFabric.ProjectMenager;
import Homework.Homework18.AbstractFabric.TeamCommand;
import Homework.Homework18.AbstractFabric.Tester;

public class CppCommandFabric implements TeamCommand {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }

    @Override
    public Tester createTester() {
        return new QaCppTester();
    }

    @Override
    public ProjectMenager createProjectMenager() {
        return new CppPM();
    }
}
