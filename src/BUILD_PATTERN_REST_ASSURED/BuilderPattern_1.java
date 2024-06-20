package BUILD_PATTERN_REST_ASSURED;

public class BuilderPattern_1 {

    public BuilderPattern_1 Step1()
    {
        System.out.println("Step A");
        return this;
    }
    public BuilderPattern_1 Step2(String name)
    {
        System.out.println("Step B  " + name);
        return this;
    }
    public BuilderPattern_1 Step3(String name, String color)
    {
        System.out.println("Step C  " + name + "  "+color);
        return this;
    }
    public static void main(String[] args) {
        BuilderPattern_1 v = new BuilderPattern_1();
        v.Step1().Step2("RAKESH").Step3("Radesh","RED");
    }

}
