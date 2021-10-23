package lyssechko.com;

public class PhytonDeveloperFactory implements FactoryDeveloper{
    @Override
    public Developer createDeveloper() {
        return new PhytonDeveloper();
    }
}
