public class NotImmutable {
    private StringBuilder builder;

    public NotImmutable(StringBuilder b) {
        builder = b;
    }

    // problematic getter
    public StringBuilder getBuilder() {
        return builder;
    }
    
    // solution
    public string getBuilder() {
        return string.toString();
    }
}

// be returning type of StringBuilder the user of the class
// can call methods the object itself and thus making the class mutable
class VerifyImmutablity {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("initial");
        NotImmutable problem = new NotImmutable(sb);
        sb.append(" added");
        StringBuilder gotBuilder = problem.getBuilder();
        gotBuilder.append(" more");
        System.out.println(problem.getBuilder()); // "initial added more"
    }
}
