package lyssechko.com;

public class CppDeveloperFactory implements FactoryDeveloper{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
