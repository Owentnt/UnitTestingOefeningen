package week1;

public class Greetings {
    public String sayHello(String name) {
        if (name == null || name.isEmpty()){
            return "Hello there!";
        }

        if (name.contains("\t") || name.contains("\n")){
            return "Hello there!";
        }
        return "Hello " + name + "!";
    }

    public String sayHello(String name, String language) {
        if (language == null){
            return "What language do you speak";
        }
        return switch (language) {
            case "English" -> "Hello " + name + "!";
            case "Spanish" -> "Hola " + name + "!";
            case "French" -> "Bonjour " + name + "!";
            case "", "\t\n"-> "What language do you speak";
            default -> "I don't know how to say hello to you, " + name;
        };


    }

}
