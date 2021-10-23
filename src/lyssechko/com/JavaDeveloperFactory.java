package lyssechko.com;

public class JavaDeveloperFactory implements FactoryDeveloper{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
