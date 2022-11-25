public class App {
    public static void main(String [] args){
        User newUser = new User.Builder("mikeBox", "mike@gmail.com").firstName("mikeFirst").lastName("mikeLast").build();
        System.out.println(newUser);
    }
    
}
