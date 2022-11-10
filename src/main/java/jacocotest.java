

public class jacocotest {

    public String hello(String name) {
        switch (name) {
            case "펭":
                return "하이";
            case "hello":
                return "world";
            case "hello2":
                return "world2";

            default:
                return "no one";
        }
    }

    public void callMe() {
        System.out.println("Please, call me");
    }

}