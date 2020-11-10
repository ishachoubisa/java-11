
class MixAndMatch{
    String mix;
    String match;
    String mixAndMatch;
    static int counter = 0;

    MixAndMatch(){
        counter++;
    }
    MixAndMatch(String mixAndMatch){
        this();
        this.mixAndMatch = mixAndMatch;
        System.out.println("mixAndMatch = "+this.mixAndMatch+" for instance # "+counter);
    }
    MixAndMatch(String mix, String match){
        this(mix + "and" + match);
        this.mix = mix;
        this.match = match;
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {
        new MixAndMatch("Mix","Match");
        new MixAndMatch("Mix or Match");
        new MixAndMatch();
        new MixAndMatch("not this "," not that");
    }
}
