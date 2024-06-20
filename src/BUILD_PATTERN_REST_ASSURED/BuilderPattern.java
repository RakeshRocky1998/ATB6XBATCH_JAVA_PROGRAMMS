package BUILD_PATTERN_REST_ASSURED;

public class BuilderPattern {

    public BuilderPattern Step1()
    {
        System.out.println("Step1");
        return this;
    }
    public BuilderPattern Step2()
    {
        System.out.println("Step2");
        return this;
    }
    public BuilderPattern Step3()
    {
        System.out.println("Step3");
        return this;
    }

    public static void main(String[] args) {
        BuilderPattern b = new BuilderPattern();
        b.Step1().Step2().Step3();
    }

}
