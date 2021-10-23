package lyssechko.com;

public class Main {

    public static void main(String[] args) {
        FactoryDeveloper factoryDeveloper = createDeveloperBySpeciality("phyton");
        Developer developer = factoryDeveloper.createDeveloper();

        developer.writeCode();
    }

    static FactoryDeveloper createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if(speciality.equalsIgnoreCase("phyton")){
            return new PhytonDeveloperFactory();
        }
        else {
            throw new RuntimeException(speciality + "is unknown speciality");
        }
    }
}
