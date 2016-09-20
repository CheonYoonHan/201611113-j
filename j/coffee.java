class IndiaCoffee {
    String origin;
    int degreeOfRoast;
    int grade;
    IndiaCoffee(string o) {
        origin=o;
    }
    public void roast() {
        System.out.println("roasting..."+origin);
    }
    public void grind() {
        System.out.println("grinding..."+origin);
    }
    public void brew() {
        System.out.println("brewing..."+origin);
    }
}
IndiaCoffee india=new IndiaCoffee("India");
india.roast();