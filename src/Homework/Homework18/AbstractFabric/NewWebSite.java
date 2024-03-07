package Homework.Homework18.AbstractFabric;

import Homework.Homework18.AbstractFabric.CppApp.CppCommandFabric;
import Homework.Homework18.AbstractFabric.WebApp.WebCommandFabric;

public class NewWebSite {
    public static void main(String[] args) {
        WebCommandFabric webCommandFabric = new WebCommandFabric();
        Developer webDeveloper = webCommandFabric.createDeveloper();
        Tester webTester = webCommandFabric.createTester();
        ProjectMenager webPM = webCommandFabric.createProjectMenager();

        System.out.println("---Creat new web project----");
        webDeveloper.workProcces();
        webTester.workProcces();
        webPM.workProcces();

        CppCommandFabric cppCommandFabric = new CppCommandFabric();
        Developer cppDeveloper = cppCommandFabric.createDeveloper();
        Tester cppTester  = cppCommandFabric.createTester();
        ProjectMenager cppPM = cppCommandFabric.createProjectMenager();
        System.out.println("--- Create new big Cpp App----");
        cppDeveloper.workProcces();
        cppTester.workProcces();
        cppPM.workProcces();

    }
}
