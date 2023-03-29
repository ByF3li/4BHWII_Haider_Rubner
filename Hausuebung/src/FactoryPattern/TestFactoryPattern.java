package FactoryPattern;

public class TestFactoryPattern {
    public static void main(String[] args) {
        Briefumschläge a4 = BriefumschlägeFactory.getBriefumschlag("a4","20");
        Briefumschläge a5 = BriefumschlägeFactory.getBriefumschlag("a5","100");
        Briefumschläge a6 = BriefumschlägeFactory.getBriefumschlag("A6","50");
        System.out.println("A4: "+ a4);
        System.out.println("A5: " + a5);
        System.out.println("A6: " + a6);
    }
}
