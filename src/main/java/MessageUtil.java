public class MessageUtil {
    private String message;

    public MessageUtil(String message){
        this.message = message;
    }

    public String sayWelcome(){
        return "Welcome to cicd demo !";
    }

    public String sayHello(){
        message = "Hello," + message;
        return message;
    }
}
