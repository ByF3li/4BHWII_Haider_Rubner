package FactoryPattern;

public class BriefumschlägeFactory {
    public static Briefumschläge getBriefumschlag(String type, String weight){
        if(type.equalsIgnoreCase("A4")){
            return new A4(weight);
        }
        else if(type.equalsIgnoreCase("A5")){
            return new A5(weight);
        }
        else if(type.equalsIgnoreCase("A6")){
            return new A6(weight);
        }
        return null;
    }
}
